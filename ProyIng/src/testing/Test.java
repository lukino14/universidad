/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.sql.SQLException;
import org.javalite.activejdbc.Base;
import src.dominio.Person;
import src.persistencia.Connection;

/**
 *
 * @author Cuello Lucas Oscar
 */
public class Test {
    
    public static void main(String[] args) throws SQLException {
        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/pruebausuario", "root", "Mibase"); 
        System.err.println("abrio");
        
        Person pa = new Person();
        System.err.println("creo");
        pa.set("first_name", "Marilyn");
        pa.set("last_name", "Monroe");
        System.err.println("inserto");
        pa.saveIt();
        Base.close(); 
    }
}
