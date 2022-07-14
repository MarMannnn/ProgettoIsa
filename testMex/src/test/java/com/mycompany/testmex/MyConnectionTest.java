/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testmex;
import java.sql.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author marman
 */
public class MyConnectionTest {
    
    /** testiamo il metodo getConnection verificando che avvenga una connessione*/
    @Test
    public void getCommectionTest(){
        System.out.println("test metodo genConnection");
        MyConnection connect = new MyConnection();
        Connection con = connect.getConnection();
        assertFalse(con.equals(null));
    }
    
}
