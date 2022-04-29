package com.example.demo.repository;

import com.example.demo.model.Cricketer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CricketerRepository extends JpaRepository<Cricketer, Integer> {
}
