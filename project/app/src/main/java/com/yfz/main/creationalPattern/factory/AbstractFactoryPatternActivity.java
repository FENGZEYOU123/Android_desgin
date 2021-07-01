package com.yfz.main.creationalPattern.factory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.yfz.main.R;
import com.yfz.main.creationalPattern.factory.meetFactory.factory.Factory;
import com.yfz.main.creationalPattern.factory.meetFactory.factory.abstractFactory.AbstractFactory;
import com.yfz.main.creationalPattern.factory.meetFactory.factory.abstractFactory.PorkAbstractFactory;

/**
 * 抽象工厂模式,猪肉工厂实现工厂抽象类，不仅可以生产普通猪肉，也可以生产指定产品，猪脚
 */
public class AbstractFactoryPatternActivity extends AppCompatActivity {
    public static String TAG ="抽象工厂:>> ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_factory_pattern);
        AbstractFactory factory = new PorkAbstractFactory();
        System.out.println(TAG+"生产的产品是:>> "+ factory.createProduct().make());
        System.out.println(TAG+"同时还能生产指定产品:>> "+ factory.createProductPart().make());

    }
}