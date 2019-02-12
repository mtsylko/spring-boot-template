package com.etest.entity.user;

import com.etest.entity.BasicEntity;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.Column;

@Document
public class Privilege extends BasicEntity {

    @Column(name = "name", nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
