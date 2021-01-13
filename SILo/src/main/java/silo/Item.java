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
        String res = "ID: " + itemId + "\n"
                + "Barcode: " + barcode + "\n"
                + "Title: " + title + "\n"
                + "Desciption: " + description + "\n"
                + "Manufacturer: " + manufacturer + "\n"
                + "URL: " + url + "\n"
                + "Stock: " + numberOfStock + "\n";
        return res;
    }
    
 //konstruksi item dari fields yg ada
    public Item(String id ,String barcode, String title, String description, String manufacturer, String url,String numberOfStock){
        //Item newItem = new Item();
        this.itemId =  Integer.parseInt(id);
        this.barcode = barcode;
        this.title = title;
        this.description = description;
        this.manufacturer = manufacturer;
        this.url = url;
        this.numberOfStock = Integer.parseInt(numberOfStock);
        
        //return newItem;
    }
   
    //buat item baru
    public Item(String barcode, String title, String description, String manufacturer, String url,String numberOfStock){
       // this.itemId = id;
        this.barcode = barcode;
        this.title = title;
        this.description = description;
        this.manufacturer = manufacturer;
        this.url = url;
        this.numberOfStock = numberOfStock;
    }
    
       public Vector<String> toVector() {
        Vector<String> current = new Vector<>();
        current.add(String.valueOf(this.itemId));
        current.add(this.barcode);
        current.add(this.title);
        current.add(this.description);
        current.add(this.manufacturer);
        current.add(this.url);
        current.add(String.valueOf(this.numberOfStock));
        return current;
    }
    
    //    public void setStock(int stock){
//        this.numberOfStock = stock;
//    }
//    
//    public void editItemDescription(String desc){
//        this.description = desc;
//    }
//    
}
