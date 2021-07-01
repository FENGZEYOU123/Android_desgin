package com.yfz.main.creationalPattern.builder.foodItem;


import com.yfz.main.creationalPattern.builder.foodPackStyle.FoodPackingStyle;
import com.yfz.main.creationalPattern.builder.foodPackStyle.WrapperPacking;

/**
 * 食物-汉堡-抽象类（汉堡可以有许多种）
 */
public abstract class FoodBurger implements FoodItem {
    //返回具体食品包装类型的实现类,汉堡一律都是纸质包装
    @Override
    public FoodPackingStyle foodPackingStyle() {
        return new WrapperPacking();
    }
}
