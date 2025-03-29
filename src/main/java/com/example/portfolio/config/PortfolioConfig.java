package com.example.portfolio.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.portfolio.model.Experience;

@Configuration
public class PortfolioConfig {
    
    @Bean
    public List<Experience> experiences() {
        return Arrays.asList(
            Experience.builder()
                .company("Deutsche Bank")
                .position("Associate Software Engineer")
                .duration("Sep 2023 - present")
                .description(
                    "• Built scalable Spring Boot REST APIs and backend services for cloud-native apps, improving performance by 40%\n" +
                "• Secured microservices using Spring Security, OAuth2, and JWT for robust auth flows\n" +
                "• Integrated JMS with IBM MQ and Kafka for reliable async messaging across services\n" +
                "• Engineered multi-threaded SFTP file processing (100K+ rows), enabling fault-tolerant data ingestion\n" +
                "• Followed TDD/BDD practices using JUnit and Mockito, enhancing code quality and stability\n" +
                "• Optimized MySQL data filtering with dynamic JSON parsing for high-throughput systems\n" +
                "• Automated CI/CD using Jenkins, Maven, Docker; reduced deployment time by 40%\n" +
                "• Led OCP3 to OCP4 migration using Helm, Kubernetes, and OpenShift Operators, enabling GCP integration"
                )    
                .build(),
                
            Experience.builder()
                .company("UNC Charlotte")
                .position("Teaching/Instruction Assistant")
                .duration("Aug 2022 - May 2023")
                .description(
                    "• Instructed and mentored 72 students in advanced Software Development methodologies and practices\n" +
                    "• Designed and evaluated programming assignments focusing on Java, Spring Boot, and microservices\n" +
                    "• Created comprehensive assessment criteria and grading rubrics for course projects\n" +
                    "• Conducted one-on-one sessions to help students with complex programming concepts\n" +
                    "• Facilitated weekly lab sessions focusing on practical software development skills\n" +
                    "• Collaborated with professors to improve course content and learning outcomes"
                )
                .build(),
                
            Experience.builder()
                .company("IBM(Kyndryl)")
                .position("Software Engineer")
                .duration("Oct 2019 - Oct 2021")
                .description(
                    "• Spearheaded the migration of monolithic applications to microservices architecture using Spring Cloud\n" +
                    "• Implemented containerization using Docker and Kubernetes, improving scalability by 70%\n" +
                    "• Developed and maintained RESTful APIs serving 1M+ daily requests with 99.9% uptime\n" +
                    "• Integrated Kotlin services with existing Java applications, enhancing system functionality\n" +
                    "• Optimized database performance through indexing and query optimization, reducing latency by 50%\n" +
                    "• Led code reviews and implemented coding standards across multiple development teams\n" +
                    "• Managed deployment pipelines in AWS, implementing auto-scaling and monitoring solutions"
                )
                .build(),
                
            Experience.builder()
                .company("Infosys")
                .position("Software Engineer(Intern)")
                .duration("Jan 2019 - May 2019")
                .description(
                    "• Developed responsive web applications using React.js and Redux, improving user engagement by 35%\n" +
                    "• Implemented RESTful APIs using Spring Boot and Hibernate for efficient data management\n" +
                    "• Created automated test suites achieving 85% code coverage using Jest and JUnit\n" +
                    "• Participated in agile development cycles, contributing to sprint planning and daily standups\n" +
                    "• Optimized application performance through code refactoring and implementing best practices"
                )
                .build()
        );
    }
} 
