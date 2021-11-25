package com.nttdata.Product.dao;

import com.nttdata.Product.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductDao extends CrudRepository<Product, Integer> {

    List<Product> findProductByIdClient(Integer idClient);
}
