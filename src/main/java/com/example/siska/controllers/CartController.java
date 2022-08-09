package com.example.siska.controllers;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.siska.services.CartService;

import javax.annotation.PostConstruct;
import java.util.List;

@Scope(scopeName = "session")
@RestController
@RequestMapping("/store/order")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }
    @PostConstruct
    public void setup(){
        System.out.println("Controller is created");
    }
    @GetMapping("/add")
    public String add(@RequestParam("item") int... id) {
        return cartService.addProduct(id);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return cartService.getCart();



    }

}
