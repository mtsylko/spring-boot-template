package com.etest.entity.test;

import com.etest.entity.BasicEntity;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.*;


@Document
public class Answer extends BasicEntity {

    @ManyToOne
    @JoinColumn(name = "question_id", foreignKey = @ForeignKey(name = "fk_answer_question"), nullable = false)
    private Question question;

    @Column(name = "is_correct")
    private Boolean isCorrect;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Boolean getCorrect() {
        return isCorrect;
    }

    public void setCorrect(Boolean correct) {
        isCorrect = correct;
    }
}
