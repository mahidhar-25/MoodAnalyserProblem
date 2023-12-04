package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    private String message;

    /*
    @desc : default constructor , initializes the empty message
    @params : no params
    @return : void
     */
    public MoodAnalyser() {
        this.message = "";
    }


      /*
    @desc : Parameterized constructor , initializes the  message provided
    @params : String - message
    @return : void
     */
    public MoodAnalyser(String message) {
        this.message = message;
    }

    // Method to analyze mood
    /*
    @desc : analyze mode will the check the condition whether message contains sad or happy
    @parms : no params
    @return : String - Mood
     */
    public String analyseMood()  {
        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}
