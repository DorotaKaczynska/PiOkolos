/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dorota
 */
public class Cart {
     public static List<Item> items = new ArrayList();

    
    public void addItem(Item item) {
        items.add(item);
    }
    
    public void listItem(){
        int suma = 0;
        for(Item item : items){
            suma += item.getPrice();
            System.out.println(item.getName() +" " + item.getCode());
        }
        System.out.println("Wartość koszyka: " + suma + " gr"
                + "");
    }
}
