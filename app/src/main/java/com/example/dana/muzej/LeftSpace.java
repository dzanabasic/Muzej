package com.example.dana.muzej;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;

public class LeftSpace extends AppCompatActivity {

    private EditText mValueField;
    private EditText mKeyField;

    private Button mAddBtn;
    private Firebase mRootRef;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_left_space);

    }
}