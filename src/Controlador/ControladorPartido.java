/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Partido;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 34684
 */
public class ControladorPartido {
    Controlador c;
    ArrayList partido=new ArrayList();
    public ControladorPartido() throws SQLException{
        
    }
    public ArrayList<Partido> sacarPartido() throws SQLException{
        try{
            Conexion.getConexion();
            Statement st = Conexion.createdStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM partidos;");
            while(rs.next()){
                Partido p = new Partido();
                p.setCodigo_del_partido(rs.getInt("codigo"));
                p.setCodigo_equipo1(rs.getInt("codigo_equipo"));
                p.setCodigo_equipo2(rs.getInt("codigo_equipo2"));
                p.setGoles_en_casa(rs.getInt("goles_casa"));
                p.setGoloes_visita(rs.getInt("goles_visitas"));
                p.setFecha_del_partido(rs.getDate("fecha_partido"));
                partido.add(p);
                
            }
           
  
            
    }catch(SQLException e){
        
    }finally{
        Conexion.desconectar();
        return partido;
    }
}
}
