package com.tencent.yolov8ncnn;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class WelcomeActivity extends Activity {

    private Handler handler = new Handler(){
        public void handleMessage(Message msg){
            super.handleMessage(msg);
            Intent intent = new Intent(WelcomeActivity.this,MainActivity.class);    //收到消息后跳转
            startActivity(intent);
            WelcomeActivity.this.finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guanyigji);
        ActionBar actionBar = getActionBar(); //得到ActionBar
        actionBar.hide();
        handler.sendEmptyMessageDelayed(0,5000);        //  延迟3秒后发送一个空消息
    }
}
