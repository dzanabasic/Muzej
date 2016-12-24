package com.example.dana.muzej;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Džana on 24.12.2016.
 */

public class Muzej extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
