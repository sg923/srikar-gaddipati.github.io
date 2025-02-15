package com.example.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.portfolio.config.PortfolioProperties;
import com.example.portfolio.model.Experience;

@Controller
public class WebController {
    
    @Autowired
    private List<Experience> experiences;
    
    @Autowired
    private PortfolioProperties properties;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("experiences", experiences);
        model.addAttribute("properties", properties);
        return "index";
    }
}


