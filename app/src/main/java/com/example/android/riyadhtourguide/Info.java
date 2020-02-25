package com.example.android.riyadhtourguide;

public class Info {

    private String placeName;
    private String placePhoneNumber;
    private  int imageRes;

    public Info(String placeName, String placeLocation, int imageRes) {
        this.placeName = placeName;
        this.placePhoneNumber = placeLocation;
        this.imageRes = imageRes;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getPlacePhoneNumber() {
        return placePhoneNumber;
    }

    public int getImageRes() {
        return imageRes;
    }
}
