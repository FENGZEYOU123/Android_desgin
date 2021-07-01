package com.yfz.main.creationalPattern.Singleton;

/**
 * 双检锁/双重校验锁
 */
public class DCLSingleton {
    //实例对象
    private volatile static DCLSingleton mInstance;
    //私有构造函数，防止外部方法对其进行实例化
    private DCLSingleton(){}
    //外部获取实例对象
    public static DCLSingleton getInstance(){
        if(null == mInstance){
            synchronized (DCLSingleton.class){
                if(null == mInstance){
                    mInstance = new DCLSingleton();
                }
            }
        }
        return mInstance;
    }
}
