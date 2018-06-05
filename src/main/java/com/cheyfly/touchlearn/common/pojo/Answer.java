package com.cheyfly.touchlearn.common.pojo;

public class Answer {
    private Long id;

    private Boolean answerTypeIsChoose;

    private String answerContent;

    private Long questionId;

    public Answer(Long id, Boolean answerTypeIsChoose, String answerContent, Long questionId) {
        this.id = id;
        this.answerTypeIsChoose = answerTypeIsChoose;
        this.answerContent = answerContent;
        this.questionId = questionId;
    }

    public Answer() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getAnswerTypeIsChoose() {
        return answerTypeIsChoose;
    }

    public void setAnswerTypeIsChoose(Boolean answerTypeIsChoose) {
        this.answerTypeIsChoose = answerTypeIsChoose;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent == null ? null : answerContent.trim();
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }
}