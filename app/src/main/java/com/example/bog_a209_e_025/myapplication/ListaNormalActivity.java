package com.example.bog_a209_e_025.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListaNormalActivity extends AppCompatActivity {

    private ListView Listanormal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_normal);
        init();
    }

    private void init() {

        Listanormal=(ListView) findViewById(R.id.lista_normal);

        List<String> paises = new ArrayList<String>();
        paises.add("Colombia");
        paises.add("cuba");
        paises.add("argentina");
        paises.add("japon");
        paises.add("francia");

        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,paises);
        Listanormal.setAdapter(myadapter);

        Listanormal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(ListaNormalActivity.this,"Click on: " + position,Toast.LENGTH_LONG).show();
            }
        });


    }
}
