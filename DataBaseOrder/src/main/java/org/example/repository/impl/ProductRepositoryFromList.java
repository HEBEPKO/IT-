package org.example.repository.impl;

import org.example.entity.Product;
import org.example.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

/*public class ProductRepositoryFromList implements ProductRepository {

    private List<Product> productList;

    public ProductRepositoryFromList() {
        productList = new ArrayList<>();
        productList.add(new Product("HOLSTEIN","Пиво\"HOLSTEN EXPORT\"5.4%(свет,бут)0.45л", 1.4));
        productList.add(new Product("TUB-ORG GREEN","Пиво\"TUBORG GREEN\"4.6%(свет,пэт)0.9л", 3.12));
        productList.add(new Product("HOLSTEIN","Пиво\"HOLSTEN EXPORT\"5.4%(свет,бут)0.45л", 1.4));
        productList.add(new Product("GARAGE ZERO GRAPEFRUIT","Нап.пив\"GARAGE ZERO GRAPEFRUIT\"(ж/б)0.45", 1.24));
        productList.add(new Product("GARAGE BLACK CHERRY","Нап.пив\"GARAGE BLACK CHERRY\"(бут)0.4л", 1.4));
        productList.add(new Product("HOLSTEIN","Пиво\"HOLSTEN EXPORT\"5.4%(свет,бут)0.45л", 1.4));
    }

    @Override
    public List<Product> getAllProduct() {
        return productList;
    }

    @Override
    public Product getProductByNameProduct(String name) {
        return productList.stream()
                .filter(product -> name.equals(product.getProductName()))
                .findFirst()
                .get();
    }

    @Override
    public void saveProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void updateProduct(Product product) {
        Product productFromRepository = getProductByNameProduct(product.getProductName());
        productFromRepository.setDescriptionProduct(product.getDescriptionProduct());
        productFromRepository.setPrice(product.getPrice());
    }

    @Override
    public Product deleteProductByName(String product) {
        Product productByName = getProductByNameProduct(product);
        productList.remove(productByName);

        return productByName;
    }


}*/
