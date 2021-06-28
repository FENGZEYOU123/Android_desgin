package com.yfz.main.observerPattern.customObser;


/**
 * 创建抽象观察者,定义接收到通知
 * Observer
 */
public interface StudentObserverInterface {
    public void receivedNotifyFromTeacher(String msg);
}