package com.yfz.main.behaviorPattern.strategy;

import android.util.Log;

/**
 * 创建算法具体实体类，实现接口
 * 除法
 */
public class OperationDivision implements StrategyInterface {
    @Override
    public int doOperation(int num1,int num2) {
        int result = num1 / num2;
//        Log.d("策略模式:>>", "本次执行算法的结果是 "+result);
        return num1 / num2;
    }
}
