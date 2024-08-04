package com.example.jobbybackend.service;


import com.example.jobbybackend.entity.JobEntity;
import com.example.jobbybackend.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public List<JobEntity> getJobsByCategory(String jobCategory) {
        return jobRepository.findByJobCategory(jobCategory);
    }
}