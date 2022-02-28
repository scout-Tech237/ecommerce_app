package com.example.gourmeturca.modalclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("surname")
    @Expose
    private String surname;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("identity_number")
    @Expose
    private String identityNumber;
    @SerializedName("Onay")
    @Expose
    private String onay;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("birthdate")
    @Expose
    private String birthdate;
    @SerializedName("mobile_phone")
    @Expose
    private String mobilePhone;
    @SerializedName("home_phone")
    @Expose
    private String homePhone;
    @SerializedName("office_phone")
    @Expose
    private String officePhone;
    @SerializedName("company")
    @Expose
    private String company;
    @SerializedName("mail_notify")
    @Expose
    private String mailNotify;
    @SerializedName("sms_notify")
    @Expose
    private String smsNotify;
    @SerializedName("phone_notify")
    @Expose
    private String phoneNotify;
    @SerializedName("kvkk")
    @Expose
    private Integer kvkk;
    @SerializedName("kvkk_approval_time")
    @Expose
    private Integer kvkkApprovalTime;
    @SerializedName("customer_group_id")
    @Expose
    private String customerGroupId;
    @SerializedName("cart_total_count")
    @Expose
    private Integer cartTotalCount;
    @SerializedName("mobile_token")
    @Expose
    private String mobileToken;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getOnay() {
        return onay;
    }

    public void setOnay(String onay) {
        this.onay = onay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getMailNotify() {
        return mailNotify;
    }

    public void setMailNotify(String mailNotify) {
        this.mailNotify = mailNotify;
    }

    public String getSmsNotify() {
        return smsNotify;
    }

    public void setSmsNotify(String smsNotify) {
        this.smsNotify = smsNotify;
    }

    public String getPhoneNotify() {
        return phoneNotify;
    }

    public void setPhoneNotify(String phoneNotify) {
        this.phoneNotify = phoneNotify;
    }

    public Integer getKvkk() {
        return kvkk;
    }

    public void setKvkk(Integer kvkk) {
        this.kvkk = kvkk;
    }

    public Integer getKvkkApprovalTime() {
        return kvkkApprovalTime;
    }

    public void setKvkkApprovalTime(Integer kvkkApprovalTime) {
        this.kvkkApprovalTime = kvkkApprovalTime;
    }

    public String getCustomerGroupId() {
        return customerGroupId;
    }

    public void setCustomerGroupId(String customerGroupId) {
        this.customerGroupId = customerGroupId;
    }

    public Integer getCartTotalCount() {
        return cartTotalCount;
    }

    public void setCartTotalCount(Integer cartTotalCount) {
        this.cartTotalCount = cartTotalCount;
    }

    public String getMobileToken() {
        return mobileToken;
    }

    public void setMobileToken(String mobileToken) {
        this.mobileToken = mobileToken;
    }

}