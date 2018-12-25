package com.etest.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Max on 30.04.18.
 */
@Entity
@Table(name = "answer")
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
