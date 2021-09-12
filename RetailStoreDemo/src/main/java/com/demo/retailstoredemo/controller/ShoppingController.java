package com.demo.retailstoredemo.controller;

import com.demo.retailstoredemo.models.ProductDetail;
import com.demo.retailstoredemo.models.ShoppingDetail;
import com.demo.retailstoredemo.services.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class ShoppingController {

    @Autowired
    ShoppingService shoppingService;

    //Endpoints to perform normal CRUD operation on shopping details
    @RequestMapping(value = "/addShopping", method = RequestMethod.POST)
    public int saveShopping(ShoppingDetail shoppingDetail){
        ShoppingDetail shop = shoppingService.saveShopping(shoppingDetail);
        return shop.getId();
    }

    @RequestMapping(value = "/editShopping/{id}", method = RequestMethod.PUT)
    public ShoppingDetail editShopping(@PathVariable Integer id, @RequestBody ShoppingDetail shop){
        shoppingService.updateShopping(id, shop);
        return shop;
    }

    @RequestMapping(value = "/deleteShopping/{id}", method = RequestMethod.DELETE)
    public Boolean deleteCustomer(@PathVariable Integer id){
        shoppingService.deleteShopping(id);
        return true;
    }

    @RequestMapping(value = "/shopping/{id}")
    public ShoppingDetail getShopping(@PathVariable Integer id){
        return shoppingService.getShopping(id);
    }

    @RequestMapping("/allShoppings")
    public List<ShoppingDetail> allShoppings(){
        List<ShoppingDetail> allShoppings = shoppingService.allShoppings();
        return allShoppings;
    }

    //Adds a product to a shopping list
    @RequestMapping("/addItemToCart/shoppingId")
    public void itemsSelected(@PathVariable Integer shoppingId, ProductDetail product){
        ShoppingDetail shopping = shoppingService.getShopping(shoppingId);
        shopping.addProductToShopping(product);
    }

    public  double totalBillDiscount (double totalBill){

        double value = 0.00;
        if (totalBill > 100){
            value = value + 5;
            totalBill = totalBill - 100;
            totalBillDiscount(totalBill);
        return value;
        }else return value;

    }

    @RequestMapping("/checkOutShopping")
    public void checkOut(ShoppingDetail shopping) {

        double bill = 0.00;
        List<ProductDetail> selectedProducts = shopping.getSelectedItems();
        for (int i = 0; i < selectedProducts.size(); i++){
            bill = bill + selectedProducts.get(i).getPrice();
        }
        double hundredDollarDiscount = totalBillDiscount(bill);
        double totalBill = bill - hundredDollarDiscount;
        double payableBill = 0.00;

        String customerType = shopping.getShopperType();

        switch (customerType){
            case "Employee":
                payableBill = totalBill - (0.3 * totalBill);
            case "Partner":
                payableBill = totalBill - (0.1 * totalBill);
            default:
                payableBill = totalBill - (0.05 * totalBill);
        }

    }

}
