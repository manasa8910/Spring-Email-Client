package com.example.springEmailClient.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Category {

    private Long id;
    private String name;
    private String description;
    private boolean needsApproval;
}
