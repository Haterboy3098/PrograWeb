package com.example.aulaVirtual.model.repositories;

import com.example.aulaVirtual.model.dao.UserStudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface userStudentRepo extends JpaRepository<UserStudentEntity,Long>  {

    @Query("select u from UserStudentEntity u where u.username=?1")
    UserStudentEntity findByUsername(String username);

}
