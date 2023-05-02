package com.sparta.aa;

public class Program {
    // coding in main,
    // main must be as clean as possible, only responsibility is to start the program
    // 2 jobs - makes it difficult to check its doing those 2 properly
    // cannot test method
    // what makes code good: Readability, Maintainability, Testability
    public static void main(String[] args) {
        int timeOfDay = 21;
        System.out.println(getGreeting(timeOfDay));
    }

    private static String getGreeting(int timeOfDay) {
        String greeting = "";
        if (timeOfDay >= 5 && timeOfDay <= 12) {
            greeting = "Good morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            greeting = "Good afternoon!";
        } else {
            greeting = "Good evening!";
        }
        return greeting;
    }
}
