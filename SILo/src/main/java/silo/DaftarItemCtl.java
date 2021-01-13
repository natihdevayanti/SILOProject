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
public class DaftarItemCtl {
    private DBHandler dbHandler;
    private Item item[];
    private MainPage mainpage;
    
    public DaftarItemCtl(DBHandler dbHandler, MainPage mainpage){
        this.dbHandler = dbHandler;
        this.mainpage = mainpage;
    }
    
    public void getListItem(){
       
        //Object[] results =   dbHandler.getListItem();
        List<Item> items = dbHandler.getListItem();
        mainpage.showListItem(items);
    }
    
    
    public void searchItem(String keyword){
        List<Item> items = dbHandler.searchItem(keyword);
        mainpage.showListItem(items);
    }
}
