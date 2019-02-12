package com.etest.entity.test;

import com.etest.entity.BasicEntity;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.*;
import java.sql.Time;


@Document
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
