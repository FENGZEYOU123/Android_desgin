package com.yfz.main.creationalPattern.factory.meetFactory.factory;

import com.yfz.main.creationalPattern.factory.meetFactory.product.MeetProduct;

/**
 * 为了将单个简单工厂拆分，需要创建个抽象工厂接口类，作为母工厂。
 * 猪肉工厂和牛肉工厂分别具体实现该抽象即可
 */
public abstract class Factory {
    public abstract MeetProduct createProduct();
}
