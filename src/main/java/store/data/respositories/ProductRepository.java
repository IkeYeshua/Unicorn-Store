package store.data.respositories;

import store.data.models.Buyer;
import store.data.models.Product;

import java.util.List;

public interface ProductRepository {
    Product save(Product product);
    Product findId(int id);
    List<Product> findAll();
    void delete(Product product);

}
