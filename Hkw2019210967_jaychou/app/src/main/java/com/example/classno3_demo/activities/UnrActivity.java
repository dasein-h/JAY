package com.example.classno3_demo.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.classno3_demo.R;

        import android.content.Intent;
        import android.graphics.Bitmap;
        import android.graphics.BitmapFactory;
        import android.os.Bundle;
        import android.os.Handler;
        import android.os.Message;
        import android.util.Log;
        import android.view.View;
import android.view.Window;
import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.TextView;



        import org.jetbrains.annotations.NotNull;
        import org.json.JSONArray;
        import org.json.JSONObject;

        import java.io.IOException;

        import okhttp3.Call;
        import okhttp3.Callback;
        import okhttp3.OkHttpClient;
        import okhttp3.Request;
        import okhttp3.Response;

public class UnrActivity extends AppCompatActivity {


    private TextView textView;
    private ImageView imageView;

    int c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unr);
       // supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        imageView = findViewById(R.id.unrimage);
        textView = findViewById(R.id.unrtext);

        getP();
        getDataAsync();
    }




    Handler handler=new Handler(){
        public void handleMessage(Message msg){
            //调用父类handleMessage（）方法
            super.handleMessage(msg);
            if (msg.what==1){
                Bundle data=msg.getData();
                String responseBody=data.getString("responseBody");

                getJsonString(responseBody);
            }

            if(msg.what==2){
                Bundle data=msg.getData();
                byte[] bytes=data.getByteArray("bytes");
                Bitmap myPhoto= BitmapFactory.decodeByteArray(bytes,0,bytes.length);
                imageView.setImageBitmap(myPhoto);

            }
        }
    };
    public void getJsonString(String jsonString){
        try{
            JSONObject jo=new JSONObject(jsonString);
            JSONArray jsonArray=jo.getJSONArray("data");
            JSONObject jsonObject_0=jsonArray.getJSONObject(0);
            JSONObject jsonObject_0_auther=jsonObject_0.getJSONObject("author");
            String s = jsonObject_0_auther.getString("avatar_url");
            textView.setText(s);


        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public void getDataAsync(){
        final OkHttpClient client;
        client = new OkHttpClient();
        final Request request = new Request.Builder().url("https://cnodejs.org/api/v1/topics").build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                Log.d("failed","错误");
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                String responseBody;
                if (response.isSuccessful()){
                    responseBody = response.body().string();
                    Message msg=Message.obtain();
                    Bundle data=new Bundle();
                    data.putString("responseBody",responseBody);
                    msg.setData(data);
                    msg.what=1;
                    handler.sendMessage(msg);
                }else {
                    Log.d("failed","错误");
                }

            }
        });
    }


    public void getP(){
        final OkHttpClient client = new OkHttpClient();
        final Request request=new Request.Builder().url("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1576615032921&di=2b9e223221e0731db13943c505eb3275&imgtype=0&src=http%3A%2F%2Fww1.sinaimg.cn%2Flarge%2F80927b8fjw1f58l1koktfj20m80etag4.jpg").build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                Log.d("failed","请求网络错误");
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {

                String responseBody;

                if (response.isSuccessful()) {

                    byte[] bytes = response.body().bytes();

                    //创建message
                    Message msg = Message.obtain();
                    //创建bundle
                    Bundle data = new Bundle();
                    //将responseBody放进data中
                    data.putByteArray("bytes", bytes);
                    //将data放进msg中
                    msg.setData(data);
                    //给msg设定一个id
                    msg.what = 2;
                    //将msg传递给handler
                    handler.sendMessage(msg);
                } else {
                    Log.d("failed", "处理图片错误");
                }
            }
        });
    }
}

