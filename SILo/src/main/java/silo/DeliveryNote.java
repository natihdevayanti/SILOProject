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
    public int deliveryNoteInvoiceNumber;
    public int deliveryNoteNumber;
    public String deliveryNoteCustomerName;
    Date deliveryNoteOrderDate = new Date();
    Date deliveryNoteDeliveryDate = new Date();
    private String deliveryNoteStatus;
    
    SimpleDateFormat formatter;

    public DeliveryNote(int invoiceNumber, int deliveryNoteNumber, String customerName, Date orderDate, Date deliveryDate, String status) throws ParseException{
        this.deliveryNoteInvoiceNumber = invoiceNumber;
        this.deliveryNoteNumber = deliveryNoteNumber;
        this.deliveryNoteCustomerName = customerName;
        formatter =new SimpleDateFormat("dd-MMM-yyyy"); 
        this.deliveryNoteOrderDate = orderDate;
        this.deliveryNoteDeliveryDate = deliveryDate;
        this.deliveryNoteStatus = status;
    }
    
    public int getInvoiceNumber() {
        return deliveryNoteInvoiceNumber;
    }

    public int getDeliveryNoteNumber() {
        return deliveryNoteNumber;
    }

    public String getCustomerName() {
        return deliveryNoteCustomerName;
    }

    public Date getOrderDate() {
        return deliveryNoteOrderDate;
    }

    public Date getDeliveryDate() {
        return deliveryNoteDeliveryDate;
    }

    public String getStatus() {
        return deliveryNoteStatus;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.deliveryNoteInvoiceNumber = invoiceNumber;
    }

    public void setDeliveryNoteNumber(int deliveryNoteNumber) {
        this.deliveryNoteNumber = deliveryNoteNumber;
    }

    public void setCustomerName(String customerName) {
        this.deliveryNoteCustomerName = customerName;
    }

    public void setOrderDate(Date orderDate) {
        this.deliveryNoteOrderDate = orderDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryNoteDeliveryDate = deliveryDate;
    }

    public void setStatus(String status) {
        this.deliveryNoteStatus = status;
    }
    
    public String getOrderDateString() {
        return formatter.format(deliveryNoteOrderDate);
    }

    public String getDeliveryDateString() {
        return formatter.format(deliveryNoteDeliveryDate);
    }
    
    
}
