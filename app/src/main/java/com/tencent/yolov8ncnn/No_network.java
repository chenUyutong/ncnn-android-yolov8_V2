package com.tencent.yolov8ncnn;

import android.app.ActionBar;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public  class No_network extends Activity  implements View.OnClickListener {










    @Override
    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.no_network);
        ActionBar actionBar = getActionBar(); //得到ActionBar
        actionBar.hide();


        ListView listView = (ListView) findViewById(R.id.list_view);

        TextView datatext = (TextView) findViewById(R.id.textView2);
        //3、准备数据
        String[] data={"0：细菌枯萎病"
       , "1：细菌-叶-条纹"
       ,  "2：爆炸"
        , "3：棕色斑点"
        , "4： 死心"
        , "5：霜霉病"
        , "6：虚假色情内容"
       , " 7：正常"
        , "8： 纹枯病"
        , "9： 桉"};
        //4、创建适配器 连接数据源和控件的桥梁
        //参数 1：当前的上下文环境
        //参数 2：当前列表项所加载的布局文件
        //(android.R.layout.simple_list_item_1)这里的布局文件是Android内置的，里面只有一个textview控件用来显示简单的文本内容
        //参数 3：数据源
        ArrayAdapter<String> adapter=new ArrayAdapter<>(No_network.this,android.R.layout.simple_list_item_1,data);
        //5、将适配器加载到控件中
        listView.setAdapter(adapter);
        //6、为列表中选中的项添加单击响应事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {





                String result=((TextView)view).getText().toString();
                String str2 = result.substring(0,result.indexOf('：'));
                    switch (str2){
                        case "0":    datatext.setText(R.string.NO_wulifbnb0); break;
                        case "1":    datatext.setText(R.string.NO_wulifbnb1); break;
                        case "2":    datatext.setText(R.string.NO_wulifbnb2); break;
                        case "3":    datatext.setText(R.string.NO_wulifbnb3); break;
                        case "4":    datatext.setText(R.string.NO_wulifbnb4); break;
                        case "5":    datatext.setText(R.string.NO_wulifbnb5); break;
                        case "6":    datatext.setText(R.string.NO_wulifbnb6); break;
                        case "7":    datatext.setText(R.string.NO_wulifbnb7); break;
                        case "8":    datatext.setText(R.string.NO_wulifbnb8); break;


                    }

                Toast.makeText(No_network.this,"您选择的疾病是："+result,Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onClick(View view) {

    }


    //hcn
}

