package com.yfz.main.creationalPattern.factory.meetFactory.factory.abstractFactory;

import com.yfz.main.creationalPattern.factory.AbstractFactoryPatternActivity;
import com.yfz.main.creationalPattern.factory.meetFactory.product.BeefProduct;
import com.yfz.main.creationalPattern.factory.meetFactory.product.MeetProduct;
import com.yfz.main.creationalPattern.factory.meetFactory.product.PorkProduct;

/**
 * 猪肉工厂-实现母工厂抽象类
 */
public class PorkAbstractFactory extends AbstractFactory {
    public PorkAbstractFactory(){
        System.out.println(AbstractFactoryPatternActivity.TAG+" 猪肉工厂");
    }
    @Override
    public MeetProduct createProduct() {
        return new PorkProduct();
    }

    @Override
    public MeetProduct createProductPart() {
        return new PorkFeetProduct();
    }
}
