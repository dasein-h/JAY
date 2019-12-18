package com.example.classno3_demo.singactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.classno3_demo.R;

public class Activity_List_Empty extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__list__empty);

        textView = findViewById(R.id.text_list_empty);
        textView.setText("敬请期待");


    }
}
