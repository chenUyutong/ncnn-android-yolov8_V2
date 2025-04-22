
package com.tencent.yolov8ncnn;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.tencent.yolov8ncnn.tool.Internet;


public  class yes_network extends Activity implements View.OnClickListener {










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
        ArrayAdapter<String> adapter=new ArrayAdapter<>(yes_network.this,android.R.layout.simple_list_item_1,data);
        //5、将适配器加载到控件中
        listView.setAdapter(adapter);
        //6、为列表中选中的项添加单击响应事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {




          Internet a= new Internet();
                String result=((TextView)view).getText().toString();
                String str2 = result.substring(0,result.indexOf('：'));
                switch (str2){
                    case "0":         new Thread(new Runnable() {
                        @Override
                        public void run() {
                            String s = Internet.get("http://113.44.65.128:5000/api/?data=%E7%A8%BB%E7%98%9F%E7%97%85&ip=%E5%B1%B1%E4%B8%9C%E7%9C%81%E6%B5%8E%E5%8D%97%E5%B8%82%E7%AB%A0%E4%B8%98%E5%8C%BA%E6%9F%90%E6%9F%90&time=1620000000&model=qwen2-1.5b-instruct");
                           Log.i("aaa", s);
                            datatext.setText(s);
                        }
                    }).start();break;
                    case "1":    datatext.setText(R.string.NO_wulifbnb1); break;
                    case "2":    datatext.setText(R.string.NO_wulifbnb2); break;
                    case "3":    datatext.setText(R.string.NO_wulifbnb3); break;
                    case "4":    datatext.setText(R.string.NO_wulifbnb4); break;
                    case "5":    datatext.setText(R.string.NO_wulifbnb5); break;
                    case "6":    datatext.setText(R.string.NO_wulifbnb6); break;
                    case "7":    datatext.setText(R.string.NO_wulifbnb7); break;
                    case "8":    datatext.setText(R.string.NO_wulifbnb8); break;


                }

                Toast.makeText(yes_network.this,"您选择的疾病yyy是："+result,Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
    // get 请求方法

}

