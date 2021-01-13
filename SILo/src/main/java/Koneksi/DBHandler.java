/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;


import java.sql.*;
import java.util.List; 
import java.util.ArrayList;
/**
 *
 * @author putrinatih
 */
public class DBHandler {
    public List<String []> getItems() {
        List<Item> items = new ArrayList<Item>();
        try {
            Connection con = Koneksi.Koneksi();
            Statement stmt = new Koneksi().getConn();
            
            String sql = ""
            ArrayList<String[]> results = new ArrayList<> ();
            
            while (rs.next()) {
                String[] row = {
                    rs.getString("itemId"),
                    rs.getString("barcode"),
                    rs.getString("title"),
                    rs.getString("description"),
                    rs.getString("manufacturer"),
                    rs.getString("url"),
                    rs.getString("numberOfStock"),
                };
            }
        }catch(Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
