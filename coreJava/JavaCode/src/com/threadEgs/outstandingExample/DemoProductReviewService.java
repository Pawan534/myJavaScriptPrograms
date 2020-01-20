package com.threadEgs.outstandingExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//TODO
public class DemoProductReviewService {

    public static void main(String[] args) {

        List<String> productReviews = new ArrayList<>();
        List<String> productBadReviews = new ArrayList<>();
        Random random = new Random();

        productReviews.add("Product is excellent");
        productReviews.add("Quality is good");
        productReviews.add("Product is delivered as expected");
        productReviews.add("Product look awsome when compare with product image");

        productBadReviews.add("Worst product");
        productBadReviews.add("Not reach as per the expectation");
        productBadReviews.add("Bad quality");

        ProductReviewsService temp = new ProductReviewsService();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<100; i++){
                    temp.addProduct(random.nextInt(100+i));
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<100; i++){
                    temp.addProductReview(random.nextInt(100+i),productReviews.get(1));
                }
            }
        });





    }
}
