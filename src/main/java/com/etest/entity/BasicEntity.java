package com.etest.entity;

import org.springframework.data.annotation.Id;

import java.io.Serializable;


public class BasicEntity implements Serializable {

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
