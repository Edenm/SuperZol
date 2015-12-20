package com.example.eden.superzol_edenmor;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

import java.lang.reflect.Type;


/**
 * Created by MOR on 12/19/2015.
 */
public class SearchActivity extends AppCompatActivity{

    TabHost tabHost;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        tabHost = (TabHost)findViewById(R.id.tabhost);

        CreateTab1("Search", "Search");
        CreateTab2("Super", "Super");

    }

    private void CreateTab1(String tag, String label)
    {
        Intent intent = new Intent(SearchActivity.this, Tab1Activity.class);

        TabHost.TabSpec spec = tabHost.newTabSpec(tag);
        spec.setIndicator("Search");
        spec.setContent(intent);

        tabHost.addTab(spec);
    }

    private void CreateTab2(String tag, String label)
    {
        Intent intent = new Intent(SearchActivity.this, Tab2Activity.class);
        //intent.AddFlags(ActivityFlags.NewTask);

        TabHost.TabSpec spec = tabHost.newTabSpec(tag);
        spec.setIndicator("Super");
        spec.setContent(intent);

        tabHost.addTab(spec);
    }
}
