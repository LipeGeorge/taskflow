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

    @ManyToOne(cascade = CascadeType.ALL)
    private Category category;

    @OneToMany
    @JoinColumn(name = "reminders")
    private Set<TaskReminder> reminders;
}
