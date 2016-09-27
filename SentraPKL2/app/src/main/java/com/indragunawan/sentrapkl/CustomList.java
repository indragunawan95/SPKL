package com.indragunawan.sentrapkl;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Belal on 7/22/2015.
 */
public class CustomList extends ArrayAdapter<String> {
    private Integer[] image1id;
    private String[] names;
    private String[] desc;
    private Integer[] image2id;
    private Activity context;

    public CustomList(Activity context, String[] names, String[] desc, Integer[] image1id, Integer[] image2id) {
        super(context, R.layout.activity_listview, names);
        this.context = context;
        this.names = names;
        this.desc = desc;
        this.image1id = image1id;
        this.image2id = image2id;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.activity_listview, null, true);
        ImageView imageView = (ImageView) listViewItem.findViewById(R.id.imageView);
        TextView textViewName = (TextView) listViewItem.findViewById(R.id.text_besar);
        TextView textViewDesc = (TextView) listViewItem.findViewById(R.id.text_kecil);
        ImageView list_image = (ImageView) listViewItem.findViewById(R.id.list_image);

        imageView.setImageResource(image2id[position]);
        textViewName.setText(names[position]);
        textViewDesc.setText(desc[position]);
        list_image.setImageResource(image1id[position]);
        return  listViewItem;
    }
}