package example.emre.com.mobilliumexample.Adapters;

import android.graphics.Color;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.Image;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

import java.util.ArrayList;

import example.emre.com.mobilliumexample.Models.Product;
import example.emre.com.mobilliumexample.Models.Shop;
import example.emre.com.mobilliumexample.R;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ViewHolder> {

    final int radius = 5;
    final int margin = 5;

    private ArrayList<Shop> products = new ArrayList<>();





    public ShopAdapter(ArrayList<Shop> datas) {
        this.products = datas;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.shops_custom_view, parent, false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Picasso.get().load(products.get(position).getCover().getURL()).centerCrop().fit().into(holder.imageView2);
        holder.setIsRecyclable(true);
        holder.textView.setText(products.get(position).getName());
        holder.textView2.setText(products.get(position).getDefinition());
        Picasso.get().load(products.get(position).getLogo().getURL()).centerCrop().fit().into(holder.imageView);
//        Picasso.get().load(products.get(position).getPopularProducts().get(position).getImages().get(0).getURL()).centerCrop().fit().into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        RelativeLayout relativeLayout;
        ImageView imageView,imageView2;
        TextView textView;
        TextView textView2;

        public ViewHolder(View itemView) {

            super(itemView);
            relativeLayout=itemView.findViewById(R.id.bgr);
            imageView = itemView.findViewById(R.id.shopImage);
            imageView2=itemView.findViewById(R.id.bgImage);
            textView=itemView.findViewById(R.id.shopText1);
            textView2=itemView.findViewById(R.id.shopText2);
        }


        @Override
        public void onClick(View v) {

        }
    }


}