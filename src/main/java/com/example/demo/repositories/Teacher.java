package com.example.demo.repositories;

public interface Teacher {
    void teach(Learner learner, double numberOf);
    void lecture(Iterable<? extends Learner> learners, double numberOfHours);
}
