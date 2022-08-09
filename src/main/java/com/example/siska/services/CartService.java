package com.example.siska.services;

import com.example.siska.Cart;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Scope(scopeName = "prototype")
@Service
public class CartService {
    private final Cart cart = new Cart(new ArrayList<>());
    @PostConstruct
    public void setup() {
        System.out.println("Service is Created");
    }

    public String addProduct(int... id) {
        for (int orderId : id) {
            cart.add(orderId);
        }
        if (id.length == 1) {
            return "Product " + Arrays.toString(id) + " added to your cart";

        } else {
            return "Products " + Arrays.toString(id) + " added to your cart";
        }



    }

    public List<Integer> getCart() {
        return cart.getOrder();
    }
}
