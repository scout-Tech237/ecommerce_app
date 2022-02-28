package com.example.gourmeturca.Adapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.gourmeturca.R;
import com.example.gourmeturca.activities.SelectCategory;

import java.util.ArrayList;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.ViewHolder> {


    private Context mContext;
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mTitles = new ArrayList<>();

    public CategoriesAdapter(Context mContext, ArrayList<String> mImageUrls, ArrayList<String> mTitles) {
        this.mContext = mContext;
        this.mImageUrls = mImageUrls;
        this.mTitles = mTitles;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categorie, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        Glide.with(mContext)
                .asBitmap()
                .load(mImageUrls.get(position))
                .into(holder.categoryImage);

        holder.categoryTitle.setText(mTitles.get(holder.getAdapterPosition()));

        holder.categoryImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, mTitles.get(holder.getAdapterPosition()), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mImageUrls.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView categoryImage;
        TextView categoryTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryImage = itemView.findViewById(R.id.categorie_img);
            categoryTitle = itemView.findViewById(R.id.categorie_title);
        }
    }

}

