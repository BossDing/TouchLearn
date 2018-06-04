package com.cheyfly.touchlearn.web.controller;

import com.alibaba.fastjson.JSON;
import com.cheyfly.touchlearn.common.dao.ChooseMapper;
import com.cheyfly.touchlearn.common.dao.QuestionMapper;
import com.cheyfly.touchlearn.common.dao.QuestionParentMapper;
import com.cheyfly.touchlearn.common.pojo.QuestionParent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author thrsky
 * @version 1.0.0
 * @date Created in 21:08 2018/6/3
 */
@Controller
@RequestMapping(value = "/question")
public class QuestionController {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private ChooseMapper chooseMapper;

    @Autowired
    private QuestionParentMapper questionParentMapper;

    @GetMapping(value = "/id/parent/{id}")
    public String getQuestion(@PathVariable(value = "id") Long id, Model model) {

        QuestionParent parent = questionParentMapper.selectByPrimaryKey(id);
        if (parent != null) {
            parent.setQuestions(questionMapper.selectByParentId(id));
            parent.getQuestions().forEach(question -> {
                question.setChooses(chooseMapper.selectByQuestionId(question.getId()));
            });
            model.addAttribute("question", parent);
        }
        return "question";
    }

    @GetMapping(value = "/id/parent/{id}/data")
    @ResponseBody
    public String parentQuestionData(@PathVariable(value = "id") Long id) {
        QuestionParent parent = questionParentMapper.selectByPrimaryKey(id);
        if (parent != null) {
            parent.setQuestions(questionMapper.selectByParentId(id));
        }
        return JSON.toJSONString(parent);
    }

    @GetMapping(value = "all")
    public String getAllQuestion(Model model) {
        List<QuestionParent> parents = questionParentMapper.selectAll();
        parents.forEach(x -> {
            x.setQuestions(questionMapper.selectByParentId(x.getId()));
        });
        model.addAttribute("questions", parents);
        return "questions";
    }
}
