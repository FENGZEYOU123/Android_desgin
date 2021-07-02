package com.yfz.main.structuralPattern.adapter;


import com.yfz.main.structuralPattern.adapter.adaptee.CNVoltage;

/**
 * 电器-打印机-中国产的
 */
public class Printer{
    /**
     * 给打印机配置一个电压，由于是中国产的，所以默认是中国电压
     */
    private CNVoltage mCnVoltage;
    public Printer(CNVoltage cnVoltage){
        System.out.println(AdapterPatternActivity.TAG+"实例化一个打印机，并配置电压 "+cnVoltage.getVoltage());
        this.mCnVoltage = cnVoltage;
    }

    /**
     * 连接电源
     */
    public void doConnect(){
        mCnVoltage.connect();
    }
}
