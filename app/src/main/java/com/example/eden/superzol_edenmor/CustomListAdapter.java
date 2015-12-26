package com.example.eden.superzol_edenmor;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by MOR on 12/24/2015.
 */
public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;
    private final String [] price;
    private String pListType;


    public CustomListAdapter(Activity context,Integer[] imgid, String[] itemname, String[] price, String pListType) {
        super(context, R.layout.productlist_quantity, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
        this.price=price;
        this.pListType=pListType;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();

        View rowView= null;
        if (pListType.equals("list"))
            rowView=inflater.inflate(R.layout.productlist, null,true);
        if (pListType.equals("quantity"))
            rowView=inflater.inflate(R.layout.productlist_quantity, null,true);
        if (pListType.equals("super"))
            rowView=inflater.inflate(R.layout.productlist_super, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.prodName);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.prodImg);
        TextView extratxt = (TextView) rowView.findViewById(R.id.priceTxt);

        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        extratxt.setText(price[position]);
        return rowView;
    };

}

