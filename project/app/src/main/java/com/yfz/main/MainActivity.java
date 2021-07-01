package com.yfz.main;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.yfz.main.behaviorPattern.observer.ObserverPatternActivity;
import com.yfz.main.behaviorPattern.strategy.StrategyPatternActivity;
import com.yfz.main.creationalPattern.builder.BuildPatternActivity;
import com.yfz.main.creationalPattern.factory.FactoryMethodPatternActivity;
import com.yfz.main.creationalPattern.factory.SimpleFactoryPatternActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doObserverPattern(View view){
        startActivity(new Intent(MainActivity.this, ObserverPatternActivity.class));
    }
    public void doStrategyPattern(View view){
        startActivity(new Intent(MainActivity.this, StrategyPatternActivity.class));
    }
    public void doBuildPattern(View view){
        startActivity(new Intent(MainActivity.this, BuildPatternActivity.class));
    }
    public void doSimpleFactoryPattern(View view){
        startActivity(new Intent(MainActivity.this, SimpleFactoryPatternActivity.class));
    }
    public void doFactoryMethodPattern(View view){
        startActivity(new Intent(MainActivity.this, FactoryMethodPatternActivity.class));
    }
}