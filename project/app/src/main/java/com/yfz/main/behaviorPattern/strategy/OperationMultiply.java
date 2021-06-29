package com.yfz.main.behaviorPattern.strategy;

/**
 * 创建算法具体实体类，实现接口
 * 乘法
 */
public class OperationMultiply implements CalculateStrategyInterface{
    @Override
    public int doOperation(int num1,int num2) {
        return num1 * num2;
    }
}
