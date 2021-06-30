package com.yfz.main.creationalPattern.build.foodPackStyle;

/**
 * 食物包装的具体实现类 - 纸质包装
 */
public class WrapperPacking implements FoodPackingStyle {
    @Override
    public String packStyle() {
        return "纸质包装";
    }
}
