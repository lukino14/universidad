/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.persistencia;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Cuello Lucas Oscar
 */
public class Connection {
      
    public static java.sql.Connection GetConnection()throws SQLException, ClassNotFoundException
    {
        java.sql.Connection conexion=null;
        
        if (conexion==null){
            try{
                String servidor = "";
                String usuarioDB = "";
                String passwordDB = "";
                servidor="localhost";
                usuarioDB="root";
                passwordDB="root";
                Class.forName("com.mysql.jdbc.Driver");
                //conexion = DriverManager.getConnection("jdbc:mysql://localhost/"+servidor,usuarioDB,passwordDB);
                conexion = DriverManager.getConnection("jdbc:mysql://localhost/ingenieria?user=root&password=Mibase");
                
                System.out.println("Se conecto correctamente");
            }catch(SQLException ex){
                conexion=null;
                System.out.println("No se conecto");
            }
        }
        return conexion;
    }
    
    public static void Disconnect(java.sql.Connection con) throws SQLException{
        con.close();
        System.out.println("Se desconecto");
    }
    
}

