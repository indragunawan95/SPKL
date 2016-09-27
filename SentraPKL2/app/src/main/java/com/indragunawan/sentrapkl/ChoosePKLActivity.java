package com.indragunawan.sentrapkl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ChoosePKLActivity extends AppCompatActivity {

    private ListView listView;
    private String names[] = {
            "Pecel Madiun",
            "Pecel Sejati",
            "Pecel Makmur",
            "Pecel Rawon",
    };

    private String desc[] = {
            "The Powerful Hypter Text Markup Language 5",
            "Cascading Style Sheets",
            "Code with Java Script",
            "Manage your content with Wordpress"
    };

    private Integer image1id[] = {
            R.drawable.pic_warungpecel,
            R.drawable.pic_warungpecel,
            R.drawable.pic_warungpecel,
            R.drawable.pic_warungpecel
    };

    private Integer image2id[] = {
            R.drawable.arrow,
            R.drawable.arrow,
            R.drawable.arrow,
            R.drawable.arrow
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_pkl);


        CustomList customList = new CustomList(this, names, desc, image1id, image2id);

        //ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.pkl_list);
        listView.setAdapter(customList);
    }
}
