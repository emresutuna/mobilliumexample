package example.emre.com.mobilliumexample.Adapters;

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
import android.widget.TextView;


import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

import java.util.ArrayList;

import example.emre.com.mobilliumexample.Models.Product;
import example.emre.com.mobilliumexample.Models.Shop;
import example.emre.com.mobilliumexample.R;

public class Shops2Adapter extends RecyclerView.Adapter<Shops2Adapter.ViewHolder> {

    final int radius = 5;
    final int margin = 5;

    private ArrayList<Shop> products = new ArrayList<>();





    public Shops2Adapter(ArrayList<Shop> datas) {
        this.products = datas;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.shops2_custom_view, parent, false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        Picasso.get().load(products.get(position).getLogo().getURL()).centerCrop().fit().into(holder.imageView2);

        holder.textView.setText(products.get(position).getName());
        holder.textView2.setText(products.get(position).getDefinition());
        if(products.get(position).getLogo()==null&&products.get(position).getCover()==null){

        }else if (products.get(position).getLogo()!=null){
            Picasso.get().load(products.get(position).getLogo().getURL()).centerCrop().fit().into(holder.imageView2);

        }
        else if(products.get(position).getLogo()==null&&products.get(position).getCover()==null){


        }else{
            Picasso.get().load(products.get(position).getCover().getURL()).centerCrop().fit().into(holder.imageView);

        }


    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageView,imageView2;
        TextView textView;
        TextView textView2;

        public ViewHolder(View itemView) {

            super(itemView);
            imageView = itemView.findViewById(R.id.shop2Image);
            imageView2 = itemView.findViewById(R.id.shop2Circle);

            textView=itemView.findViewById(R.id.shop2Text1);
            textView2=itemView.findViewById(R.id.shop2Text2);
        }


        @Override
        public void onClick(View v) {

        }
    }


}