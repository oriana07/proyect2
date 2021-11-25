package com.nttdata.Product.repository;

import com.nttdata.Product.model.Product;
import com.nttdata.Product.model.ProductType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProductTypeRepository {
    public Stream<ProductType> productTypeGet() {
        List<ProductType> productType = new ArrayList<>();
        productType.add(new ProductType(1, "Ahorro","Cuenta de Ahorros"));
        productType.add(new ProductType(1, "Corriente","Cuenta Corriente"));
        productType.add(new ProductType(1, "Plazo fijo","Cuenta de Plazo fijo"));

        return productType.stream();
    }

}
