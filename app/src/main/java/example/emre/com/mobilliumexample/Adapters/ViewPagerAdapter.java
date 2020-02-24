package example.emre.com.mobilliumexample.Adapters;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import example.emre.com.mobilliumexample.Models.Featured;
import example.emre.com.mobilliumexample.R;

public class ViewPagerAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater inflater;
    private ArrayList<Featured>featuredList;

    public ViewPagerAdapter(Context context,ArrayList<Featured>featuredList) {
        this.context = context;
        this.featuredList=featuredList;
    }

    @Override
    public int getCount() {
        return featuredList.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
//        inflater=(LayoutInflater) LayoutInflater.from(context).inflate(R.layout.custom_view,false);

        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.custom_view,null);
        TextView textView=(TextView)view.findViewById(R.id.imageTitle);
        TextView textView2=(TextView)view.findViewById(R.id.imageType);
        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
        ViewPager vp=(ViewPager)container;
        vp.addView(view,0);
        textView.setText(featuredList.get(position).getTitle());
        textView2.setText(featuredList.get(position).getType());
        Picasso.get().load(featuredList.get(position).getCover().getURL()).fit().centerCrop().into(imageView);
        return view;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager vp=(ViewPager)container;
        View view=(View)object;
        vp.removeView(view );
    }
}
