package com.yfz.main.creationalPattern.factory.meetFactory.factory;

import com.yfz.main.creationalPattern.factory.FactoryMethodPatternActivity;
import com.yfz.main.creationalPattern.factory.meetFactory.product.BeefProduct;
import com.yfz.main.creationalPattern.factory.meetFactory.product.MeetProduct;
import com.yfz.main.creationalPattern.factory.meetFactory.product.PorkProduct;

/**
 * 牛肉工厂-实现母工厂抽象类
 */
public class BeefFactory extends Factory{
    public BeefFactory(){
        System.out.println(FactoryMethodPatternActivity.TAG+" 牛肉工厂");
    }
    @Override
    public MeetProduct createProduct() {
        return new BeefProduct();
    }
}
