package com.yfz.main.creationalPattern.factory.meetFactory.factory.abstractFactory;

import com.yfz.main.creationalPattern.factory.meetFactory.product.MeetProduct;

/**
 * 工厂抽象接口，猪肉工厂不光是能生产猪肉，还能生产指定的部位，猪脚
 */
public abstract class AbstractFactory {
    public abstract MeetProduct createProduct();
    public abstract MeetProduct createProductPart();
}
