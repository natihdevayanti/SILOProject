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
public class Invoice {
    public int invoiceNumber;
    private int poNumber;
    private String supplierName;
    private Date invoiceOrderDate;
    private Date invoiceDeliveryDate;
    private int invoiceStatus;
    
    public void changeInvoiceStatus(int status){
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
