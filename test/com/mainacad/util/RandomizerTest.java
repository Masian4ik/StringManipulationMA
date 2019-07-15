package com.mainacad.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomizerTest {

    @Test
    void testGetRandomNumber() {
        int testNumber = Randomizer.getRandomNumber(50, 100);
        assertNotNull(testNumber);
        assertTrue(testNumber >= 50 & testNumber <= 100);

    }

    @Test
    void getRandomSrtring() {
        String testString = Randomizer.getRandomSrtring(20);
        assertNotNull(testString);
        assertEquals(20, testString.length());
    }
}