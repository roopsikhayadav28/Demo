package model;

public class Product extends  BaseModel{
    int price;
    String name;
    // Image image;
    Status status;

    public Product(int price, String name, Status status) {
        this.price = price;
        this.name = name;
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }
}
