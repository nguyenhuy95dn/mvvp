package com.framgia.fdms.data.model;

/**
 * Created by Age on 4/1/2017.
 */
public class Device {
    private String mName;
    private String mDate;
    private String mCategory;
    private String mImage;
    private String mDescription;

    public Device(String name, String date, String category, String image) {
        mName = name;
        mDate = date;
        mCategory = category;
        mImage = image;
    }

    public Device(String name, String date, String category, String image, String description) {
        mName = name;
        mDate = date;
        mCategory = category;
        mImage = image;
        mDescription = description;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public String getCategory() {
        return mCategory;
    }

    public void setCategory(String category) {
        mCategory = category;
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }
}
