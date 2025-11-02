package com.arterecs.ecommerce.services;

import com.arterecs.ecommerce.entities.*;
import java.util.List;
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

}
