package com.mjcuenca.arquitectura.model;

import java.time.LocalDate;

public class Task {

    public enum TaskStatus{pending,in_progress,done};
    private int id;
    private String name;
    private String description;
    private String owner;
    private LocalDate creationDate;
    private TaskStatus status;

    public Task(int id, String name, String description, String owner, LocalDate creationDate, TaskStatus status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.owner = owner;
        this.creationDate = creationDate;
        this.status = status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getOwner() {
        return owner;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public TaskStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Task{id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", owner='" + owner + '\'' +
                ", creationDate=" + creationDate +
                ", status='" + status + '}';
    }

}