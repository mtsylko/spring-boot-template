package com.etest.entity.test;

import com.etest.entity.BasicEntity;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.*;


@Document
public class Test extends BasicEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "number_of_questions", nullable = false)
    private Integer numberOfQuestions;

    @Column(name = "max_time")
    private Integer maxTime; // whole, in minutes

    @Column(name = "percent_to_pass", nullable = false)
    private Float percentToPass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(Integer numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public Integer getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(Integer maxTime) {
        this.maxTime = maxTime;
    }

    public Float getPercentToPass() {
        return percentToPass;
    }

    public void setPercentToPass(Float percentToPass) {
        this.percentToPass = percentToPass;
    }
}
