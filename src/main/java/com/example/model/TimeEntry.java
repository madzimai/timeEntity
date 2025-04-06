package com.example.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class TimeEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taskName;

    private String period; // daily, weekly, monthly, quarterly, yearly

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private String description;

    private Double completionPercentage; // 0.0 to 100.0

    // === Constructors ===

    public TimeEntry() {
    }

    public TimeEntry(Long id, String taskName, String period, LocalDateTime startTime, LocalDateTime endTime, String description, Double completionPercentage) {
        this.id = id;
        this.taskName = taskName;
        this.period = period;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
        this.completionPercentage = completionPercentage;
    }

    // === Getters and Setters ===

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getCompletionPercentage() {
        return completionPercentage;
    }

    public void setCompletionPercentage(Double completionPercentage) {
        this.completionPercentage = completionPercentage;
    }
}
