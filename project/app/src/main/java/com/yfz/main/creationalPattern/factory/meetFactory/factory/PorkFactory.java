package com.yfz.main.creationalPattern.factory.meetFactory.factory;

import com.yfz.main.creationalPattern.factory.FactoryMethodPatternActivity;
import com.yfz.main.creationalPattern.factory.meetFactory.product.MeetProduct;
import com.yfz.main.creationalPattern.factory.meetFactory.product.PorkProduct;

/**
 * 将简单工厂，拆分成2个子工厂- 猪肉工厂
 */
public class PorkFactory extends Factory{
    public PorkFactory(){
        System.out.println(FactoryMethodPatternActivity.TAG+" 猪肉工厂");
    }
    @Override
    public MeetProduct createProduct() {
        return new PorkProduct();
    }
}
