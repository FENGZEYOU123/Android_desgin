package com.yfz.main.creationalPattern.factory.meetFactory.factory;

import com.yfz.main.creationalPattern.factory.FactoryMethodPatternActivity;
import com.yfz.main.creationalPattern.factory.meetFactory.product.BeefProduct;
import com.yfz.main.creationalPattern.factory.meetFactory.product.MeetProduct;
import com.yfz.main.creationalPattern.factory.meetFactory.product.PorkProduct;

/**
 * 将简单工厂，拆分成2个子工厂- 牛肉工厂
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
