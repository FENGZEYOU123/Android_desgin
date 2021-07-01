package com.yfz.main.creationalPattern.factory.meetFactory.factory;

import com.yfz.main.creationalPattern.factory.SimpleFactoryPatternActivity;
import com.yfz.main.creationalPattern.factory.meetFactory.product.BeefProduct;
import com.yfz.main.creationalPattern.factory.meetFactory.product.MeetProduct;
import com.yfz.main.creationalPattern.factory.meetFactory.product.PorkProduct;

/**
 * 工厂角色-用于客户调用，只需要传递想要生产什么肉即可
 */
public class MeetFactory {
    public MeetFactory(){
        System.out.println(SimpleFactoryPatternActivity.TAG+"创建了个肉厂");
    }
    //可生产的种类
    public enum ProductStyle{
        猪肉,牛肉
    }
    public MeetProduct makeProduct(ProductStyle productStyle){
        MeetProduct meetProduct = null;
        switch (productStyle){
            case 牛肉:
                meetProduct =  new BeefProduct();
                break;
            case 猪肉:
                meetProduct =  new PorkProduct();
                break;
        }
        return meetProduct;
    }
}
