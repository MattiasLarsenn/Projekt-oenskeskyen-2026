package org.example.oenskeskyen2026.Models;

public class Wish
{
    private int id;
    private String title;
    private String url;
    private String description;
    private String imageAdress;

    public Wish(int id, String title, String url, String description, String pictureAdress)
    {
        this.id = id;
        this.title = title;
        this.url = url;
        this.description = description;
        this.imageAdress = pictureAdress;
    }

    public int getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public String getUrl()
    {
        return url;
    }

    public String getDescription()
    {
        return description;
    }

    public String getImageAdress()
    {
        return imageAdress;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setImageAdress(String imageAdress)
    {
        this.imageAdress = imageAdress;
    }
}
