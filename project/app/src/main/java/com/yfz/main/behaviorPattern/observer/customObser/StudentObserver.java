package com.yfz.main.behaviorPattern.observer.customObser;


/**
 * 创建具体观察者,实现抽象方法，并对收到的通知作出反应
 * Concrete
 */
public class StudentObserver implements StudentObserverInterface {
    private String studentName;
    private String eventFromTeacher;

    public StudentObserver (String studentName){
        this.studentName = studentName;
    }
    public String getStudentName(){
        return studentName;
    }
    public String getEventFromTeacher(){
        return eventFromTeacher;
    }
    @Override
    public void receivedNotifyFromTeacher(String msg) {
        eventFromTeacher = msg;
    }
}
