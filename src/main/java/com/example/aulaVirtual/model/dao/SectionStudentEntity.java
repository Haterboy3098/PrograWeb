package com.example.aulaVirtual.model.dao;

import javax.persistence.*;

@Entity
@Table(name = "SectionStudent")
public class SectionStudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private SectionEntity section;

    @ManyToOne
    private StudentEntity student;

    public SectionStudentEntity(Long id, SectionEntity section, StudentEntity student) {
        this.id = id;
        this.section = section;
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SectionEntity getSection() {
        return section;
    }

    public void setSection(SectionEntity section) {
        this.section = section;
    }

    public StudentEntity getStudent() {
        return student;
    }

    public void setStudent(StudentEntity student) {
        this.student = student;
    }
}
