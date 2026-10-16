package com.taskflow.TaskFlow.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_task_reminder")
public class TaskReminder {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long taskReminderId;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Task task;

    @Column(name = "remindAt")
    private Instant remindAt;

    @Column(name = "sent")
    private Boolean sent;

    public TaskReminder(){}

    public TaskReminder(Long taskReminderId, Task task, Instant remindAt, Boolean sent) {
        this.taskReminderId = taskReminderId;
        this.task = task;
        this.remindAt = remindAt;
        this.sent = sent;
    }

    public Long getTaskReminderId() {
        return taskReminderId;
    }

    public void setTaskReminderId(Long taskReminderId) {
        this.taskReminderId = taskReminderId;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Instant getRemindAt() {
        return remindAt;
    }

    public void setRemindAt(Instant remindAt) {
        this.remindAt = remindAt;
    }

    public Boolean getSent() {
        return sent;
    }

    public void setSent(Boolean sent) {
        this.sent = sent;
    }
}
