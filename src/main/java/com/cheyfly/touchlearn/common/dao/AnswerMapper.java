package com.cheyfly.touchlearn.common.dao;

import com.cheyfly.touchlearn.common.pojo.Answer;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AnswerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Answer record);

    Answer selectByPrimaryKey(Long id);

    List<Answer> selectAll();

    int updateByPrimaryKey(Answer record);
}