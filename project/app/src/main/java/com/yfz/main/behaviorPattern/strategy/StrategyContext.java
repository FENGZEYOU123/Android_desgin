package com.yfz.main.behaviorPattern.strategy;

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
        return mStrategyInterface.doOperation(num1, num2);
    }
}
