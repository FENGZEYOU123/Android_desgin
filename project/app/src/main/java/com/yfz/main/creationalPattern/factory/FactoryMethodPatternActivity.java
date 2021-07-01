package com.yfz.main.creationalPattern.factory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.yfz.main.R;
import com.yfz.main.creationalPattern.factory.meetFactory.factory.BeefFactory;
import com.yfz.main.creationalPattern.factory.meetFactory.factory.Factory;
import com.yfz.main.creationalPattern.factory.meetFactory.factory.PorkFactory;
import com.yfz.main.creationalPattern.factory.meetFactory.product.MeetProduct;

public class FactoryMethodPatternActivity extends AppCompatActivity {
    public static String TAG ="工厂法模式:>> ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory_method_pattern);
        //创建牛肉工厂-生产牛肉
        Factory factoryA = new BeefFactory();
        System.out.println(TAG+"生产的产品是:>> "+ factoryA.createProduct().make());
        //创建猪工厂-生产猪肉
        Factory factoryB = new PorkFactory();
        System.out.println(TAG+"生产的产品是:>> "+ factoryB.createProduct().make());

    }
}