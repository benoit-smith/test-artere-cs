package com.arterecs.ecommerce.entities;

public class Product {

    private Long productId;

    private String name;

    private Double price;

    private Long stock;

    private Long categoryId;

    public Product() {
        super();
    }

    public Product(Long productId, String name, Double price, Long stock, Long categoryId) {
        super();
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
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

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

}
