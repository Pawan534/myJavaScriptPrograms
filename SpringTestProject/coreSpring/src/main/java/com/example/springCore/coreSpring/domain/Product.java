package com.example.springCore.coreSpring.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.io.Serializable;
import java.util.List;
import java.util.List;

/*
As we will be transferring data from one system to another system, information will be passed in byte code.
it will break into packets and send the code
 */
public class Product implements Serializable, InitializingBean, DisposableBean {

    private List<Integer> productId;
    private List<Double> productPrice;
    private List<String> productName;

    public void setProductId(List<Integer> productId) {
        this.productId = productId;
    }

    public void setProductPrice(List<Double> productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductName(List<String> productName) {
        this.productName = productName;
    }

    public List<Integer> getProductId() {
        return productId;
    }

    public List<Double> getProductPrice() {
        return productPrice;
    }

    public List<String> getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productPrice=" + productPrice +
                ", productName=" + productName +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside Destroy method of Product class");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside Init method of Product class");
    }
}
