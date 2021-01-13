/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.*;

import koneksi.*;

/**
 *
 * @author ASUS
 */
public class Koneksi {
     private Connection koneksi;
    
    public Connection Koneksi() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/silodb", "root", "");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch(SQLException e) {
			e.printStackTrace();
	}
        return koneksi;
    }
    
    public Connection getConn() {
		return koneksi;
	}
}
