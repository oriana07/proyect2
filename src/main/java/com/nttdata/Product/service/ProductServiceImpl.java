package com.nttdata.Product.service;

import com.nttdata.Product.dao.ProductDao;
import com.nttdata.Product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductService productService;

    @Autowired
    ProductDao productDao;

    @Override
    public Product getProductById(Integer id) {
        return productService.getProductById(id);
    }

    @Override
    public List<Product> getProductAll() {

        return productService.getProductAll();
    }

    @Override
    public void save(Product product) {

        productDao.save(product);

    }

    @Override
    public void deleteById(Integer id) {

        productDao.deleteById(id);

    }

    @Override
    public void updateBalance(Product product) {

        Product products=productService.getProductById(product.getId());
        products.setBalance(product.getBalance());
        productService.save(products);

    }
}
