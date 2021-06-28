package com.yfz.main.observerPattern.customObser;
import java.util.ArrayList;

/**
 * 创建具体(被观察者)主题,实现抽象方法。
 * ConcreteSubject
 */
public class TeacherObservable implements TeacherObservableInterface {
    private ArrayList<StudentObserverInterface> personList = new ArrayList<StudentObserverInterface>();//保存收件人（观察者）的信息

    @Override
    public void addStudent(StudentObserverInterface observer) {
        personList.add(observer);

    }

    @Override
    public void removeStudent(StudentObserverInterface observer) {
        personList.remove(observer);
    }

    @Override
    public void notifyToStudent(String message) {
        for(int i=0; i<personList.size(); i++){ //逐个通知所有的观察者（这里指的是逐个通知所有的学生）
            personList.get(i).receivedNotifyFromTeacher(message);
        }
    }
}