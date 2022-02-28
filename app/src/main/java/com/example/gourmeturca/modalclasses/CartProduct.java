package com.example.gourmeturca.modalclasses;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CartProduct {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("cart_index")
    @Expose
    private Integer cartIndex;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("order_notes")
    @Expose
    private String orderNotes;
    @SerializedName("gift_notes")
    @Expose
    private String giftNotes;
    @SerializedName("is_gift_package_active")
    @Expose
    private Boolean isGiftPackageActive;
    @SerializedName("campaign_name")
    @Expose
    private String campaignName;
    @SerializedName("campaign_percent")
    @Expose
    private Integer campaignPercent;
    @SerializedName("price_total")
    @Expose
    private Double priceTotal;
    @SerializedName("price_sell")
    @Expose
    private String priceSell;
    @SerializedName("price_not_discounted")
    @Expose
    private Double priceNotDiscounted;
    @SerializedName("is_display_discounted_active")
    @Expose
    private String isDisplayDiscountedActive;
    @SerializedName("discount_percent")
    @Expose
    private Integer discountPercent;
    @SerializedName("vat")
    @Expose
    private Integer vat;
    @SerializedName("target_currency")
    @Expose
    private String targetCurrency;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("variant_id")
    @Expose
    private Integer variantId;
    @SerializedName("variant_name")
    @Expose
    private String variantName;
    @SerializedName("stock")
    @Expose
    private Integer stock;
    @SerializedName("stock_unit")
    @Expose
    private String stockUnit;
    @SerializedName("stock_unit_id")
    @Expose
    private Integer stockUnitId;
    @SerializedName("stock_increment")
    @Expose
    private Integer stockIncrement;
    @SerializedName("image")
    @Expose
    private Image2 image;
    @SerializedName("image_ratio")
    @Expose
    private Integer imageRatio;
    @SerializedName("display_vat")
    @Expose
    private String displayVat;
    @SerializedName("min_order_count")
    @Expose
    private Integer minOrderCount;
    @SerializedName("update_date")
    @Expose
    private Object updateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCartIndex() {
        return cartIndex;
    }

    public void setCartIndex(Integer cartIndex) {
        this.cartIndex = cartIndex;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getOrderNotes() {
        return orderNotes;
    }

    public void setOrderNotes(String orderNotes) {
        this.orderNotes = orderNotes;
    }

    public String getGiftNotes() {
        return giftNotes;
    }

    public void setGiftNotes(String giftNotes) {
        this.giftNotes = giftNotes;
    }

    public Boolean getIsGiftPackageActive() {
        return isGiftPackageActive;
    }

    public void setIsGiftPackageActive(Boolean isGiftPackageActive) {
        this.isGiftPackageActive = isGiftPackageActive;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public Integer getCampaignPercent() {
        return campaignPercent;
    }

    public void setCampaignPercent(Integer campaignPercent) {
        this.campaignPercent = campaignPercent;
    }

    public Double getPriceTotal() {
        return priceTotal;
    }

    public void setPriceTotal(Double priceTotal) {
        this.priceTotal = priceTotal;
    }

    public String getPriceSell() {
        return priceSell;
    }

    public void setPriceSell(String priceSell) {
        this.priceSell = priceSell;
    }

    public Double getPriceNotDiscounted() {
        return priceNotDiscounted;
    }

    public void setPriceNotDiscounted(Double priceNotDiscounted) {
        this.priceNotDiscounted = priceNotDiscounted;
    }

    public String getIsDisplayDiscountedActive() {
        return isDisplayDiscountedActive;
    }

    public void setIsDisplayDiscountedActive(String isDisplayDiscountedActive) {
        this.isDisplayDiscountedActive = isDisplayDiscountedActive;
    }

    public Integer getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Integer discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Integer getVat() {
        return vat;
    }

    public void setVat(Integer vat) {
        this.vat = vat;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getVariantId() {
        return variantId;
    }

    public void setVariantId(Integer variantId) {
        this.variantId = variantId;
    }

    public String getVariantName() {
        return variantName;
    }

    public void setVariantName(String variantName) {
        this.variantName = variantName;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getStockUnit() {
        return stockUnit;
    }

    public void setStockUnit(String stockUnit) {
        this.stockUnit = stockUnit;
    }

    public Integer getStockUnitId() {
        return stockUnitId;
    }

    public void setStockUnitId(Integer stockUnitId) {
        this.stockUnitId = stockUnitId;
    }

    public Integer getStockIncrement() {
        return stockIncrement;
    }

    public void setStockIncrement(Integer stockIncrement) {
        this.stockIncrement = stockIncrement;
    }

    public Image2 getImage() {
        return image;
    }

    public void setImage(Image2 image) {
        this.image = image;
    }

    public Integer getImageRatio() {
        return imageRatio;
    }

    public void setImageRatio(Integer imageRatio) {
        this.imageRatio = imageRatio;
    }

    public String getDisplayVat() {
        return displayVat;
    }

    public void setDisplayVat(String displayVat) {
        this.displayVat = displayVat;
    }

    public Integer getMinOrderCount() {
        return minOrderCount;
    }

    public void setMinOrderCount(Integer minOrderCount) {
        this.minOrderCount = minOrderCount;
    }

    public Object getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Object updateDate) {
        this.updateDate = updateDate;
    }

}
