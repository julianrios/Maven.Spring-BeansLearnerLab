package com.example.demo.models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {
        Students studentsList = new Students(new ArrayList<>());
        studentsList.add(new Student(2L, "Julian"));
        studentsList.add(new Student(4L, "Bryan"));
        return studentsList;
    }

    @Bean(name = "previousStudents")
    public Students previousStudents() {
        Students previousStudentsList = new Students(new ArrayList<>());
        previousStudentsList.add(new Student(1L, "Jon"));
        previousStudentsList.add(new Student(2L, "Connor"));
        return previousStudentsList;
    }
}
