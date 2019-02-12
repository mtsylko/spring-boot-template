package com.etest.entity.test;

import com.etest.entity.BasicEntity;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Test extends BasicEntity {

    private String name;

    private Integer numberOfQuestions;

    private Integer maxTime; // whole, in minutes

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
