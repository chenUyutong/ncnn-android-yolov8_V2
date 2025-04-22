package com.tencent.yolov8ncnn;


public class NativeTest {

    public native void CalltestNotify();

    public void test() {
        CalltestNotify();
    }
}
