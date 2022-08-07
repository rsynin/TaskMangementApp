package com.example.android.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.RetrofitApi.POJO.Vegetable;

import java.util.ArrayList;
import java.util.List;

public class VegetablesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);// takes a layout resource file
        setContentView(R.layout.activity_vegetables); // this inflates the UI
        ArrayList<Vegetable> data=new ArrayList<>();
        setVegetables(data);
        // Setting the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.example_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new VegetableAdapter(data));
    }

    private void setVegetables(List<Vegetable> vegetables) {
        vegetables.add(new Vegetable("Potato", "October", "January"));
        vegetables.add(new Vegetable("Tomato", "February", "July"));
        vegetables.add(new Vegetable("Spring Onion", "September", "November"));
        vegetables.add(new Vegetable("Eggplant", "May", "August"));
    }
}
