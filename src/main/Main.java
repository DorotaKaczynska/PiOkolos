/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Dorota
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item item1  = new Item("czajnik", "W99990", 30000);
        Item item2 = new Item("garnek", "B00009", 60000);
        
        Cart cart = new Cart();
        cart.addItem(item1);
        cart.addItem(item2);
        
        cart.listItem();
    }
    
}
