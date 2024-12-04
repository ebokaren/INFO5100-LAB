/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BasicDesignPattern;

/**
 *
 * @author eboka
 * @version 1.0
 * Singleton Class Example
 * Ensures that only one instance of the class can be created.

 */
public class SingletonPattern {
    // Got help online
 private static SingletonPattern instance;

    // Private constructor to prevent instantiation from outside the class
    private SingletonPattern() {
    }

    // Public method to provide access to the single instance
    public static SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }
}


