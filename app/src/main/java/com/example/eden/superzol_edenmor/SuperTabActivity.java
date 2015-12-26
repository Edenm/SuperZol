package com.example.eden.superzol_edenmor;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.HashMap;


public class SuperTabActivity extends Activity{
    ListView list;
    String[] itemname = {"חלב דל לקטוז תנובה", "חלב תנובה 1% קרטון", "חלב טרה 3% שומן","חלב טרה 3% שומן","חלב טרה 3% שומן"};
    String[] price = {"5.55", "7.08", "4.32","4.32","4.32"};
    Integer[] imgid = { R.drawable.dallaktoz, R.drawable.dalshuman, R.drawable.tara, R.drawable.tara,R.drawable.tara};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_super);

        TextView superName= (TextView)findViewById(R.id.txtSuperName);
        superName.setText("רמי לוי שיווק השקמה - נשר");

        CustomListAdapter adapter= new CustomListAdapter(this,  imgid,itemname, price,"super");
        list = (ListView) findViewById(R.id.listViewSuper);
        list.setAdapter(adapter);



        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ClipData.Item i = (ClipData.Item) parent.getAdapter().getItem(position);
                HashMap<String, Object> obj = (HashMap<String, Object>) parent.getAdapter().getItem(position);
                String name = (String) obj.get("name");

                String pName = parent.getItemAtPosition(position).toString();
            }
        });
    }
}