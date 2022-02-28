package com.example.gourmeturca.modalclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DatumToken {

    @SerializedName("userId")
    @Expose
    private String userId;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("secretKey")
    @Expose
    private String secretKey;
    @SerializedName("expirationTime")
    @Expose
    private String expirationTime;
    @SerializedName("limited")
    @Expose
    private String limited;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("tableId")
    @Expose
    private String tableId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public String getLimited() {
        return limited;
    }

    public void setLimited(String limited) {
        this.limited = limited;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

}