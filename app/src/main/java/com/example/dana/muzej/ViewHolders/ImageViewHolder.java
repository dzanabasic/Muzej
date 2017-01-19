package com.example.dana.muzej.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.dana.muzej.Helpers.Image;
import com.example.dana.muzej.R;

/**
 * Created by Džana on 18.1.2017.
 */

public class ImageViewHolder extends RecyclerView.ViewHolder {

    private ImageView mAdImage;
    private TextView mAdName;

    public ImageViewHolder(View itemView) {
        super(itemView);
        mAdImage = (ImageView) itemView.findViewById(R.id.ad_image);
        mAdName = (TextView) itemView.findViewById(R.id.ad_name);
    }

    public void bindAd(Image ad) {
        mAdName.setText(ad.name);
        Glide.with(mAdImage.getContext()).load(ad.image1).into(mAdImage);
    }

}