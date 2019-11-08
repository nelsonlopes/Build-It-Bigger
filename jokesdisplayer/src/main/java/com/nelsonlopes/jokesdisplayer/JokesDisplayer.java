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

        String joke = intent.getStringExtra(getString(R.string.intent_joke));

        Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();
    }

    private void closeOnError() {
        finish();
        Toast.makeText(this, R.string.error_message, Toast.LENGTH_SHORT).show();
    }
}
