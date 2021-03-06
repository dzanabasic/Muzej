package com.example.dana.muzej;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
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
        databaseReference.child("ImagesLeftSpace").addValueEventListener(new ValueEventListener() {
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
        places.add(new Image("http://www.akta.ba/resources/Article/SmallImages/885b461e-5456-414f-9ae9-dd133bc0a3datoskana_mala.jpg",
                "Historical museum of Bosnia",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem " +
                        "Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."));
        places.add(new Image("https://firebasestorage.googleapis.com/v0/b/historijskimuzejbih-985c5.appspot.com/o/slike_eksponata%2Fvatrogasni_sljem.jpg?alt=media&token=375a4efd-349e-4820-b7cc-d488aa4a5068",
                "Fire helmet",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem " +
                "Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."));
        places.add(new Image("https://firebasestorage.googleapis.com/v0/b/historijskimuzejbih-985c5.appspot.com/o/slike_eksponata%2Ftelefon.jpg?alt=media&token=2d586ef5-845c-4614-ba48-e719824a5277",
                "Telephone",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem " +
                        "Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."));


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = database.getReference();
        for (int i = 0; i < places.size(); i++) {
            databaseReference.child("ImagesLeftSpace").push().setValue(places.get(i));
        }


    }
    }


