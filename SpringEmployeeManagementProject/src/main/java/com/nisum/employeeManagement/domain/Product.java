package com.nisum.employeeManagement.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {

    @Id
    @Column(name="id")
    private int productId;
    @Column
    private String description;
    @Column
    private double price;
    @Column
    private String productName;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return productName;
    }

    public void setName(String name) {
        this.productName = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", name='" + productName + '\'' +
                '}';
    }
}
