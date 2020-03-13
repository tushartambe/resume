package com.example.resume;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import org.qap.ctimelineview.TimelineRow;
import org.qap.ctimelineview.TimelineViewAdapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Education extends AppCompatActivity {

    ArrayList<TimelineRow> timelineRowsList;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        timelineRowsList = new ArrayList<>();



        Date bcaDate = null;
        try {
            bcaDate = new SimpleDateFormat("dd/MM/yyyy").parse("01/10/2019");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        TimelineRow bca = new TimelineRow(0);
        bca.setDate(bcaDate);
        bca.setTitle("BCA");
        bca.setDescription("@ Alagappa University \n From 2019 to Present");
        bca.setBellowLineColor(Color.rgb(61, 61, 61));
        bca.setBellowLineSize(6);
        bca.setImageSize(40);
        bca.setBackgroundColor(Color.rgb(0, 0, 0));
        bca.setBackgroundSize(60);
        bca.setDateColor(Color.rgb(109, 110, 109));
        bca.setTitleColor(Color.rgb(0, 12, 87));
        bca.setDescriptionColor(Color.rgb(51, 57, 99));
        timelineRowsList.add(bca);

        Date diplomaDate = null;
        try {
            diplomaDate = new SimpleDateFormat("dd/MM/yyyy").parse("16/6/2015");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        TimelineRow diploma = new TimelineRow(1);
        diploma.setDate(diplomaDate);
        diploma.setTitle("Diploma In Computer Engineering");
        diploma.setDescription("@ Govt. Polytechnic Awasari kh. \n From 2015 to 2018");
        diploma.setBellowLineColor(Color.rgb(61, 61, 61));
        diploma.setBellowLineSize(6);
        diploma.setImageSize(40);
        diploma.setBackgroundColor(Color.rgb(0, 0, 0));
        diploma.setBackgroundSize(60);
        diploma.setDateColor(Color.rgb(109, 110, 109));
        diploma.setTitleColor(Color.rgb(0, 12, 87));
        diploma.setDescriptionColor(Color.rgb(51, 57, 99));
        timelineRowsList.add(diploma);

        Date tenthDate = null;
        try {
            tenthDate = new SimpleDateFormat("dd/MM/yyyy").parse("16/6/2009");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        TimelineRow tenth = new TimelineRow(2);
        tenth.setDate(tenthDate);
        tenth.setTitle("SSC");
        tenth.setDescription("@ Bhairavanath Vidyalaya Waki Bk. \n From 2009 to 2015 ");
        tenth.setImage(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
        tenth.setBellowLineColor(Color.rgb(61, 61, 61));
        tenth.setBellowLineSize(6);
        tenth.setImageSize(40);
        tenth.setBackgroundColor(Color.rgb(0, 0, 0));
        tenth.setBackgroundSize(60);
        tenth.setDateColor(Color.rgb(109, 110, 109));
        tenth.setTitleColor(Color.rgb(0, 12, 87));
        tenth.setDescriptionColor(Color.rgb(51, 57, 99));
        timelineRowsList.add(tenth);

        ArrayAdapter<TimelineRow> myAdapter = new TimelineViewAdapter(this, 0, timelineRowsList,
                true);

        ListView myListView = (ListView) findViewById(R.id.timeline_education);
        myListView.setAdapter(myAdapter);
    }
}
