package com.yfz.main.structuralPattern.decorator.component;

/**
 * 角色：concreteComponent具体实现类,玩家职业
 */
public class Profession implements Avatar{

    @Override
    public String describe() {
        return "小明的创建的游戏角色是>> 职业:战士";
    }
}
