package com.example.dana.muzej;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class EntranceMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrance_main);

        Button buttonLeft=(Button)findViewById(R.id.buttonLeftSpace);

        buttonLeft.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intLeft=new Intent(EntranceMain.this,LeftSpace.class);
                startActivity(intLeft);
            }


        });

        Button buttonRight=(Button)findViewById(R.id.buttonRightSpace);

        buttonRight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intLeft=new Intent(EntranceMain.this,RightSpace.class);
                startActivity(intLeft);
            }


        });


        Button buttonUp=(Button)findViewById(R.id.buttonUpSpace);

        buttonUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intLeft=new Intent(EntranceMain.this,UpSpace.class);
                startActivity(intLeft);
            }


        });

        Button buttonBottom=(Button)findViewById(R.id.buttonBottomSpace);

        buttonBottom.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intLeft=new Intent(EntranceMain.this,BottomSpace.class);
                startActivity(intLeft);
            }


        });


    }
}
