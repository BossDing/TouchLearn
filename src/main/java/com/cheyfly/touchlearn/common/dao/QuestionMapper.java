package com.cheyfly.touchlearn.common.dao;

import com.cheyfly.touchlearn.common.pojo.Question;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Question record);

    Question selectByPrimaryKey(Long id);

    List<Question> selectAll();

    int updateByPrimaryKey(Question record);

    List<Question> selectByParentId(Long id);
}