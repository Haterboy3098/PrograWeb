package com.example.aulaVirtual.model.repositories;


import com.example.aulaVirtual.model.dao.SectionStudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionStudentRepository extends JpaRepository<SectionStudentEntity,Long> {
}
