package com.example.aulaVirtual.model.dao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Teacher")
public class TeacherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private Long code;

    @Column(name = "names")
    private String names;

    @Column(name = "last_names", length = 50)
    private String last_names;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "personal_email", length = 50)
    private String personal_email;

    @Column(name = "photo_url", length = 100)
    private String photo_url;

    @ManyToOne
    private CountryEntity country;

    @ManyToOne
    private GenderEntity gender;

    @ManyToOne
    private TeacherTypeEntity teacherType;

    @OneToMany(mappedBy = "teacher")
    private List<SectionTeacherEntity> SectionTeacher;

    @OneToOne(mappedBy = "teacher")
    private UserTeacherEntity userTeacher_id;


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

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLast_names() {
        return last_names;
    }

    public void setLast_names(String last_names) {
        this.last_names = last_names;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersonal_email() {
        return personal_email;
    }

    public void setPersonal_email(String personal_email) {
        this.personal_email = personal_email;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }

    public CountryEntity getCountry() {
        return country;
    }

    public void setCountry(CountryEntity country) {
        this.country = country;
    }

    public GenderEntity getGender() {
        return gender;
    }

    public void setGender(GenderEntity gender) {
        this.gender = gender;
    }

    public TeacherTypeEntity getTeacherType() {
        return teacherType;
    }

    public void setTeacherType(TeacherTypeEntity teacherType) {
        this.teacherType = teacherType;
    }

    public List<SectionTeacherEntity> getSectionTeacher() {
        return SectionTeacher;
    }

    public void setSectionTeacher(List<SectionTeacherEntity> sectionTeacher) {
        SectionTeacher = sectionTeacher;
    }

    public UserTeacherEntity getUserTeacher_id() {
        return userTeacher_id;
    }

    public void setUserTeacher_id(UserTeacherEntity userTeacher_id) {
        this.userTeacher_id = userTeacher_id;
    }
}
