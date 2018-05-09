package com.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class GridLayoutActivity extends AppCompatActivity {

    //Widgets
    RecyclerView rv_gl;

    // Variables
    ArrayList<DataModel> dataModelArrayList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        rv_gl = findViewById(R.id.rv_gl);

        for (int i = 0; i < 10; i++) {
            DataModel dataModel = new DataModel();
            dataModel.setName("Name "+i);
            dataModel.setPlace("Place "+i);
            dataModelArrayList.add(dataModel);
        }

        rv_gl.setLayoutManager(new GridLayoutManager(this, 2));
        GridLayoutAdapter gridLayoutAdapter = new GridLayoutAdapter(dataModelArrayList, getApplicationContext());
        rv_gl.setAdapter(gridLayoutAdapter);

    }
}
