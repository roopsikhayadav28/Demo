package controller;

import model.Deal;
import repository.Result;
import service.StartDealService;
 // seller/sellerid
public class SellerController {

    StartDealService dealService;


    public SellerController(StartDealService dealService) {
        this.dealService = dealService;
    }

 //apis : path {createdeal//id
    Result CreateDeal(Deal deal){
        return dealService.addDeal(deal);
    }

    Result EndDeal(Deal deal) throws Exception {
        return dealService.endDeal(deal.getDealId());
    }

//    Deal updateDeal(Deal deal){
//        return dealService.updateDeal(deal);
//    }
}
