package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView aboutMe;
    String myInfo = "I’m Tushar, born and brought up in Pune(Rajgurunagar). Started programming with so many dreams in mind. I’m curious to know about how things work. Worked on JavaScript, Clojure, React and Java.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToAboutMe(View view) {
        Intent intent = new Intent(this, AboutMe.class);
        startActivity(intent);
    }
}
