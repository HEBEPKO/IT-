//package org.example.service.impl;
//
//import org.example.entity.Product;
//import org.example.repository.ProductJPARepository;
////import org.example.repository.impl.ProductRepositoryFromList;
//import org.example.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//@Service
//public class ProductServiceImpl implements ProductService {
//    @Autowired
//    private ProductJPARepository productRepository;
//
////    private ProductRepository productRepository = new ProductRepositoryJDBCImpl();
//
//    @Override
//    public List<Product> getProductList() {
//        return productRepository.findAll();
//    }
//
//    @Override
//    public Product getProductByNameProduct(String name) {
//        return productRepository.findById(name)
//                .orElse(new Product());
//    }
//
//    @Override
//    public Product saveProduct(Product product) {
//        return productRepository.save(product);
//    }
//
//    @Override
//    public void updateProduct(Product product) {
//        productRepository.save(product);
//    }
//
//    @Override
//    public Product deleteProductByName(String productName) {
//        Product productByName = getProductByNameProduct(productName);
//        if (productByName != null) {
//            productRepository.delete(productByName);
//        }
//        return productByName;
//    }
//}
