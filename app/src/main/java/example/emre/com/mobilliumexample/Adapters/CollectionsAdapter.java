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

import example.emre.com.mobilliumexample.Models.Collection;
import example.emre.com.mobilliumexample.Models.Product;
import example.emre.com.mobilliumexample.R;

public class CollectionsAdapter extends RecyclerView.Adapter<CollectionsAdapter.ViewHolder> {

    final int radius = 5;
    final int margin = 5;

    private ArrayList<Collection> collections = new ArrayList<>();





    public CollectionsAdapter(ArrayList<Collection> datas) {
        this.collections = datas;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.collection_custom_view, parent, false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.textView.setText(collections.get(position).getTitle());
        holder.textView2.setText(collections.get(position).getStart());
        Picasso.get().load(collections.get(position).getCover().getURL()).centerCrop().fit().into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return collections.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageView;
        TextView textView;
        TextView textView2;

        public ViewHolder(View itemView) {

            super(itemView);
            imageView = itemView.findViewById(R.id.collectionImage);
            textView=itemView.findViewById(R.id.collectionText1);
            textView2=itemView.findViewById(R.id.collectionText2);
        }


        @Override
        public void onClick(View v) {

        }
    }


}