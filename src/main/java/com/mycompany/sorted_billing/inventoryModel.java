/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorted_billing;

/**
 *
 * @author HP
 */
public class inventoryModel {
    private int id;
    private String catagory;
    private String item;
    private String Qty;
    private String price;

    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }
    
    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setQty(String Qty) {
        this.Qty = Qty;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCatagory() {
        return catagory;
    }

    public String getItem() {
        return item;
    }

    public String getQty() {
        return Qty;
    }

    public String getPrice() {
        return price;
    }
}
