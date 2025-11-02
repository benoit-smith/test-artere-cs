package com.arterecs.ecommerce.entities;

public class Cart {

    private Long cartId; // Unique identifier
    private Long customerId;
    private Long productId;
    private Long count;

    public Cart() {
    }

    public Long getCartId() {
        return cartId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public Long getProductId() {
        return productId;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

}
