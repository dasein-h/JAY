package com.example.classno3_demo.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.ListFragment;

import com.example.classno3_demo.R;
import com.example.classno3_demo.server.MusicServer;
import com.example.classno3_demo.singactivities.Activity_List1;
import com.example.classno3_demo.singactivities.Activity_List2;
import com.example.classno3_demo.singactivities.Activity_List3;
import com.example.classno3_demo.singactivities.Activity_List_Empty;
import com.example.classno3_demo.music.Music;
import com.example.classno3_demo.utils.MusictAdapter;

import java.util.ArrayList;
import java.util.List;
//在fragment中显示ListView要继承ListFragment
public class Fragment_3 extends ListFragment {

    private ListView listView;
    private String[] strings = new String[]{"床边故事","说走就走","一点点","前世情人","英雄","不该","土耳其冰淇淋","告白气球","Now You See Me","爱情废柴"};

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.listview_demo_3,container,false);

        listView=view.findViewById(android.R.id.list);

        List<Music> musicss = new ArrayList<>();



        for( int i = 0; i < 10; i++) {
            Music musics= new Music();
            musics.setName(strings[i]);
            musics.setWord("方文山");
            musics.setPhoto(R.drawable.story);
            musicss.add(musics);
        }
        //创建Adapter 实例化对象， 调用构造函数传参，将数据和adapter  绑定
        MusictAdapter mMyListAdapter = new MusictAdapter(musicss,getContext());
        listView.setAdapter(mMyListAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                onListItemClick(listView,view,position,id);
            }
        });//将定义的adapter 和 listView 绑定

        return view;
    }
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l,v,position,id);


        if (position == 0) {
            Intent intent1 = new Intent(getActivity(), Activity_List1.class);
            startActivity(intent1);
        }

        if (position == 1) {
            Intent intent2 = new Intent(getActivity(), Activity_List2.class);
            startActivity(intent2);
        }

        if (position == 2) {
            Intent intent3 = new Intent(getActivity(), Activity_List3.class);
            startActivity(intent3);
        }

        if (position >= 3) {
            Intent intent4 = new Intent(getActivity(), Activity_List_Empty.class);
            startActivity(intent4);
        }



        Toast.makeText(getActivity(),"《"+strings[position]+"》的歌词",Toast.LENGTH_SHORT).show();
    }
}
