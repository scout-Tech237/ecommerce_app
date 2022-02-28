package com.example.gourmeturca.modalclasses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum2 {

    @SerializedName("customer_id")
    @Expose
    private String customerId;
    @SerializedName("customer_code")
    @Expose
    private String customerCode;
    @SerializedName("cart_total_count")
    @Expose
    private Integer cartTotalCount;
    @SerializedName("target_currency")
    @Expose
    private String targetCurrency;
    @SerializedName("is_buy_button_active")
    @Expose
    private Boolean isBuyButtonActive;
    @SerializedName("is_gift_note_active")
    @Expose
    private Boolean isGiftNoteActive;
    @SerializedName("is_order_note_active")
    @Expose
    private Boolean isOrderNoteActive;
    @SerializedName("gift_package_cost")
    @Expose
    private Double giftPackageCost;
    @SerializedName("is_confirmation_box_active")
    @Expose
    private Boolean isConfirmationBoxActive;
    @SerializedName("display_confirmation_box")
    @Expose
    private Boolean displayConfirmationBox;
    @SerializedName("confirmation_text")
    @Expose
    private String confirmationText;
    @SerializedName("price_gift_package")
    @Expose
    private Integer priceGiftPackage;
    @SerializedName("price_personalization")
    @Expose
    private Integer pricePersonalization;
    @SerializedName("is_campaign_active")
    @Expose
    private Boolean isCampaignActive;
    @SerializedName("price_campaign")
    @Expose
    private Integer priceCampaign;
    @SerializedName("selected_campaign_list")
    @Expose
    private List<Object> selectedCampaignList = null;
    @SerializedName("campaign_product_id")
    @Expose
    private Integer campaignProductId;
    @SerializedName("campaign_list")
    @Expose
    private List<Object> campaignList = null;
    @SerializedName("is_discount_coupon_active")
    @Expose
    private Boolean isDiscountCouponActive;
    @SerializedName("price_coupon")
    @Expose
    private Integer priceCoupon;
    @SerializedName("price_cart")
    @Expose
    private Double priceCart;
    @SerializedName("cargo_payment_type")
    @Expose
    private Integer cargoPaymentType;
    @SerializedName("is_cargo_free")
    @Expose
    private Boolean isCargoFree;
    @SerializedName("price_cargo")
    @Expose
    private String priceCargo;
    @SerializedName("display_cargo")
    @Expose
    private Boolean displayCargo;
    @SerializedName("price_general")
    @Expose
    private Double priceGeneral;
    @SerializedName("error")
    @Expose
    private String error;
    @SerializedName("cart_message")
    @Expose
    private String cartMessage;
    @SerializedName("min_order_price")
    @Expose
    private Integer minOrderPrice;
    @SerializedName("favor_coupon")
    @Expose
    private String favorCoupon;
    @SerializedName("is_favor_coupon_active")
    @Expose
    private Boolean isFavorCouponActive;
    @SerializedName("is_delivery_date_active")
    @Expose
    private Boolean isDeliveryDateActive;
    @SerializedName("delivery_date_text")
    @Expose
    private String deliveryDateText;
    @SerializedName("is_delivery_hour_active")
    @Expose
    private Boolean isDeliveryHourActive;
    @SerializedName("delivery_hour_text")
    @Expose
    private String deliveryHourText;
    @SerializedName("delivery_date")
    @Expose
    private String deliveryDate;
    @SerializedName("delivery_hour")
    @Expose
    private String deliveryHour;
    @SerializedName("is_member_logged_in")
    @Expose
    private Boolean isMemberLoggedIn;
    @SerializedName("products")
    @Expose
    private List<CartProduct> products = null;
    /*@SerializedName("hopi")
    @Expose
    private Hopi hopi;
    @SerializedName("zubizu")
    @Expose
    private Zubizu zubizu;*/

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public Integer getCartTotalCount() {
        return cartTotalCount;
    }

    public void setCartTotalCount(Integer cartTotalCount) {
        this.cartTotalCount = cartTotalCount;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public Boolean getIsBuyButtonActive() {
        return isBuyButtonActive;
    }

    public void setIsBuyButtonActive(Boolean isBuyButtonActive) {
        this.isBuyButtonActive = isBuyButtonActive;
    }

    public Boolean getIsGiftNoteActive() {
        return isGiftNoteActive;
    }

    public void setIsGiftNoteActive(Boolean isGiftNoteActive) {
        this.isGiftNoteActive = isGiftNoteActive;
    }

    public Boolean getIsOrderNoteActive() {
        return isOrderNoteActive;
    }

    public void setIsOrderNoteActive(Boolean isOrderNoteActive) {
        this.isOrderNoteActive = isOrderNoteActive;
    }

    public Double getGiftPackageCost() {
        return giftPackageCost;
    }

    public void setGiftPackageCost(Double giftPackageCost) {
        this.giftPackageCost = giftPackageCost;
    }

    public Boolean getIsConfirmationBoxActive() {
        return isConfirmationBoxActive;
    }

    public void setIsConfirmationBoxActive(Boolean isConfirmationBoxActive) {
        this.isConfirmationBoxActive = isConfirmationBoxActive;
    }

    public Boolean getDisplayConfirmationBox() {
        return displayConfirmationBox;
    }

    public void setDisplayConfirmationBox(Boolean displayConfirmationBox) {
        this.displayConfirmationBox = displayConfirmationBox;
    }

    public String getConfirmationText() {
        return confirmationText;
    }

    public void setConfirmationText(String confirmationText) {
        this.confirmationText = confirmationText;
    }

    public Integer getPriceGiftPackage() {
        return priceGiftPackage;
    }

    public void setPriceGiftPackage(Integer priceGiftPackage) {
        this.priceGiftPackage = priceGiftPackage;
    }

    public Integer getPricePersonalization() {
        return pricePersonalization;
    }

    public void setPricePersonalization(Integer pricePersonalization) {
        this.pricePersonalization = pricePersonalization;
    }

    public Boolean getIsCampaignActive() {
        return isCampaignActive;
    }

    public void setIsCampaignActive(Boolean isCampaignActive) {
        this.isCampaignActive = isCampaignActive;
    }

    public Integer getPriceCampaign() {
        return priceCampaign;
    }

    public void setPriceCampaign(Integer priceCampaign) {
        this.priceCampaign = priceCampaign;
    }

    public List<Object> getSelectedCampaignList() {
        return selectedCampaignList;
    }

    public void setSelectedCampaignList(List<Object> selectedCampaignList) {
        this.selectedCampaignList = selectedCampaignList;
    }

    public Integer getCampaignProductId() {
        return campaignProductId;
    }

    public void setCampaignProductId(Integer campaignProductId) {
        this.campaignProductId = campaignProductId;
    }

    public List<Object> getCampaignList() {
        return campaignList;
    }

    public void setCampaignList(List<Object> campaignList) {
        this.campaignList = campaignList;
    }

    public Boolean getIsDiscountCouponActive() {
        return isDiscountCouponActive;
    }

    public void setIsDiscountCouponActive(Boolean isDiscountCouponActive) {
        this.isDiscountCouponActive = isDiscountCouponActive;
    }

    public Integer getPriceCoupon() {
        return priceCoupon;
    }

    public void setPriceCoupon(Integer priceCoupon) {
        this.priceCoupon = priceCoupon;
    }

    public Double getPriceCart() {
        return priceCart;
    }

    public void setPriceCart(Double priceCart) {
        this.priceCart = priceCart;
    }

    public Integer getCargoPaymentType() {
        return cargoPaymentType;
    }

    public void setCargoPaymentType(Integer cargoPaymentType) {
        this.cargoPaymentType = cargoPaymentType;
    }

    public Boolean getIsCargoFree() {
        return isCargoFree;
    }

    public void setIsCargoFree(Boolean isCargoFree) {
        this.isCargoFree = isCargoFree;
    }

    public String getPriceCargo() {
        return priceCargo;
    }

    public void setPriceCargo(String priceCargo) {
        this.priceCargo = priceCargo;
    }

    public Boolean getDisplayCargo() {
        return displayCargo;
    }

    public void setDisplayCargo(Boolean displayCargo) {
        this.displayCargo = displayCargo;
    }

    public Double getPriceGeneral() {
        return priceGeneral;
    }

    public void setPriceGeneral(Double priceGeneral) {
        this.priceGeneral = priceGeneral;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getCartMessage() {
        return cartMessage;
    }

    public void setCartMessage(String cartMessage) {
        this.cartMessage = cartMessage;
    }

    public Integer getMinOrderPrice() {
        return minOrderPrice;
    }

    public void setMinOrderPrice(Integer minOrderPrice) {
        this.minOrderPrice = minOrderPrice;
    }

    public String getFavorCoupon() {
        return favorCoupon;
    }

    public void setFavorCoupon(String favorCoupon) {
        this.favorCoupon = favorCoupon;
    }

    public Boolean getIsFavorCouponActive() {
        return isFavorCouponActive;
    }

    public void setIsFavorCouponActive(Boolean isFavorCouponActive) {
        this.isFavorCouponActive = isFavorCouponActive;
    }

    public Boolean getIsDeliveryDateActive() {
        return isDeliveryDateActive;
    }

    public void setIsDeliveryDateActive(Boolean isDeliveryDateActive) {
        this.isDeliveryDateActive = isDeliveryDateActive;
    }

    public String getDeliveryDateText() {
        return deliveryDateText;
    }

    public void setDeliveryDateText(String deliveryDateText) {
        this.deliveryDateText = deliveryDateText;
    }

    public Boolean getIsDeliveryHourActive() {
        return isDeliveryHourActive;
    }

    public void setIsDeliveryHourActive(Boolean isDeliveryHourActive) {
        this.isDeliveryHourActive = isDeliveryHourActive;
    }

    public String getDeliveryHourText() {
        return deliveryHourText;
    }

    public void setDeliveryHourText(String deliveryHourText) {
        this.deliveryHourText = deliveryHourText;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryHour() {
        return deliveryHour;
    }

    public void setDeliveryHour(String deliveryHour) {
        this.deliveryHour = deliveryHour;
    }

    public Boolean getIsMemberLoggedIn() {
        return isMemberLoggedIn;
    }

    public void setIsMemberLoggedIn(Boolean isMemberLoggedIn) {
        this.isMemberLoggedIn = isMemberLoggedIn;
    }

    public List<CartProduct> getProducts() {
        return products;
    }

    public void setProducts(List<CartProduct> products) {
        this.products = products;
    }

    /*public Hopi getHopi() {
        return hopi;
    }

    public void setHopi(Hopi hopi) {
        this.hopi = hopi;
    }

    public Zubizu getZubizu() {
        return zubizu;
    }

    public void setZubizu(Zubizu zubizu) {
        this.zubizu = zubizu;
    }*/

}
