package com.yufeng.junitjava;

import org.junit.jupiter.api.*;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;

class MyJunitTest {

    static Logger log = Logger.getLogger(MyJunitTest.class.getName());

    @Test
    void sum() {
        var myJunit = new MyJunit();
        assertEquals(4, myJunit.sum(2, 2));
        assertEquals(6, myJunit.sum(3, 3));
    }

    @Test
    void gradeLetter() {
        var myJunit = new MyJunit();

        //normal test
        assertEquals("F", myJunit.gradeLetter(55));
        assertEquals("D", myJunit.gradeLetter(65));
        assertEquals("C", myJunit.gradeLetter(75));
        assertEquals("B", myJunit.gradeLetter(85));
        assertEquals("A", myJunit.gradeLetter(95));

        //edge case test
        assertEquals("F", myJunit.gradeLetter(0));
        assertEquals("D", myJunit.gradeLetter(60));
        assertEquals("C", myJunit.gradeLetter(70));
        assertEquals("B", myJunit.gradeLetter(80));
        assertEquals("A", myJunit.gradeLetter(90));

        //exception test
        assertThrows(IllegalArgumentException.class, () -> {
            myJunit.gradeLetter(-1);
        });
    }

    @BeforeAll
    static void setup() {
        log.info("@BeforeAll - executes once before all test methods in this class");
    }

    @BeforeEach
    void init() {
        log.info("@BeforeEach - executes before each test method in this class");
    }

    @AfterEach
    void tearDown() {
        log.info("@AfterEach - executed after each test method.");
    }

    @AfterAll
    static void done() {
        log.info("@AfterAll - executed after all test methods.");
    }

    @DisplayName("Single test successful")
    @Test
    void testSingleSuccessTest() {
        log.info("Success");
    }

    @Test
    @Disabled("Not implemented yet")
    void testShowSomething() {
    }

    @Test
    void assumptionThat() {
        String someString = "Just a string";
        assumingThat(
                someString.equals("Just a string"),
                () -> assertEquals(2 + 2, 4)
        );
    }
}