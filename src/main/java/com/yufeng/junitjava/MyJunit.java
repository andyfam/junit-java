package com.yufeng.junitjava;

public class MyJunit {
    public static void main(String[] args) {

    }

    public int sum(int a, int b) {
        return a + b;
    }

    public String gradeLetter(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("number cannot be less than 0");
        } else if (number < 60) {
            return "F";
        } else if (number < 70) {
            return "D";
        } else if (number < 80) {
            return "C";
        } else if (number < 90) {
            return "B";
        } else {
            return "A";
        }

    }
}
