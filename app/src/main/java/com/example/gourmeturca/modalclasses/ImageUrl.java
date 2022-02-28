package com.example.gourmeturca.modalclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageUrl {

    @SerializedName("ImageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("ListNo")
    @Expose
    private String listNo;
    @SerializedName("PropertyId")
    @Expose
    private String propertyId;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getListNo() {
        return listNo;
    }

    public void setListNo(String listNo) {
        this.listNo = listNo;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }
}

