package com.yfz.main.creationalPattern.factory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.yfz.main.R;
import com.yfz.main.creationalPattern.factory.meetFactory.factory.MeetFactory;
import com.yfz.main.creationalPattern.factory.meetFactory.product.MeetProduct;

/**
 * 简单工厂
 */
public class SimpleFactoryPatternActivity extends AppCompatActivity {
    public static String TAG ="工厂模式:>> ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory_pattern);
        //创建个工厂对象，(开了个肉厂)
        MeetFactory meetFactory = new MeetFactory();
        //指定肉厂生产的产品(我想要生产牛肉)
        MeetProduct meetProduct = meetFactory.makeProduct(MeetFactory.ProductStyle.牛肉);
        System.out.println(TAG+"生产的产品是:>> "+ meetProduct.make());
    }
}