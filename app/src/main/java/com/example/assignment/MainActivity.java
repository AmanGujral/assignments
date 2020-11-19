package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView movieList;
    ArrayList<ListItemModelClass> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();
        movieList = findViewById(R.id.listView);
        MovieListAdapter adapter = new MovieListAdapter(list);

        movieList.setAdapter(adapter);

    }

    public void getData(){
        list.add(new ListItemModelClass("Avengers", "9.8/10", "dummy"));
        list.add(new ListItemModelClass("Avengers", "9.8/10", "dummy"));
        list.add(new ListItemModelClass("Avengers", "9.8/10", "dummy"));
        list.add(new ListItemModelClass("Avengers", "9.8/10", "dummy"));
        list.add(new ListItemModelClass("Avengers", "9.8/10", "dummy"));
    }
}
