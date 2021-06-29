package com.yfz.main.behaviorPattern.strategy;

/**
 * 创建算法具体实体类，实现接口
 * 除法
 */
public class OperationDivision implements StrategyInterface {
    @Override
    public int doOperation(int num1,int num2) {
        return num1 / num2;
    }
}
