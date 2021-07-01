package com.yfz.main.creationalPattern.builder.foodItem;

import com.yfz.main.creationalPattern.builder.foodPackStyle.FoodPackingStyle;
import com.yfz.main.creationalPattern.builder.foodPackStyle.WrapperPacking;

/**
 * 食物-饮料-抽象类（饮料可以有许多种）
 */
public abstract class FoodDrink implements FoodItem{

    //返回具体食品包装类型的实现类,饮料一律都是塑料瓶包装
    @Override
    public FoodPackingStyle foodPackingStyle() {
        return new WrapperPacking();
    }

    //食物价格
    @Override
    public abstract float foodPrice();
}
