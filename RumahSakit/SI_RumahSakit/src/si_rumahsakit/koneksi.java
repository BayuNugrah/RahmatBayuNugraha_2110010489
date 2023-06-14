/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package si_rumahsakit;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author rbayu
 */
public class koneksi {
    Connection connection;
    
    public Connection geteConnection() {
        try{
            connection = DriverManager("jdbc://localhost/sistem informasi rumah sakit","root","");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal koneksi\n"+e);   
        }
        return connection;
    }
    
}
