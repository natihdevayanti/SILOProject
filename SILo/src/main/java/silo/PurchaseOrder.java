/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silo;

/**
 *
 * @author ASUS
 */
public class PurchaseOrder {
    private int purchaseOrderStatus;
    
    public void changePublicOrderStatus(int status){
        this.purchaseOrderStatus = status;
    }
    
}
