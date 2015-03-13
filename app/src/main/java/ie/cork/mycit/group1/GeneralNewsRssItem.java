package ie.cork.mycit.group1;

public class GeneralNewsRssItem {

    private String title;
    private String description;
    private String pubDate;
    private String link;
    private String image;

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public String getPubDate(){
        return pubDate;
    }
    public void setPubDate(String pubDate){
        this.pubDate = pubDate;
    }

    public String getLink(){
        return link;
    }
    public void setLink(String link){
        this.link = link;
    }

    public String getImage(){
        return image;
    }
    public void setImage(String image){
        this.image = image;
    }

    @Override
    public String toString() {
        return "General News [title = " + title + ", description = " + description + ", pubDate = "
                + pubDate + ", link = " + link + ", image = " + image;
    }

}
