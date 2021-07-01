package com.yfz.main.creationalPattern.singleton;

import android.util.Log;

/**
 * 静态内部类
 */
public class InternalClassSingleton {
    private static class InternalClassHolder{
        private static final InternalClassSingleton INSTANCE = new InternalClassSingleton();
    }
    //私有构造方法，防止被实例化
    private InternalClassSingleton(){ }
    public static final InternalClassSingleton getInstance(){
        return InternalClassHolder.INSTANCE;
    }
}
