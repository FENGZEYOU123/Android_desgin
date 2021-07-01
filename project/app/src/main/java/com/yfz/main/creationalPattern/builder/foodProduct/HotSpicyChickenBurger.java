package com.yfz.main.creationalPattern.builder.foodProduct;

import com.yfz.main.creationalPattern.builder.foodItem.FoodBurger;
/**
 * 香辣鸡腿堡-食物商品-汉堡的具体实现类
 */
public class HotSpicyChickenBurger extends FoodBurger {
    @Override
    public String foodName() {
        return "香辣鸡腿堡";
    }
    @Override
    public float foodPrice() {
        return 30;
    }
}
