package com.yfz.main.creationalPattern.builder.foodPackStyle;

/**
 * 食物包装的具体实现类 - 塑料瓶包装
 */
public class BottlePacking implements FoodPackingStyle {
    @Override
    public String packStyle() {
        return "塑料瓶包装";
    }
}
