package com.nelsonlopes.javajokes;

import java.util.Random;

public class Joker {

    private static String[] jokes = {
            "Girls are like Internet Domain names, the ones I like are already taken.",
            "Q: How many programmers does it take to change a light bulb?\n" +
                    "A: None, that's a hardware problem.",
            "If at first you don't succeed, call it version 1.0.",
            "CAPS LOCK - Preventing Login Since 1980.",
            "A system administrator has 2 problems:\n" +
                    "- dumb users\n" +
                    "- smart users "};

    public static String getJoke() {
        return jokes[new Random().nextInt(jokes.length)];
    }
}
