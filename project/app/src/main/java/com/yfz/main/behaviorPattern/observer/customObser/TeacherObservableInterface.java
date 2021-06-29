package com.yfz.main.behaviorPattern.observer.customObser;

/**
 * 创建抽象(被观察者)主题,定义添加,删除,通知等方法：
 * Subject
 */
public interface TeacherObservableInterface {
    void addStudent(StudentObserverInterface observer);//添加观察者 （添加学生）

    void removeStudent(StudentObserverInterface observer);//删除观察者 （删除学生）

    void notifyToStudent(String message);//通知观察者 （通知学生）
}
