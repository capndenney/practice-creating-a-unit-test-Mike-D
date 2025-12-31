package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//The test class mirrors the name of the class being tested (with Test at the end) DONE
//The test method name clearly describes what is being tested
//The test can run independently and doesn’t rely on other tests
//There is at least one test for the normal (“happy path”) case DONE
//There is at least one test for an edge case or unusual input
//The test uses appropriate assertions to verify behavior

public class PersonTest {
    @Test
    public void testGetAge() {
        Person mike = new Person("Mike", 31, "1600 Penn Ave");
        int result = mike.getAge();
        assertEquals(31, result);
    }
    @Test
    public void testGetNameandAddress() {
        Person mike = new Person("Mike", 29, "122 s 2nd");
        String result = mike.getNameAndAddress();
        assertEquals("Mike 122 s 2nd", result);
    }
    @Test
    public void testSetAge() {
        Person mike = new Person("Mike", 31, "1600 Penn Ave");
        mike.setAge(Integer.MAX_VALUE);
        int result = mike.getAge();
        assertEquals(Integer.MAX_VALUE, result);
    }
}