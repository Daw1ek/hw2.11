package com.example.siska;

import java.util.List;
import java.util.Objects;

public class Cart {

    private List<Integer> order;

    public Cart(List<Integer> order) {

        this.order = order;
    }


    public List<Integer> getOrder() {
        return order;
    }

    public void setOrder(List<Integer> order) {
        this.order = order;
    }

    public void add(int i) {
        this.order.add(i);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return order.equals(cart.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order);
    }

}
