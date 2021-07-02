package com.yfz.main.structuralPattern.adapter.target;

import com.yfz.main.structuralPattern.adapter.AdapterPatternActivity;

/**
 * 目标具体实现类，美国电压需要120V才能正常工作
 */
public class USAVoltageImpl implements USAVoltage {
    @Override
    public void connect() {
        System.out.println(AdapterPatternActivity.TAG+"目标：打印机以 "+getVoltage()+"伏电压工作");
    }

    @Override
    public int getVoltage() {
        return 120;
    }
}
