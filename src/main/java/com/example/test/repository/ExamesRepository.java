package com.example.test.repository;

import com.example.test.model.Exame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamesRepository extends JpaRepository<Exame, Long> {
}
