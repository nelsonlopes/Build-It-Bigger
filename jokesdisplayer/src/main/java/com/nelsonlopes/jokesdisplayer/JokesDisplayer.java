package com.nelsonlopes.jokesdisplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class JokesDisplayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes_displayer);

        Intent intent = getIntent();
        if (intent == null) {
            closeOnError();
        }

        if (intent.hasExtra(getString(R.string.intent_joke))) {
            String joke = intent.getStringExtra(getString(R.string.intent_joke));

            if (!joke.equals("")) {
                Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();
            } else {
                closeOnError();
            }
        } else {
            closeOnError();
        }
    }

    private void closeOnError() {
        finish();
        Toast.makeText(this, R.string.error_message, Toast.LENGTH_SHORT).show();
    }
}
