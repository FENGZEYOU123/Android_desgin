package com.yfz.main.creationalPattern.build;

import com.yfz.main.creationalPattern.build.foodItem.FoodItem;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建套餐Builder类
 */
public class MealBuilder {
    private List<FoodItem> itemsList = new ArrayList<FoodItem>();

    //对外提供添加食物商品的方法
    public void addFoodProduct(FoodItem foodItem){
        itemsList.add(foodItem);
    }

    //计算价格
    public float getCost(){
        float cost = 0.0f;
        for (FoodItem item : itemsList) {
            cost += item.foodPrice();
        }
        return cost;
    }

    //展示套餐内所有商品信息
    public void showItems(){
        System.out.print("建造者模式:>> 您的套餐包含如下食品>> ");
        for (FoodItem item : itemsList) {
            System.out.print("建造者模式:>> 名字:>> "+item.foodName());
            System.out.print("建造者模式:>> 包装:>> "+item.foodPackingStyle());
            System.out.println("建造者模式:>> 单价:>> "+item.foodPrice());
        }
        System.out.print("建造者模式:>> 您需要支付总价为 "+getCost()+" RMB");
    }
}
