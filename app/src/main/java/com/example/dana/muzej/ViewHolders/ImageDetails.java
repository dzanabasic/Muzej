package com.example.dana.muzej.ViewHolders;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.dana.muzej.Helpers.Image;
import com.example.dana.muzej.R;

/**
 * Created by Džana on 18.1.2017.
 */

public class ImageDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_details);
        // TO DO
        //Ad ad = (Ad) savedInstanceState.getSerializable("ad");
        ImageView imageView = (ImageView) findViewById(R.id.imageAdDetails);
        TextView textView = (TextView) findViewById(R.id.textAdDetails);
        if (getIntent().hasExtra("ad")) {
            Image ad = (Image) getIntent().getSerializableExtra("ad");
            textView.setText(ad.name);
            Glide.with(imageView.getContext()).load(ad.image1).into(imageView);
        }
    }
}