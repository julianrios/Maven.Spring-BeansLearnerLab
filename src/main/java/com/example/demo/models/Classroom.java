package com.example.demo.models;

import com.example.demo.repositories.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    List<Instructors> instructorsList;
    List<Students> studentsList;

    public Classroom(List<Instructors> instructorsList, List<Students> studentsList) {
        this.instructorsList = instructorsList;
        this.studentsList = studentsList;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(new ArrayList<>(10), numberOfHours);
    }

}
