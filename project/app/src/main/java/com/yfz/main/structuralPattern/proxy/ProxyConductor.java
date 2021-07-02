package com.yfz.main.structuralPattern.proxy;

import java.lang.reflect.Proxy;

/**
 * 代理售票员-实现真正售票员的实现的同一个接口
 */
public class ProxyConductor implements Conductor{
    private RealConductor realConductor;

    /**
     * 持用真正售票员的引用
     * @param realConductor
     */
    public ProxyConductor(RealConductor realConductor){
        this.realConductor = realConductor;
    }
    @Override
    public String where() {
        return "松江大学生火车票代售点";
    }

    @Override
    public int ticketAmount() {
        return realConductor.ticketAmount();
    }

    /**
     * 提供出售火车票的方法
     * @param whereToGo
     * @param ticketNum
     */
    public void purchase(String whereToGo, int ticketNum){
        System.out.println(ProxyPatternActivity.TAG+"您好，这里是 "+where()+" 。您购买了 "+ticketNum+"张,前往 "+whereToGo+" 的票");
    }
    /**
     * 提供总售票处的地点
     */
    public void askWhereIsMainConductor(){
        System.out.println(ProxyPatternActivity.TAG+"小明询问：请问你们的总售票处在哪啊？");
        System.out.println(ProxyPatternActivity.TAG+"代理售票员回答道：总售票处在： "+realConductor.where());
    }
}
