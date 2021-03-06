package com.example.demo;

import com.example.demo.Instructor;
import com.example.demo.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;

@Configuration
public class InstructorsConfig {

    @Bean(name = "usa")
    public Instructors tcUsaInstructors() {
        Instructors instructors = new Instructors(new ArrayList<>());
        instructors.add(new Instructor(3L, "Kris"));
        instructors.add(new Instructor(4L, "Nhu"));
        return instructors;
    }

    @Bean(name = "uk")
    public Instructors tcUKInstructors() {
        Instructors instructors = new Instructors(new ArrayList<>());
        instructors.add(new Instructor(5L, "Leon"));
        instructors.add(new Instructor(6L, "Dolio"));
        return instructors;
    }

    @Primary
    @Bean(name = "instructors")
    public Instructors getAllZipCodeInstructors() {
        Instructors instructors = new Instructors(new ArrayList<>());
        instructors.add(new Instructor(3L, "Leon"));
        instructors.add(new Instructor(4L, "Nhu"));
        instructors.add(new Instructor(5L, "Kris"));
        instructors.add(new Instructor(6L, "Dolio"));
        instructors.add(new Instructor(7L, "Froilan"));
        instructors.add(new Instructor(8L, "Wilhem"));
        instructors.add(new Instructor(9L, "Tariq"));
        return instructors;
    }

}
