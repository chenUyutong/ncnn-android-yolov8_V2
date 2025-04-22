package com.tencent.yolov8ncnn;

import android.Manifest;
import android.app.ActionBar;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;



// Tencent is pleased to support the open source community by making ncnn available.
//
// Copyright (C) 2021 THL A29 Limited, a Tencent company. All rights reserved.
//
// Licensed under the BSD 3-Clause License (the "License"); you may not use this file except
// in compliance with the License. You may obtain a copy of the License at
//
// https://opensource.org/licenses/BSD-3-Clause
//
// Unless required by applicable law or agreed to in writing, software distributed
// under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
// CONDITIONS OF ANY KIND, either express or implied. See the License for the
// specific language governing permissions and limitations under the License.

public class ces extends Activity implements View.OnClickListener {



    Button jianche;

    Button  No_wangli;
    Button yeswl;


    //Button che;>-------底部vief


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qw);
        ActionBar actionBar = getActionBar(); //得到ActionBar
        actionBar.hide();
        jianche  = (Button) findViewById(R.id.jianche);//跳转d>通信2025-04-21 15:16:06.375 18229-18229     JobService
        No_wangli= (Button) findViewById(R.id.Nowl);
 yeswl =(Button) findViewById(R.id.yes);

        jianche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent();
                ComponentName componentName = new ComponentName(ces.this,MainActivity.class);//chandao
                intent.setComponent(componentName);
                startActivity(intent);


            }
        });




        No_wangli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();

                ComponentName componentName = new ComponentName(ces .this, No_network.class);
                intent.setComponent(componentName);
                startActivity(intent);
            }
        });

        yeswl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();

                ComponentName componentName = new ComponentName(ces .this, yes_network.class);
                intent.setComponent(componentName);
                startActivity(intent);
            }
        });


    }


    private Handler handler = new Handler(){
        public void handleMessage(Message msg){
            super.handleMessage(msg);
            Intent intent = new Intent(ces.this,MainActivity.class);    //收到消息后跳转
            startActivity(intent);
            ces.this.finish();
        }
    };


    @Override
    public void onClick(View view) {

        handler.sendEmptyMessageDelayed(0, 100);




    }
}
