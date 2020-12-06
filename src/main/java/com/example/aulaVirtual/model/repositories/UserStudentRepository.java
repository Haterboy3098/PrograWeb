package com.example.aulaVirtual.model.repositories;

import com.example.aulaVirtual.model.dao.UserStudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserStudentRepository extends JpaRepository<UserStudentEntity,Long> {

    Optional<UserStudentEntity> findByUsername(String username);
}
