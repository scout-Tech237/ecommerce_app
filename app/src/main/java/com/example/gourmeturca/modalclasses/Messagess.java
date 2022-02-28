package com.example.gourmeturca.modalclasses;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Messagess {

    @SerializedName("type")
    @Expose
    private Object type;
    @SerializedName("code")
    @Expose
    private Object code;
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
    private List<Object> text = null;
    @SerializedName("errorField")
    @Expose
    private List<Object> errorField = null;

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
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

    public List<Object> getText() {
        return text;
    }

    public void setText(List<Object> text) {
        this.text = text;
    }

    public List<Object> getErrorField() {
        return errorField;
    }

    public void setErrorField(List<Object> errorField) {
        this.errorField = errorField;
    }

}
