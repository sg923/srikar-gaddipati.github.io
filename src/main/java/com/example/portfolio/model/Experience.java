package com.example.portfolio.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Experience {
    private String company;
    private String position;
    private String duration;
    private String description;
} 