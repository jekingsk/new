/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorted_billing;

/**
 *
 * @author HP
 */
public class cartmodel {

    
   private inventoryModel product;
    private int buyqty;
    private double price;
     public void setproduct(inventoryModel product) {
        this.product = product;
    }
      public void setbuyqty(int buyqty) {
        this.buyqty = buyqty;
    }
       public void setprice(double price) {
        this.price = price;
    }
     public inventoryModel getproduct() {
        return product;
    }
      public int getbuyqty() {
        return buyqty;
    }
       public double getprice() {
        return price;
    }
}
