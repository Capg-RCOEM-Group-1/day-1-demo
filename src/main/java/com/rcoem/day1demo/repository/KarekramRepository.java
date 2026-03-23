package com.rcoem.day1demo.repository;

import com.rcoem.day1demo.entities.Karekram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KarekramRepository extends JpaRepository<Karekram, Integer> {
}
