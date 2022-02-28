package com.example.gourmeturca.modalclasses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Message2 {

    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("index")
    @Expose
    private Integer index;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("subid")
    @Expose
    private String subid;
    @SerializedName("text")
    @Expose
    private List<String> text = null;
    @SerializedName("errorField")
    @Expose
    private List<Object> errorField = null;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubid() {
        return subid;
    }

    public void setSubid(String subid) {
        this.subid = subid;
    }

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }

    public List<Object> getErrorField() {
        return errorField;
    }

    public void setErrorField(List<Object> errorField) {
        this.errorField = errorField;
    }

}
