package example.emre.com.mobilliumexample.Models;

public class ParentCategoryClass {
    private long id;
    private String name;
    private Long parentID;
    private long order;
    private ParentCategoryClass parentCategory;

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
}
