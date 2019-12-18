package com.example.classno3_demo.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.classno3_demo.R;
import com.example.classno3_demo.music.Music;

import java.util.List;

/**
 * Created by lum on 2018/5/27.
 */

public class MusictAdapter extends BaseAdapter {

    private List<Music> musicss;   //创建一个StudentData 类的对象 集合
    private LayoutInflater inflater;

    public MusictAdapter(List<Music> musicss, Context context) {
        this.musicss = musicss;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return musicss == null?0:musicss.size();  //判断有说个Item
    }

    @Override
    public Object getItem(int position) {
        return musicss.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //加载布局为一个视图
        View view = inflater.inflate(R.layout.list_item_2,null);
        Music musics = (Music) getItem(position);

        //在view 视图中查找 组件
        TextView tv_name = (TextView) view.findViewById(R.id.text_name);
        TextView tv_word = (TextView) view.findViewById(R.id.text_word);
        ImageView im_photo = (ImageView) view.findViewById(R.id.phone_id);

        //为Item 里面的组件设置相应的数据
        tv_name.setText(musics.getName());
        tv_word.setText("     词: "+musics.getWord() );
        im_photo.setImageResource(musics.getPhoto());

        //返回含有数据的view
        return view;
    }
}

