package com.arterecs.ecommerce.entities;

public class Category {

    private Long categoryId; // Unique identifier
    private String name;
    private String description;
    private Long parentCategoryId;

    public Category() {
        super();
    }

    public Category(Long categoryId, String name, String description, Long parentCategoryId) {
        super();
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.parentCategoryId = parentCategoryId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

}
