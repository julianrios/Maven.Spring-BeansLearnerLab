package com.example.demo.models;

import com.example.demo.repositories.Learner;
import com.example.demo.repositories.Teacher;

public class Instructor extends Person implements Teacher {

    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOf) {
        learner.learn(numberOf);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        for (Learner obj : learners) {
            obj.learn(numberOfHours/getSize(learners));
        }
    }

    public int getSize(Iterable<? extends Learner> learners) {
        int size = 0;
        for (Learner obj : learners) {
            size++;
        }
        return size;
    }
}
