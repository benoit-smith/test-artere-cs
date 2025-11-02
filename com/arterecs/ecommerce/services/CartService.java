package com.arterecs.ecommerce.services;

import com.arterecs.ecommerce.entities.*;
import java.util.*;
import java.util.stream.*;
import org.apache.commons.collections4.CollectionUtils;

public class CartService {

    private ProductService productService;

    public CartService(ProductService productService) {
        this.productService = productService;
    }

    public getCart(Long cartId) {
        return null; //TODO retrieve Cart entity by identifier cartId
    }

    public List<Cart> getCustomerCart(Long customerId) {
        return null; //TODO retrieve all Cart entities by customerId
    }

    public Long getCartTotalCost(Long customerId) {
        List<Cart> customerCart = this.getCustomerCart(Long customerId);
        if (CollectionUtils.isEmpty(customerCart)) {
            return 0d;
        }
        return customerCart.stream()
            .map(cart -> {
                Product product = productService.getProduct(cart.getProductId());
                return (Double) (cart.getCount() * product.getPrice());
            })
            .reduce(0, Double::sum);
    }

    public void addProductToCart(Long customerId, Product product, Long count) {
        List<Cart> customerCart = this.getCustomerCart(Long customerId);
        if (CollectionUtils.isEmpty(customerCart) || customerCart.stream().noneMatch(cart -> cart.getProductId().equals(product.getProductId()))) {
            Cart cart = new Cart();
            cart.setCustomerId(customerId);
            cart.setProductId(product.getProductId());
            cart.setCount(count);
            //TODO save Cart cart - since it's a new entity, set an incrementally generated cartId
        } else {
            this.updateProductCountInCart(customerId, product, count);
        }
    }

    public void updateProductCountInCart(Long customerId, Product product, Long count) {
        List<Cart> customerCart = this.getCustomerCart(Long customerId);
        if (CollectionUtils.isEmpty(customerCart)) {
            return;
        }
        Optional<Cart> optCart = customerCart.stream().filter(cart -> cart.getProductId().equals(product.getProductId())).findAny();
        if (optCart.isPresent()) {
            Cart productCart = optCart.get();
            if (productCart.getCount() <= count) {
                //TODO delete Cart productCart
            } else {
                productCart.setCount(productCart.getCart() + count);
                //TODO save Cart productCart
            }
        }
    }


}
