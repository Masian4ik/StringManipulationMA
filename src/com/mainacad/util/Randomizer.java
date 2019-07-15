package com.mainacad.util;

import java.util.Random;

public class Randomizer {


    public static int getRandomNumber(int min, int max) {
        int randomNumber = min + new Random().nextInt(max-min);
        return randomNumber;

    }

    public static String getRandomSrtring(int lenght) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzAABCDEFGHIJKLMNOPQRSTUWXYZ0123456789";
        char[] symbols = alphabet.toCharArray();
        String outText = "";
        for (int i = 0; i < lenght; i++) {
            outText += symbols[getRandomNumber(0, symbols.length - 1)];

        }
        return outText;
    }

}

