package com.example.gourmeturca.modalclasses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CartResponse {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("data")
    @Expose
    private Datum2 data;
    @SerializedName("message")
    @Expose
    private List<Message2> message = null;
    @SerializedName("summary")
    @Expose
    private Summary2 summary;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Datum2 getData() {
        return data;
    }

    public void setData(Datum2 data) {
        this.data = data;
    }

    public List<Message2> getMessage() {
        return message;
    }

    public void setMessage(List<Message2> message) {
        this.message = message;
    }

    public Summary2 getSummary() {
        return summary;
    }

    public void setSummary(Summary2 summary) {
        this.summary = summary;
    }

}