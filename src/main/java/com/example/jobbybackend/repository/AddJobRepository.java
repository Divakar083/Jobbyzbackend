package com.example.jobbybackend.repository;

import com.example.jobbybackend.entity.AddJobEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddJobRepository extends JpaRepository<AddJobEntity, Long> {
}