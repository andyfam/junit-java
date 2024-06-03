package com.yufeng.junitjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyJunitTest {

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
    }
}