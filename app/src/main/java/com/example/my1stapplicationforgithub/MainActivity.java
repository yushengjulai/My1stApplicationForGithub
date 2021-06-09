package com.example.my1stapplicationforgithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RVData data = new RVData();
        data.setId(1);
        data.setName("第一个");
        data.setCreditNo(431223);
        TextView text1 = findViewById(R.id.textView);
        TextView text2 = findViewById(R.id.textView2);
        TextView text3 = findViewById(R.id.textView3);
        text1.setText(data.getId()+"");
        text2.setText(data.getName());
        text3.setText(data.getCreditNo()+"");
    }
}