package com.kent.hellojpawithspring.model;

import javax.persistence.*;

/**
 * Created by Naver on 2016-11-28.
 */
@Entity
public class Student {
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    public Student() {
    }

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
