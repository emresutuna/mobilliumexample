package example.emre.com.mobilliumexample.Models;

public class Collection {
    private long id;
    private String title;
    private String definition;
    private String start;
    private Object end;
    private String shareURL;
    private Cover cover;
    private Cover logo;

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }

    public String getDefinition() { return definition; }
    public void setDefinition(String value) { this.definition = value; }

    public String getStart() { return start; }
    public void setStart(String value) { this.start = value; }

    public Object getEnd() { return end; }
    public void setEnd(Object value) { this.end = value; }

    public String getShareURL() { return shareURL; }
    public void setShareURL(String value) { this.shareURL = value; }

    public Cover getCover() { return cover; }
    public void setCover(Cover value) { this.cover = value; }

    public Cover getLogo() { return logo; }
    public void setLogo(Cover value) { this.logo = value; }
}
