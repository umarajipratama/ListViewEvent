package com.example.umarajipratama.listviewevent;

/**
 * Created by Umar Aji Pratama on 15/10/2016.
 */
public class product {
    private int id;
    private String name;
    private double price;

    public product(){
        super();
    }

    public product(int id, String name, double price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.id + ". " + this.name + " [$" + this.price + "]";
    }
}
