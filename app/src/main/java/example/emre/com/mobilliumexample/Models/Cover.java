package example.emre.com.mobilliumexample.Models;

public class Cover {
    private long width;
    private long height;
    private String url;
    private Medium medium;
    private Medium thumbnail;

    public long getWidth() { return width; }
    public void setWidth(long value) { this.width = value; }

    public long getHeight() { return height; }
    public void setHeight(long value) { this.height = value; }

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }

    public Medium getMedium() { return medium; }
    public void setMedium(Medium value) { this.medium = value; }

    public Medium getThumbnail() { return thumbnail; }
    public void setThumbnail(Medium value) { this.thumbnail = value; }
}
