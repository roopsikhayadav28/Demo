package model;

import java.util.Random;

public class Deal extends BaseModel{

    Product product;
    int ProductDiscount;
    Seller seller;
    DealTime time;
    int maxQtyLimit;

    //DO builder later

    public Deal(Product product, int productDiscount, Seller seller, DealTime time, int maxQtyLimit) {
        this.product = product;
        ProductDiscount = productDiscount;
        this.seller = seller;
        this.time = time;
        this.maxQtyLimit = maxQtyLimit;
    }

    public long getDealId(){
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public int getProductDiscount() {
        return ProductDiscount;
    }

    public Seller getSeller() {
        return seller;
    }

    public DealTime getTime() {
        return time;
    }

    public int getMaxQtyLimit() {
        return maxQtyLimit;
    }
}
