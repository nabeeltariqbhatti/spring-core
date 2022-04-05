package model;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/5/2022
 * @Time at 11:00 PM
 */
public class Product {

    private int id;
    private String name;
    private double price;

    public int getId() {
        return id;
    }

    public Product setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Product setPrice(double price) {
        this.price = price;
        return this;
    }
}
