package model;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Seller extends BaseModel{
    User user;
    ArrayList<Product> products;

    public Seller(User user, ArrayList<Product> products) {
        this.user = user;
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
