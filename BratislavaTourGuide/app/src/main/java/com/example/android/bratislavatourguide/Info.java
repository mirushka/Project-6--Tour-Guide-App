package com.example.android.bratislavatourguide;

/**
 * Created by Mirka on 12/06/2017.
 */

public class Info {
    //The name of the place/event
    private String mTitle;

    //Short description
    private String mDescription;

    //ID of the image resource
    private int mImageResourceId;


    //Public constructor of the Info object with no date and url
    public Info(String title, String description, int imageResourceId) {
        mTitle = title;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    //Getter methods
    public String getName() {
        return mTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getImageId() {
        return mImageResourceId;
    }

}

