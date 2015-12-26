package com.example.eden.superzol_edenmor;


import android.app.Activity;
import android.content.ClipData;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.content.Intent;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.HashMap;

public class ListTabActivity extends Activity{

    ListView list;
    String[] itemname = {"חלב דל לקטוז תנובה", "חלב תנובה 1% קרטון", "חלב טרה 3% שומן"};
    String[] price = {"5.55", "7.08", "4.32"};
    Integer[] imgid = { R.drawable.dallaktoz, R.drawable.dalshuman, R.drawable.tara};

    String[] supername = {"רמי לוי שיווק השקמה - 250 ש''ח", "שופרסל דיל - 300 ש''ח", "יינות ביתן - 315 ש''ח"};
    Integer[] logoid = { R.drawable.ramilevi_logo, R.drawable.supersal_logo, R.drawable.tara};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_list);

        TextView title= (TextView) findViewById(R.id.txtTitleSuper);
        title.setText("שלושת הסופרים הכי זולים");

//        TextView s1= (TextView) findViewById(R.id.txtFirstSuper);
//        s1.setText("רמי לוי שיווק השקמה - 250 ש''ח");
//
//        TextView s2= (TextView) findViewById(R.id.txtSecondSuper);
//        s2.setText("שופרסל דיל - 300 ש''ח");
//
//        TextView s3= (TextView) findViewById(R.id.txtThirdSuper);
//        s3.setText("יינות ביתן - 315 ש''ח");

        CustomListAdapter adapter = new CustomListAdapter(this, imgid, itemname, price, "list");
        list = (ListView) findViewById(R.id.listViewList);
        list.setAdapter(adapter);

        CustomListAdapter adapter2 = new CustomListAdapter(this, logoid, supername, price, "superList");
        list = (ListView) findViewById(R.id.listViewBestSuper);
        list.setAdapter(adapter2);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ClipData.Item i = (ClipData.Item) parent.getAdapter().getItem(position);
                HashMap<String, Object> obj = (HashMap<String, Object>) parent.getAdapter().getItem(position);
                String name = (String) obj.get("name");

                String pName=parent.getItemAtPosition(position).toString();
            }
        });
    }

}

