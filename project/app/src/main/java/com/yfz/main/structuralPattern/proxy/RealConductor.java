package com.yfz.main.structuralPattern.proxy;

/**
 * 真正的售票员，实现接口
 */
public class RealConductor implements Conductor{

    @Override
    public String where() {
        return "上海虹桥火车站";
    }

    @Override
    public int ticketAmount() {
        return 10;
    }

}
