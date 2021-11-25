package com.nttdata.Product.controller;

import com.nttdata.Product.model.Product;
import com.nttdata.Product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("/product/{id}")
    public Product getById(PathVariable Integer id){
        return productService.getById(id);
    }

    @PostMapping("/product")
    public void save(Product product){
        productService.save(product);
    }

    @DeleteMapping("/product/{id}")
    public void delete(PathVariable Integer id){
        productService.deleteById(id);
    }

    @PutMapping("/product")
    public void update(@RequestBody Product product){
        productService.save(product);
    }

    @GetMapping("/product/client/{id}")
    public List<Product> getProductByIdClient(@PathVariable Integer id){
        return productService.getProductIdClient(id);
    }
}
