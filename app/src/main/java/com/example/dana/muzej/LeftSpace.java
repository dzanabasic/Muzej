package com.example.dana.muzej;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.dana.muzej.Helpers.Image;
import com.example.dana.muzej.Helpers.ImageAdapter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import static com.example.dana.muzej.R.id.snap;


public class LeftSpace extends AppCompatActivity {

    private static LeftSpace instance = null;
    final ArrayList<Image> ads = new ArrayList<Image>();
    StaggeredGridLayoutManager mStaggeredLayoutManager;
    RecyclerView mRecyclerView;
    ImageAdapter mAdAdapter;
    //  private Firebase mRootRef;


    public static LeftSpace getInstance() {
        if (instance == null) {
            instance = new LeftSpace();
        }
        return instance;
    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_left_space);


        //initializePlaces();
        //ArrayList<Image> ads;

     FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = database.getReference();
        databaseReference.child("Images").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                Iterable<DataSnapshot> children = dataSnapshot.getChildren();
                for (DataSnapshot child : children) {
                    Image r = child.getValue(Image.class);
                    ads.add(r);

                    mAdAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        mAdAdapter = new ImageAdapter(ads);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mStaggeredLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mStaggeredLayoutManager);

        mRecyclerView.setAdapter(mAdAdapter);


    }

    public void initializePlaces() {

        ArrayList<Image> places = new ArrayList<>();
        // Creating ads in database should be considered
        places.add(new Image("http://www.akta.ba/resources/Article/SmallImages/885b461e-5456-414f-9ae9-dd133bc0a3datoskana_mala.jpg", "Biss-Tours"));
        places.add(new Image("http://www.centrotrans.com/uimages/drugislider/18102016_news_home.jpg", "Centrotrans"));
        places.add(new Image("http://www.centrotrans.com/uimages/odrzavanje/zimskiredvoznje_ab1617_big.jpg", "Centrotrans"));
        places.add(new Image("http://072info.com/wp-content/uploads/2014/04/BRATISLAVA-BEC-BUDIMPESTA-BISS-TOURS.jpg", "Biss-Tours"));
        places.add(new Image("http://www.fksarajevo.ba/assets/uploads/articles/centrotrans-eurolines-se-ukljucuje-u-lbc-projekat-fk-sarajevo.jpg", "Centrotrans"));
        places.add(new Image("http://www.akta.ba/resources/Article/SmallImages/91c97092-9326-4f48-8d65-6f53fbe27f34Spanija_Bisstours1.jpg", "Biss-Tours"));

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = database.getReference();
        for (int i = 0; i < places.size(); i++) {
            databaseReference.child("Images").push().setValue(places.get(i));
        }


    }

    }


