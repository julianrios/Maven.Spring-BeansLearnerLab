package com.example.demo;

import com.example.demo.People;
import com.example.demo.Student;

import java.util.List;

public class Students extends People<Student> {

    public Students(List<Student> personList) {
        super(personList);
    }
}
