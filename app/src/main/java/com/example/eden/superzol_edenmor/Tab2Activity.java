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
public class Tab2Activity extends Activity {

    TextView tv2;

    protected void OnCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab2);
        tv2 = (TextView)findViewById(R.id.textView2);
        tv2.setText("This is the My Schedule tab");
    }
}

