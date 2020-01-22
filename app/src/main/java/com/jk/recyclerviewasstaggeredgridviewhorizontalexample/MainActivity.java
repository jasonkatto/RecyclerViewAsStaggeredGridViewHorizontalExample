package com.jk.recyclerviewasstaggeredgridviewhorizontalexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> personsName = new ArrayList<>(Arrays.asList(
            "Person1",
            "Person2",
            "Person3",
            "Person4",
            "Person 5",
            "Person 6",
            "Person 7",
            "Person 8",
            "Person 9",
            "Person 10",
            "Person 11",
            "Person 12",
            "Person 13",
            "Person 14"
    ));

    ArrayList<Integer> personImages = new ArrayList<>(Arrays.asList(
            R.drawable.person1,
            R.drawable.person2,
            R.drawable.person3,
            R.drawable.person4,
            R.drawable.person5,
            R.drawable.person6,
            R.drawable.person7,
            R.drawable.person1,
            R.drawable.person2,
            R.drawable.person3,
            R.drawable.person4,
            R.drawable.person5,
            R.drawable.person6,
            R.drawable.person7
    ));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get the reference of recyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        //set staggeredGridLayoutManager with 3 number of columns and horizontal orientation
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, LinearLayoutManager.HORIZONTAL);

        recyclerView.setLayoutManager(staggeredGridLayoutManager);//set the layoutmanager to recyclerView

        //call the constructor of CustomAdapter to send reference and data to adapter
        CustomAdapter customAdapter = new CustomAdapter(this, personsName, personImages);
        recyclerView.setAdapter(customAdapter);//set the adapter to recyclerView

    }
}
