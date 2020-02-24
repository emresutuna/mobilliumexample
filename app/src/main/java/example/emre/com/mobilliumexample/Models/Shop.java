package example.emre.com.mobilliumexample.Models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shop {
    private long id;
    private String name;
    private String slug;
    private String definition;
    private boolean nameUpdateable;
    private long vacationMode;
    private String createdAt;
    private long shopPaymentID;
    private long productCount;
    private long shopRate;
    private long commentCount;
    private long followerCount;
    private boolean isEditorChoice;
    private boolean isFollowing;
    private Cover cover;
    private String shareURL;
    private Cover logo;
    private ArrayList<Product> popularProducts;

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getSlug() { return slug; }
    public void setSlug(String value) { this.slug = value; }

    public String getDefinition() { return definition; }
    public void setDefinition(String value) { this.definition = value; }

    public boolean getNameUpdateable() { return nameUpdateable; }
    public void setNameUpdateable(boolean value) { this.nameUpdateable = value; }

    public long getVacationMode() { return vacationMode; }
    public void setVacationMode(long value) { this.vacationMode = value; }

    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String value) { this.createdAt = value; }

    public long getShopPaymentID() { return shopPaymentID; }
    public void setShopPaymentID(long value) { this.shopPaymentID = value; }

    public long getProductCount() { return productCount; }
    public void setProductCount(long value) { this.productCount = value; }

    public long getShopRate() { return shopRate; }
    public void setShopRate(long value) { this.shopRate = value; }

    public long getCommentCount() { return commentCount; }
    public void setCommentCount(long value) { this.commentCount = value; }

    public long getFollowerCount() { return followerCount; }
    public void setFollowerCount(long value) { this.followerCount = value; }

    public boolean getIsEditorChoice() { return isEditorChoice; }
    public void setIsEditorChoice(boolean value) { this.isEditorChoice = value; }

    public boolean getIsFollowing() { return isFollowing; }
    public void setIsFollowing(boolean value) { this.isFollowing = value; }

    public Cover getCover() { return cover; }
    public void setCover(Cover value) { this.cover = value; }

    public String getShareURL() { return shareURL; }
    public void setShareURL(String value) { this.shareURL = value; }

    public Cover getLogo() { return logo; }
    public void setLogo(Cover value) { this.logo = value; }

    public ArrayList<Product> getPopularProducts() { return popularProducts; }
    public void setPopularProducts(ArrayList<Product> value) { this.popularProducts = value; }
}
