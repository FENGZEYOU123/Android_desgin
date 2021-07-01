package com.yfz.main.creationalPattern.factory.meetFactory.product;

/**
 * 产品抽象类的具体实现-产品为牛肉
 */
public class BeefProduct extends MeetProduct {
    @Override
    public String make() {
        return "牛肉";
    }
}
