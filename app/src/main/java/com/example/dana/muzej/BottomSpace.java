package com.example.dana.muzej;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import com.firebase.client.Firebase;

//import com.bumptech.glide.Glide;

public class BottomSpace extends AppCompatActivity {


    // Reference to an image file in Firebase Storage
  /*  FirebaseStorage storage = FirebaseStorage.getInstance();

   private StorageReference storageRef;
    = storage.getReferenceFromUrl("gs://historijskimuzejbih-985c5.appspot.com");

    // ImageView in your Activity
    ImageView imageView;*/

// Load the image using Glide

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // imageView=(ImageView)findViewById(R.id.slika);

       /* Glide.with(this /* context )
                .using(new FirebaseImageLoader())
                .load(storageReference)
                .into(imageView);*/
        setContentView(R.layout.activity_bottom_space);
    }
}
