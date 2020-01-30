package com.nisum.inventory.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductCategory implements InitializingBean, DisposableBean {

    @Value("Laptops")
    private String productCategoryName;
    @Value("1234")
    private int productCategoryId;
    private Category category;
    private List<Product> product;

    public List<Product> getProduct() {
        return product;
    }

    @Autowired
    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public int getProductCategoryId() {
        return productCategoryId;
    }

    //@Required
    public void setProductCategoryId(int productCategoryId) {
        this.productCategoryId = productCategoryId;
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

    @Autowired
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
