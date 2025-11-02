package com.arterecs.ecommerce.entities;

public class Product {

    private long productId;

    private String name;

    private String description;

    private long categoryId;

    public long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long cId) {
        categoryId = cId;
    }

}
