/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.databaseconnectionlab6;

import java.sql.SQLException;
import java.util.List;
import models.Product;
import utils.DatabaseUtils;

/**
 *
 * @author eboka
 */
public class DatabaseConnectionLab6 {
// CRUD - Create Read Update and Delete
    public static void main(String[] args) throws SQLException {
// System.out.println("Hello World!");

    DatabaseUtils dbUtils = new DatabaseUtils();
    List<Product> products = dbUtils.getProducts();
    
    for (Product product : products){
        System.out.println(product.toString());
         }
    
//    System.out.println("======Insertion=====");
//    Product p1 = new Product("Apple", 15);
//    Product p2 = new Product("Banana", 25);
//    
//    dbUtils.insertProduct(p1);
//    dbUtils.insertProduct(p2);
//    System.out.println("Insertion DONE");
    
//    System.out.println("======Update=====");
//    Product p1 = new Product("LaTx", 14);
//    Product p2 = new Product("Rubr", 26);
//    
//    dbUtils.updateProduct(p1);
//    dbUtils.updateProduct(p2);

//    System.out.println("======Deletion=====");
//   
//    dbUtils.deleteProduct(5);
//    dbUtils.deleteProduct(6);
//    
//    System.out.println("DELETION DONE");

//    dbUtils.close();
//    
//    products = dbUtils.getProducts();
//    for (Product product : products){
//        System.out.println(product.toString());
//    }
    }
}
