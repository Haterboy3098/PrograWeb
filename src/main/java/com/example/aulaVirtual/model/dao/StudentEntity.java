package com.example.aulaVirtual.model.dao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private Long code;

    @Column(name = "names",length = 50)
    private String names;

    @Column(name = "last_names", length = 50)
    private String last_names;

    @Column(name = "email",length = 50)
    private String email;

    @Column(name = "personal_email", length = 50)
    private String personal_email;

    @Column(name = "photo_url",length = 100)
    private String photo_url;

    @ManyToOne
    private GenderEntity gender;

    @ManyToOne
    private CareerEntity career;

    @ManyToOne
    private CountryEntity country;

    @OneToOne(mappedBy = "student")
    private UserStudentEntity userStudent_id;

    public StudentEntity() {
    }

    public StudentEntity(Long id, Long code, String names, String last_names, String email, String personal_email, String photo_url) {
        this.id = id;
        this.code = code;
        this.names = names;
        this.last_names = last_names;
        this.email = email;
        this.personal_email = personal_email;
        this.photo_url = photo_url;
    }

    public CountryEntity getCountry() {
        return country;
    }

    public void setCountry(CountryEntity country) {
        this.country = country;
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

    public GenderEntity getGender() {
        return gender;
    }

    public void setGender(GenderEntity gender) {
        this.gender = gender;
    }

    public CareerEntity getCareer() {
        return career;
    }

    public void setCareer(CareerEntity career) {
        this.career = career;
    }

 }
