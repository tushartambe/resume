package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
    }

    public void goToEducation(View view) {
        Intent intent = new Intent(this, Education.class);
        startActivity(intent);
    }

    public void goToExperience(View view) {
        Intent intent = new Intent(this, Experience.class);
        startActivity(intent);
    }

    public void goToSkills(View view) {
        Intent intent = new Intent(this, Skills.class);
        startActivity(intent);
    }

    public void instagramProfile(View view) {
        String url = "https://www.instagram.com/being_coder_/?hl=en";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    public void facebookProfile(View view) {
        String url = "https://www.facebook.com/profile.php?id=100009797925213";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    public void linkedInProfile(View view) {
        String url = "https://in.linkedin.com/in/tushar-tambe-3b3b48158";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    public void githubProfile(View view) {
        String url = "https://www.github.com/tushartambe";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

}
