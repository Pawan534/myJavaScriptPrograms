package com.example.springCore.coreSpring.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class ProductCategory implements InitializingBean, DisposableBean {

    private List<Product> product;
    private String productCategoryName;
    private int productCategoryId;
    private Category category;

    public int getProductCategoryId() {
        return productCategoryId;
    }

    @Required
    public void setProductCategoryId(int productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "product=" + product +
                ", productCategoryName='" + productCategoryName + '\'' +
                ", productCategoryId=" + productCategoryId +
                ", categoryId=" + category.getCategoryId() +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside Destroy method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside Init method");
    }
}
