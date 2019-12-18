package com.example.classno3_demo.singactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.classno3_demo.R;
import com.example.classno3_demo.server.MusicServer;

public class Activity_List1 extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__list1);

        textView = findViewById(R.id.text_list1);
        textView.setText("\n" + "床边故事 - 周杰伦\n\n" +
                "词：方文山\n" +
                "曲：周杰伦\n\n" +
                "从前从前有只猫头鹰\n" +
                "它站在屋顶\n" +
                "屋顶后面一片森林\n" +
                "森林很安静\n" +
                "安静的钢琴在大厅\n" +
                "阁楼里 仔细听\n" +
                "仔细听 叮叮叮\n" +
                "什么声音\n" +
                "乖乖睡 不要怕 听我说\n" +
                "乖乖睡 醒来就 吃苹果\n" +
                "不睡觉 的时候 有传说\n" +
                "会有人 咬你的 小指头\n" +
                "这故事 继续翻页 再翻页\n" +
                "你继续 不想睡 我却想睡\n" +
                "然后我准备去打开衣柜\n" +
                "去看看 躲着谁\n" +
                "去看看 躲着谁\n" +
                "纸上的城堡卡片\n" +
                "发光的立体呈现\n" +
                "奇幻的床边故事\n" +
                "动听的令人称羡\n" +
                "场景瞬间变化\n" +
                "我接着又施展魔法\n" +
                "活过来说话\n" +
                "准备开始吧\n" +
                "等天黑一起倒数后关上灯\n" +
                "三二一 入梦境的缤纷\n" +
                "我们并非正常人\n" +
                "游戏怎么会照剧本 oh\n" +
                "天黑一起来关上灯\n" +
                "三二一 进自由的灵魂\n" +
                "Ohohohoh oh come on\n" +
                "再回童年 敲敲门\n" +
                "滴哒滴哒突然开始摆动\n" +
                "墙上老挂钟\n" +
                "古董油画出现诡异的笑容\n" +
                "好的巫婆坏掉的苹果\n" +
                "愿望要跟谁说\n" +
                "旋转的音乐盒\n" +
                "我竖起耳朵听\n" +
                "这不会是一场梦\n" +
                "Oh 梦 一下子瞬间跳跃\n" +
                "我翻阅下个世界\n" +
                "满满都是蝴蝶\n" +
                "森林满满蝴蝶\n" +
                "窗外纷飞着雪\n" +
                "一觉醒来旁边躺着是谁\n" +
                "这故事 继续翻页 再翻页\n" +
                "你继续 不想睡 我却想睡\n" +
                "然后我准备去打开衣柜\n" +
                "去看看 躲着谁\n" +
                "去看看 躲着谁\n" +
                "纸上的城堡卡片\n" +
                "发光的立体呈现\n" +
                "奇幻的床边故事\n" +
                "动听的令人称羡\n" +
                "场景瞬间变化\n" +
                "我接着又施展魔法\n" +
                "活过来说话\n" +
                "准备开始吧\n" +
                "等天黑一起倒数后关上灯\n" +
                "三二一 入梦境的缤纷\n" +
                "我们并非正常人\n" +
                "游戏怎么会照剧本 oh\n" +
                "天黑一起来关上灯\n" +
                "三二一 进自由的灵魂\n" +
                "Ohohohoh oh come on\n" +
                "再回童年 敲敲门\n" +
                "乖乖睡啊 不要害怕\n" +
                "乖乖睡醒来就吃苹果啊\n" +
                "不睡觉啊 有传说啊\n" +
                "会有人咬你的小指头啊\n" +
                "等天黑一起倒数后关上灯\n" +
                "三二一 入梦境的缤纷\n" +
                "我们并非正常人\n" +
                "游戏怎么会照剧本 oh\n" +
                "天黑一起来关上灯\n" +
                "三二一 进自由的灵魂\n" +
                "Ohohohoh oh come on\n" +
                "再回童年 敲敲门\n" +
                "再回童年 敲敲门\n" +
                "再回童年 敲敲门" + "\n");

        Intent intent = new Intent(Activity_List1.this, MusicServer.class);
        startService(intent);


    }

    protected void onStop() {
        Intent intent = new Intent(Activity_List1.this, MusicServer.class);
        stopService(intent);
        super.onStop();
    }
}
