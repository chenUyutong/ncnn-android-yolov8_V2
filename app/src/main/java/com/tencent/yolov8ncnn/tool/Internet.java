package com.tencent.yolov8ncnn.tool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Internet {
    public static String get(String src){
        HttpURLConnection connection = null;
        BufferedReader reader = null;
        StringBuilder response = null;
        try{
            URL url = new URL(src);//新建URL
            connection = (HttpURLConnection)url.openConnection();//发起网络请求
            connection.setRequestMethod("GET");//请求方式
            connection.setConnectTimeout(800000);//连接最大时间
            connection.setReadTimeout(800000);//读取最大时间
            InputStream in = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(in));//写入reader
            response = new StringBuilder();
            String line;
            while((line = reader.readLine()) != null){
                response.append(line);
            }
        }catch (Exception e){//异常抛出
            e.printStackTrace();
        }finally {
            if(reader != null){
                try{
                    reader.close();//io流开了要关，不然容易内存泄露
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(connection != null){
                connection.disconnect();//同理，关闭http连接
            }
        }
        return response.toString();
    }
}



