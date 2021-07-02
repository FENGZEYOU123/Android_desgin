package com.yfz.main.structuralPattern.decorator.decorte;

import com.yfz.main.structuralPattern.decorator.component.Avatar;

public class Bottom extends AvatarDecorator {
    public Bottom(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String describe() {
        return super.describe()+" 裤子：牛仔裤";
    }
}
