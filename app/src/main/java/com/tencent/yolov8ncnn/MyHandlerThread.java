package com.tencent.yolov8ncnn;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class MyHandlerThread extends Thread {


    @Override
    public void run() {
        try {

            Thread.sleep(1000);

            try {
                File urlFile = new File("/data/data/com.tencent.yolov8ncnn/hello.txt");
                InputStreamReader isr = new InputStreamReader(new FileInputStream(urlFile), "UTF-8");
                BufferedReader br = new BufferedReader(isr);
                String str = "";
                String mimeTypeLine = null ;
                while ((mimeTypeLine = br.readLine()) != null) {
                    str = str+mimeTypeLine;
                }
                Log.i("aa", str);

            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}