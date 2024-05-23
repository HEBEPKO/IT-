//package org.example.controller;
//
////import org.example.entity.Product;
////import org.example.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/product")
//public class ProductController {
//
//    @Autowired
//    private ProductService productService;
////    private ProductService productService = new ProductServiceImpl();
//
//    /* CRUD -> Read */
//
//    @GetMapping()
//    public List<Product> getProductList(){
//      return productService.getProductList();
//    };
//
//    @GetMapping(params = "productName")
//    public Product getProductByNameProduct(@RequestParam String productName){
//        return productService.getProductByNameProduct(productName);
//    }
//
//    @GetMapping("/{productName}")
//    public Product getProductFromURL(@PathVariable String productName){
//        return productService.getProductByNameProduct(productName);
//    }
//
//    /* CRUD -> Create */
//
//    @PostMapping()
//    public Product createNewProduct(@RequestBody Product product){
//        productService.saveProduct(product);
//        return productService.getProductByNameProduct(product.getProductName());
//    }
//    /* CRUD -> Update */
//    @PutMapping()
//    public Product updateProduct(@RequestBody Product product){
//        productService.updateProduct(product);
//        return productService.getProductByNameProduct(product.getProductName());
//    }
//
//    /* CRUD -> Delete */
//    @DeleteMapping("/{productName}")
//    public Product deleteProduct(@PathVariable String productName){
//        return productService.deleteProductByName(productName);
//    }
//}
