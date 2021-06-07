package com.example.my1stapplicationforgithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RVData data = new RVData();
        data.setId(1);
        data.setName("第一个");
    }
}