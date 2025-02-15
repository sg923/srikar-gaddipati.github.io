package com.example.portfolio.model;

import lombok.Data;
import lombok.Builder;
import java.util.List;

@Data
@Builder
public class Project {
    private String name;
    private String description;
    private String link;
    private List<String> technologies;
    private String imageUrl;
} 
//Fix the issue with the Project class

