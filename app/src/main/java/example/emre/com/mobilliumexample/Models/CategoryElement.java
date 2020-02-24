package example.emre.com.mobilliumexample.Models;

import java.util.ArrayList;

public class CategoryElement {
    private long id;
    private String name;
    private Long parentID;
    private long order;
    private ParentCategoryClass parentCategory;
    private Cover logo;
    private Cover cover;
    private ArrayList<CategoryElement> children;

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public Long getParentID() { return parentID; }
    public void setParentID(Long value) { this.parentID = value; }

    public long getOrder() { return order; }
    public void setOrder(long value) { this.order = value; }

    public ParentCategoryClass getParentCategory() { return parentCategory; }
    public void setParentCategory(ParentCategoryClass value) { this.parentCategory = value; }
    public Cover getLogo() { return logo; }
    public void setLogo(Cover value) { this.logo = value; }

    public Cover getCover() { return cover; }
    public void setCover(Cover value) { this.cover = value; }

    public ArrayList<CategoryElement> getChildren() { return children; }
    public void setChildren(ArrayList<CategoryElement> value) { this.children = value; }
}
