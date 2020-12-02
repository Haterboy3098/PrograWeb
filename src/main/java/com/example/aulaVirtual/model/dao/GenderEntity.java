package com.example.aulaVirtual.model.dao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Gender")
public class GenderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",length = 15)
    private String name;

    @OneToMany(mappedBy = "gender")
    private List<TeacherEntity> teachers;

    @OneToMany(mappedBy = "gender")
    private List<StudentEntity> students;

    public GenderEntity(Long id, String name, List<TeacherEntity> teachers, List<StudentEntity> students) {
        this.id = id;
        this.name = name;
        this.teachers = teachers;
        this.students = students;
    }

    public GenderEntity(Long id, String name, List<TeacherEntity> teachers) {
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

    public List<StudentEntity> getStudents() {
        return students;
    }

    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }
}
