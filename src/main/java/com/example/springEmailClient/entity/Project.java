package com.example.springEmailClient.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {


    private Long id;
    private String name;
    private String description;
}
