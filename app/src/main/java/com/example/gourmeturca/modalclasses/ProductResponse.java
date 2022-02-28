package com.example.gourmeturca.modalclasses;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductResponse {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("data")
    @Expose
    private List<Datum1> data = null;
    @SerializedName("message")
    @Expose
    private List<Messagess> message = null;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<Datum1> getData() {
        return data;
    }

    public void setData(List<Datum1> data) {
        this.data = data;
    }

    public List<Messagess> getMessage() {
        return message;
    }

    public void setMessage(List<Messagess> message) {
        this.message = message;
    }



}
