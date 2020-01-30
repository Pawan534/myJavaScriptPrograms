package com.nisum.inventory.order;

import org.springframework.stereotype.Component;

@Component
public class OredrDAOImpl implements OrderDAO {
    @Override
    public void createOrder() {
        System.out.println("Creating order in DB");
    }
}
