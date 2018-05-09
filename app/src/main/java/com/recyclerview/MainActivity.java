package com.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Widgets
    Button btn_llv, btn_glv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        find_view_by_id();
        register_clicklistner();
    }

    private void find_view_by_id() {
        btn_llv = findViewById(R.id.btn_llv);
        btn_glv = findViewById(R.id.btn_glv);
    }

    private void register_clicklistner() {
        btn_llv.setOnClickListener(this);
        btn_glv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_llv:
                Intent intent_llv = new Intent(MainActivity.this, LinearLayoutActivity.class);
                startActivity(intent_llv);
                break;

            case R.id.btn_glv:
                Intent intent_glv = new Intent(MainActivity.this, GridLayoutActivity.class);
                startActivity(intent_glv);
                break;
        }
    }
}
