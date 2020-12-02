package com.example.aulaVirtual.model.dao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Career")
public class CareerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",length = 25)
    private String name;

    @OneToMany(mappedBy = "career")
    private List<CourseEntity> courses;

    public CareerEntity(Long id, String name, List<CourseEntity> courses) {
        this.id = id;
        this.name = name;
        this.courses = courses;
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

    public List<CourseEntity> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseEntity> courses) {
        this.courses = courses;
    }
}

