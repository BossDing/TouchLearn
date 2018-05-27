package com.cheyfly.touchlearn.common.dao;

import com.cheyfly.touchlearn.common.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoMapper {

    int deleteByPrimaryKey(Long userId);

    int insert(UserInfo record);

    UserInfo selectByPrimaryKey(Long userId);

    List<UserInfo> selectAll();

    int updateByPrimaryKey(UserInfo record);

    List<UserInfo> selectByNameAndPasswd(@Param("userName") String userName, @Param("userPassword") String password);
}