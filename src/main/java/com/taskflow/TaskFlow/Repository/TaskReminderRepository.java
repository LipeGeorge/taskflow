package com.taskflow.TaskFlow.Repository;

import com.taskflow.TaskFlow.Entity.TaskReminder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskReminderRepository extends JpaRepository<TaskReminder, Long> {
}
