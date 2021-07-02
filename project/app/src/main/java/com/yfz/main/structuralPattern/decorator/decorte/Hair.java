package com.yfz.main.structuralPattern.decorator.decorte;

import com.yfz.main.structuralPattern.decorator.component.Avatar;

public class Hair extends AvatarDecorator {

    public Hair(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String describe() {
        return super.describe()+" 头发：红头发";
    }
}
