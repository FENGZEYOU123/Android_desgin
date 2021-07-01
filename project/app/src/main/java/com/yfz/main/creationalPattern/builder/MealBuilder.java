package com.yfz.main.creationalPattern.builder;

import com.yfz.main.creationalPattern.builder.foodItem.FoodItem;
import com.yfz.main.creationalPattern.builder.foodProduct.BigMacBurger;
import com.yfz.main.creationalPattern.builder.foodProduct.CocaColaDrink;
import com.yfz.main.creationalPattern.builder.foodProduct.HotSpicyChickenBurger;
import com.yfz.main.creationalPattern.builder.foodProduct.SpriteDrink;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建套餐Builder类
 */
public class MealBuilder {
    private List<FoodItem> itemsList = new ArrayList<FoodItem>();
    private String name;
    //点餐必须带上顾客名字
    public MealBuilder(String name){
        this.name = name;
    }
    //香辣鸡腿堡套餐内必须含有一个【香辣鸡腿堡】，一杯【可乐】
    public void hotSpicyChickenBurgerMealComb(){
        itemsList.add(new HotSpicyChickenBurger());
        itemsList.add(new CocaColaDrink());
    }
    //巨无霸套餐内必须含有一个【巨无霸汉堡】，一杯【雪碧】
    public void bigMacBurgerMealComb(){
        itemsList.add(new BigMacBurger());
        itemsList.add(new SpriteDrink());
    }
    //对外提供添加食物商品的方法，如果客人觉得不够可自由添加其他食品
    public void addFoodProduct(FoodItem foodItem){
        itemsList.add(foodItem);
    }
    //计算价格
    private float getCost(){
        float cost = 0.0f;
        for (FoodItem item : itemsList) {
            cost += item.foodPrice();
        }
        return cost;
    }
    //买单并展示套餐内所有商品信息
    public void doCheck(){
        System.out.println("建造者模式:>> "+name+" 您的套餐包含如下食品>> ");
        for (FoodItem item : itemsList) {
            System.out.println("建造者模式:>> 名字："+item.foodName()+" 包装："+item.foodPackingStyle().packStyle()+" 单价："+item.foodPrice());
        }
        System.out.println("建造者模式:>> 您需要支付总价为 "+getCost()+" RMB。");
        System.out.println("建造者模式:>> 结束。");

    }
}
