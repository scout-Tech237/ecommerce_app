package com.example.gourmeturca.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.gourmeturca.Adapters.BigCategoryAdapter;
import com.example.gourmeturca.Adapters.FastCategoryAdapter;
import com.example.gourmeturca.R;
import com.example.gourmeturca.modalclasses.AllCategoryModalClass;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class CategoryActivity extends AppCompatActivity {

    RecyclerView fastRecycler, bigRecycler;
    DatabaseReference databaseReference, databaseReference1;
    FastCategoryAdapter fastCategoryAdapter;
    BigCategoryAdapter bigCategoryAdapter;
    ArrayList<AllCategoryModalClass> listFast, listBig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        fastRecycler = findViewById(R.id.gridLayout_fast_category);
        bigRecycler = findViewById(R.id.gridLayout_big);

        databaseReference = FirebaseDatabase.getInstance().getReference("0").child("Fast");
        databaseReference1 = FirebaseDatabase.getInstance().getReference("1").child("Big");

        /**
         * setting fast category list start
         */
        fastRecycler.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new GridLayoutManager(this, 3);
        fastRecycler.setLayoutManager(layoutManager);
        listFast = new ArrayList<>();
        fastCategoryAdapter = new FastCategoryAdapter(this, listFast);
        fastRecycler.setAdapter(fastCategoryAdapter);

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot1 : snapshot.getChildren()){
                    //AllCategoryModalClass allCategoryModalClass = dataSnapshot1.getValue(AllCategoryModalClass.class);
                    listFast.add(dataSnapshot1.getValue(AllCategoryModalClass.class));
                }
                fastCategoryAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        /**
         * setting fast category list end
         */


        /**
         * setting big category list
         */

        bigRecycler.setHasFixedSize(true);
        LinearLayoutManager layoutManager1 = new GridLayoutManager(this, 3);
        bigRecycler.setLayoutManager(layoutManager1);
        listBig = new ArrayList<>();
        bigCategoryAdapter = new BigCategoryAdapter(this, listBig);
        bigRecycler.setAdapter(bigCategoryAdapter);

        databaseReference1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot1 : snapshot.getChildren()){
                    //AllCategoryModalClass allCategoryModalClass = dataSnapshot1.getValue(AllCategoryModalClass.class);
                    listBig.add(dataSnapshot1.getValue(AllCategoryModalClass.class));
                }
                bigCategoryAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        /**
         * setting big category list end
         */


    }
}