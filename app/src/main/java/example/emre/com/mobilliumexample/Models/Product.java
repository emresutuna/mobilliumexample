package example.emre.com.mobilliumexample.Models;

import java.util.ArrayList;

public class Product {
    private long id;
    private Object code;
    private String title;
    private String slug;
    private String definition;
    private Long oldPrice;
    private long price;
    private long stock;
    private Object maxInstallment;
    private long commissionRate;
    private long cargoTime;
    private boolean isCargoFree;
    private boolean isNew;
    private Object rejectReason;
    private long categoryID;
    private String difference;
    private boolean isEditorChoice;
    private long commentCount;
    private boolean isOwner;
    private boolean isApproved;
    private boolean isActive;
    private String shareURL;
    private boolean isLiked;
    private long likeCount;
    private Shop shop;
    private ParentCategoryClass category;
    private ArrayList<Cover> images;
    private Long viewCount;

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public Object getCode() { return code; }
    public void setCode(Object value) { this.code = value; }

    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }

    public String getSlug() { return slug; }
    public void setSlug(String value) { this.slug = value; }

    public String getDefinition() { return definition; }
    public void setDefinition(String value) { this.definition = value; }

    public Long getOldPrice() { return oldPrice; }
    public void setOldPrice(Long value) { this.oldPrice = value; }

    public long getPrice() { return price; }
    public void setPrice(long value) { this.price = value; }

    public long getStock() { return stock; }
    public void setStock(long value) { this.stock = value; }

    public Object getMaxInstallment() { return maxInstallment; }
    public void setMaxInstallment(Object value) { this.maxInstallment = value; }

    public long getCommissionRate() { return commissionRate; }
    public void setCommissionRate(long value) { this.commissionRate = value; }

    public long getCargoTime() { return cargoTime; }
    public void setCargoTime(long value) { this.cargoTime = value; }

    public boolean getIsCargoFree() { return isCargoFree; }
    public void setIsCargoFree(boolean value) { this.isCargoFree = value; }

    public boolean getIsNew() { return isNew; }
    public void setIsNew(boolean value) { this.isNew = value; }

    public Object getRejectReason() { return rejectReason; }
    public void setRejectReason(Object value) { this.rejectReason = value; }

    public long getCategoryID() { return categoryID; }
    public void setCategoryID(long value) { this.categoryID = value; }

    public String getDifference() { return difference; }
    public void setDifference(String value) { this.difference = value; }

    public boolean getIsEditorChoice() { return isEditorChoice; }
    public void setIsEditorChoice(boolean value) { this.isEditorChoice = value; }

    public long getCommentCount() { return commentCount; }
    public void setCommentCount(long value) { this.commentCount = value; }

    public boolean getIsOwner() { return isOwner; }
    public void setIsOwner(boolean value) { this.isOwner = value; }

    public boolean getIsApproved() { return isApproved; }
    public void setIsApproved(boolean value) { this.isApproved = value; }

    public boolean getIsActive() { return isActive; }
    public void setIsActive(boolean value) { this.isActive = value; }

    public String getShareURL() { return shareURL; }
    public void setShareURL(String value) { this.shareURL = value; }

    public boolean getIsLiked() { return isLiked; }
    public void setIsLiked(boolean value) { this.isLiked = value; }

    public long getLikeCount() { return likeCount; }
    public void setLikeCount(long value) { this.likeCount = value; }

    public Shop getShop() { return shop; }
    public void setShop(Shop value) { this.shop = value; }

    public ParentCategoryClass getCategory() { return category; }
    public void setCategory(ParentCategoryClass value) { this.category = value; }

    public ArrayList<Cover> getImages() { return images; }
    public void setImages(ArrayList<Cover> value) { this.images = value; }

    public Long getViewCount() { return viewCount; }
    public void setViewCount(Long value) { this.viewCount = value; }
}
