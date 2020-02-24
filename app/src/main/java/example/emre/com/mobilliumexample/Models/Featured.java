package example.emre.com.mobilliumexample.Models;

public class Featured {
    private long id;
    private String type;
    private Cover cover;
    private String title;
    private String subTitle;

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }

    public Cover getCover() { return cover; }
    public void setCover(Cover value) { this.cover = value; }

    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }

    public String getSubTitle() { return subTitle; }
    public void setSubTitle(String value) { this.subTitle = value; }
}
