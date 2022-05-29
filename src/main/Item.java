/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Dorota
 */
public class Item {
    private String name = "Domyślna nazwa";
    private String code = "Domyślny kod";
    private int price = 0;

    public Item(String name, String code, int price){
        this.name = name;
        this.code = code;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCode(){
        return code;
    }
    
    public void setCode (String code) {
        this.code = code;
    }
    
    public int getPrice(){
        return price;
    }
    
    public void setPrice(int proce) {
        this.price = price;
    }
}
