package com.example.envy.lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] values = new String[] { "Pies", "Kot", "Koń", "Gołąb", "Kruk", "Dzik", "Karp", "Osioł",
        "Chomik", "Mysz", "Jeż", "Karaluch"};

        this.target = new ArrayList<String>();
        this.target.addAll(Arrays.asList(values));

        this.adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,this.target);

        ListView listview = (ListView) findViewById(R.id.listView);
        listview.setAdapter(this.adapter);
    }

    private ArrayList<String> target;
    private ArrayAdapter adapter;

}
