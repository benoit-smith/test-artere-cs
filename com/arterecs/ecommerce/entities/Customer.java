package com.arterecs.ecommerce.entities;

public class Customer {

    private Long customerId; // Unique identifier
    private String name;

    public Customer() {
        super();
    }

    public Customer(Long customerId, String name) {
        super();
        this.customerId = customerId;
        this.name = name;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
