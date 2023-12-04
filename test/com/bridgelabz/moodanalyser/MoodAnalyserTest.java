package com.bridgelabz.moodanalyser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyserTest {
    /*
    @desc : when pass the message using setter it should analyse the message and returns the mood
     */

    @Test
    public void testAnalyseMoodSadMessageShouldReturnSAD() {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            moodAnalyser.setMessage("I am in Sad Mood");
            assertEquals("SAD", moodAnalyser.analyseMood());
    }
        /*
    @desc : when pass the message using setter it should analyse the message and returns the mood
     */

    @Test
    public void testAnalyseMoodAnyMessageShouldReturnHAPPY() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.setMessage("I am in Any Mood");
            assertEquals("HAPPY", moodAnalyser.analyseMood());

    }

}
