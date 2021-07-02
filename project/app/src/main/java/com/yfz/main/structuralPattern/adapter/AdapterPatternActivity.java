package com.yfz.main.structuralPattern.adapter;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.yfz.main.R;
import com.yfz.main.structuralPattern.adapter.adaptee.CNVoltage;
import com.yfz.main.structuralPattern.adapter.adaptee.CNVoltageImpl;
import com.yfz.main.structuralPattern.adapter.target.USAVoltage;
import com.yfz.main.structuralPattern.adapter.target.USAVoltageImpl;
import com.yfz.main.structuralPattern.adapter.voltageAdapter.VoltageAdapter;

public class AdapterPatternActivity extends AppCompatActivity {
    public static String TAG = "适配器模式:>> ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_pattern);

        System.out.println(AdapterPatternActivity.TAG+"小明在中国:>>");
        //获取中国电压器220V
        CNVoltage cnVoltage = new CNVoltageImpl();
        //将电压器220V配置给打印机
        Printer printerA = new Printer(cnVoltage);
        //打印机配置好220V电压后，就可以工作了
        printerA.doConnect();

        System.out.println("\n"+AdapterPatternActivity.TAG+"小明带着打印机飞到了美国:>>");
        //获取美国电压器120V
        USAVoltage usaVoltage = new USAVoltageImpl();
        //装一个电压适配器,将美国的电压120装进去
        VoltageAdapter voltageAdapter = new VoltageAdapter(usaVoltage);
        //将电压适配器，配置给打印机
        Printer printer = new Printer(voltageAdapter);
        //打印机配置好120V电压后，就可以工作了
        printer.doConnect();



    }
}