package com.yfz.main.creationalPattern.builder.foodProduct;

import com.yfz.main.creationalPattern.builder.foodItem.FoodBurger;

/**
 * 巨无霸腿堡-食物商品-汉堡的具体实现类
 */
public class BigMacBurger extends FoodBurger {
    @Override
    public String foodName() {
        return "巨无霸汉堡";
    }
    @Override
    public float foodPrice() {
        return 27;
    }
}
