/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silo;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author ASUS
 */
    public class DeliveryNote {
    public int invoiceNumber;
    public int deliveryNoteNumber;
    public String customerName;
    Date orderDate = new Date();
    Date deliveryDate = new Date();
    private String deliveryNoteStatus;
    
    SimpleDateFormat formatter;

    public DeliveryNote(int invoiceNumber, int deliveryNoteNumber, String customerName, Date orderDate, Date deliveryDate, String status) throws ParseException{
        this.invoiceNumber = invoiceNumber;
        this.deliveryNoteNumber = deliveryNoteNumber;
        this.customerName = customerName;
        formatter =new SimpleDateFormat("dd-MMM-yyyy"); 
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.deliveryNoteStatus = status;
    }
    
    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public int getDeliveryNoteNumber() {
        return deliveryNoteNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public String getStatus() {
        return deliveryNoteStatus;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setDeliveryNoteNumber(int deliveryNoteNumber) {
        this.deliveryNoteNumber = deliveryNoteNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setStatus(String status) {
        this.deliveryNoteStatus = status;
    }
    
    public String getOrderDateString() {
        return formatter.format(orderDate);
    }

    public String getDeliveryDateString() {
        return formatter.format(deliveryDate);
    }
    
    
}
