package com.yfz.main.creationalPattern.factory.meetFactory.product;

/**
 * 产品抽象类的具体实现-产品为猪肉
 */
public class PorkProduct extends MeetProduct {
    @Override
    public String make() {
        return "猪肉";
    }
}