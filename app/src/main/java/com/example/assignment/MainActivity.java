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
        list.add(new ListItemModelClass("The Avengers", "8.0/10",
                "Earth's mightiest heroes must come together and learn to fight as a team " +
                        "if they are going to stop the mischievous Loki and his alien army from enslaving humanity.",
                R.drawable.the_avengers));
        list.add(new ListItemModelClass("Avengers: Age of Ultron", "7.3/10",
                "When Tony Stark and Bruce Banner try to jump-start a dormant peacekeeping " +
                        "program called Ultron, things go horribly wrong and it's up to Earth's mightiest " +
                        "heroes to stop the villainous Ultron from enacting his terrible plan.",
                R.drawable.avengers_age_of_ultron));
        list.add(new ListItemModelClass("Avengers: Infinity War", "8.4/10",
                "The Avengers and their allies must be willing to sacrifice all in an attempt to " +
                        "defeat the powerful Thanos before his blitz of devastation and ruin puts an end to the universe.",
                R.drawable.avengers_infinity_war));
        list.add(new ListItemModelClass("Avengers: Endgame", "8.4/10",
                "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. " +
                        "With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' " +
                        "actions and restore balance to the universe.",
                R.drawable.avengers_endgame));
        list.add(new ListItemModelClass("Black Panther", "7.3/10",
                "T'Challa, heir to the hidden but advanced kingdom of Wakanda, must step forward to lead his " +
                        "people into a new future and must confront a challenger from his country's past.",
                R.drawable.black_panther));
    }
}
