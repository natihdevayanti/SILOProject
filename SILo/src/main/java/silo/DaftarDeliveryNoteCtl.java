package silo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
/**
 *
 * @author ASUS
 */
public class DaftarDeliveryNoteCtl {
    private DBHandler dbHandler;
    private MainPage mainpage;
    
    public DaftarDeliveryNoteCtl(DBHandler dBHandler, MainPage mainpage){
        this.dbHandler = dBHandler;
        this.mainpage = mainpage;
    }
    
    public void getListDeliveryNote(){
        List<DeliveryNote> deliveryNotes = dbHandler.getListDeliveryNote();
        mainpage.showListDeliveryNote(deliveryNotes);
    }
    
    public void searchDeliveryNote(String keyword){
        List<DeliveryNote> ldn = dbHandler.searchDeliveryNote(keyword);
        mainpage.showListDeliveryNote(ldn);
    }
}
