package repository;

import model.Deal;
import model.Product;
import model.Status;
import model.UserProductStatus;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class InmemoryDatabase extends RepositoryOperations{

    HashMap<Long, Deal> dealInfo = new HashMap<Long, Deal>();

    //HashMap<ProductId, DealId> dealInfo = new HashMap<Long, Deal>();

    HashMap<Long, DealStatus> dealStatusInfo = new HashMap<>();

    HashMap<Product, Deal> productDealHashMap = new HashMap<>();

    ConcurrentHashMap<Product, UserProductStatus> userProductStatusConcurrentHashMap = new ConcurrentHashMap<>();

    @Override
    public Result AddDeal(Deal deal) {
        dealInfo.put(deal.getDealId(),deal);
        dealStatusInfo.put(deal.getDealId(),DealStatus.START);

        return  Result.SUCCESS;
    }

    @Override
    public Result endDeal(Long dealID) throws Exception {

        if(dealStatusInfo.get(dealID) != null){
            throw new Exception("No such deal is present");
        }else{
            dealStatusInfo.put(dealID,DealStatus.END);
        }
        return Result.SUCCESS;
    }

    @Override
    public Deal updateDeal(Deal Deal) throws Exception {
        return null;
    }




}
