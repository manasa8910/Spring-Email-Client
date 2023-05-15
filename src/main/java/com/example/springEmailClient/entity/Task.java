package com.example.springEmailClient.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {

    private Long id;
    private String name;
    private String description;
    private Status status = Status.ASSIGNED; //default
    private boolean completed = false;  //default
    private Priority priority;
    private Date createdAt;
    private Date updatedAt;
    private User createdBy;
    private User assignedTo;
    private Project project;
    private Category category;
}

