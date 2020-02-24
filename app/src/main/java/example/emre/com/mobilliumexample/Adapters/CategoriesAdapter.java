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

import example.emre.com.mobilliumexample.Models.CategoryElement;
import example.emre.com.mobilliumexample.Models.Product;
import example.emre.com.mobilliumexample.R;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.ViewHolder> {




    private ArrayList<CategoryElement> categories = new ArrayList<>();





    public CategoriesAdapter(ArrayList<CategoryElement> datas) {
        this.categories = datas;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_custom_view, parent, false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.textView.setText(categories.get(position).getName());
        Picasso.get().load(categories.get(position).getCover().getURL()).centerCrop().fit().into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageView;
        TextView textView;


        public ViewHolder(View itemView) {

            super(itemView);
            imageView=itemView.findViewById(R.id.categoryImage);
            textView=itemView.findViewById(R.id.categoryText);

        }


        @Override
        public void onClick(View v) {

        }
    }


}