/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import java.sql.SQLException;

/**
 *
 * @author 34684
 */
public class Controlador {
    
    public void conectar() throws SQLException{
       Conexion.getConexion();
        
    }
    public void desconectar(){
        Conexion.desconectar();
    }
}
