package com.cheyfly.touchlearn.common.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    private Long id;

    private String questionDesc;

    private Boolean questionIsChoose;

    private Long questionParentId;

    public Question(Long id, String questionDesc, Boolean questionIsChoose, Long questionParentId) {
        this.id = id;
        this.questionDesc = questionDesc;
        this.questionIsChoose = questionIsChoose;
        this.questionParentId = questionParentId;
    }

    private List<Choose> chooses = new ArrayList<>();
}