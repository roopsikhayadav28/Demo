package repository;

import model.Deal;

import java.util.HashMap;

public abstract class RepositoryOperations {



    public abstract Result AddDeal(Deal deal);

    public abstract  Result endDeal(Long dealID) throws Exception;

    abstract Deal updateDeal(Deal Deal) throws Exception;


}
