package com.nisum.inventory.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderBOImpl implements OrderBO {

    @Autowired
    private OrderDAO orderDAO;

    public OrderDAO getOrderDAO() {
        return orderDAO;
    }

    public void setOrderDAO(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    @Override
    public void placeOrder() {
        System.out.println("Placing an order ");
        orderDAO.createOrder();
    }
}
