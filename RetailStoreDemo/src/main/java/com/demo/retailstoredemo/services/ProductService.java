package com.demo.retailstoredemo.services;

import com.demo.retailstoredemo.models.PartnerDetail;
import com.demo.retailstoredemo.models.ProductDetail;
import com.demo.retailstoredemo.models.ProductType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<ProductDetail> listProducts = new ArrayList<>(

            Arrays.asList(
                    new ProductDetail(1, "Eggs", 20, ProductType.Groceries),
                    new ProductDetail(2, "Shoes", 40, ProductType.Clothes),
                    new ProductDetail(3, "Panadol", 99, ProductType.Pharmacy),
                    new ProductDetail(4, "Sofa", 12, ProductType.Furniture)
            )


    );

    public ProductDetail saveProduct(ProductDetail productDetail){
        listProducts.add(productDetail);
        return productDetail;
    }

    public ProductDetail editProduct(Integer id, ProductDetail productDetail){
        for (int i = 0; i < listProducts.size(); i++){
            ProductDetail product = listProducts.get(i);
            if(product.getId().equals(id)){
                listProducts.set(i, productDetail);
            }
        }
        return productDetail;
    }

    public List<ProductDetail> allProducts(){
        return listProducts;
    }

    public ProductDetail getProduct(Integer id){
        return (ProductDetail) listProducts.stream().filter(product -> product.getId().equals(id));
    }

    public void deleteProduct(Integer id){
        for (int i = 0; i < listProducts.size(); i++){
            ProductDetail product = listProducts.get(i);
            if(product.getId().equals(id)){
                listProducts.remove(product);
            }
        }
    }

}
