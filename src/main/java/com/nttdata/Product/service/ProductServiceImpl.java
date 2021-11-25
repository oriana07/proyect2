package com.nttdata.Product.service;

import com.nttdata.Product.model.Product;
import com.nttdata.Product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }


    @Override
    public Product getById(Integer id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);

    }

    @Override
    public void deleteById(Integer id) {
        productRepository.deleteById(id);

    }

    @Override
    public void updateBalance(Product product) {

        Product productDB=productRepository.getById(product.getId();
        productDB.setBalance(product.getBalance());
        productRepository.save(productDB);

    }

    @Override
    public List<Product> getProductIdClient(Integer id) {
        return productRepository.findAll().stream().filter(product ->getProductIdClient().equals(id)).collect(Collectors.toList());
    }
}
