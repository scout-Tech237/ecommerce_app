package com.example.gourmeturca.modalclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Categoryy {

    @SerializedName("CategoryId")
    @Expose
    private String categoryId;
    @SerializedName("CategoryCode")
    @Expose
    private String categoryCode;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

}