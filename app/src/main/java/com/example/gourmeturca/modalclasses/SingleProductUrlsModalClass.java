package com.example.gourmeturca.modalclasses;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SingleProductUrlsModalClass {

    @SerializedName("ImageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("Small")
    @Expose
    private String small;
    @SerializedName("Medium")
    @Expose
    private String medium;
    @SerializedName("Big")
    @Expose
    private String big;
    @SerializedName("ListNo")
    @Expose
    private Integer listNo;
    @SerializedName("PropertyId")
    @Expose
    private Integer propertyId;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getBig() {
        return big;
    }

    public void setBig(String big) {
        this.big = big;
    }

    public Integer getListNo() {
        return listNo;
    }

    public void setListNo(Integer listNo) {
        this.listNo = listNo;
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

}