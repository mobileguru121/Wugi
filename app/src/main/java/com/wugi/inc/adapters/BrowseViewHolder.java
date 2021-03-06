package com.wugi.inc.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.wugi.inc.R;

/**
 * Created by storm on 12/16/2017.
 */

public class BrowseViewHolder extends RecyclerView.ViewHolder {
    public ImageView thumbnail;
    public TextView tv_title;

    public BrowseViewHolder(View view) {
        super(view);
        thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
        tv_title = (TextView) view.findViewById(R.id.tv_title);
    }
}