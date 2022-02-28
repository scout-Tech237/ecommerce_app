package com.example.gourmeturca.Adapters;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.gourmeturca.R;
import com.example.gourmeturca.activities.ProductDetailFragment;
import com.example.gourmeturca.modalclasses.CartProduct;
import com.example.gourmeturca.modalclasses.Datum1;
import com.example.gourmeturca.modalclasses.Datum2;
import com.example.gourmeturca.modalclasses.Image2;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder>{

    private Context mContext;
    private List<CartProduct> productResponseList;
    private List<Image2> image2List;

    public CartAdapter(Context mContext, List<CartProduct> productResponseList) {
        this.mContext = mContext;
        this.productResponseList = productResponseList;
    }

    @NonNull
    @Override
    public CartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item, parent, false);
        return new CartAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartAdapter.ViewHolder holder, int position) {
        holder.pName.setText(StringUtils.substringBefore(productResponseList.get(position).getTitle(), ","));
        holder.pCount.setText(String.valueOf(productResponseList.get(position).getCount()));
        String price = String.format("%.2f", productResponseList.get(position).getPriceTotal());
        holder.sPrice.setText("$" + price);
        Glide.with(mContext)
                .load(productResponseList.get(position).getImage().getSmall())
                .into(holder.imageView);

        /*holder.addCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, productResponseList.get(position).getProductName() + "add to cart" , Toast.LENGTH_SHORT).show();
                StringUtils.substringBefore(filename, ".");
                String.format("%.2f", 3.45);



            }
        });
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatActivity activity = (AppCompatActivity)  v.getContext();
                ProductDetailFragment myFragment = new ProductDetailFragment();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.product_list, myFragment).addToBackStack(null).commit();

            }
        });*/
    }

    @Override
    public int getItemCount() {
        return productResponseList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView pName, pCount, sPrice;
        Button addCart;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.cart_image);
            pName = itemView.findViewById(R.id.cart_product_name);
            pCount = itemView.findViewById(R.id.cart_nbr_items);
            sPrice = itemView.findViewById(R.id.cart_product_price);

        }

    }

}
