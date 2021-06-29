package com.yfz.main.behaviorPattern.observer.customObser;


import android.util.Log;

import com.yfz.main.behaviorPattern.observer.ObserverPatternActivity;

/**
 * 创建具体观察者,实现抽象方法，并对收到的通知作出反应
 * Concrete
 */
public class StudentObserver implements StudentObserverInterface {
    private String studentName; //学生名字
    private boolean isMonitor; //是否是班长

    public StudentObserver (String studentName,boolean isMonitor){
        this.studentName = studentName;
        this.isMonitor = isMonitor;
    }
    @Override
    public void receivedNotifyFromTeacher(String msg) {
        if(isMonitor){ //如果是班长
            Log.d(ObserverPatternActivity.TAG, studentName+":>> 好的老师！我会维持班级秩序");
        }else {  //普通学生
            Log.d(ObserverPatternActivity.TAG, studentName+":>> 太好了，老师去开会了");
        }
    }
}
