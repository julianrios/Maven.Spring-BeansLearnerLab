package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = StudentConfig.class)
@RunWith(SpringRunner.class)
public class TestStudentConfig {

    @Autowired @Qualifier("students")
    Students students;
    @Test
    public void testCurrentStudents() {
        // given
        String expected = "id: 3\nname: Julian\n" +
                "id: 4\nname: Bryan\n";
        // when
        String actual = students.toString();
        // then
        System.out.println(students.toString());
        Assert.assertEquals(expected, actual);
    }

    @Autowired @Qualifier("previousStudents")
    Students previousStudents;
    @Test
    public void testPreviousStudents() {
        // given
        String expected = "id: 1\nname: Jon\n" +
                "id: 2\nname: Connor\n";
        // when
        String actual = previousStudents.toString();
        // then
        System.out.println(previousStudents.toString());
        Assert.assertEquals(expected, actual);
    }
}
