/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silo;

import java.util.List;
/**
 *
 * @author ASUS
 */
public class DaftarInvoiceCtl {
    private DBHandler dbHandler;
    private MainPage mainpage;
    
    public DaftarInvoiceCtl(DBHandler dbHandler, MainPage mainpage){
        this.dbHandler = dbHandler;
        this.mainpage = mainpage;
    }
    
    public void getListInvoice(){
        List<Invoice> invoices = dbHandler.getListInvoice();
        mainpage.showListInvoice(invoices);
    }
    
    private Invoice[] createInvoice(String[] results) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public void searchInvoice(String keyword){
        List<Invoice> inv = dbHandler.searchInvoice(keyword);
        mainpage.showListInvoice(inv);
    }
}
