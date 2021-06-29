package com.yfz.main.behaviorPattern.observer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.yfz.main.R;
import com.yfz.main.behaviorPattern.observer.customObser.StudentObserver;
import com.yfz.main.behaviorPattern.observer.customObser.TeacherObservable;

import java.util.ArrayList;

/**
 * 观察者模式就是：当一个对象的状态发送改变时，所有依赖于它的对象都能得到通知并被自动更新。
 * 这种模式最常用在我们熟悉的事件驱动模型里面，像VC、Android界面里面的事件响应，就是基于观察者模式来实现。
 *
 * 定义：对象间的一种一对多的依赖关系，以便一个对象的状态发生变化时，所有依赖于它的对象都得到通知并自动刷新。
 * 2.角色：观察者(Observer)，被观察者(Observable)
 * 观察者：（Observer）将自己注册到被观察对象（Subject）中，被观察对象将观察者存放在一个容器（Container）里。
 * 被观察者：被观察对象发生了某种变化（如图中的SomeChange），从容器中得到所有注册过的观察者，将变化通知观察者。
 *
 * 3.根据对它们各自的定义，观察者/被观察者需要具备以下几个特性：
 * 被观察者：
 * (1).需要一个容器来保存所以的观察者，如下定义的ArrayList集合类。
 * (2).需要一个注册到容器的方法，及从容器的释放的方法，如registerObserver和unregisterObserver。
 * (3).当被观察者自身改变时，需要一个方法来通知所有的观察者，如notifyChanged
 *
 * Reference:https://www.cnblogs.com/mythou/p/3370340.html
 * http://c.biancheng.net/view/1390.html
 */

public class ObserverPatternActivity extends AppCompatActivity {
    private TeacherObservable mTeacherObservable = new TeacherObservable();
    public static String TAG ="观察者模式：>> ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer_pattern);
        addStudent();
        removeStudent();
        teacherNotify();
    }

    private void addStudent(){
        StudentObserver studentObserver1 = new StudentObserver("小红",true);
        mTeacherObservable.addStudent(studentObserver1);
        StudentObserver studentObserver2 = new StudentObserver("李明",false);
        mTeacherObservable.addStudent(studentObserver2);
        StudentObserver studentObserver3 = new StudentObserver("张三",false);
        mTeacherObservable.addStudent(studentObserver3);
    }
    private void teacherNotify(){
        Log.d(TAG, "老师开会，并发布通知到所有学生: ");
        mTeacherObservable.notifyToStudent("老师去开会了,班长管一下班级");
    }
    private void removeStudent(){
        mTeacherObservable.removeStudent(mTeacherObservable.getStudentList().get(2));
    }
}