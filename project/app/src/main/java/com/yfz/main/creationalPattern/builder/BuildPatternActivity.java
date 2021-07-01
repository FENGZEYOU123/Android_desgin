package com.yfz.main.creationalPattern.builder;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.yfz.main.R;
import com.yfz.main.creationalPattern.builder.foodProduct.HotSpicyChickenBurger;

public class BuildPatternActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build_pattern);
        /**
         * 小明 开始点餐-> 选择了一份【香辣鸡腿堡套餐】-> 买单
         */
        MealBuilder mealBuilderA = new MealBuilder("小明").hotSpicyChickenBurgerMealComb();
        mealBuilderA.doCheck();
        /**
         * 王老二 开始点餐-> 选择了一份【巨无霸汉堡套餐】-> 感觉不够吃，又点了单个【香辣鸡腿堡】->买单
         */
        MealBuilder mealBuilderB = new MealBuilder("王老二").bigMacBurgerMealComb().addFoodProduct(new HotSpicyChickenBurger());
        mealBuilderB.doCheck();
    }
}