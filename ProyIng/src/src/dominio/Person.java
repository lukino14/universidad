package src.dominio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.javalite.activejdbc.Model;
/**
 *
 * @author Cuello Lucas Oscar
 */
public class Person extends Model{
static {
        validatePresenceOf("first_name", "last_name");
    }    
        
}

