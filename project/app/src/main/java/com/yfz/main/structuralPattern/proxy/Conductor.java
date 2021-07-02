package com.yfz.main.structuralPattern.proxy;

/**
 * 售票抽象类-定义方法
 */
public interface Conductor {
     String where(); //售票地点在哪
     int ticketAmount(); //剩余多少张票
}
