package com.etest.entity.test;

import com.etest.entity.BasicEntity;

import javax.persistence.*;

/**
 * Created by Max on 03.07.18.
 */
@Entity
@Table(name = "topic")
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
