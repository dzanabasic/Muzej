package com.example.dana.muzej;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.dana.muzej.CustomAdapter;
import com.firebase.client.Firebase;

import java.util.ArrayList;
import java.util.List;

public class LeftSpace extends AppCompatActivity {

    private EditText mValueField;
    private EditText mKeyField;

    private Button mAddBtn;
    private Firebase mRootRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_left_space);

        mRootRef=new Firebase("https://historijskimuzejbih-985c5.firebaseio.com/Photos");
        mValueField=(EditText) findViewById(R.id.valueField);
        mKeyField=(EditText) findViewById(R.id.keyField);

        mAddBtn=(Button) findViewById(R.id.addBtn);



        mAddBtn.setOnClickListener(new View.OnClickListener(){

            @Override
          public void onClick(View view){
            String value=mValueField.getText().toString();
                String mKey=mKeyField.getText().toString();

                Firebase childRef=mRootRef.child(mKey);
                childRef.setValue(value);
            }
        }
        );








    }
}