package com.demo.retailstoredemo.services;

import com.demo.retailstoredemo.DAO.CustomerRepository;
import com.demo.retailstoredemo.DAO.ShoppingRepository;
import com.demo.retailstoredemo.models.CustomerDetail;
import com.demo.retailstoredemo.models.ShoppingDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ShoppingService {

    @Autowired
    ShoppingRepository shoppingRepo;

    List<ShoppingDetail> listShopping = new ArrayList<>(

//            Arrays.asList(
//                    new CustomerDetail(1, "Samuel", "Ngombi", "23-08-2018"),
//                    new CustomerDetail(2, "Mark", "Ochieng", "02-12-2020"),
//                    new CustomerDetail(3, "Susan", "Chebet", "03-07-2018"),
//                    new CustomerDetail(4, "Faith", "Mwikali", "29-01-2019")
//            )
    );

    public ShoppingDetail saveShopping(ShoppingDetail shopping){
        listShopping.add(shopping);
        return shopping;
    }

    public ShoppingDetail updateShopping(Integer id,ShoppingDetail shopping){
        for (int i = 0; i < listShopping.size(); i++){
            ShoppingDetail shop = listShopping.get(i);
            if(shop.getId().equals(id)){
                listShopping.set(i, shopping);
            }
        }
        return shopping;
    }

    public List<ShoppingDetail> allShoppings(){
        return listShopping;
    }

    public ShoppingDetail getShopping(Integer id){
        return (ShoppingDetail) listShopping.stream().filter(shopping -> shopping.getId().equals(id));
    }


    public void deleteShopping(Integer id){
        for (int i = 0; i < listShopping.size(); i++){
            ShoppingDetail shop = listShopping.get(i);
            if(shop.getId().equals(id)){
                listShopping.remove(shop);
            }
        }
    }

}
