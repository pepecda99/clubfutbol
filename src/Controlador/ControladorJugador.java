/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Consultas;
import java.sql.SQLException;

/**
 *
 * @author 34684
 */
public class ControladorJugador {
    Consultas cons;
    public ControladorJugador() throws SQLException{
        cons=new Consultas();
    }
    public void insertarbuscareliminarj (String consulta) throws SQLException{
        cons.ejecutarInsertDeleteUpdate(consulta);
    }
}
