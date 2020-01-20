package com.collection.sortedCollection;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList(){
        this.list = new LinkedHashMap<>();
    }


    public int addStock(StockItem item){
        if(item!=null){
            //checking if already have qty of this item
            StockItem inStock = list.getOrDefault(item.getName(), item);
            //StockItem inStock = list.get(item.getName());
            if(inStock!=item){
                item.adjustStock(inStock.getQuantityStock());
            }
            list.put(item.getName(), item);
            return item.getQuantityStock();
        }
        return 0;
    }


    public int sellStock(String sellItem, int sellQty){

        StockItem inStock = list.getOrDefault(sellItem, null);
        if((inStock!=null) && sellQty>0 && (inStock.getQuantityStock()>=sellQty)){
             inStock.adjustStock(-sellQty);
             return sellQty;
        }
        return 0;
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    public Map<String, StockItem> items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for(Map.Entry<String, StockItem> item: list.entrySet()){
            StockItem stockItem = item.getValue();
            double itemValue = stockItem.getPrice() * stockItem.getQuantityStock();
            s = s + stockItem + ".\tThere are " + stockItem.getQuantityStock() + " in stock. Value of items: $" + String.format("%.2f", itemValue) + "\n";
            totalCost +=itemValue;
        }
        return (s + "Total stock value $" + totalCost);
    }
}
