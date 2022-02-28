package com.example.gourmeturca.modalclasses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TokenResponse {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("data")
    @Expose
    private List<DatumToken> data = null;
    @SerializedName("message")
    @Expose
    private List<Messages> message = null;
    @SerializedName("summary")
    @Expose
    private String summary;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<DatumToken> getData() {
        return data;
    }

    public void setData(List<DatumToken> data) {
        this.data = data;
    }

    public List<Messages> getMessage() {
        return message;
    }

    public void setMessage(List<Messages> message) {
        this.message = message;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

}