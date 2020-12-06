package com.example.aulaVirtual.model.repositories;


import com.example.aulaVirtual.model.dao.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UsersEntity,Long> {
}
