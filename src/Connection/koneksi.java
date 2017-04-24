/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Connection;

/**
 *
 * @author USER
 */
import java.sql.*;
public class koneksi {
    private Connection koneksi;
    public Connection connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil Koneksi");
        } catch (ClassNotFoundException ex) {
            System.out.println("Gagal Koneksi "+ex);
        }
        String url = "jdbc:mysql://localhost/siak";
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/siak","root","");
            System.out.println("Berhasil Koneksi Database");
        } catch (SQLException ex) {
            System.out.println("Gagal Koneksi Database "+ex);
        }
        return koneksi;
    }
    
}
