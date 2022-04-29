/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Consultas;
import Modelo.Jugador;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 34684
 */
public class ControladorJugador {
    Controlador ConsultarPartidos;
    Consultas cons;
    ArrayList jugador=new ArrayList();
    public ControladorJugador() throws SQLException{
        cons=new Consultas();
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
       public ArrayList<Jugador> sacarJugador() throws SQLException{
        try{
            Conexion.getConexion();
            jugador.clear();
            Statement st = Conexion.createdStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM jugador;");
            while(rs.next()){
                Jugador p = new Jugador();
                p.setCodigo_jugador(rs.getInt("codigo"));
                p.setNombre(rs.getString("nombre"));
                p.setFecha_de_nacimiento(rs.getDate("fech_nacimiento"));
                p.setPosicion(rs.getString("posicion"));
                p.setCodigo_equipo(rs.getInt("codigo_equipo"));
                jugador.add(p);
                
            }
                    
    }catch(SQLException e){
        
    }finally{
        Conexion.desconectar();
        return jugador;
    }
    }
}
