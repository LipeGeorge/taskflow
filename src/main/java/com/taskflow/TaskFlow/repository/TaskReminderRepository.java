package com.taskflow.TaskFlow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

import com.taskflow.TaskFlow.entity.TaskReminder;

// @Repository
public interface TaskReminderRepository extends JpaRepository<TaskReminder, Long> {
}
