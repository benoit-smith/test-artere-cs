package com.arterecs.ecommerce.services;

import com.arterecs.ecommerce.entities.Category;
import com.arterecs.ecommerce.entities.Product;

public class ProductService {

    public Product getProduct(Long productId) {
        return null; //TODO retrieve the unique Product identified by productId
    }

    public Product createOrUpdateProduct(Long product, String name, Double price, Long stock, Long categoryId) {
        Product ret;
        if (productId != null) {
            ret = this.getProduct(productId);
        } else {
            ret = new Product();
        }
        ret.setName(name);
        ret.setPrice(price);
        ret.setStock(stock);
        ret.setCategoryId(categoryId);
        //TODO save - if it's a new entity, set an incrementally generated productId

        return ret;
    }

    public void deleteProduct(Product productId) {
        //TODO delete Product entity by productId
    }

}
