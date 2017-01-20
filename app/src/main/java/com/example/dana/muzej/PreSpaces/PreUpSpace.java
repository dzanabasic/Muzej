package com.example.dana.muzej.PreSpaces;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.dana.muzej.R;
import com.example.dana.muzej.UpSpace;

/**
 * Created by Džana on 20.1.2017.
 */

public class PreUpSpace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pre_up_space);

        Button buttonUp=(Button)findViewById(R.id.buttonUpSpace);

        buttonUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intLeft=new Intent(PreUpSpace.this,UpSpace.class);
                startActivity(intLeft);
            }


        });
    }
}