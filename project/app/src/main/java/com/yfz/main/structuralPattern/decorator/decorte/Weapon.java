package com.yfz.main.structuralPattern.decorator.decorte;

import com.yfz.main.structuralPattern.decorator.component.Avatar;

public class Weapon extends AvatarDecorator {

    public Weapon(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String describe() {
        return super.describe()+" 武器：开山斧";
    }
}
