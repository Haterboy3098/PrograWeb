package com.example.aulaVirtual.model.dao;

import javax.persistence.*;

@Entity
@Table(name = "UserStudent")
public class UserStudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username",length = 45)
    private String username;

    @Column(name="password",length = 45)
    private String password;

    @Column(name = "reset_key",length = 45)
    private String reset_key;

    @Column(name = "activation_key",length = 45)
    private String activation_key;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UsersEntity user;

    @OneToOne
    @JoinColumn(name="student_id")
    private StudentEntity student;

    public UserStudentEntity(Long id, String username, String password, String reset_key, String activation_key) {

        this.id = id;
        this.username = username;
        this.password = password;
        this.reset_key = reset_key;
        this.activation_key = activation_key;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReset_key() {
        return reset_key;
    }

    public void setReset_key(String reset_key) {
        this.reset_key = reset_key;
    }

    public String getActivation_key() {
        return activation_key;
    }

    public void setActivation_key(String activation_key) {
        this.activation_key = activation_key;
    }

    public UsersEntity getUser() {
        return user;
    }

    public void setUser(UsersEntity user) {
        this.user = user;
    }

    public StudentEntity getStudent() {
        return student;
    }

    public void setStudent(StudentEntity student) {
        this.student = student;
    }

}
