package com.cheyfly.touchlearn.common.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserInfo {

    private Long userId;

    private String userName;

    private String userPassword;

    private String userEmail;

    private String userAge;

}