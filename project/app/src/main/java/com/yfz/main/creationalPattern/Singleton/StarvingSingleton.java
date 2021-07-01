package com.yfz.main.creationalPattern.Singleton;

/**
 * 懒汉
 */
public class StarvingSingleton {
    //实例对象
    private static StarvingSingleton mInstance;
    //私有构造函数，防止外部方法对其进行实例化
    private StarvingSingleton(){}
    //外部获取实例对象
    public static synchronized StarvingSingleton getInstance(){
        if(mInstance == null){
            mInstance = new StarvingSingleton();
        }
        return mInstance;
    }
}
