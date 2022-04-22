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
    private Conexion cn = new Conexion();
    public void conectar() throws SQLException{
       cn.getConexion();
        
    }
    public void desconectar(){
        cn.desconectar();
    }
}
