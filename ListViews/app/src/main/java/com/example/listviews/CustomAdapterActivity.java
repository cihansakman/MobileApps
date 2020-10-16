package com.example.listviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {

    final List<Animal> animals = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);
        animals.add(new Animal("Crow",R.mipmap.ic_crow));
        animals.add(new Animal("Ape",R.mipmap.ic_ape));
        animals.add(new Animal("Cat",R.mipmap.ic_cat));

        ListView listView = findViewById(R.id.listview);
        AnimalAdapter adapter = new AnimalAdapter(animals,this);
        listView.setAdapter(adapter);



    }
}