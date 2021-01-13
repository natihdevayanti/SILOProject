/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Invoice {
    public String invoiceNumber;
    public String poNumber;
    public String supplierName;
    public Date invoiceOrderDate;
    public Date invoiceDeliveryDate;
    public String invoiceStatus;
    
    public void changeInvoiceStatus(String status){
        this.invoiceStatus = status;
    }
    
    public void setInvoiceDeliveryDate(Date deliveryDate){
        this.invoiceDeliveryDate = deliveryDate;
    }
    
    public void showInvoiceDescription(){
        System.out.println("Invoice Number  :" + this.invoiceNumber);
        System.out.println("Po Number       :" + this.poNumber);
        System.out.println("Supplier        :" + this.supplierName);
        System.out.println("Order Date      :" + this.invoiceOrderDate);
        System.out.println("Delivery Date   :" + this.invoiceDeliveryDate);
        System.out.println("Status          :" + this.invoiceStatus);
    }
}
