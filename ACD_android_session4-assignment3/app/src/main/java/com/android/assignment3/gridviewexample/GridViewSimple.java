package com.android.vicky.gridviewexample;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class GridViewSimple extends AppCompatActivity {
    GridView gridView;
    static final Integer[] imgid= new Integer[]{
            R.drawable.ginger_bread,
            R.drawable.honeycomb,
            R.drawable.ics,
            R.drawable.jelly_bean,
            R.drawable.kitkat,
            R.drawable.lollipop,
    };
    static final String[] imgName= new String[]{
            "Ginger Bread",
            "Honeycomb",
            "Ice Cream Sandwich",
            "Jelly Bean",
            "Kitkat",
            "Lollipop",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_simple);
        gridView = (GridView) findViewById(R.id.gridview);

        /*ArrayAdapter<Integer> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_gallery_item, imgid);*/

        //gridView.setAdapter(adapter);
        gridView.setAdapter(new ImageAdapter(this, imgid));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                String selectedImageName = imgName[position];
                Toast.makeText(getApplicationContext(),selectedImageName+" Logo", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

