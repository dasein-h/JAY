package com.example.classno3_demo.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.classno3_demo.R;
import com.example.classno3_demo.activities.UnrActivity;

public class Fragment_1 extends Fragment {
    private Button c;

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.listview_demo_1, container, false);

        c =  view.findViewById(R.id.button1);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent();
                it.setClass(getActivity(), UnrActivity.class);
                startActivity(it);
            }
        });


        return view;
    }


}



