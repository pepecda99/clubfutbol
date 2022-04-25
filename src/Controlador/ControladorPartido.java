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
            ResultSet rs = st.executeQuery("SELECT codigo_equipo, goles_casa, codigo_equipo2, goles_visitas FROM `partidos` WHERE codigo=1;");
            while(rs.next()){
                Partido p = new Partido();
                //p.setCodigo_del_partido(rs.getInt("codigo_partido"));
                p.setE1(rs.getInt("codigo_equipo1"));
                p.setE2(rs.getInt("codigo_equipo2"));
                p.setGoles_en_casa(rs.getInt("goles_casa"));
                p.setGoloes_visita(rs.getInt("goles_visitas"));
                partido.add(p);
                
            }
           
  
            
    }catch(SQLException e){
        
    }finally{
        Conexion.desconectar();
        return partido;
    }
}
}
