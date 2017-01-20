package com.example.dana.muzej.PreSpaces;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.dana.muzej.LeftSpace;
import com.example.dana.muzej.R;

/**
 * Created by Džana on 20.1.2017.
 */

public class PreLeftSpace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pre_left_space);


        Button buttonLeft=(Button)findViewById(R.id.buttonLeftSpace);

        buttonLeft.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intLeft=new Intent(PreLeftSpace.this,LeftSpace.class);
                startActivity(intLeft);
            }


        });

    }
}