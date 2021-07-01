package com.yfz.main.creationalPattern.Singleton;

/**
 * 饿汉
 */
public class SluggardSingleton {
    //声明静态对象的时候就进行初始化
    private static SluggardSingleton mInstance = new SluggardSingleton();
    //私有构造方法，防止被实例化
    private SluggardSingleton() { }
    //外部获取实例
    public static SluggardSingleton getInstance(){
        return mInstance;
    }
}
