package com.nttdata.Product.controller;

import com.nttdata.Product.dao.ProductDao;
import com.nttdata.Product.model.Product;
import com.nttdata.Product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    ProductDao productDao;

    @GetMapping("/product")
    public List<Product> getProductAll(){
        return productService.getProductAll();
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable Integer id){
        return productService.getProductById(id);
    }

    @PostMapping("/product")
    public void save(Product product){
        productDao.save(product);
    }

    @DeleteMapping("/product/{id}")
    public void delete(@PathVariable Integer id){
        productDao.deleteById(id);
    }

    @PutMapping("/product")
    public void update(@RequestBody Product product){
        productDao.save(product);
    }

}
