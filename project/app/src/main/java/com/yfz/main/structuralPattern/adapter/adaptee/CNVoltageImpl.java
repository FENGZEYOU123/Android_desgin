package com.yfz.main.structuralPattern.adapter.adaptee;

import com.yfz.main.structuralPattern.adapter.AdapterPatternActivity;

/**
 * 源角色的具体实现类，中国电压需要220V才能正常工作
 */
public class CNVoltageImpl implements CNVoltage {
    @Override
    public void connect() {
        System.out.println(AdapterPatternActivity.TAG+"源：打印机以 "+getVoltage()+"伏电压工作");
    }

    @Override
    public int getVoltage() {
        return 220;
    }
}
