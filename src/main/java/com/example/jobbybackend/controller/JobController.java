package com.example.jobbybackend.controller;

import com.example.jobbybackend.entity.JobEntity;
import com.example.jobbybackend.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {
    @Autowired
    private JobService jobService;
    @CrossOrigin(origins = "http://localhost:4200/")
    @GetMapping("/{jobCategory}")
    public List<JobEntity> getJobsByCategory(@PathVariable String jobCategory) {
        return jobService.getJobsByCategory(jobCategory);
    }
}
