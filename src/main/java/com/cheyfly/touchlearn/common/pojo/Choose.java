package com.cheyfly.touchlearn.common.pojo;

public class Choose {
    private Long id;

    private String chooseCode;

    private String chooseContext;

    private String questionId;

    public Choose(Long id, String chooseCode, String chooseContext, String questionId) {
        this.id = id;
        this.chooseCode = chooseCode;
        this.chooseContext = chooseContext;
        this.questionId = questionId;
    }

    public Choose() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChooseCode() {
        return chooseCode;
    }

    public void setChooseCode(String chooseCode) {
        this.chooseCode = chooseCode == null ? null : chooseCode.trim();
    }

    public String getChooseContext() {
        return chooseContext;
    }

    public void setChooseContext(String chooseContext) {
        this.chooseContext = chooseContext == null ? null : chooseContext.trim();
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId == null ? null : questionId.trim();
    }
}