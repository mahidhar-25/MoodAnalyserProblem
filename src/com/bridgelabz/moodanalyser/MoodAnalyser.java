package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    private String message;
/*
@desc: getters for the message variable
@params : no params
@return : String - message
 */
    public String getMessage() {
        return message;
    }

    /*
@desc: setter for the message variable
@params : String - message
@return : void
 */

    public void setMessage(String message) {
        this.message = message;
    }

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
    public String analyseMood() throws MoodAnalysisException {
        if(message == null){
            throw new MoodAnalysisException(MoodAnalysisError.NULL, "Mood should not be null");
        }else if (message.isEmpty()) {
            throw new MoodAnalysisException(MoodAnalysisError.EMPTY, "Mood should not be empty");
        }
        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}
