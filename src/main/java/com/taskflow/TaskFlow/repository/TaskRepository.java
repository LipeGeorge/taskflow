package com.taskflow.TaskFlow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

import com.taskflow.TaskFlow.entity.Task;

// @Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
