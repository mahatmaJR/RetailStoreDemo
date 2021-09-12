package com.demo.retailstoredemo.controller;

import com.demo.retailstoredemo.models.PartnerDetail;
import com.demo.retailstoredemo.models.ProductDetail;
import com.demo.retailstoredemo.services.PartnerService;
import com.demo.retailstoredemo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    //Endpoints to perform normal CRUD operation on product details
    @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
    public int saveProduct(ProductDetail productDetail){
        ProductDetail product = productService.saveProduct(productDetail);
        return product.getId();
    }

    @RequestMapping(value = "/editProduct/{id}", method = RequestMethod.PUT)
    public ProductDetail editProduct(@PathVariable Integer id, @RequestBody ProductDetail product){
        productService.editProduct(id, product);
        return product;
    }

    @RequestMapping(value = "/deleteProduct/{id}", method = RequestMethod.DELETE)
    public Boolean deleteProduct(@PathVariable Integer id){
        productService.deleteProduct(id);
        return true;
    }

    @RequestMapping(value = "/product/{id}")
    public ProductDetail getProduct(@PathVariable Integer id){
        return productService.getProduct(id);
    }

    @RequestMapping("/allProducts")
    public List<ProductDetail> allProducts(){
        List<ProductDetail> allProducts = productService.allProducts();
        return allProducts;
    }

}
