package com.example.gourmeturca.Adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.gourmeturca.R;
import com.example.gourmeturca.activities.SingleProductDetail;
import com.example.gourmeturca.modalclasses.Datum1;
import com.example.gourmeturca.modalclasses.Image2;
import com.example.gourmeturca.modalclasses.SingleProductUrlsModalClass;

import org.apache.commons.lang3.StringUtils;

import java.util.List;



public class SingleProductAdapter extends RecyclerView.Adapter<SingleProductAdapter.ViewHolder> {

    private Context mContext;
    private List<Image2> productResponseList;


    public SingleProductAdapter(Context mContext, List<Image2> productResponseList) {
        this.mContext = mContext;
        this.productResponseList = productResponseList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_recycler_image, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(mContext)
                .load(productResponseList.get(position).getImageUrl())
                .into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return productResponseList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.categorie_img_product_layout);

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

        }
    }




}
