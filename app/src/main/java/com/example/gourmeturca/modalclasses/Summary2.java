package com.example.gourmeturca.modalclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Summary2 {

    @SerializedName("totalRecordCount")
    @Expose
    private Integer totalRecordCount;

    public Integer getTotalRecordCount() {
        return totalRecordCount;
    }

    public void setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

}
