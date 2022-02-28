package com.example.gourmeturca.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.gourmeturca.R;
import com.example.gourmeturca.activities.CategoryProductsActivity;
import com.example.gourmeturca.modalclasses.AllCategoryModalClass;
import com.example.gourmeturca.modalclasses.CategoriesModalClass;

import java.util.ArrayList;

public class FastCategoryAdapter extends RecyclerView.Adapter<FastCategoryAdapter.ViewHolder> {

    Context context;
    ArrayList<AllCategoryModalClass> categoriesModalClassArrayList;

    public FastCategoryAdapter(Context context, ArrayList<AllCategoryModalClass> categoriesModalClassArrayList) {
        this.context = context;
        this.categoriesModalClassArrayList = categoriesModalClassArrayList;
    }

    @NonNull
    @Override
    public FastCategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.categorie, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FastCategoryAdapter.ViewHolder holder, int position) {

        AllCategoryModalClass categoriesModalClass = categoriesModalClassArrayList.get(position);
        holder.categoryName.setText(categoriesModalClass.getText());
        Glide.with(context)
                .asBitmap()
                .load(categoriesModalClass.getImageUrl())
                .into(holder.categoryImage);

        String categoryID = categoriesModalClass.getCategory_id();
        String categoryName = categoriesModalClass.getText();

        holder.wholeCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, CategoryProductsActivity.class);
                intent.putExtra("categoryID", categoryID);
                intent.putExtra("categoryName", categoryName);
                context.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return categoriesModalClassArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView categoryImage;
        TextView categoryName;
        LinearLayout wholeCategory;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            categoryImage = itemView.findViewById(R.id.categorie_img);
            categoryName = itemView.findViewById(R.id.categorie_title);
            wholeCategory = itemView.findViewById(R.id.whole_category_icon);
        }
    }
}
