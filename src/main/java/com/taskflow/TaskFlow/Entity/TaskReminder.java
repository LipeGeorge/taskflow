package com.taskflow.TaskFlow.Entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_task_reminder")
public class TaskReminder {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long taskReminderId;

    @ManyToOne(cascade = CascadeType.ALL)
    private Task task;

    @Column(name = "remindAt")
    private Instant remindAt;

    @Column(name = "sent")
    private Boolean sent;


}
