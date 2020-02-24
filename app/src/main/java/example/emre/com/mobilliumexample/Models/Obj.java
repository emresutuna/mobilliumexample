package example.emre.com.mobilliumexample.Models;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class Obj {
    private String type;
    private String title;
    private ArrayList<Featured> featured;
    private ArrayList<Product> products;
    private ArrayList<CategoryElement> categories;
    private ArrayList<Collection> collections;
    private ArrayList<Shop> shops;

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }

    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }

    public ArrayList<Featured> getFeatured() { return featured; }
    public void setFeatured(ArrayList<Featured> value) { this.featured = value; }

    public ArrayList<Product> getProducts() { return products; }
    public void setProducts(ArrayList<Product> value) { this.products = value; }

    public ArrayList<CategoryElement> getCategories() { return categories; }
    public void setCategories(ArrayList<CategoryElement> value) { this.categories = value; }

    public ArrayList<Collection>getCollections() { return collections; }
    public void setCollections(ArrayList<Collection> value) { this.collections = value; }

    public ArrayList<Shop> getShops() { return shops; }
    public void setShops(ArrayList<Shop> value) { this.shops = value; }
}
