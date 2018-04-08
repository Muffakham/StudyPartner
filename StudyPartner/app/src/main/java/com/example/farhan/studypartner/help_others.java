package com.example.farhan.studypartner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class help_others extends AppCompatActivity implements Serializable {

    ArrayList<String> words = new ArrayList <String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_others);
        setContentView(R.layout.activity_get_help);
        words.add("Maths");
        words.add("Physics");
        words.add("Chemistry");
        words.add("Mechanics");
        words.add("Basic electrical engineering");
        words.add("C programming");
        words.add("Data Structures");
        words.add("Algorithms");
        words.add("Operating Systems");
        words.add("Circuit Designing");
        words.add("Component analysis");
        words.add("Cloud computing");
        words.add("Artificial Intelligence");
        words.add("Internet of Things");
        words.add("Engineering Graphics");
        words.add("circuit analysis");

        ArrayAdapter<String> a = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,words);
        ListView l = (ListView)findViewById(R.id.list);
        l.setAdapter(a);
        l.setClickable(true);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent , View view, int i, long l) {
                String s = (String) parent.getItemAtPosition(i);
                Toast toast = Toast.makeText(help_others.this,"You have been Successfully added as a helper", Toast.LENGTH_LONG);
                Intent il = new Intent(help_others.this, info.class);
                startActivity(il);


            }});
    }
}
