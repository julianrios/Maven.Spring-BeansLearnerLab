package com.example.demo.models;

import com.example.demo.repositories.Teacher;

import java.util.ArrayList;

public class Classroom {
    Students students;
    Instructors instructors;

    public Classroom(Students students, Instructors instructors) {
        this.students = students;
        this.instructors = instructors;
    }

    public void hostLecture(Teacher teacher, Double numberOfHours) {
        teacher.lecture(students,numberOfHours);
    }

}
