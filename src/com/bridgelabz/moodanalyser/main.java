package com.bridgelabz.moodanalyser;

public class main {
    public static void main(String[] args) throws MoodAnalysisException {
        System.out.println("Welcome to mood analyser problem");
                try {
                    // Test Case 1 - Given “I am in Sad Mood” message, Should Return SAD
                    MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am in Sad Mood");
                    System.out.println("Test Case 1: " + moodAnalyser1.analyseMood());

                    // Test Case 1.1 - Given “I am in Any Mood” message, Should Return HAPPY
                    MoodAnalyser moodAnalyser2 = new MoodAnalyser("I am in Any Mood");
                    System.out.println("Test Case 1.1: " + moodAnalyser2.analyseMood());

                    // Test Case 1.2 - Given “I am in Sad Mood” message in Constructor Should Return SAD
                    MoodAnalyser moodAnalyser3 = new MoodAnalyser("I am in Sad Mood");
                    System.out.println("Test Case 1.2: " + moodAnalyser3.analyseMood());

                    // Test Case 1.3 - Given “I am in Happy Mood” message in Constructor Should Return HAPPY
                    MoodAnalyser moodAnalyser4 = new MoodAnalyser("I am in Happy Mood");
                    System.out.println("Test Case 1.3: " + moodAnalyser4.analyseMood());

                    // Test Case 2 - Given Null Mood Should Return Happy
                    MoodAnalyser moodAnalyser5 = new MoodAnalyser(null);
                    System.out.println("Test Case 2: " + moodAnalyser5.analyseMood());

                    // Test Case 2.1 - Given Invalid Mood Should Throw MoodAnalysisException
                    MoodAnalyser moodAnalyser6 = new MoodAnalyser("");
                    System.out.println("Test Case 2.1: " + moodAnalyser6.analyseMood());
                    // Test Case 3 - Given NULL Mood Should Throw MoodAnalysisException
                    MoodAnalyser moodAnalyser7 = new MoodAnalyser(null);
                    System.out.println("Test Case 3: " + moodAnalyser7.analyseMood());


                } catch (MoodAnalysisException e) {
                    System.out.println("Exception: " + e.getMessage() + ", Error: " + e.error);
                }

    }
}
