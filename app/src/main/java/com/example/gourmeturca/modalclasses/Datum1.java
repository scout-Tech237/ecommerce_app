package com.example.gourmeturca.modalclasses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum1 {

    @SerializedName("ProductId")
    @Expose
    private String productId;
    @SerializedName("ProductCode")
    @Expose
    private String productCode;
    @SerializedName("ProductName")
    @Expose
    private String productName;
    @SerializedName("DefaultCategoryId")
    @Expose
    private String defaultCategoryId;
    @SerializedName("DefaultCategoryName")
    @Expose
    private String defaultCategoryName;
    @SerializedName("DefaultCategoryPath")
    @Expose
    private String defaultCategoryPath;
    @SerializedName("SupplierProductCode")
    @Expose
    private String supplierProductCode;
    @SerializedName("Barcode")
    @Expose
    private Object barcode;
    @SerializedName("Stock")
    @Expose
    private String stock;
    @SerializedName("IsActive")
    @Expose
    private String isActive;
    @SerializedName("ComparisonSites")
    @Expose
    private String comparisonSites;
    @SerializedName("IsApproved")
    @Expose
    private String isApproved;
    @SerializedName("HasSubProducts")
    @Expose
    private String hasSubProducts;
    @SerializedName("HasImages")
    @Expose
    private String hasImages;
    @SerializedName("Vat")
    @Expose
    private String vat;
    @SerializedName("CurrencyId")
    @Expose
    private String currencyId;
    @SerializedName("BuyingPrice")
    @Expose
    private String buyingPrice;
    @SerializedName("SellingPrice")
    @Expose
    private String sellingPrice;
    @SerializedName("SellingPriceVatIncludedNoDiscount")
    @Expose
    private String sellingPriceVatIncludedNoDiscount;
    @SerializedName("SellingPriceVatIncluded")
    @Expose
    private Double sellingPriceVatIncluded;
    @SerializedName("DiscountedSellingPrice")
    @Expose
    private String discountedSellingPrice;
    @SerializedName("SeoLink")
    @Expose
    private String seoLink;
    @SerializedName("StockUnit")
    @Expose
    private String stockUnit;
    @SerializedName("StockUnitId")
    @Expose
    private String stockUnitId;
    @SerializedName("SearchKeywords")
    @Expose
    private String searchKeywords;
    @SerializedName("DisplayOnHomepage")
    @Expose
    private String displayOnHomepage;
    @SerializedName("IsNewProduct")
    @Expose
    private String isNewProduct;
    @SerializedName("OnSale")
    @Expose
    private String onSale;
    @SerializedName("IsDisplayProduct")
    @Expose
    private String isDisplayProduct;
    @SerializedName("VendorDisplayOnly")
    @Expose
    private String vendorDisplayOnly;
    @SerializedName("DisplayWithVat")
    @Expose
    private String displayWithVat;
    @SerializedName("Brand")
    @Expose
    private String brand;
    @SerializedName("BrandId")
    @Expose
    private String brandId;
    @SerializedName("BrandLink")
    @Expose
    private String brandLink;
    @SerializedName("Model")
    @Expose
    private String model;
    @SerializedName("ModelId")
    @Expose
    private String modelId;
    @SerializedName("SupplierId")
    @Expose
    private String supplierId;
    @SerializedName("CustomerGroupDisplay")
    @Expose
    private String customerGroupDisplay;
    @SerializedName("Additional1")
    @Expose
    private String additional1;
    @SerializedName("Additional2")
    @Expose
    private String additional2;
    @SerializedName("Additional3")
    @Expose
    private String additional3;
    @SerializedName("ImageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("Magnifier")
    @Expose
    private String magnifier;
    @SerializedName("MemberMinOrder")
    @Expose
    private String memberMinOrder;
    @SerializedName("MemberMaxOrder")
    @Expose
    private String memberMaxOrder;
    @SerializedName("VendorMinOrder")
    @Expose
    private String vendorMinOrder;
    @SerializedName("VendorMaxOrder")
    @Expose
    private String vendorMaxOrder;
    @SerializedName("FreeDeliveryMember")
    @Expose
    private String freeDeliveryMember;
    @SerializedName("FreeDeliveryVendor")
    @Expose
    private String freeDeliveryVendor;
    @SerializedName("ShortDescription")
    @Expose
    private String shortDescription;
    @SerializedName("SavingDate")
    @Expose
    private String savingDate;
    @SerializedName("CreateDateTimeStamp")
    @Expose
    private String createDateTimeStamp;
    @SerializedName("CreateDate")
    @Expose
    private String createDate;
    @SerializedName("FilterGroupId")
    @Expose
    private String filterGroupId;
    @SerializedName("ListNo")
    @Expose
    private String listNo;
    @SerializedName("OwnerId")
    @Expose
    private String ownerId;
    @SerializedName("StockUpdateDate")
    @Expose
    private String stockUpdateDate;
    @SerializedName("StockUpdatePlatform")
    @Expose
    private String stockUpdatePlatform;
    @SerializedName("PriceUpdateDate")
    @Expose
    private String priceUpdateDate;
    @SerializedName("PriceUpdatePlatform")
    @Expose
    private String priceUpdatePlatform;
    @SerializedName("Gender")
    @Expose
    private String gender;
    @SerializedName("OpportunityProduct")
    @Expose
    private String opportunityProduct;
    @SerializedName("OpportunityStart")
    @Expose
    private String opportunityStart;
    @SerializedName("OpportunityFinish")
    @Expose
    private String opportunityFinish;
    @SerializedName("DisablePaymentTypes")
    @Expose
    private Object disablePaymentTypes;
    @SerializedName("AgeGroup")
    @Expose
    private String ageGroup;
    @SerializedName("Point")
    @Expose
    private String point;
    @SerializedName("Numeric1")
    @Expose
    private String numeric1;
    @SerializedName("DefaultSubProductId")
    @Expose
    private String defaultSubProductId;
    @SerializedName("DisableCargoCompany")
    @Expose
    private Object disableCargoCompany;
    @SerializedName("HomepageSort")
    @Expose
    private String homepageSort;
    @SerializedName("MostSoldSort")
    @Expose
    private String mostSoldSort;
    @SerializedName("NewestSort")
    @Expose
    private String newestSort;
    @SerializedName("EftRate")
    @Expose
    private String eftRate;
    @SerializedName("RelatedProductsBlock1")
    @Expose
    private String relatedProductsBlock1;
    @SerializedName("RelatedProductsBlock2")
    @Expose
    private String relatedProductsBlock2;
    @SerializedName("RelatedProductsBlock3")
    @Expose
    private String relatedProductsBlock3;

    @SerializedName("DefaultCategoryCode")
    @Expose
    private String defaultCategoryCode;
    @SerializedName("Currency")
    @Expose
    private String currency;
    @SerializedName("Supplier")
    @Expose
    private String supplier;
    @SerializedName("DiscountedSellingPriceTL")
    @Expose
    private Double discountedSellingPriceTL;
    @SerializedName("Categories")
    @Expose
    private List<Categoryy> categories = null;
    @SerializedName("Details")
    @Expose
    private String details;
    @SerializedName("Width")
    @Expose
    private String width;
    @SerializedName("Height")
    @Expose
    private String height;
    @SerializedName("Depth")
    @Expose
    private String depth;
    @SerializedName("Weight")
    @Expose
    private String weight;
    @SerializedName("CBM")
    @Expose
    private String cbm;
    @SerializedName("WarrantyInfo")
    @Expose
    private Object warrantyInfo;
    @SerializedName("DeliveryInfo")
    @Expose
    private Object deliveryInfo;
    @SerializedName("DeliveryTime")
    @Expose
    private String deliveryTime;
    @SerializedName("ProductNote")
    @Expose
    private Object productNote;
    @SerializedName("Document")
    @Expose
    private String document;
    @SerializedName("Warehouse")
    @Expose
    private String warehouse;
    @SerializedName("PersonalizationId")
    @Expose
    private String personalizationId;
    @SerializedName("SeoTitle")
    @Expose
    private String seoTitle;
    @SerializedName("SeoKeywords")
    @Expose
    private String seoKeywords;
    @SerializedName("SeoDescription")
    @Expose
    private String seoDescription;
    @SerializedName("SeoSettingsId")
    @Expose
    private String seoSettingsId;
    @SerializedName("Gtip")
    @Expose
    private String gtip;
    @SerializedName("CountryOfOrigin")
    @Expose
    private String countryOfOrigin;
    @SerializedName("PackageProducts")
    @Expose
    private List<Object> packageProducts = null;
    @SerializedName("ImageUrls")
    @Expose
    private List<Image2> imageUrls = null;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDefaultCategoryId() {
        return defaultCategoryId;
    }

    public void setDefaultCategoryId(String defaultCategoryId) {
        this.defaultCategoryId = defaultCategoryId;
    }

    public String getDefaultCategoryName() {
        return defaultCategoryName;
    }

    public void setDefaultCategoryName(String defaultCategoryName) {
        this.defaultCategoryName = defaultCategoryName;
    }

    public String getDefaultCategoryPath() {
        return defaultCategoryPath;
    }

    public void setDefaultCategoryPath(String defaultCategoryPath) {
        this.defaultCategoryPath = defaultCategoryPath;
    }

    public String getSupplierProductCode() {
        return supplierProductCode;
    }

    public void setSupplierProductCode(String supplierProductCode) {
        this.supplierProductCode = supplierProductCode;
    }

    public Object getBarcode() {
        return barcode;
    }

    public void setBarcode(Object barcode) {
        this.barcode = barcode;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getComparisonSites() {
        return comparisonSites;
    }

    public void setComparisonSites(String comparisonSites) {
        this.comparisonSites = comparisonSites;
    }

    public String getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(String isApproved) {
        this.isApproved = isApproved;
    }

    public String getHasSubProducts() {
        return hasSubProducts;
    }

    public void setHasSubProducts(String hasSubProducts) {
        this.hasSubProducts = hasSubProducts;
    }

    public String getHasImages() {
        return hasImages;
    }

    public void setHasImages(String hasImages) {
        this.hasImages = hasImages;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(String buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public String getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getSellingPriceVatIncludedNoDiscount() {
        return sellingPriceVatIncludedNoDiscount;
    }

    public void setSellingPriceVatIncludedNoDiscount(String sellingPriceVatIncludedNoDiscount) {
        this.sellingPriceVatIncludedNoDiscount = sellingPriceVatIncludedNoDiscount;
    }

    public Double getSellingPriceVatIncluded() {
        return sellingPriceVatIncluded;
    }

    public void setSellingPriceVatIncluded(Double sellingPriceVatIncluded) {
        this.sellingPriceVatIncluded = sellingPriceVatIncluded;
    }

    public String getDiscountedSellingPrice() {
        return discountedSellingPrice;
    }

    public void setDiscountedSellingPrice(String discountedSellingPrice) {
        this.discountedSellingPrice = discountedSellingPrice;
    }

    public String getSeoLink() {
        return seoLink;
    }

    public void setSeoLink(String seoLink) {
        this.seoLink = seoLink;
    }

    public String getStockUnit() {
        return stockUnit;
    }

    public void setStockUnit(String stockUnit) {
        this.stockUnit = stockUnit;
    }

    public String getStockUnitId() {
        return stockUnitId;
    }

    public void setStockUnitId(String stockUnitId) {
        this.stockUnitId = stockUnitId;
    }

    public String getSearchKeywords() {
        return searchKeywords;
    }

    public void setSearchKeywords(String searchKeywords) {
        this.searchKeywords = searchKeywords;
    }

    public String getDisplayOnHomepage() {
        return displayOnHomepage;
    }

    public void setDisplayOnHomepage(String displayOnHomepage) {
        this.displayOnHomepage = displayOnHomepage;
    }

    public String getIsNewProduct() {
        return isNewProduct;
    }

    public void setIsNewProduct(String isNewProduct) {
        this.isNewProduct = isNewProduct;
    }

    public String getOnSale() {
        return onSale;
    }

    public void setOnSale(String onSale) {
        this.onSale = onSale;
    }

    public String getIsDisplayProduct() {
        return isDisplayProduct;
    }

    public void setIsDisplayProduct(String isDisplayProduct) {
        this.isDisplayProduct = isDisplayProduct;
    }

    public String getVendorDisplayOnly() {
        return vendorDisplayOnly;
    }

    public void setVendorDisplayOnly(String vendorDisplayOnly) {
        this.vendorDisplayOnly = vendorDisplayOnly;
    }

    public String getDisplayWithVat() {
        return displayWithVat;
    }

    public void setDisplayWithVat(String displayWithVat) {
        this.displayWithVat = displayWithVat;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandLink() {
        return brandLink;
    }

    public void setBrandLink(String brandLink) {
        this.brandLink = brandLink;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getCustomerGroupDisplay() {
        return customerGroupDisplay;
    }

    public void setCustomerGroupDisplay(String customerGroupDisplay) {
        this.customerGroupDisplay = customerGroupDisplay;
    }

    public String getAdditional1() {
        return additional1;
    }

    public void setAdditional1(String additional1) {
        this.additional1 = additional1;
    }

    public String getAdditional2() {
        return additional2;
    }

    public void setAdditional2(String additional2) {
        this.additional2 = additional2;
    }

    public String getAdditional3() {
        return additional3;
    }

    public void setAdditional3(String additional3) {
        this.additional3 = additional3;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getMagnifier() {
        return magnifier;
    }

    public void setMagnifier(String magnifier) {
        this.magnifier = magnifier;
    }

    public String getMemberMinOrder() {
        return memberMinOrder;
    }

    public void setMemberMinOrder(String memberMinOrder) {
        this.memberMinOrder = memberMinOrder;
    }

    public String getMemberMaxOrder() {
        return memberMaxOrder;
    }

    public void setMemberMaxOrder(String memberMaxOrder) {
        this.memberMaxOrder = memberMaxOrder;
    }

    public String getVendorMinOrder() {
        return vendorMinOrder;
    }

    public void setVendorMinOrder(String vendorMinOrder) {
        this.vendorMinOrder = vendorMinOrder;
    }

    public String getVendorMaxOrder() {
        return vendorMaxOrder;
    }

    public void setVendorMaxOrder(String vendorMaxOrder) {
        this.vendorMaxOrder = vendorMaxOrder;
    }

    public String getFreeDeliveryMember() {
        return freeDeliveryMember;
    }

    public void setFreeDeliveryMember(String freeDeliveryMember) {
        this.freeDeliveryMember = freeDeliveryMember;
    }

    public String getFreeDeliveryVendor() {
        return freeDeliveryVendor;
    }

    public void setFreeDeliveryVendor(String freeDeliveryVendor) {
        this.freeDeliveryVendor = freeDeliveryVendor;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getSavingDate() {
        return savingDate;
    }

    public void setSavingDate(String savingDate) {
        this.savingDate = savingDate;
    }

    public String getCreateDateTimeStamp() {
        return createDateTimeStamp;
    }

    public void setCreateDateTimeStamp(String createDateTimeStamp) {
        this.createDateTimeStamp = createDateTimeStamp;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getFilterGroupId() {
        return filterGroupId;
    }

    public void setFilterGroupId(String filterGroupId) {
        this.filterGroupId = filterGroupId;
    }

    public String getListNo() {
        return listNo;
    }

    public void setListNo(String listNo) {
        this.listNo = listNo;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getStockUpdateDate() {
        return stockUpdateDate;
    }

    public void setStockUpdateDate(String stockUpdateDate) {
        this.stockUpdateDate = stockUpdateDate;
    }

    public String getStockUpdatePlatform() {
        return stockUpdatePlatform;
    }

    public void setStockUpdatePlatform(String stockUpdatePlatform) {
        this.stockUpdatePlatform = stockUpdatePlatform;
    }

    public String getPriceUpdateDate() {
        return priceUpdateDate;
    }

    public void setPriceUpdateDate(String priceUpdateDate) {
        this.priceUpdateDate = priceUpdateDate;
    }

    public String getPriceUpdatePlatform() {
        return priceUpdatePlatform;
    }

    public void setPriceUpdatePlatform(String priceUpdatePlatform) {
        this.priceUpdatePlatform = priceUpdatePlatform;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOpportunityProduct() {
        return opportunityProduct;
    }

    public void setOpportunityProduct(String opportunityProduct) {
        this.opportunityProduct = opportunityProduct;
    }

    public String getOpportunityStart() {
        return opportunityStart;
    }

    public void setOpportunityStart(String opportunityStart) {
        this.opportunityStart = opportunityStart;
    }

    public String getOpportunityFinish() {
        return opportunityFinish;
    }

    public void setOpportunityFinish(String opportunityFinish) {
        this.opportunityFinish = opportunityFinish;
    }

    public Object getDisablePaymentTypes() {
        return disablePaymentTypes;
    }

    public void setDisablePaymentTypes(Object disablePaymentTypes) {
        this.disablePaymentTypes = disablePaymentTypes;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getNumeric1() {
        return numeric1;
    }

    public void setNumeric1(String numeric1) {
        this.numeric1 = numeric1;
    }

    public String getDefaultSubProductId() {
        return defaultSubProductId;
    }

    public void setDefaultSubProductId(String defaultSubProductId) {
        this.defaultSubProductId = defaultSubProductId;
    }

    public Object getDisableCargoCompany() {
        return disableCargoCompany;
    }

    public void setDisableCargoCompany(Object disableCargoCompany) {
        this.disableCargoCompany = disableCargoCompany;
    }

    public String getHomepageSort() {
        return homepageSort;
    }

    public void setHomepageSort(String homepageSort) {
        this.homepageSort = homepageSort;
    }

    public String getMostSoldSort() {
        return mostSoldSort;
    }

    public void setMostSoldSort(String mostSoldSort) {
        this.mostSoldSort = mostSoldSort;
    }

    public String getNewestSort() {
        return newestSort;
    }

    public void setNewestSort(String newestSort) {
        this.newestSort = newestSort;
    }

    public String getEftRate() {
        return eftRate;
    }

    public void setEftRate(String eftRate) {
        this.eftRate = eftRate;
    }

    public String getRelatedProductsBlock1() {
        return relatedProductsBlock1;
    }

    public void setRelatedProductsBlock1(String relatedProductsBlock1) {
        this.relatedProductsBlock1 = relatedProductsBlock1;
    }

    public String getRelatedProductsBlock2() {
        return relatedProductsBlock2;
    }

    public void setRelatedProductsBlock2(String relatedProductsBlock2) {
        this.relatedProductsBlock2 = relatedProductsBlock2;
    }

    public String getRelatedProductsBlock3() {
        return relatedProductsBlock3;
    }

    public void setRelatedProductsBlock3(String relatedProductsBlock3) {
        this.relatedProductsBlock3 = relatedProductsBlock3;
    }

    public String getDefaultCategoryCode() {
        return defaultCategoryCode;
    }

    public void setDefaultCategoryCode(String defaultCategoryCode) {
        this.defaultCategoryCode = defaultCategoryCode;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Double getDiscountedSellingPriceTL() {
        return discountedSellingPriceTL;
    }

    public void setDiscountedSellingPriceTL(Double discountedSellingPriceTL) {
        this.discountedSellingPriceTL = discountedSellingPriceTL;
    }

    public List<Categoryy> getCategories() {
        return categories;
    }

    public void setCategories(List<Categoryy> categories) {
        this.categories = categories;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCbm() {
        return cbm;
    }

    public void setCbm(String cbm) {
        this.cbm = cbm;
    }

    public Object getWarrantyInfo() {
        return warrantyInfo;
    }

    public void setWarrantyInfo(Object warrantyInfo) {
        this.warrantyInfo = warrantyInfo;
    }

    public Object getDeliveryInfo() {
        return deliveryInfo;
    }

    public void setDeliveryInfo(Object deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Object getProductNote() {
        return productNote;
    }

    public void setProductNote(Object productNote) {
        this.productNote = productNote;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getPersonalizationId() {
        return personalizationId;
    }

    public void setPersonalizationId(String personalizationId) {
        this.personalizationId = personalizationId;
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle;
    }

    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords;
    }

    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription;
    }

    public String getSeoSettingsId() {
        return seoSettingsId;
    }

    public void setSeoSettingsId(String seoSettingsId) {
        this.seoSettingsId = seoSettingsId;
    }

    public String getGtip() {
        return gtip;
    }

    public void setGtip(String gtip) {
        this.gtip = gtip;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public List<Object> getPackageProducts() {
        return packageProducts;
    }

    public void setPackageProducts(List<Object> packageProducts) {
        this.packageProducts = packageProducts;
    }

    public List<Image2> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<Image2> imageUrls) {
        this.imageUrls = imageUrls;
    }

}
