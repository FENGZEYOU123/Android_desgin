package com.yfz.main.behaviorPattern.strategy;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.yfz.main.R;

public class StrategyPatternActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy_pattern);
        initial();
    }
    private void initial(){
        int num1 = 10;
        int num2 = 5;
        System.out.println("策略模式:>> num1>> "+num1+" --- num2>> "+num2);

        StrategyContext mStrategyContext = new StrategyContext(new OperationAdd());
        System.out.println("策略模式:>> 加法>> "+mStrategyContext.doCalculate(num1,num2));

                        mStrategyContext = new StrategyContext(new OperationSubtract());
        System.out.println("策略模式:>> 减法>> "+mStrategyContext.doCalculate(num1,num2));

                        mStrategyContext = new StrategyContext(new OperationMultiply());
        System.out.println("策略模式:>> 乘法>> "+mStrategyContext.doCalculate(num1,num2));

                        mStrategyContext = new StrategyContext(new OperationDivision());
        System.out.println("策略模式:>> 除法>> "+mStrategyContext.doCalculate(num1,num2));

    }
}