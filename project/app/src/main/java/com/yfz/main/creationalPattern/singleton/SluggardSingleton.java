package com.yfz.main.creationalPattern.singleton;

/**
 * 懒汉
 */
public class SluggardSingleton {
    //实例对象
    private static SluggardSingleton mInstance;
    //私有构造函数，防止外部方法对其进行实例化
    private SluggardSingleton(){}
    //外部获取实例对象
    public static synchronized SluggardSingleton getInstance(){
        if(mInstance == null){
            mInstance = new SluggardSingleton();
        }
        return mInstance;
    }
}
