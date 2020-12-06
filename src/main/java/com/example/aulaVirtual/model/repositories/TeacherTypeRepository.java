package com.example.aulaVirtual.model.repositories;

import com.example.aulaVirtual.model.dao.TeacherTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherTypeRepository extends JpaRepository<TeacherTypeEntity,Long> {
}
