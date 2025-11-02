package com.arterecs.ecommerce.entities;

public class Product {

    private Long productId;

    private String name;

    private Double price;

    private Long count;

    private Long categoryId;

    public Product() {
        super();
    }

    public Product(Long productId, String name, Double price, Long count, Long categoryId) {
        super();
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.count = count;
        this.categoryId = categoryId;
    }


    public Long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

}
