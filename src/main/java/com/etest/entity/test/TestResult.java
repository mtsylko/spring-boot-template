package com.etest.entity.test;

import com.etest.entity.BasicEntity;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.sql.Time;


@Document
public class TestResult extends BasicEntity {

    private Integer correctAnswers;

    private Time timeSpent;

    @DBRef
    private Test test;

    private Boolean passed;

    public Integer getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(Integer correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public Time getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(Time timeSpent) {
        this.timeSpent = timeSpent;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Boolean getPassed() {
        return passed;
    }

    public void setPassed(Boolean passed) {
        this.passed = passed;
    }
}
