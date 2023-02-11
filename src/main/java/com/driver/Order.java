package com.driver;

public class Order {

    private String id;
    private int deliveryTime;

    public Order(String id, String deliveryTime) {
        // The deliveryTime has to converted from string
        // to int and then stored in the attribute


        // deliveryTime given in HH:MM format,
        // so first two characters of string -> hours
        // next characters, starting from 2nd index -> minutes
        // deliveryTime  = HH*60 + MM
        this.id = id;
        Integer hour = Integer.valueOf(deliveryTime.substring(0,2));
        Integer minutes = Integer.valueOf(deliveryTime.substring(2));
        this.deliveryTime = hour*60 + minutes;
    }

    public Order() {

    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {return deliveryTime;}
}
