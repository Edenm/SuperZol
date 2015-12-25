package com.example.eden.superzol_edenmor;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Eden on 25-Dec-15.
 */
public class ChooseProductActivity extends Activity {

    ListView list;
    String[] itemname = {"חלב דל לקטוז תנובה", "חלב תנובה 1% קרטון", "חלב טרה 3% שומן","חלב טרה 3% שומן","חלב טרה 3% שומן"};
    String[] price = {"5.55", "7.08", "4.32","4.32","4.32"};
    Integer[] imgid = { R.drawable.dallaktoz, R.drawable.dalshuman, R.drawable.tara, R.drawable.tara,R.drawable.tara};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_product);

        TextView searchProduct= (TextView)findViewById(R.id.txtSearchProduct);
        searchProduct.setText("חלב");

        CustomListAdapter adapter= new CustomListAdapter(this,  imgid,itemname, price,1);
        list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);

    }
}
