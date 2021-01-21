/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silo;

/**
 *
 * @author putrinatih
 */
public class InvoiceCtl {
    
 private DBHandler dbHandler;
    private MainPage mainPage;
    private InvoiceDetailPage detailInvoicePage;
    
    int viewInvoiceIndex = 0;
    
    public InvoiceCtl(DBHandler dbHandler,MainPage mainpage, InvoiceDetailPage detailInvoicePage){
        this.dbHandler = dbHandler;
        this.mainPage = mainpage;
        this.detailInvoicePage = detailInvoicePage;
    }
    
    public void getInvoiceDescription(Invoice invoice, int index){
        
        detailInvoicePage.setVisible(true);
        detailInvoicePage.setCurrentInvoice(invoice);
        viewInvoiceIndex = index;
        
    }

    private Invoice[] createInvoice(String[] result) {
        return null;
    }

    void requestChangeStatus(String status, String invoiceNumber) {
//        detailInvoicePage.setVisible(false);
        dbHandler.changeInvoiceStatus(status, invoiceNumber);
        
        mainPage.refreshInvoiceList();
    }
    
    void closeInvoiceDetailPage(){
        detailInvoicePage.setVisible(false);
    }
}
