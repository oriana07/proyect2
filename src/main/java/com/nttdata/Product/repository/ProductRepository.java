package com.nttdata.Product.repository;

import com.nttdata.Product.model.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProductRepository {
    public Stream<Product> productGet() {
        List<Product> product = new ArrayList<>();
        product.add(new Product(1,"Ahorros","193-789",new BigDecimal(2.500),5.4,4,1,"Active"));
        product.add(new Product(1,"Corriente","194-123",new BigDecimal(5000),0.0,10,2,"Active"));
        product.add(new Product(1,"Plazo Fijo","195-456",new BigDecimal(7.500),2.3,3,3,"Active"));
        return product.stream();
    }

}