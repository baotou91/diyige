package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import recyclerview.LinearRecyclerViewActivity;
import recyclerview.RecyclerViewActivity;


public class MainActivity extends AppCompatActivity {
private Button mBtnPu;
    private Button mBtn_linear;
    private Button mBtnRv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnPu=findViewById(R.id.btn_recyclerview);
        mBtnPu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, RecyclerViewActivity.class);
                startActivity(intent);
            }
        });

    }
}
