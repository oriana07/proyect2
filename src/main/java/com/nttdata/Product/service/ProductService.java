package com.nttdata.Product.service;
import java.util.List;
import com.nttdata.Product.model.Product;

public interface ProductService {

    Product getProductById(Integer id);

    List<Product> getProductAll();

    void save(Product product);

    void deleteById(Integer id);

    void updateBalance(Product product);



}
