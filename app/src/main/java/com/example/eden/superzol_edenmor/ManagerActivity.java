package com.example.eden.superzol_edenmor;

import android.os.Bundle;
import android.widget.TabHost;
import android.app.TabActivity;
import android.content.Intent;

public class ManagerActivity extends TabActivity {
    TabHost mTabHost;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);

        mTabHost = getTabHost();

        Intent intent;

        TabHost.TabSpec ts3 = mTabHost.newTabSpec("3");
        intent=new Intent(this, ComparisonTabActivity.class);
        ts3.setContent(intent);
        ts3.setIndicator("השוואה");
        mTabHost.addTab(ts3);

        TabHost.TabSpec ts2 = mTabHost.newTabSpec("2");
        intent=new Intent(this, SuperTabActivity.class);
        ts2.setContent(intent);
        ts2.setIndicator("סופר");
        mTabHost.addTab(ts2);

        TabHost.TabSpec ts1 = mTabHost.newTabSpec("1");
        intent=new Intent(this, SearchTabActivity.class);
        ts1.setContent(intent);
        ts1.setIndicator("רשימה");
        mTabHost.addTab(ts1);
    }
}