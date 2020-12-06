package com.example.aulaVirtual.model.repositories;


import com.example.aulaVirtual.model.dao.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<CountryEntity,Long> {
}
