package com.example.aulaVirtual.model.dao;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "user")
    private UserStudentEntity userStudent_id;

    @OneToOne(mappedBy = "users")
    private UserTeacherEntity userTeacher_id;

    public UsersEntity(Long id) {
        this.id = id;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserStudentEntity getUserStudent_id() {
        return userStudent_id;
    }

    public void setUserStudent_id(UserStudentEntity userStudent_id) {
        this.userStudent_id = userStudent_id;
    }

    public UserTeacherEntity getUserTeacher_id() {
        return userTeacher_id;
    }

    public void setUserTeacher_id(UserTeacherEntity userTeacher_id) {
        this.userTeacher_id = userTeacher_id;
    }
}
