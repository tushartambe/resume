package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.qap.ctimelineview.TimelineRow;
import org.qap.ctimelineview.TimelineViewAdapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Experience extends AppCompatActivity {

    ArrayList<TimelineRow> timelineRowsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);

        timelineRowsList = new ArrayList<>();

        Date twDate = null;
        try {
            twDate = new SimpleDateFormat("dd/MM/yyyy").parse("02/03/2020");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        TimelineRow tw = new TimelineRow(0);
        tw.setDate(twDate);
        tw.setTitle("Consultant");
        tw.setDescription("@ ThoughtWorks \n From 2020 to Present");
        tw.setBellowLineColor(Color.rgb(61, 61, 61));
        tw.setBellowLineSize(6);
        tw.setImageSize(40);
        tw.setBackgroundColor(Color.rgb(0, 0, 0));
        tw.setBackgroundSize(60);
        tw.setDateColor(Color.rgb(109, 110, 109));
        tw.setTitleColor(Color.rgb(0, 12, 87));
        tw.setDescriptionColor(Color.rgb(51, 57, 99));
        timelineRowsList.add(tw);

        Date stepDate = null;
        try {
            stepDate = new SimpleDateFormat("dd/MM/yyyy").parse("02/07/2018");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        TimelineRow step = new TimelineRow(1);
        step.setDate(stepDate);
        step.setTitle("Intern [STEP Programme]");
        step.setDescription("@ ThoughtWorks \n From 2018 to 2020");
        step.setBellowLineColor(Color.rgb(61, 61, 61));
        step.setBellowLineSize(6);
        step.setImageSize(40);
        step.setBackgroundColor(Color.rgb(0, 0, 0));
        step.setBackgroundSize(60);
        step.setDateColor(Color.rgb(109, 110, 109));
        step.setTitleColor(Color.rgb(0, 12, 87));
        step.setDescriptionColor(Color.rgb(51, 57, 99));
        timelineRowsList.add(step);


        ArrayAdapter<TimelineRow> myAdapter = new TimelineViewAdapter(this, 0, timelineRowsList,
                true);

        ListView myListView = (ListView) findViewById(R.id.timeline_experience);
        myListView.setAdapter(myAdapter);
    }
}
