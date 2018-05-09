package com.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class LinearLayoutActivity extends AppCompatActivity {

    //Widgets
    RecyclerView rv_ll;

    // Variables
    ArrayList<DataModel> dataModelArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        rv_ll = findViewById(R.id.rv_ll);

        for (int i = 0; i < 10; i++) {
            DataModel dataModel = new DataModel();
            dataModel.setName("Name "+i);
            dataModel.setPlace("Place "+i);
            dataModelArrayList.add(dataModel);
        }

        rv_ll.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        LinearLayoutAdapter linearLayoutAdapter = new LinearLayoutAdapter(dataModelArrayList, getApplicationContext());
        rv_ll.setAdapter(linearLayoutAdapter);

    }
}
