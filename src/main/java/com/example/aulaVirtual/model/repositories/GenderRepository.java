package com.example.aulaVirtual.model.repositories;


import com.example.aulaVirtual.model.dao.GenderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepository  extends JpaRepository<GenderEntity,Long> {
}
