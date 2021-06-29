package com.yfz.main.behaviorPattern.observer.nativeObser;

import java.util.Observable;

public class TeacherNativeObservable extends Observable {
    //单例模式，被观察者全局唯一
    private TeacherNativeObservable (){}
    private static TeacherNativeObservable mInstance = null;
    public static TeacherNativeObservable getInstance(){
        if(mInstance == null){
            synchronized (TeacherNativeObservable.class){
                if(mInstance == null){
                    mInstance = new TeacherNativeObservable();
                }
            }
        }
        return mInstance;
    }

    public void sendNotifyToAllStudent(String msg){
        setChanged();//将changed变为true，代表有更新
        notifyObservers(msg);
    }
}
