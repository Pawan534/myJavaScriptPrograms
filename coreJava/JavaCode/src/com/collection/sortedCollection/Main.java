package com.collection.sortedCollection;

import java.util.HashMap;

public class Main {
    private static StockList stockList = new StockList();
    public static void main(String[] args) {

        StockItem temp = new StockItem("bread", 0.85, 100);
        stockList.addStock(temp);
        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.10, 10);
        stockList.addStock(temp);

        temp = new StockItem("chair", 52.50, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 100);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.10, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.10, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.90, 40);
        stockList.addStock(temp);

        temp = new StockItem("vase", 10.90, 30);
        stockList.addStock(temp);


        Basket basket = new Basket("Tim");
        sellItem(basket, "car", 1);
        System.out.println(basket);

        sellItem(basket, "car", 1);
        System.out.println(basket);

        sellItem(basket, "juice", 1);
        sellItem(basket, "spanner", 1);
        temp = new StockItem("flowers", 8.0, 40);
        stockList.addStock(temp);
        System.out.println(basket);
        stockList.items().get("car").adjustStock(100);
        System.out.println(stockList);


    }

    public static int sellItem(Basket basket, String item, int qty){
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("We dont sell "+ item);
            return 0;
        }

        if(stockList.sellStock(item, qty) !=0){
            basket.addToBasket(stockItem, qty);
            return qty;
        }

        return 0;

    }
}
