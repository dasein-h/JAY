package com.example.classno3_demo.singactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.classno3_demo.R;
import com.example.classno3_demo.server.MusicServer;
import com.example.classno3_demo.server.MusicServer2;

public class Activity_List2 extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__list2);
        textView = findViewById(R.id.text_list2);
        textView.setText("\n"+"说走就走 - 周杰伦\n\n" +
                "词：方文山\n" +
                "曲：周杰伦\n\n" +
                "伸出手 搭便车 唱着歌 弹着斑鸠\n" +
                "不远处沙漠 我们才刚刚经过\n" +
                "路两旁是单调的颜色\n" +
                "却有种辽阔的快乐 我还记得\n" +
                "边走边说边牵着你手\n" +
                "边弹边唱边微笑看我\n" +
                "你的侧脸逆着光 背对夕阳\n" +
                "你轮廓像幅画 看久会融化\n" +
                "What's up 开始牵挂\n" +
                "我将所有的感觉用诗写下\n" +
                "细腻描述你的长发\n" +
                "以及歌词里要对你说的话\n" +
                "当暧昧慢慢酝酿 心动的频率抽象\n" +
                "我的心 只能够 容纳你的模样\n" +
                "真爱让人拥有力量\n" +
                "你我都该勇敢 率性放下一切别管 Oh\n" +
                "跟着我 对天上星星 喊爱你的证明\n" +
                "这就是年轻 该潇洒一次的决定\n" +
                "说走就走的旅行 Oh\n" +
                "跟着我 数天上星星 再一起等黎明\n" +
                "无边的风景 风呼啸的声音 爱\n" +
                "一路守护着约定\n" +
                "伸出手 搭便车 唱着歌 弹着斑鸠\n" +
                "不远处沙漠 我们才 刚刚经过\n" +
                "路两旁是单调的颜色\n" +
                "却有种辽阔的快乐 我还记得\n" +
                "边走边说边牵着你手\n" +
                "边弹边唱边微笑看我\n" +
                "你的侧脸逆着光 背对夕阳\n" +
                "你轮廓像幅画 看久会融化\n" +
                "What's up 开始牵挂\n" +
                "我将所有的感觉用诗写下\n" +
                "细腻描述你的长发\n" +
                "以及歌词里要对你说的话\n" +
                "当暧昧慢慢酝酿 心动的频率抽象\n" +
                "我的心 只能够 容纳你的模样\n" +
                "真爱让人拥有力量\n" +
                "你我都该勇敢 率性放下一切别管 Oh\n" +
                "跟着我 对天上星星 喊爱你的证明\n" +
                "这就是年轻 该潇洒一次的决定\n" +
                "说走就走的旅行 Oh\n" +
                "跟着我 数天上星星 再一起等黎明\n" +
                "无边的风景 风呼啸的声音 爱\n" +
                "一路守护着约定\n" +
                "跟着我 对天上星星 喊爱你的证明\n" +
                "这就是年轻 该潇洒一次的决定\n" +
                "说走就走的旅行 Oh\n" +
                "跟着我 数天上星星 再一起等黎明\n" +
                "无边的风景 风呼啸的声音 爱\n" +
                "一路守护着约定 Oh"+"\n");

        Intent intent = new Intent(Activity_List2.this, MusicServer2.class);
        startService(intent);

    }
    protected void onStop() {
        Intent intent = new Intent(Activity_List2.this, MusicServer2.class);
        stopService(intent);
        super.onStop();
    }
}
