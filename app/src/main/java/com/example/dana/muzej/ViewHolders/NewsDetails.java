package com.example.dana.muzej.ViewHolders;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.dana.muzej.Helpers.Image;
import com.example.dana.muzej.Helpers.News;
import com.example.dana.muzej.R;

/**
 * Created by Džana on 18.1.2017.
 */

public class NewsDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_details);
        // TO DO
        //Ad ad = (Ad) savedInstanceState.getSerializable("ad");
        ImageView imageView = (ImageView) findViewById(R.id.imageAdDetails);
        TextView textView = (TextView) findViewById(R.id.textAdDetails);
        TextView textDesc = (TextView) findViewById(R.id.descriptionAdDetails);

        if (getIntent().hasExtra("ad")) {
            News ad = (News) getIntent().getSerializableExtra("ad");
            textView.setText(ad.naziv_dogadjaja);
            textDesc.setText(ad.opis_dogadjaja);
            Glide.with(imageView.getContext()).load(ad.slika_dogadjaja).into(imageView);
        }
    }
}