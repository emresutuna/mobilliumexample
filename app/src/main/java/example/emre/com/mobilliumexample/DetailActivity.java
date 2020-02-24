package example.emre.com.mobilliumexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

import example.emre.com.mobilliumexample.Adapters.CategoriesAdapter;
import example.emre.com.mobilliumexample.Adapters.CollectionsAdapter;
import example.emre.com.mobilliumexample.Adapters.ProductsAdapter;
import example.emre.com.mobilliumexample.Adapters.ShopAdapter;
import example.emre.com.mobilliumexample.Adapters.Shops2Adapter;
import example.emre.com.mobilliumexample.Models.Featured;

public class DetailActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ProductsAdapter productsAdapter;
    CategoriesAdapter categoriesAdapter;
    CollectionsAdapter collectionsAdapter;
    ShopAdapter shopAdapter;
    Shops2Adapter shop2Adapter;
    RecyclerView.LayoutManager layoutManager;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        context=this;
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        Intent i=getIntent();
        String val=i.getStringExtra("list");
        ArrayList<Featured> featureds = MainActivity.featuredArrayList;
        if (val.equals("1")){
            layoutManager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);

            productsAdapter=new ProductsAdapter(MainActivity.productList);
            recyclerView.setAdapter(productsAdapter);
            recyclerView.setLayoutManager(layoutManager);
        }else if(val.equals("2")){
            layoutManager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);

            collectionsAdapter=new CollectionsAdapter(MainActivity.collectionList);
            recyclerView.setAdapter(collectionsAdapter);
            recyclerView.setLayoutManager(layoutManager);
        }else if(val.equals("3")){
            layoutManager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);

            shopAdapter=new ShopAdapter(MainActivity.shops);
            recyclerView.setAdapter(shopAdapter);
            recyclerView.setLayoutManager(layoutManager);
        }else if(val.equals("4")){
            layoutManager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);

            shop2Adapter=new Shops2Adapter(MainActivity.shops2);
            recyclerView.setAdapter(shop2Adapter);
            recyclerView.setLayoutManager(layoutManager);
        }
Log.d("Test",val);
    }
}
