package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @DependsOn({"students", "allInstructors"})
    @Bean (name = "currentCohort")
    public Classroom currentCohort(Students students, Instructors allInstructors) {
        return new Classroom(students, allInstructors);
    }

    @DependsOn({"previousStudents", "allInstructors"})
    @Bean(name = "previousCohort")
    public Classroom previousCohort(Students previousStudents, Instructors allInstructors) {
        return new Classroom(previousStudents, allInstructors);
    }
}
