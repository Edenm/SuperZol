package com.example.eden.superzol_edenmor;

import android.os.Bundle;
import android.widget.TabHost;
import android.app.TabActivity;
import android.content.Intent;

public class SearchActivity extends TabActivity {
    TabHost mTabHost;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        mTabHost = getTabHost();

        Intent intent;

        TabHost.TabSpec ts3 = mTabHost.newTabSpec("page1");
        intent=new Intent(this, Tab1Activity.class);
        intent.putExtra("typelist",1);
        ts3.setContent(intent);
        ts3.setIndicator("רשימה");
        mTabHost.addTab(ts3);

        TabHost.TabSpec ts2 = mTabHost.newTabSpec("page1");
        intent=new Intent(this, Tab1Activity.class);
        intent.putExtra("typelist", 2);
        ts2.setContent(intent);
        ts2.setIndicator("סופר");
        mTabHost.addTab(ts2);

        TabHost.TabSpec ts1 = mTabHost.newTabSpec("page2");
        ts1.setContent(new Intent(this,Tab1Activity.class));
        ts1.setIndicator("חיפוש");
        mTabHost.addTab(ts1);
    }
}