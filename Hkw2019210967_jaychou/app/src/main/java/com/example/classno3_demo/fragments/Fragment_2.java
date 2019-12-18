package com.example.classno3_demo.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.classno3_demo.R;

public class Fragment_2 extends Fragment {
 Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.listview_demo_2, container, false);

        TextView textView =view.findViewById(R.id.text_f);
        textView.setText("2015年，周杰伦与昆凌结婚并诞下一女，生活美满的周杰伦将自己的幸福感注入了专辑《周杰伦的床边故事》中。在专辑中，周杰伦把自己视作说书人，将十首歌曲看作是十个不同的故事，将不泯的童心和天马行空的想象力融入故事中并诉说给听众。  \n" +
                "专辑的主打歌《前世情人》是周杰伦送给自己女儿的礼物。周杰伦的女儿Hathaway在玩具钢琴上随手压出了几个音符，周杰伦听了单音后发想出了整首歌曲。周杰伦将女儿比作自己的前世情人，希望借此体现作为人父的心路历程以及对女儿未来的期待。  \n" +
                "专辑的封面照则在《床边故事》MV所搭建的场景中拍摄，在墙壁上的大钟下，周杰伦端坐在古宅中间诉说着专辑的十首床边故事，充满神秘而古典的氛围。");
        return  view;
    }
}