package com.example.gourmeturca.modalclasses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image2 {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("small")
    @Expose
    private String small;
    @SerializedName("medium")
    @Expose
    private String medium;
    @SerializedName("big")
    @Expose
    private String big;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("variant_ids")
    @Expose
    private List<Object> variantIds = null;
    @SerializedName("variant_type_id")
    @Expose
    private String variantTypeId;
    @SerializedName("medium_webp_jpg")
    @Expose
    private Object mediumWebpJpg;

    @SerializedName("ImageUrl")
    @Expose
    private String imageUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Object> getVariantIds() {
        return variantIds;
    }

    public void setVariantIds(List<Object> variantIds) {
        this.variantIds = variantIds;
    }

    public String getVariantTypeId() {
        return variantTypeId;
    }

    public void setVariantTypeId(String variantTypeId) {
        this.variantTypeId = variantTypeId;
    }

    public Object getMediumWebpJpg() {
        return mediumWebpJpg;
    }

    public void setMediumWebpJpg(Object mediumWebpJpg) {
        this.mediumWebpJpg = mediumWebpJpg;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
