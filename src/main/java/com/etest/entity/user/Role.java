package com.etest.entity.user;

import com.etest.entity.BasicEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Role extends BasicEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
