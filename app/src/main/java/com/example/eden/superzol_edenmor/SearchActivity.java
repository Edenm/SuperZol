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

        TabHost.TabSpec ts1 = mTabHost.newTabSpec("page1");
        ts1.setContent(new Intent(this, Tab1Activity.class));
        ts1.setIndicator("page1");
        mTabHost.addTab(ts1);

        TabHost.TabSpec ts2 = mTabHost.newTabSpec("page2");
        ts2.setContent(new Intent(this,Tab2Activity.class));
        ts2.setIndicator("page2");
        mTabHost.addTab(ts2);
    }
}