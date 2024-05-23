package org.example.service;

import org.example.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProductList();
    Product getProductByNameProduct(String name);
    Product saveProduct(Product product);
    void updateProduct(Product product);
    Product deleteProductByName(String product);
}
