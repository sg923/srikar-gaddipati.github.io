package com.example.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.example.portfolio.config.PortfolioProperties;

@SpringBootApplication
@EnableConfigurationProperties(PortfolioProperties.class)
public class PortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}

}
//test
// generate an application that displays a portfolio of projects
// the portfolio should be displayed in a grid of cards
// each card should display the project name, a description, and a link to the project
// the portfolio should be styled with CSS
// the application should be deployed on AWS
// the application should be containerized using Docker
// the application should be deployed using Kubernetes
// do it in a way that is easy to understand and follow
// do it in a way that is easy to deploy and scale
// do it in a way that is easy to maintain and update
// do it in a way that is easy to test and debug
// do it in a way that is easy to deploy and scale
// do it in a way that is easy to maintain and update
// do it in a way that is easy to test and debug


