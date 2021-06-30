package com.yfz.main.creationalPattern.build.foodProduct;


import com.yfz.main.creationalPattern.build.foodItem.FoodDrink;

/**
 * 可口可乐-食物商品-饮料-的具体实现类
 */
public class CocaColaDrink extends FoodDrink {
    @Override
    public String foodName() {
        return "可口可乐";
    }

    @Override
    public float foodPrice() {
        return 10;
    }
}
