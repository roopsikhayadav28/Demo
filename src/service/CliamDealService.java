package service;

import model.Product;
import model.User;
import model.UserProductStatus;
import repository.RepositoryOperations;

public class CliamDealService {

    RepositoryOperations database;


    public CliamDealService(RepositoryOperations database) {
        this.database = database;
    }

    UserProductStatus ClaimDiscountedProduct(Product product, User user ){
        // todo
       return new UserProductStatus();
    }
}
