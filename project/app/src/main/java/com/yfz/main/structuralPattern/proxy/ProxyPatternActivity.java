package com.yfz.main.structuralPattern.proxy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.yfz.main.R;

public class ProxyPatternActivity extends AppCompatActivity {
    public static String TAG = "代理模式:>> ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy_pattern);

        //小明在上海松江大学上学，没空去虹桥火车站买票，于是通过代理的方式购买
        System.out.println(TAG +"小明前往家附近的售票点买票:>> ");
        //创建一个总售票站
        RealConductor realConductor = new RealConductor();
        //创建一个代理售票站，拥有总售票站的所有信息（例如还有多少张票）
        ProxyConductor proxyConductor = new ProxyConductor(realConductor);
        //小明开始购票（通过代理售票站提供的方法）
        proxyConductor.purchase("北京",2);
        //小明询问总售票站在哪（通过代理售票站提供的方法，由于代理售票站有总售票站的所有信息，所以可以回答）
        proxyConductor.askWhereIsMainConductor();
    }
}