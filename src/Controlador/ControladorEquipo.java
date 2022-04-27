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
public class ControladorEquipo {
        Consultas cons;

    public ControladorEquipo() throws SQLException {
        this.cons = new Consultas();
    }
        public void insertarbuscareliminarj (String consulta) throws SQLException{
        try{
        Conexion.getConexion();
        cons.ejecutarInsertDeleteUpdate(consulta);
    }catch(SQLException e){
            System.out.println(e);
    }finally{
            Conexion.desconectar();
        }
}
}
