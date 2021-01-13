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
    public String itemId;
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

    
 //konstruksi item dari fields yg ada
    public Item(String id ,String barcode, String title, String description, String manufacturer, String url,String numberOfStock){
        //Item newItem = new Item();
        this.itemId =  itemId;
        this.barcode = barcode;
        this.title = title;
        this.description = description;
        this.manufacturer = manufacturer;
        this.url = url;
        this.numberOfStock = Integer.parseInt(numberOfStock);
        
        //return newItem;
    }
   
    public String getId() {
        return itemId;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getTitle() {
        return title;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getURL() {
        return URL;
    }  
    
    public String getDescription() {
        return description;
    }
    
    public int getNumberOfStock() {
        return numberOfStock;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public void setNumberOfStock(int numberOfStock) {
        this.numberOfStock = numberOfStock;
    }
}
