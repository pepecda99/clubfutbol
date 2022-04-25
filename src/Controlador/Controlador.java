/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Consultas;
import java.sql.SQLException;

/**
 *
 * @author 34684
 */
public class Controlador {
    Consultas consultas;
    
    public void conectar() throws SQLException{
       Conexion.getConexion();
        
    }
    public void desconectar(){
        Conexion.desconectar();
    }
    public void consultas(String consulta) throws SQLException{
        consultas.ejecutarInsertDeleteUpdate(consulta);
    }
}
