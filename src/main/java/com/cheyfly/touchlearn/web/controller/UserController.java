package com.cheyfly.touchlearn.web.controller;

import com.cheyfly.touchlearn.common.pojo.UserInfo;
import com.cheyfly.touchlearn.web.WebSecurityConfig;
import com.cheyfly.touchlearn.web.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpSession;

/**
 * @author thrsky
 * @version 1.0.0
 * @date Created in 18:06 2018/5/27
 */
@Controller
public class UserController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/")
    public String index(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String account, Model model) {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/loginVerify")
    public String loginVerify(String username, String password, HttpSession session, Model model) {
        UserInfo user = new UserInfo();
        user.setUserName(username);
        user.setUserPassword(password);

        boolean verify = loginService.login(user);
        if (verify) {
            model.addAttribute("username", username);
            session.setAttribute(WebSecurityConfig.SESSION_KEY, username);
            return "index";
        } else {
            return "redirect:/login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute(WebSecurityConfig.SESSION_KEY);
        return "redirect:/login";
    }
}
