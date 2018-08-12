package com.example.hasee.activitytest;

public class Fruit {
    public Fruit(String name,int resId)
    {
        this.name = name;
        this.imageId =resId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private int imageId;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
