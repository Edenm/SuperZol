package com.example.eden.superzol_edenmor;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by MOR on 12/19/2015.
 */
public class Tab1Activity extends Activity {

    TextView tv;

    protected void OnCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab1);
        tv = (TextView)findViewById(R.id.textView);
        tv.setText("This is Tab 1");
    }
}

