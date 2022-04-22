/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 34684
 */
public class Conexion {
    private final String bd= "clubfutbol";
    private final String usuario = "root";
    private final String contraseña= "";
    private final String url = "jdbc:mysql://localhost/" + bd;
    private Connection cn=null;

    public Connection getConexion() throws SQLException{
        try{
            cn= DriverManager.getConnection(this.url, this.usuario, this.contraseña);
            System.out.println("Se ha conectado");
        }catch(SQLException e){
            System.out.println(e);
            System.out.println("Entra en el error y no entra en la base de datos y no lo puedo entender");
    }
    
        return cn;

        }

    public Connection desconectar(){
        try{
            cn.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        return cn;
    }
    public Statement createdStatement() throws SQLException{
        Statement st = null;
        try{
            st=cn.createStatement();
        }catch(SQLException e){
            System.out.println(e);
        }
        return st;
        
    }

}
