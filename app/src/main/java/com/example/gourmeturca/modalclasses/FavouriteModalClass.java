package com.example.gourmeturca.modalclasses;

public class FavouriteModalClass {

    String ImageUrl;
    String ProductName;
    String SellingPrice;
    String SellingPriceVatIncludedNoDiscount;
    String Brand;


    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getSellingPrice() {
        return SellingPrice;
    }

    public void setSellingPrice(String sellingPrice) {
        SellingPrice = sellingPrice;
    }

    public String getSellingPriceVatIncludedNoDiscount() {
        return SellingPriceVatIncludedNoDiscount;
    }

    public void setSellingPriceVatIncludedNoDiscount(String sellingPriceVatIncludedNoDiscount) {
        SellingPriceVatIncludedNoDiscount = sellingPriceVatIncludedNoDiscount;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }
}
