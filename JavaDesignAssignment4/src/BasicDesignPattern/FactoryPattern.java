/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BasicDesignPattern;

/**
 *
 * @author eboka
 * @version 3.0
 * @since 3.0
 * Factory Pattern Example
 * Provides a way to create objects without specifying the exact class to be instantiated.
 * 
 */
abstract class Product {
     // Got help online
    public abstract String getDescription();
}

class ConcreteProductA extends Product {
    @Override
    public String getDescription() {
        return "Concrete Product A";
    }
}

class ConcreteProductB extends Product {
    @Override
    public String getDescription() {
        return "Concrete Product B";
    }
}

class FactoryPattern {
    public static Product createProduct(String type) {
        if (type.equalsIgnoreCase("A")) {
            return new ConcreteProductA();
        } else if (type.equalsIgnoreCase("B")) {
            return new ConcreteProductB();
        }
        throw new IllegalArgumentException("Invalid product type");
    }
}
