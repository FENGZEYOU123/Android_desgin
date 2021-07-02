package com.yfz.main.structuralPattern.decorator.decorte;

import com.yfz.main.structuralPattern.decorator.component.Avatar;

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
