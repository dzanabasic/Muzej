package com.example.dana.muzej.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.dana.muzej.Helpers.Image;
import com.example.dana.muzej.Helpers.News;
import com.example.dana.muzej.R;

/**
 * Created by Džana on 21.1.2017.
 */

public class NewsViewHolder extends RecyclerView.ViewHolder {
    private ImageView mAdImage1;
    private TextView mAdName1;

    public NewsViewHolder(View itemView) {
        super(itemView);
        mAdImage1 = (ImageView) itemView.findViewById(R.id.news_image);
        mAdName1 = (TextView) itemView.findViewById(R.id.news_name);
    }

    public void bindAd(News ad) {
        mAdName1.setText(ad.naziv_dogadjaja);
        Glide.with(mAdImage1.getContext()).load(ad.slika_dogadjaja).into(mAdImage1);
    }

}

