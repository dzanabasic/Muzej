package com.example.dana.muzej.PreSpaces;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


import com.example.dana.muzej.R;
import com.example.dana.muzej.RightSpace;

/**
 * Created by Džana on 20.1.2017.
 */

public class PreRightSpace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pre_right_space);

        Button buttonRight=(Button)findViewById(R.id.buttonRightSpace);

        buttonRight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intLeft=new Intent(PreRightSpace.this,RightSpace.class);
                startActivity(intLeft);
            }


        });

    }
}