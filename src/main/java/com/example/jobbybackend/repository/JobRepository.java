package com.example.jobbybackend.repository;


import com.example.jobbybackend.entity.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobRepository extends JpaRepository<JobEntity, Long> {
    List<JobEntity> findByJobCategory(String jobCategory);
}