package com.example.demo.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @DependsOn({"students", "allInstructors"})
    @Bean (name = "currentCohort")
    public Classroom currentCohort(@Qualifier("students") Students students, @Qualifier("allInstructors") Instructors allInstructors) {
        return new Classroom(students, allInstructors);
    }

    @DependsOn({"previousStudents", "allInstructors"})
    @Bean(name = "previousCohort")
    public Classroom previousCohort(@Qualifier("previousStudents") Students previousStudents, @Qualifier("allInstructors") Instructors allInstructors) {
        return new Classroom(previousStudents, allInstructors);
    }
}
