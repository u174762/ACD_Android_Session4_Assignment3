package com.android.vicky.gridviewexample;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Vicky on 3/1/2016.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private Integer[] imgData;
    public int getCount() {
        return imgData.length;
    }
    public Object getItem(int position) {
        return imgData[position];
    }
    public long getItemId(int position) {
        return 0;
    }
    public ImageAdapter(Context c, Integer[] imgData) {
        mContext = c;
        this.imgData = imgData;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null){
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        }
        else{
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(imgData[position]);
        return imageView;
    }

}