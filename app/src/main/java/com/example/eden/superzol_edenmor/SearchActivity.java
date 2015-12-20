package com.example.eden.superzol_edenmor;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.graphics.drawable.Drawable;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SpinnerAdapter;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TableRow;
import android.widget.Toolbar;

public class SearchActivity extends Activity {

    TabHost tabHost;
    TabWidget menuBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(actionBar.NAVIGATION_MODE_TABS);
        ActionBar.Tab tab = actionBar.newTab();
        tab.setText("TAB 1");
        TabListener<Tab1Activity> t1 = new TabListener<>(this, "tab1", Tab1Activity.class);
        tab.setTabListener(t1);
        actionBar.addTab(tab);

        ActionBar.Tab tab2 = actionBar.newTab();
        tab.setText("TAB 2");
        TabListener<Tab1Activity> t2 = new TabListener<>(this, "tab2", Tab1Activity.class);
        tab.setTabListener(t2);
        actionBar.addTab(tab2);
    }


    private class TabListener <T extends Fragment> implements ActionBar.TabListener {

        private Fragment mFragment;
        private final Activity mActivity;
        private final String mTag;
        private final Class<T> mClass;

        public TabListener(Activity activity, String tag, Class<T> clz){
            mActivity = activity;
            mTag = tag;
            mClass = clz;
        }

        @Override
        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
            if (mFragment == null)
            {
                mFragment = Fragment.instantiate(mActivity,mClass.getName());
                ft.add(android.R.id.content,mFragment,mTag);
            }
            else
            {
                ft.attach(mFragment);
            }


        }

        @Override
        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
            if (mFragment != null)
            {
                ft.detach(mFragment);
            }
        }

        @Override
        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

        }
    }




}
