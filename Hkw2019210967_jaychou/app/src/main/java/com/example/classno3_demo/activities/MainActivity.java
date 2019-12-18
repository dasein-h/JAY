package com.example.classno3_demo.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.classno3_demo.R;
import com.example.classno3_demo.fragments.Fragment_1;
import com.example.classno3_demo.fragments.Fragment_2;
import com.example.classno3_demo.fragments.Fragment_3;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView_1;
    private TextView textView_2;
    private TextView textView_3;
    private TextView textView_top_bar;
    private FrameLayout ly_content;
    private Fragment_1 f1;
    private Fragment_2 f2;
    private Fragment_3 f3;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();
        bindView();
        textView_1.performClick();
    }
    private void bindView() {
        textView_1= findViewById(R.id.text_1);
        textView_2=findViewById(R.id.text_2);
        textView_3=findViewById(R.id.text_3);
        textView_top_bar=findViewById(R.id.text_top_bar);
        ly_content=findViewById(R.id.ly_content);

        textView_1.setOnClickListener(this);
        textView_2.setOnClickListener(this);
        textView_3.setOnClickListener(this);
        textView_top_bar.setOnClickListener(this);
    }
    //重置所有文本的选中状态
    private void setSelected(){
        textView_1.setSelected(false);
        textView_2.setSelected(false);
        textView_3.setSelected(false);
        textView_top_bar.setSelected(false);
    }
    //隐藏所有Fragment
    private void hideAllFragment(FragmentTransaction fragmentTransaction){
        if(f1!=null)fragmentTransaction.hide(f1);
        if(f2!=null)fragmentTransaction.hide(f2);
        if(f3!=null)fragmentTransaction.hide(f3);
    }

    @Override
    public void onClick(View view) {
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        hideAllFragment(fragmentTransaction);

        switch (view.getId()){
            case R.id.text_1:
                setSelected();
                textView_1.setSelected(true);
                textView_top_bar.setText("《周杰伦的床边故事》");


                if(f1==null){
                    f1=new Fragment_1();//调用方法
                    fragmentTransaction.add(R.id.ly_content,f1);
                }else {
                    fragmentTransaction.show(f1);
                }
                break;
            case R.id.text_2:
                setSelected();
                textView_2.setSelected(true);
                textView_top_bar.setText("专辑简介");
                if(f2==null){
                    f2=new Fragment_2();
                    fragmentTransaction.add(R.id.ly_content,f2);
                }else {
                    fragmentTransaction.show(f2);
                }
                break;
            case R.id.text_3:
                setSelected();
                textView_3.setSelected(true);
                textView_top_bar.setText("内含歌曲");
                if(f3==null){
                    f3=new Fragment_3();
                    fragmentTransaction.add(R.id.ly_content,f3);
                }else {
                    fragmentTransaction.show(f3);
                }
                break;
        }
        fragmentTransaction.commit();

    }
}
