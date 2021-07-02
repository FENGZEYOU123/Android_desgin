package com.yfz.main.structuralPattern.decorator.decorte;

import com.yfz.main.structuralPattern.decorator.component.Avatar;

/**
 * 装饰类，实现avatar的接口方法，并持有avatar对象的引用
 */
public class AvatarDecorator implements Avatar {
    //持有原接口对象引用
    private Avatar avatar;
    public AvatarDecorator(Avatar avatar){
        this.avatar = avatar;
    }
    @Override
    public String describe() {
        return avatar.describe();
    }
}
