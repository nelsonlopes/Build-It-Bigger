package com.udacity.gradle.builditbigger.backend;

import com.nelsonlopes.javajokes.Joker;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private Joker joker;

    public MyBean() {
        joker = new Joker();
    }

    public String getJoke() {
        return joker.getJoke();
    }
}