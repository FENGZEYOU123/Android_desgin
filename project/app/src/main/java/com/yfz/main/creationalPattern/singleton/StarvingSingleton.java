package com.yfz.main.creationalPattern.singleton;


/**
 * 饿汉
 */
public class StarvingSingleton {
    //声明静态对象的时候就进行初始化
    private static StarvingSingleton mInstance = new StarvingSingleton();
    //私有构造方法，防止被实例化
    private StarvingSingleton() {
    }
    //外部获取实例
    public static StarvingSingleton getInstance(){
        return mInstance;
    }
}
