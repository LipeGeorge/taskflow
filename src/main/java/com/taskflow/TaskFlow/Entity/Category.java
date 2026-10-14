package com.taskflow.TaskFlow.Entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "tb_category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    @OneToMany
    @JoinColumn(name = "tasks")
    private Set<Task> tasks;

}
