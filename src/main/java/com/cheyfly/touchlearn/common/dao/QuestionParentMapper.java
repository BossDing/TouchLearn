package com.cheyfly.touchlearn.common.dao;

import com.cheyfly.touchlearn.common.pojo.QuestionParent;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface QuestionParentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(QuestionParent record);

    QuestionParent selectByPrimaryKey(Long id);

    List<QuestionParent> selectAll();

    int updateByPrimaryKey(QuestionParent record);
}