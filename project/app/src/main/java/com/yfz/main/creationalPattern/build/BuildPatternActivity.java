package com.yfz.main.creationalPattern.build;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.yfz.main.R;
import com.yfz.main.creationalPattern.build.foodProduct.BigMacBurger;
import com.yfz.main.creationalPattern.build.foodProduct.CocaColaDrink;
import com.yfz.main.creationalPattern.build.foodProduct.HotSpicyChickenBurger;

public class BuildPatternActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build_pattern);

        MealBuilder mealBuilder = new MealBuilder();
        mealBuilder.addFoodProduct(new BigMacBurger());
        mealBuilder.addFoodProduct(new CocaColaDrink());
        mealBuilder.addFoodProduct(new HotSpicyChickenBurger());
        mealBuilder.showItems();
    }
}