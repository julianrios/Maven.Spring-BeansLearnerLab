package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = InstructorsConfig.class)
public class TestInstructorConfig {

    @Autowired @Qualifier("usa")
    Instructors USAInstructors;
    @Test
    public void testUSAInstructorsToString() {
        // given
        String expected = "id: 3\nname: Kris\n" +
                "id: 4\nname: Nhu\n";
        // when
        String actual = USAInstructors.toString();
        // then
        System.out.println(USAInstructors.toString());
        Assert.assertEquals(expected, actual);
    }

    @Autowired @Qualifier("uk")
    Instructors UKInstructors;
    @Test
    public void testUKInstructorsToString() {
        // given
        String expected = "id: 5\nname: Leon\n" +
                "id: 6\nname: Dolio\n";
        // when
        String actual = UKInstructors.toString();
        // then
        System.out.println(UKInstructors.toString());
        Assert.assertEquals(expected, actual);
    }

    @Autowired @Qualifier("instructors")
    Instructors allInstructors;
    @Test
    public void testAllZipCodeInstructorsToString() {
        // given
        String expected = "id: 3\nname: Leon\n" +
                "id: 4\nname: Nhu\n" +
                "id: 5\nname: Kris\n" +
                "id: 6\nname: Dolio\n" +
                "id: 7\nname: Froilan\n" +
                "id: 8\nname: Wilhem\n" +
                "id: 9\nname: Tariq\n";
        // when
        String actual = allInstructors.toString();
        // then
        System.out.println(allInstructors.toString());
        Assert.assertEquals(expected, actual);
    }
}
