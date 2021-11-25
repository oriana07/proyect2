package com.nttdata.Product.service;
import java.util.List;
import com.nttdata.Product.model.Product;

public interface ProductService {

    List<Product> getAll();

    Product getById(Integer id);

    void save(Product product);

    void deleteById(Integer id);

    void updateBalance(Product product);

    List<Product> getProductIdClient(Integer id);

}
