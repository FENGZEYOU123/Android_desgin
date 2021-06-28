package com.yfz.main.observerPattern.nativeObser;

import java.util.Observable;
import java.util.Observer;

public class StudentNativeObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {  //在Observer内部只有一个update接收主题更新的事件
    }
}
