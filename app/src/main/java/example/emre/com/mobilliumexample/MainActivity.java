package example.emre.com.mobilliumexample;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

import example.emre.com.mobilliumexample.Adapters.CategoriesAdapter;
import example.emre.com.mobilliumexample.Adapters.CollectionsAdapter;
import example.emre.com.mobilliumexample.Adapters.ProductsAdapter;
import example.emre.com.mobilliumexample.Adapters.ShopAdapter;
import example.emre.com.mobilliumexample.Adapters.Shops2Adapter;
import example.emre.com.mobilliumexample.Adapters.ViewPagerAdapter;
import example.emre.com.mobilliumexample.Models.CategoryElement;
import example.emre.com.mobilliumexample.Models.Collection;
import example.emre.com.mobilliumexample.Models.Featured;
import example.emre.com.mobilliumexample.Models.Obj;
import example.emre.com.mobilliumexample.Models.Product;
import example.emre.com.mobilliumexample.Models.Shop;
import example.emre.com.mobilliumexample.R;
import example.emre.com.mobilliumexample.Services.ApiClient;
import example.emre.com.mobilliumexample.Services.GetMethods;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
androidx.appcompat.widget.SearchView searchView;
private static final int REQUEST_CODE_SPEECH_INPUT=1000;
    GetMethods apiService;
    Obj obj=new Obj();
    ViewPager viewPager;
    LinearLayout sliderDots,bgLinear,go1,go2,go3,go4;
    Context context;
    int dotscount;
    ImageView[] dots;
    public static ArrayList<Featured>featuredArrayList;
    public static ArrayList<Product>productList;
    public static ArrayList<CategoryElement>categoryList;
    public static ArrayList<Collection>collectionList;
    public static ArrayList<Shop>shops;
    public static ArrayList<Shop>shops2;
    RecyclerView recyclerView,recyclerView2,recyclerView3,recyclerView4,recyclerView5;
    ProductsAdapter productsAdapter;
    CategoriesAdapter categoriesAdapter;
    CollectionsAdapter collectionsAdapter;
    ShopAdapter shopAdapter;
    Shops2Adapter shop2Adapter;
    private RecyclerView.LayoutManager layoutManager,layoutManager2,layoutManager3,layoutManager4,layoutManager5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.productsRecycler);
        recyclerView2 = (RecyclerView) findViewById(R.id.categoryRecycler);
        recyclerView3 = (RecyclerView) findViewById(R.id.collectionsRecycler);
        recyclerView5=(RecyclerView)findViewById(R.id.shops2Recycler);
        bgLinear=(LinearLayout)findViewById(R.id.bgLinear);
        go1=(LinearLayout)findViewById(R.id.tumuButton);
        go2=(LinearLayout)findViewById(R.id.tumuButton2);
        go3=(LinearLayout)findViewById(R.id.tumuButton3);
        go4=(LinearLayout)findViewById(R.id.tumuButton4);
        go1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Clicked Go1","Clicked");
                Intent i=new Intent(MainActivity.this,DetailActivity.class);
               i.putExtra("list", "1");
                startActivity(i);
            }
        });
        go2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,DetailActivity.class);
                i.putExtra("list", "2");
                startActivity(i);
            }
        });
        go3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,DetailActivity.class);
                i.putExtra("list", "3");
                startActivity(i);
            }
        });
        go4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,DetailActivity.class);
                i.putExtra("list", "4");
                startActivity(i);
            }
        });
        recyclerView4=(RecyclerView)findViewById(R.id.shopsRecycler);
        searchView=(SearchView) findViewById(R.id.searchView);
        searchView.isSubmitButtonEnabled();
        getSupportActionBar().hide();
        sliderDots=(LinearLayout)findViewById(R.id.sliderData);
        viewPager=(ViewPager)findViewById(R.id.viewPager);
        context=this;
        apiService= ApiClient.getClient().create(GetMethods.class);
        Call<List<Obj>> call=apiService.getNews();
        categoryList=new ArrayList<CategoryElement>();
        productList=new ArrayList<Product>();
        collectionList=new ArrayList<Collection>();
        featuredArrayList=new ArrayList<Featured>();
        shops=new ArrayList<Shop>();
        shops2=new ArrayList<Shop>();
        call.enqueue(new Callback<List<Obj>>() {
            @Override
            public void onResponse(Call<List<Obj>> call, Response<List<Obj>> response) {
                Log.d("Response",new Gson().toJson(response.body().get(0).getFeatured().get(0).getCover().getURL()));
//                for (int i = 0; i <response.body().get(0).getProducts().size() ; i++) {
////                    Log.d("Response2",imageUrls[0]);
////                    Log.d("Title",response.body().get(0).getFeatured().get(i).getTitle());
//                    Log.d("Products",response.body().get(0).getProducts().get(i).getTitle());
//
//                }
Log.d("Products",new Gson().toJson(response.body().get(5).getShops().get(0).getCover().getURL()));

                //Adapter Starts
                featuredArrayList=response.body().get(0).getFeatured();
                productList=response.body().get(1).getProducts();
                categoryList=response.body().get(2).getCategories();
                collectionList=response.body().get(3).getCollections();
                shops=response.body().get(4).getShops();
                shops2=response.body().get(5).getShops();
                productsAdapter=new ProductsAdapter(productList);
                categoriesAdapter=new CategoriesAdapter(categoryList);
                collectionsAdapter=new CollectionsAdapter(collectionList);
                shopAdapter=new ShopAdapter(shops);
                shop2Adapter=new Shops2Adapter(shops2);
                layoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
                layoutManager2 = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
                layoutManager3 = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
                layoutManager4 = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
                layoutManager5 = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);

                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(productsAdapter);
                recyclerView2.setLayoutManager(layoutManager2);
                recyclerView2.setAdapter(categoriesAdapter);
                recyclerView3.setLayoutManager(layoutManager3);
                recyclerView3.setAdapter(collectionsAdapter);
                recyclerView4.setLayoutManager(layoutManager4);
                recyclerView4.setAdapter(shopAdapter);
                recyclerView5.setLayoutManager(layoutManager5);
                recyclerView5.setAdapter(shop2Adapter);
                LinearSnapHelper snapHelper = new LinearSnapHelper() {
                    @Override
                    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int velocityX, int velocityY) {
                        View centerView = findSnapView(layoutManager);
                        if (centerView == null)
                            return RecyclerView.NO_POSITION;

                        int position = layoutManager.getPosition(centerView);
                        int targetPosition = -1;
                        if (layoutManager.canScrollHorizontally()) {
                            if (velocityX < 0) {
                                targetPosition = position - 1;
                            } else {
                                targetPosition = position + 1;
                            }
                        }

                        if (layoutManager.canScrollVertically()) {
                            if (velocityY < 0) {
                                targetPosition = position - 1;
                            } else {
                                targetPosition = position + 1;
                            }
                        }

                        final int firstItem = 0;
                        final int lastItem = layoutManager.getItemCount() - 1;
                        targetPosition = Math.min(lastItem, Math.max(targetPosition, firstItem));
                        return targetPosition;
                    }
                };
                LinearSnapHelper snapHelper2 = new LinearSnapHelper() {
                    @Override
                    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int velocityX, int velocityY) {
                        View centerView = findSnapView(layoutManager);
                        if (centerView == null)
                            return RecyclerView.NO_POSITION;

                        int position = layoutManager.getPosition(centerView);
                        int targetPosition = -1;
                        if (layoutManager.canScrollHorizontally()) {
                            if (velocityX < 0) {
                                targetPosition = position - 1;
                            } else {
                                targetPosition = position + 1;
                            }
                        }

                        if (layoutManager.canScrollVertically()) {
                            if (velocityY < 0) {
                                targetPosition = position - 1;
                            } else {
                                targetPosition = position + 1;
                            }
                        }

                        final int firstItem = 0;
                        final int lastItem = layoutManager.getItemCount() - 1;
                        targetPosition = Math.min(lastItem, Math.max(targetPosition, firstItem));
                        return targetPosition;
                    }
                };

                LinearSnapHelper snapHelper3 = new LinearSnapHelper() {
                    @Override
                    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int velocityX, int velocityY) {
                        View centerView = findSnapView(layoutManager);
                        if (centerView == null)
                            return RecyclerView.NO_POSITION;

                        int position = layoutManager.getPosition(centerView);
                        int targetPosition = -1;
                        if (layoutManager.canScrollHorizontally()) {
                            if (velocityX < 0) {
                                targetPosition = position - 1;
                            } else {
                                targetPosition = position + 1;
                            }
                        }

                        if (layoutManager.canScrollVertically()) {
                            if (velocityY < 0) {
                                targetPosition = position - 1;
                            } else {
                                targetPosition = position + 1;
                            }
                        }

                        final int firstItem = 0;
                        final int lastItem = layoutManager.getItemCount() - 1;
                        targetPosition = Math.min(lastItem, Math.max(targetPosition, firstItem));
                        return targetPosition;
                    }
                };

                LinearSnapHelper snapHelper4 = new LinearSnapHelper() {
                    @Override
                    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int velocityX, int velocityY) {
                        View centerView = findSnapView(layoutManager);
                        if (centerView == null)
                            return RecyclerView.NO_POSITION;

                        int position = layoutManager.getPosition(centerView);
                        int targetPosition = -1;
                        if (layoutManager.canScrollHorizontally()) {
                            if (velocityX < 0) {
                                targetPosition = position - 1;
                            } else {
                                targetPosition = position + 1;
                            }
                        }

                        if (layoutManager.canScrollVertically()) {
                            if (velocityY < 0) {
                                targetPosition = position - 1;
                            } else {
                                targetPosition = position + 1;
                            }
                        }

                        final int firstItem = 0;
                        final int lastItem = layoutManager.getItemCount() - 1;
                        targetPosition = Math.min(lastItem, Math.max(targetPosition, firstItem));
                        return targetPosition;
                    }
                };
                recyclerView4.addOnScrollListener(new RecyclerView.OnScrollListener() {
                    @Override
                    public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                        super.onScrollStateChanged(recyclerView, newState);

                    }

                    @Override
                    public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                        super.onScrolled(recyclerView, dx, dy);
                        Log.d("State Changed","Changed");
                    }
                });
                ////
                SnapHelper helper = new LinearSnapHelper();
               SnapHelper helper2=new LinearSnapHelper();
               snapHelper.attachToRecyclerView(recyclerView);
//                helper.attachToRecyclerView(recyclerView);
                snapHelper2  .attachToRecyclerView(recyclerView2);
                snapHelper3.attachToRecyclerView(recyclerView4);
                snapHelper4.attachToRecyclerView(recyclerView5);
                ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(context,featuredArrayList);
                viewPager.setAdapter(viewPagerAdapter);
                dotscount=viewPagerAdapter.getCount();
                dots=new ImageView[dotscount];
                for (int i = 0; i <dotscount ; i++) {
                    dots[i]=new ImageView(context);
                    dots[i].setImageDrawable(ContextCompat.getDrawable(context,R.drawable.dot));
                    LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
                    params.setMargins(8,0,8,0);
                    sliderDots.addView(dots[i],params);

                }
                viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                        
                    }

                    @Override
                    public void onPageSelected(int position) {
                        for (int i = 0; i <dotscount ; i++) {
                            dots[i].setImageDrawable(ContextCompat.getDrawable(context,R.drawable.dot));
                        }
                        dots[position].setImageDrawable(ContextCompat.getDrawable(context,R.drawable.active_dot));

                    }

                    @Override
                    public void onPageScrollStateChanged(int state) {

                    }
                });
                dots[0].setImageDrawable(ContextCompat.getDrawable(context,R.drawable.active_dot));
            }

            @Override
            public void onFailure(Call<List<Obj>> call, Throwable t) {
                Log.d("Failure", t.toString());
            }
        });



        searchView.setOnSearchClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Clikced","Clickedd");
                speak();
            }
        });
    }
    public void speak(){
        Intent intent=new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,"Speak");
        try {
            startActivityForResult(intent,REQUEST_CODE_SPEECH_INPUT);
        }catch (Exception e){
            Toast.makeText(MainActivity.this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case REQUEST_CODE_SPEECH_INPUT:{
                if(resultCode==RESULT_OK && null!=data){
                    ArrayList<String>result=data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    searchView.setQueryHint(result.get(0));
                }
            }
            break;
        }
    }
}
