package com.alibou.example.repository;

import com.alibou.example.entities.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}
