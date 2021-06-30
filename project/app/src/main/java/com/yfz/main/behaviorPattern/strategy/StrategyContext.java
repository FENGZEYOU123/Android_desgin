package com.yfz.main.behaviorPattern.strategy;

import android.util.Log;

/**
 * 创建Context类-理解为使用策略的客户端
 */
public class StrategyContext {
    public StrategyInterface mStrategyInterface;
    //构造方法，传递接口
    public StrategyContext(StrategyInterface strategyInterface){
        this.mStrategyInterface = strategyInterface;
    }
    public int doCalculate(int num1, int num2){
        int result = mStrategyInterface.doOperation(num1, num2);
        Log.d("策略模式:>>", "本次执行算法的结果是 "+result);
        return result;
    }
}
