package store.data.respositories;

import store.data.models.Buyer;

import java.util.List;

public interface BuyerRepository {
    Buyer save(Buyer buyer);
    Buyer findId(int id);
    List<Buyer> findAll();
     void delete(Buyer buyer);
}
