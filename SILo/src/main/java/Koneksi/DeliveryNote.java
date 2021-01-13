/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silo;
import java.util.Date;

/**
 *
 * @author ASUS
 */
    public class DeliveryNote {
    public String invoiceNumber;
    public String deliveryNoteNumber;
    public String customerName;
    public String customerEmail;
    private Date deliveryNoteOrderDate;
    private Date deliveryNoteDeliveryDate;
    private String deliveryNoteStatus;

    public void changeDeliveryNoteStatus(String status){
        this.deliveryNoteStatus = status;
    }
    
    public void setDeliverNoteDeliveryDate(Date deliveryDate){
        this.deliveryNoteDeliveryDate = deliveryDate;
    }
    
    public void showDeliveryNote(){
        System.out.println("Delivery Note Number:" + this.deliveryNoteNumber);
        System.out.println("Order Date          :" + this.deliveryNoteNumber);
        System.out.println("Delivery Date       :" + this.deliveryNoteNumber);
        System.out.println("Status              :" + this.deliveryNoteNumber);
        
    }
    
    
}
