package com.example.aulaVirtual.model.repositories;


import com.example.aulaVirtual.model.dao.UserTeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userTeacherRep extends JpaRepository<UserTeacherEntity,Long> {
}
