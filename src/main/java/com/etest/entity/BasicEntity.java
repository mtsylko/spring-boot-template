package com.etest.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Max on 30.04.18.
 */
@MappedSuperclass
public class BasicEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
