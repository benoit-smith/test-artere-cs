package com.arterecs.ecommerce.services;

import com.arterecs.ecommerce.entities.Category;

public class CategoryService {

    public Category getCategory(Long categoryId) {
        return null; //TODO retrieve the unique Category identified by categoryId
    }

    public Category createOrUpdateCategory(Long categoryId, String name, String description, Long parentCategoryId) {
        Category ret;
        if (categoryId != null) {
            ret = this.getCategory(categoryId);
        } else {
            ret = new Category();
        }
        ret.setName(name);
        ret.setDescription(description);
        ret.setParentCategoryId(parentCategoryId);
        //TODO save Category ret - if it's a new entity, set an incrementally generated categoryId

        return ret;
    }

    public bindCategoryToParentCategory(Category category, Category parentCategory) {
        category.setParentCategoryId(parentCategory.getCategoryId());
        //TODO save Category category
    }

    public unbindCategoryFromParentCategory(Category category) {
        category.setParentCategoryId(null);
        //TODO save Category category
    }

    public void deleteCategory(Category categoryId) {
        //TODO delete Category entity by categoryId
    }

}
