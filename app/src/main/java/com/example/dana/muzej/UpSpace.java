package com.example.dana.muzej;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;



public class UpSpace extends AppCompatActivity {


    /*Firebase firebaseUserDataReference = new Firebase("your firebase url").child("your root name/");

    firebaseUserDataReference.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {

            Log.d("Call", String.valueOf(dataSnapshot.getValue()));
            for (DataSnapshot postData : dataSnapshot.getChildren()) {
                UserModel userModel= postData.getValue(UserModel.class);
                yourArrayList.add(userModel);
            }
        }*/

       /* @Override
        public void onCancelled(FirebaseError firebaseError) {

        }
    });*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_up_space);
    }
}
