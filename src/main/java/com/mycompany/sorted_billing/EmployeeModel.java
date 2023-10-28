package com.mycompany.sorted_billing;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class EmployeeModel {

    private int id;
    private String firstName = "";
    private String lastName = "";
    private String phonenNo = "";
    private String storeID = "";
    private String email = "";
    private String salary = "";
    private String gender = "";
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the phonenNo
     */
    public String getPhonenNo() {
        return phonenNo;
    }

    /**
     * @param phonenNo the phonenNo to set
     */
    public void setPhonenNo(String phonenNo) {
        this.phonenNo = phonenNo;
    }

    /**
     * @return the storeID
     */
    public String getStoreID() {
        return storeID;
    }

    /**
     * @param storeID the storeID to set
     */
    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    /**
     * @return the salary
     */
    public String getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(String salary) {
        this.salary = salary;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

   /* void setstoreID(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/

   

}
