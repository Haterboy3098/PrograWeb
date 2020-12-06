package com.example.aulaVirtual.model.repositories;

import com.example.aulaVirtual.model.dao.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<TeacherEntity,Long> {
}
