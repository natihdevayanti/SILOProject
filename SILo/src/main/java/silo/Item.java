/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silo;
import java.util.Vector;
/**
 *
 * @author ASUS
 */
public class Item {
    public int itemId;
    private String barcode;
    private String title;
    private String description;
    private String manufacturer;
    private String url;
    private int numberOfStock;
   
   
    
    public Item(String[] row) {
        this(
                row[0],
                row[1],
                row[2],
                row[3],
                row[4],
                row[5],
                row[6]
        );
    }
    
    public String toString() {
        String res = "id: " + itemId + "\n"
                + "Barcode: " + barcode + "\n"
                + "Title: " + title + "\n"
                + "Desciption: " + description + "\n"
                + "Manufacturer: " + manufacturer + "\n"
                + "URL: " + url + "\n"
                + "Stock: " + numberOfStock + "\n";
        return res;
    }
    
    public void setStock(int stock){
        this.numberOfStock = stock;
    }
    
    public void editItemDescription(String desc){
        this.description = desc;
    }
    
    public Item createItem(int id ,char barcode, String title, String desc, String manufacturer, String Url,int stock){
        Item newItem = new Item();
        newItem.itemId = id;
        newItem.barcode = barcode;
        newItem.title = title;
        newItem.description = desc;
        newItem.manufacturer = manufacturer;
        newItem.url = url;
        newItem.numberOfStock = Integer.parseInt(numberOfStock);
        
        return newItem;
    }
    
    public void updateItem(int id ,char barcode, String title, String desc, String manufacturer, String Url,int stock){
        this.itemId = id;
        this.barcode = barcode;
        this.title = title;
        this.description = desc;
        this.manufacturer = manufacturer;
        this.url = url;
        this.numberOfStock = stock;
    }
    
    
}
