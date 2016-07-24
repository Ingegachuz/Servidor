package com.ingegachuz.mascotas.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.view.ViewPager;

import com.ingegachuz.mascotas.R;
import com.ingegachuz.mascotas.fragment.PerfilFragment;

/**
 * Created by Inge on 05/06/2016.
 */
public class GridAdapter extends BaseAdapter {

    private Context mContext;

    public GridAdapter(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);

        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }
   private Integer [] mThumbIds = {
           R.drawable.dog_icon2_225x158, R.drawable.dog_icon2_225x158,
           R.drawable.dog_icon2_225x158, R.drawable.dog_icon2_225x158,
           R.drawable.dog_icon2_225x158, R.drawable.dog_icon2_225x158,
           R.drawable.dog_icon2_225x158, R.drawable.dog_icon2_225x158,
   } ;


}
