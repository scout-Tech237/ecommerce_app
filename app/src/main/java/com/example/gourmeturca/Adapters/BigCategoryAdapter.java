package com.example.gourmeturca.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.gourmeturca.R;
import com.example.gourmeturca.modalclasses.AllCategoryModalClass;

import java.util.ArrayList;

public class BigCategoryAdapter extends RecyclerView.Adapter<BigCategoryAdapter.ViewHolder> {

    Context context;
    ArrayList<AllCategoryModalClass> categoriesModalClassArrayList;

    public BigCategoryAdapter(Context context, ArrayList<AllCategoryModalClass> categoriesModalClassArrayList) {
        this.context = context;
        this.categoriesModalClassArrayList = categoriesModalClassArrayList;
    }

    @NonNull
    @Override
    public BigCategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.categorie, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BigCategoryAdapter.ViewHolder holder, int position) {

        AllCategoryModalClass categoriesModalClass = categoriesModalClassArrayList.get(position);
        holder.categoryName.setText(categoriesModalClass.getText());
        Glide.with(context)
                .asBitmap()
                .load(categoriesModalClass.getImageUrl())
                .into(holder.categoryImage);


    }

    @Override
    public int getItemCount() {
        return categoriesModalClassArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView categoryImage;
        TextView categoryName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            categoryImage = itemView.findViewById(R.id.categorie_img);
            categoryName = itemView.findViewById(R.id.categorie_title);
        }
    }
}
