package com.example.gourmeturca.Adapters;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.gourmeturca.R;
import com.example.gourmeturca.activities.ProductDetailFragment;
import com.example.gourmeturca.activities.SearchActivty;
import com.example.gourmeturca.activities.SingleProductDetail;
import com.example.gourmeturca.modalclasses.CategoriesModalClass;
import com.example.gourmeturca.modalclasses.Datum1;
import com.example.gourmeturca.modalclasses.FavouriteModalClass;
import com.example.gourmeturca.modalclasses.ProductResponse;
import com.example.gourmeturca.utils.GlobalMethods;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class SearchListAdapter extends RecyclerView.Adapter<SearchListAdapter.ViewHolder> {

    private Context mContext;
    private List<Datum1> productResponseList;
    GlobalMethods globalMethods = new GlobalMethods();


    public SearchListAdapter(Context mContext, List<Datum1> productResponseList) {
        this.mContext = mContext;
        this.productResponseList = productResponseList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        String name = StringUtils.substringBefore(productResponseList.get(holder.getAdapterPosition()).getProductName(), ",");
        holder.pName.setText(name);
        if (productResponseList.get(holder.getAdapterPosition()).getDiscountedSellingPrice() == null){
            holder.sPrice.setVisibility(View.GONE);
        }else {
            holder.sPrice.setText("$" +productResponseList.get(holder.getAdapterPosition()).getDiscountedSellingPrice());
            holder.sPrice.setPaintFlags(holder.sPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }
        //holder.sPrice.setVisibility(View.GONE);
        holder.sPriceDiscounted.setText("$" + productResponseList.get(holder.getAdapterPosition()).getSellingPrice());
        holder.brand.setText(productResponseList.get(holder.getAdapterPosition()).getBrand());
        Glide.with(mContext)
                .load("https://www.gourmeturca.com/Data/K/"+ productResponseList.get(holder.getAdapterPosition()).getImageUrl())
                .into(holder.imageView);

        holder.addCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                globalMethods.addTtoCartMethod(mContext, productResponseList.get(holder.getAdapterPosition()).getProductId(),holder.addCart, holder.pmBar, holder.itemAddToCardCount   );

            }
        });

        holder.plusOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                globalMethods.plusOneProduct(mContext, productResponseList.get(holder.getAdapterPosition()).getProductId(),holder.addCart, holder.pmBar, holder.itemAddToCardCount);
            }
        });

        holder.minusOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                globalMethods.minusOneProduct(mContext, productResponseList.get(holder.getAdapterPosition()).getProductId(),holder.addCart, holder.pmBar, holder.itemAddToCardCount);
            }
        });

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*AppCompatActivity activity = (AppCompatActivity)  v.getContext();
                ProductDetailFragment myFragment = new ProductDetailFragment();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.product_list, myFragment).addToBackStack(null).commit();*/

                    Intent intent = new Intent(mContext.getApplicationContext(), SingleProductDetail.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("productID", productResponseList.get(holder.getAdapterPosition()).getProductId());
                    mContext.startActivity(intent);


            }
        });

        //add favourite
        holder.addFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return productResponseList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView, plusOne, minusOne;
        TextView pName, sPrice, sPriceDiscounted, brand, itemAddToCardCount;
        CardView addCart, addFav, pmBar;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.custom_imageView);
            pName = itemView.findViewById(R.id.custom_product_name);
            sPriceDiscounted = itemView.findViewById(R.id.custom_price);
            sPrice = itemView.findViewById(R.id.custom_price_no_discount);
            brand = itemView.findViewById(R.id.custom_brand);
            addCart = itemView.findViewById(R.id.custom_add_cart);
            addFav = itemView.findViewById(R.id.add_fav);
            pmBar = itemView.findViewById(R.id.plus_minus_bar);
            plusOne = itemView.findViewById(R.id.add_one);
            minusOne = itemView.findViewById(R.id.minus_one);
            itemAddToCardCount = itemView.findViewById(R.id.item_count_number);
        }
    }

}