/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Fayçal
 */
public class Connecter {
    
        Connection con;
    public Connecter(){
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    }catch(ClassNotFoundException e){
     System.err.println(e);
     
     
    }
    try{
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_societe","root","");
    }catch(SQLException e){System.err.println(e);}
    }
    Connection obtenirconnexion(){ return con;}


    
}
