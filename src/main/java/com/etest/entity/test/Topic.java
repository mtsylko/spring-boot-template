package com.etest.entity.test;

import com.etest.entity.BasicEntity;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.*;


@Document
public class Topic extends BasicEntity {

    @Column(name = "name", nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
