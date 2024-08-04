package com.example.jobbybackend.service;

import com.example.jobbybackend.entity.AddJobEntity;
import com.example.jobbybackend.repository.AddJobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddJobService {

    @Autowired
    private AddJobRepository addJobRepository;

    public AddJobEntity saveJob(AddJobEntity addJobEntity) {
        return addJobRepository.save(addJobEntity);
    }
}