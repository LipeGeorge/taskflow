package com.taskflow.TaskFlow.Entity;

import com.taskflow.TaskFlow.Entity.enums.Priority;
import com.taskflow.TaskFlow.Entity.enums.Status;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.Set;

@Entity
@Table(name = "tb_task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long taskId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "scheduleAt")
    private Instant scheduleAt;

    @Column(name = "dueAt")
    private Instant dueAt;

    @Column(name = "priority")
    private Priority priority;

    @Column(name = "status")
    private Status status;

    @Column(name = "createdAt")
    private Instant createdAt;

    @Column(name = "updatedAt")
    private Instant updatedAt;

    @Column(name = "completedAt")
    private Instant completedAt;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Category category;

    @OneToMany
    @JoinColumn(name = "reminders")
    private Set<TaskReminder> reminders;

    public Task() {
    }

    public Task(Long taskId, String title, String description, Instant scheduleAt, Instant dueAt, Priority priority, Status status, Instant createdAt, Instant updatedAt, Instant completedAt, User user, Category category, Set<TaskReminder> reminders) {
        this.taskId = taskId;
        this.title = title;
        this.description = description;
        this.scheduleAt = scheduleAt;
        this.dueAt = dueAt;
        this.priority = priority;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.completedAt = completedAt;
        this.user = user;
        this.category = category;
        this.reminders = reminders;
    }


    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getScheduleAt() {
        return scheduleAt;
    }

    public void setScheduleAt(Instant scheduleAt) {
        this.scheduleAt = scheduleAt;
    }

    public Instant getDueAt() {
        return dueAt;
    }

    public void setDueAt(Instant dueAt) {
        this.dueAt = dueAt;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Instant getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(Instant completedAt) {
        this.completedAt = completedAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<TaskReminder> getReminders() {
        return reminders;
    }

    public void setReminders(Set<TaskReminder> reminders) {
        this.reminders = reminders;
    }
}
