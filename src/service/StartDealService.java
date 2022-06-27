package service;

import model.Deal;
import repository.RepositoryOperations;
import repository.Result;

public class StartDealService {

    RepositoryOperations database ;


    public StartDealService(RepositoryOperations database) {
        this.database = database;
    }

    public Result addDeal(Deal deal){
        return database.AddDeal(deal);
    }


    public Result endDeal(long dealId) throws Exception {
        return database.endDeal(dealId);
    }

//    public Deal updateDeal(Deal deal) {
//
//    }
}
