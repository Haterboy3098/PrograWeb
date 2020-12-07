package com.example.aulaVirtual.model.dao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Section")
public class SectionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private Long code;

    @ManyToOne
    private PeriodEntity period;

    @ManyToOne
    private CourseEntity course;

    @OneToMany(mappedBy = "section")
    private List<SectionTeacherEntity> sectionTeacher;

    @OneToMany(mappedBy = "section")
    private List<SectionStudentEntity> sectionStudent;


    public SectionEntity() {
    }

    public SectionEntity(Long id, Long code) {
        this.id = id;
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public PeriodEntity getPeriod() {
        return period;
    }

    public void setPeriod(PeriodEntity period) {
        this.period = period;
    }

    public CourseEntity getCourse() {
        return course;
    }

    public void setCourse(CourseEntity course) {
        this.course = course;
    }

    public List<SectionTeacherEntity> getSectionTeacher() {
        return sectionTeacher;
    }

    public void setSectionTeacher(List<SectionTeacherEntity> sectionTeacher) {
        this.sectionTeacher = sectionTeacher;
    }

    public List<SectionStudentEntity> getSectionStudent() {
        return sectionStudent;
    }

    public void setSectionStudent(List<SectionStudentEntity> sectionStudent) {
        this.sectionStudent = sectionStudent;
    }
}
