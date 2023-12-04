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


    @Test
    public void testAnalyseMoodEmptyMessageShouldThrowMoodAnalysisException() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("");
            moodAnalyser.analyseMood();
            fail("Expected MoodAnalysisException but did not occur");
        } catch (MoodAnalysisException e) {
            assertEquals(MoodAnalysisError.EMPTY, e.error);
            assertEquals("Mood should not be empty", e.getMessage());
        }
    }
/*
@desc : Test Case for Null Message Exception:

Objective: This test case aims to verify that when a MoodAnalyser object is created with a null message and the analyseMood() method is called, it correctly throws a MoodAnalysisException.
Procedure:
An instance of MoodAnalyser is created with a null message.
The analyseMood() method is invoked.
Expected Outcome: The test is successful if a MoodAnalysisException with the expected type is thrown.
 */
    @Test(expected = MoodAnalysisException.class)
    public void testAnalyseMoodNullMessageShouldThrowMoodAnalysisExceptionWithNullError() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        moodAnalyser.analyseMood();
    }
/*
@desc : Test Case for Null Message Exception with Error Message Validation:

Objective: This test case verifies that the MoodAnalysisException thrown in the previous test case contains the expected error type and message.
Procedure:
An instance of MoodAnalyser is created with a null message.
The analyseMood() method is invoked within a try-catch block.
The caught MoodAnalysisException is then validated for the expected error type and message.
Expected Outcome: The test is successful if the caught exception has the expected error type and message.
 */
    @Test(expected = MoodAnalysisException.class)
    public void testAnalyseMoodNullMessageShouldThrowMoodAnalysisExceptionWithNullErrorAndMessage() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            assertEquals(MoodAnalysisError.NULL, e.error);
            assertEquals("Mood should not be null", e.getMessage());
            throw e;
        }
    }

}
