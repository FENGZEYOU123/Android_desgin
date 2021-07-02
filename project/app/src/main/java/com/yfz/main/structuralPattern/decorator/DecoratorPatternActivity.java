package com.yfz.main.structuralPattern.decorator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.yfz.main.R;
import com.yfz.main.structuralPattern.decorator.component.Avatar;
import com.yfz.main.structuralPattern.decorator.component.Profession;
import com.yfz.main.structuralPattern.decorator.decorte.Bottom;
import com.yfz.main.structuralPattern.decorator.decorte.Hair;
import com.yfz.main.structuralPattern.decorator.decorte.Top;
import com.yfz.main.structuralPattern.decorator.decorte.Weapon;

public class DecoratorPatternActivity extends AppCompatActivity {
    public static String TAG = "装饰者:>> ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorator_pattern);
        Avatar avatar = new Weapon(new Hair(new Top(new Bottom(new Profession()))));
        System.out.println(TAG+ avatar.describe());
    }
}