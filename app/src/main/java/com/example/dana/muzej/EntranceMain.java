package com.example.dana.muzej;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dana.muzej.PreSpaces.PreBottomSpace;
import com.example.dana.muzej.PreSpaces.PreLeftSpace;
import com.example.dana.muzej.PreSpaces.PreRightSpace;
import com.example.dana.muzej.PreSpaces.PreUpSpace;

public class EntranceMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrance_main);

        Button buttonLeft=(Button)findViewById(R.id.leftbutton);
        Button buttonRight=(Button)findViewById(R.id.rightbutton);
        Button buttonUp=(Button)findViewById(R.id.upButton);
        Button buttonBottom=(Button)findViewById(R.id.bottomButton);

        buttonLeft.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intLeft=new Intent(EntranceMain.this,PreLeftSpace.class);
                startActivity(intLeft);
            }


        });



        buttonRight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intRight=new Intent(EntranceMain.this,PreRightSpace.class);
                startActivity(intRight);
            }


        });


        buttonUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intUp=new Intent(EntranceMain.this,PreUpSpace.class);
                startActivity(intUp);
            }


        });


        buttonBottom.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intBottom=new Intent(EntranceMain.this,PreBottomSpace.class);
                startActivity(intBottom);
            }


        });
    }
}
