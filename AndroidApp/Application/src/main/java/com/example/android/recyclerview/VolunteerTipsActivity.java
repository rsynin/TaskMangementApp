package com.example.android.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.RetrofitApi.POJO.Vegetable;

import java.util.ArrayList;

public class VolunteerTipsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);// takes a layout resource file
        setContentView(R.layout.activity_volunteer_tips); // this inflates the UI
    }
}
