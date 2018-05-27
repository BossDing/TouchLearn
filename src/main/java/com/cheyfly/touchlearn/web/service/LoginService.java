package com.cheyfly.touchlearn.web.service;

import com.cheyfly.touchlearn.common.dao.UserInfoMapper;
import com.cheyfly.touchlearn.common.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author thrsky
 * @version 1.0.0
 * @date Created in 18:04 2018/5/27
 */
@Service
public class LoginService {

    @Autowired
    public UserInfoMapper userInfoMapper;

    public boolean login(UserInfo userInfo) {
        return userInfoMapper.selectByNameAndPasswd(userInfo.getUserName(), userInfo.getUserPassword()).size() > 0;
    }
}
