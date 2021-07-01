package com.yfz.main.creationalPattern.builder.foodItem;

import com.yfz.main.creationalPattern.builder.foodPackStyle.FoodPackingStyle;

/**
 * 食物商品的抽象类
 * 一件食物作为商品其具有定义的属性有【名字、包装类型、价格】
 */
public interface FoodItem {
    //食物名字
    String foodName();
    //食物包装类型 - 有【纸质包装，塑料盒包装】
    FoodPackingStyle foodPackingStyle();
    //食物价格
    float foodPrice();
}
