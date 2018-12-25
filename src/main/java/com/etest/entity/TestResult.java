package com.etest.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Time;

/**
 * Created by Max on 30.04.18.
 */
@Entity
@Table(name = "test_result")
public class TestResult extends BasicEntity {

    private Integer answeredCorrectly;

    @Column(name = "time_spent")
    private Time timeSpent;

    @ManyToOne
    @JoinColumn(name = "test_id", foreignKey = @ForeignKey(name = "fk_test_test_result"))
    private Test test;

    private Boolean passed;

    public Integer getAnsweredCorrectly() {
        return answeredCorrectly;
    }

    public void setAnsweredCorrectly(Integer answeredCorrectly) {
        this.answeredCorrectly = answeredCorrectly;
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
