package com.example.portfolio.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "portfolio")
public class PortfolioProperties {
    private String title;
    private String subtitle;
    private String theme;
    private int gridColumns;
} 