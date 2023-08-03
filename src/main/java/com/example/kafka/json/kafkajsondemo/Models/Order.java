package com.example.kafka.json.kafkajsondemo.Models;

public class Order {
    private int order_id;
    private String owner;

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", owner='" + owner + '\'' +
                '}';
    }
}
