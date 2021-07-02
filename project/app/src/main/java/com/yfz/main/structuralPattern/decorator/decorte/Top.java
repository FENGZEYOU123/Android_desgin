package com.yfz.main.structuralPattern.decorator.decorte;

import com.yfz.main.structuralPattern.decorator.component.Avatar;

public class Top extends AvatarDecorator {
    public Top(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String describe() {
        return super.describe()+" 上衣：锁子甲";
    }
}
