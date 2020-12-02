package com.example.aulaVirtual.model.dao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TeacherType")
public class TeacherTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",length = 20)
    private String name;

    @OneToMany(mappedBy = "teacherType")
    private List<TeacherEntity> teachers;

    public TeacherTypeEntity(Long id, String name, List<TeacherEntity> teachers) {
        this.id = id;
        this.name = name;
        this.teachers = teachers;
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

    public List<TeacherEntity> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<TeacherEntity> teachers) {
        this.teachers = teachers;
    }
}
