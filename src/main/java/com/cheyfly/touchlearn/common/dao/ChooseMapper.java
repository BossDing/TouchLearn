package com.cheyfly.touchlearn.common.dao;

import com.cheyfly.touchlearn.common.pojo.Choose;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChooseMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Choose record);

    Choose selectByPrimaryKey(Long id);

    List<Choose> selectAll();

    List<Choose> selectByQuestionId(Long id);

    int updateByPrimaryKey(Choose record);
}