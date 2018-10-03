package com.example.bog_a209_e_025.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
    }

    private void init() {
        customList = (ListView) findViewById(R.id.idList);

        List<String> paises = new ArrayList<>();

        paises.add("Colombia");
        paises.add("cuba");
        paises.add("argentina");
        paises.add("japon");
        paises.add("francia");

        MyAdapter myAdapter= new MyAdapter(this,R.layout.list_item, paises);
        customList.setAdapter(myAdapter);

    }
}
