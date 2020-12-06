package com.example.aulaVirtual.model.repositories;


import com.example.aulaVirtual.model.dao.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseEntity,Long> {
}
