package com.etest.entity.test;

import com.etest.entity.BasicEntity;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.*;
import java.util.List;


@Document
public class Question extends BasicEntity {

    @Column(name = "question_text")
    private String questionText;

    @OneToMany(mappedBy = "question")
    private List<Answer> answerList;

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }
}
