package com.example.assignment;

public class ListItemModelClass {

    private String title;
    private String rating;
    private String description;
    private String imgSrc;

    //default constructor
    public ListItemModelClass(String title, String rating, String description, String imgSrc){
        this.title = title;
        this.rating = rating;
        this.description = description;
        this.imgSrc = imgSrc;
    }

    //constructor without imgSrc parameter
    public ListItemModelClass(String title, String rating, String description){
        this.title = title;
        this.rating = rating;
        this.description = description;
        this.imgSrc = String.valueOf(R.drawable.default_image);//default image when no image provided
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }
}
