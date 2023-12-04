package com.bridgelabz.moodanalyser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MoodAnalyserTest {
    /*
    @desc : when pass the message using setter it should analyse the message and returns the mood
     */

    @Test
    public void testAnalyseMoodSadMessageShouldReturnSAD() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            moodAnalyser.setMessage("I am in Sad Mood");
            assertEquals("SAD", moodAnalyser.analyseMood());
        }catch (MoodAnalysisException e) {
            fail("Unexpected exception");
        }
    }
        /*
    @desc : when pass the message using setter it should analyse the message and returns the mood
     */

    @Test
    public void testAnalyseMoodAnyMessageShouldReturnHAPPY() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            moodAnalyser.setMessage("I am in Any Mood");
            assertEquals("HAPPY", moodAnalyser.analyseMood());
        }catch (MoodAnalysisException e) {
            fail("Unexpected exception");
        }

    }
        /*
    @desc : when pass the message while intializing using constructors it should analyse the message and returns the mood
     */

    @Test
    public void testAnalyseMoodSadMessageShouldReturnSADUseConstructors() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
            assertEquals("SAD", moodAnalyser.analyseMood());
        }catch (MoodAnalysisException e) {
            fail("Unexpected exception");
        }

    }
    /*
@desc : when pass the message while intializing using constructors it should analyse the message and returns the mood
 */
    @Test
    public void testAnalyseMoodAnyMessageShouldReturnHAPPYUseConstructors() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
            assertEquals("HAPPY", moodAnalyser.analyseMood());
        }catch (MoodAnalysisException e) {
            fail("Unexpected exception");
        }

    }
    @Test
    public void testAnalyseMoodNullMessageShouldReturnHAPPY() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser(null);
            assertEquals("HAPPY", moodAnalyser.analyseMood());
        } catch (MoodAnalysisException e) {
            assertEquals(MoodAnalysisError.NULL, e.error);
            assertEquals("Mood should not be null", e.getMessage());
        }
    }

}
