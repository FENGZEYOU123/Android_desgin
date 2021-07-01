package com.yfz.main.creationalPattern.factory.meetFactory.factory.abstractFactory;

import com.yfz.main.creationalPattern.factory.meetFactory.product.MeetProduct;

/**
 * 产品抽象类的具体实现-产品为牛肉
 */
public class PorkFeetProduct extends MeetProduct {
    @Override
    public String make() {
        return "猪脚";
    }
}
