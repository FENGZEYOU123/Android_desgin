package com.yfz.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.yfz.main.behaviorPattern.observer.ObserverPatternActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doObserverPattern(View view){
        startActivity(new Intent(MainActivity.this, ObserverPatternActivity.class));
    }
}