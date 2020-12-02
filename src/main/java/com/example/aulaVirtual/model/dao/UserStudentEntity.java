package com.example.aulaVirtual.model.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "UserStudent")
public class UserStudentEntity{


    private String user;

    private String pass;

    @ManyToOne
    private

}
