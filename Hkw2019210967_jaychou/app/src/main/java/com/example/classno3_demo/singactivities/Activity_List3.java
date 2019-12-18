package com.example.classno3_demo.singactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.classno3_demo.R;

public class Activity_List3 extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__list3);

        textView = findViewById(R.id.text_list3);
        textView.setText("\n"+"一点点 - 周杰伦\n\n" +
                "词：方文山\n" +
                "曲：周杰伦\n\n" +
                "几次争辩 几次的失眠\n" +
                "而我却 视而不见\n" +
                "从不 先说抱歉\n" +
                "工作优先 跟朋友见面\n" +
                "永远多过给你 的时间\n" +
                "那亏欠 一直 放在心里面\n" +
                "没能说出口 你已走远\n" +
                "抱紧你 却抓不住 你的爱剩 一点点\n" +
                "那一天 你几乎带走我 所有 的从前\n" +
                "你说我 根本没有因为爱你 而改变\n" +
                "我始终听不进 你的劝\n" +
                "想吃甜点 想去电影院\n" +
                "而我却 都嫌太远\n" +
                "你在 委曲埋怨\n" +
                "我连生日 都忘记敷衍\n" +
                "却只会要你乖 一点点\n" +
                "那亏欠 一直 放在心里面\n" +
                "没能说出口 你已走远\n" +
                "抱紧你 却抓不住 你的爱剩 一点点\n" +
                "那一天 你几乎带走我 所有 的从前\n" +
                "故事里 不再出现与你相关 的画面\n" +
                "一个人的幸福 怎么编\n" +
                "面对面 泪滑落在彼此的脸 那瞬间\n" +
                "不再让你离开 我身边"+"\n");

    }
}
