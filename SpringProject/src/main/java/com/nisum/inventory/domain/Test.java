package com.nisum.inventory.domain;

import com.nisum.inventory.repository.DatabaseDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;


public class Test {

    private static Consumer<Category> categoryDetails = (product) -> System.out.println("Category Details -> " + product.getCategoryId() + " " + product.getCategoryName());
    private static Consumer<ProductCategory> productCategory = (product) -> System.out.println("Product Category Details -> " + product);
    private static Consumer<Product> prodNames = (product -> System.out.println("Product Names --> " +product.getProductName() + " : "));
    private static Consumer<Product> prodIds = (product -> System.out.println("Product Ids --> " +product.getProductId() + " : " ));
    private static Consumer<Product> prodPrices = (product -> System.out.println("Product Prices --> " +product.getProductPrice()));

    public static void main(String[] args) throws IOException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/java/beans.xml");



        System.out.println("\nCreating Beans with Collections");
        System.out.println("**********************************");
        ProductCategory productList = (ProductCategory) ctx.getBean("productCategory");
        List<Product> getAllProducts = productList.getProduct();
        categoryDetails.accept(productList.getCategory());
        productCategory.accept(productList);
        getAllProducts.forEach(prodIds.andThen(prodNames).andThen(prodPrices));


        //Db Connection

        DatabaseDAO databaseDAO = (DatabaseDAO) ctx.getBean("database");
        System.out.println(databaseDAO);


    }
}
