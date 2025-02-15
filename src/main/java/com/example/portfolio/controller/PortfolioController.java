package com.example.portfolio.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.portfolio.config.PortfolioProperties;
import com.example.portfolio.model.Experience;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/portfolio")
@RequiredArgsConstructor
public class PortfolioController {
    private final List<Experience> experiences;
    private final PortfolioProperties properties;

    @GetMapping("/config")
    public PortfolioProperties getConfig() {
        return properties;
    }

    @GetMapping("/experiences")
    public List<Experience> getExperiences() {
        return experiences;
    }
} 