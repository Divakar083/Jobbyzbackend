package com.example.jobbybackend.dto;

public class AddJob {

    private String jobCategory;
    private String job;
    private String company;
    private String experience;
    private String location;
    private String salary;
    private String joblink;

    // Getters and Setters
    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getJoblink() {
        return joblink;
    }

    public void setJoblink(String joblink) {
        this.joblink = joblink;
    }
}
