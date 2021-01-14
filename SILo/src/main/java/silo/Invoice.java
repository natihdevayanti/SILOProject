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
import java.text.SimpleDateFormat;
import java.util.Date;

public class Invoice {
    private int invoiceNumber;
    private int PONumber;
    private String supplierName;
    Date invoiceOrderDate = new Date();
    Date invoiceDeliveryDate = new Date();
    private String invoiceStatus;
    
    SimpleDateFormat formatter;

    public Invoice(int invoiceNumber, int PONumber, String supplierName, Date invoiceOrderDate, Date invoiceDeliveryDate, String invoiceStatus){
        this.invoiceNumber = invoiceNumber;
        this.PONumber = PONumber;
        this.supplierName = supplierName;
        this.invoiceOrderDate = invoiceOrderDate;
        this.invoiceDeliveryDate = invoiceDeliveryDate;
        this.invoiceStatus = invoiceStatus;
        
        formatter =new SimpleDateFormat("dd-MMM-yyyy"); 
    }
    
    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public int getPONumber() {
        return PONumber;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public Date getOrderDate() {
        return invoiceOrderDate;
    }

    public Date getDeliveryDate() {
        return invoiceDeliveryDate;
    }

    public String getStatus() {
        return invoiceStatus;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setPONumber(int PONumber) {
        this.PONumber = PONumber;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setOrderDate(Date invoiceOrderDate) {
        this.invoiceOrderDate = invoiceOrderDate;
    }

    public void setDeliveryDate(Date invoiceDeliveryDate) {
        this.invoiceDeliveryDate = invoiceDeliveryDate;
    }

    public void setStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }
    
    public String getOrderDateString() {
        return formatter.format(invoiceOrderDate);
    }

    public String getDeliveryDateString() {
        return formatter.format(invoiceDeliveryDate);
    }
}

