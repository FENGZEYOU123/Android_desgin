package com.yfz.main.structuralPattern.adapter.voltageAdapter;

import com.yfz.main.structuralPattern.adapter.AdapterPatternActivity;
import com.yfz.main.structuralPattern.adapter.adaptee.CNVoltage;
import com.yfz.main.structuralPattern.adapter.target.USAVoltage;

/**
 * 电压适配器-打印机是中国产的，默认电压是220V，所以要实现 源 接口.
 * 但是在美国也要使用，所以我们需要持有美国电压器的引用
 */
public class VoltageAdapter implements CNVoltage {
    /**
     * 持有美国电压器的引用
     */
    private USAVoltage usaVoltage;
    public VoltageAdapter(USAVoltage usaVoltage){
        System.out.println(AdapterPatternActivity.TAG+"使用电压适配器，将中国的220V电压，转换为目标电压 "+usaVoltage.getVoltage());
        this.usaVoltage = usaVoltage;
    }
    @Override
    public void connect() {
        usaVoltage.connect();//将 源（中国电压）的方法，用目标（美国电压）的方法替代，这样就实现了在中国的打印机使用120V电压
    }
    @Override
    public int getVoltage() {
        return usaVoltage.getVoltage();
    }
}
