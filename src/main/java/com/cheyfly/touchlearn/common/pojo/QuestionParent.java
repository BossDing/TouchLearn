package com.cheyfly.touchlearn.common.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class QuestionParent {

    private Long id;

    private String questionParentDesc;

    public QuestionParent(Long id, String desc) {
        this.id = id;
        this.questionParentDesc = desc;
    }

    private List<Question> questions;

}