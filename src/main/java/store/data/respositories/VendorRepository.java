package store.data.respositories;

import store.data.models.Buyer;
import store.data.models.Vendor;

import java.util.List;

public interface VendorRepository {
    Vendor save(Vendor vendor);
    Vendor findId(int id);
    List<Vendor> findAll();
    void delete(Vendor vendor);


}
