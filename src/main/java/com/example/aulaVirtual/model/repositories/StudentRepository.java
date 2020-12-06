package com.example.aulaVirtual.model.repositories;

import com.example.aulaVirtual.model.dao.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity,Long> {
}
