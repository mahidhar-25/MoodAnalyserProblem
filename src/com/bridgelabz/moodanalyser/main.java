package com.bridgelabz.moodanalyser;

public class main {
    public static void main(String[] args) {
        System.out.println("Welcome to mood analyser problem");
            // Test Case 1 - Given “I am in Sad Mood” message, Should Return SAD
            MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am in Sad Mood");
            System.out.println("Test Case 1: " + moodAnalyser1.analyseMood());

    }
}
