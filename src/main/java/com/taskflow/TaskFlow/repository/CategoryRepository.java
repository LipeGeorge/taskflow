package com.taskflow.TaskFlow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

import com.taskflow.TaskFlow.entity.Category;

// @Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
