package com.example.eden.superzol_edenmor;


import android.app.Activity;
import android.content.ClipData;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.content.Intent;
import android.widget.Toast;

import java.util.HashMap;

public class SearchTabActivity extends Activity{

    ListView list;
    String[] itemname = {"חומוס אחלה 500 גרם", "מלפפון", "חלב טרה 3% שומן", "קוקה קולה"};
    String[] price = {"10", "4.10", "4.32", "5.99"};
    Integer[] imgid = { R.drawable.hummus_classic, R.drawable.cucumber, R.drawable.tara, R.drawable.cocacola};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_search);

        CustomListAdapter adapter = new CustomListAdapter(this, imgid, itemname, price, "list");
        list = (ListView) findViewById(R.id.listViewSearch);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent quantityIntent = new Intent(SearchTabActivity.this, ChooseProductActivity.class);
                startActivity(quantityIntent);
            }
        });
    }

}

