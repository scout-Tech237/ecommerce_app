package com.example.gourmeturca.modalclasses;

public class CategoriesModalClass {
    String ImageUrl;
    String name;
    String DefaultCategoryCode;

    public String getDefaultCategoryCode() {
        return DefaultCategoryCode;
    }

    public void setDefaultCategoryCode(String defaultCategoryCode) {
        DefaultCategoryCode = defaultCategoryCode;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
