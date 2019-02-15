package com.example.safapp;

public class OnlineItems {

    private String Tittle;
    private String Category;
    private String Description;
    private int Thumbnail;

    public OnlineItems() {
    }

    public OnlineItems(String tittle, String category, String description, int thumbnail) {
        Tittle = tittle;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;
    }

    public String getTittle() {
        return Tittle;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setTittle(String tittle) {
        Tittle = tittle;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
