package com.yfz.main.behaviorPattern.observer.customObser;
import java.util.ArrayList;

/**
 * 创建具体(被观察者)主题,实现抽象方法。
 * ConcreteSubject
 */
public class TeacherObservable implements TeacherObservableInterface {
    //Container容器
    private ArrayList<StudentObserverInterface> studentList = new ArrayList<StudentObserverInterface>();//保存收件人（观察者）的信息

    @Override
    public void addStudent(StudentObserverInterface observer) {
        studentList.add(observer);
    }

    @Override
    public void removeStudent(StudentObserverInterface observer) {
        studentList.remove(observer);
    }

    @Override
    public void notifyToStudent(String message) {
        for(int i = 0; i< studentList.size(); i++){ //逐个通知所有的观察者（这里指的是逐个通知所有的学生）
            studentList.get(i).receivedNotifyFromTeacher(message);
        }
    }
    public ArrayList<StudentObserverInterface> getStudentList(){
        return studentList;
    }
}