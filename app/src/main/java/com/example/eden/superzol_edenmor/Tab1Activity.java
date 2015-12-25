package com.example.eden.superzol_edenmor;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.content.Intent;

public class Tab1Activity extends Activity{

    ListView list;
    String[] itemname = {"חלב דל לקטוז תנובה", "חלב תנובה 1% קרטון", "חלב טרה 3% שומן"};
    String[] price = {"5.55", "7.08", "4.32"};
    Integer[] imgid = { R.drawable.dallaktoz, R.drawable.dalshuman, R.drawable.tara};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_tab1 );
        int type;
        Intent intent = getIntent();
        type=intent.getIntExtra("typelist",0);
        CustomListAdapter adapter= new CustomListAdapter(this,  imgid,itemname, price,type);
        list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);

    }

}

