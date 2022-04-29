/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Consultas;
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
    Consultas cons;
    ArrayList partido=new ArrayList();
    public ControladorPartido() throws SQLException{
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
    public ArrayList<Partido> sacarPartido() throws SQLException{
        try{
            Conexion.getConexion();
            partido.clear();
            System.out.println("Conectaaa");
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
                
                System.out.println(p.getFecha_del_partido());
                partido.add(p);
                
            }            
    }catch(SQLException e){
            System.out.println(e);
    }finally{
        Conexion.desconectar();
            System.out.println("Desconectaraaaa");
    }
        return partido;
}
        public ArrayList<Partido> sacarPartidob(int d,int m, int a) throws SQLException{
        try{
            Conexion.getConexion();
            partido.clear();
            System.out.println("Conectaaa");
            Statement st = Conexion.createdStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM partidos where fecha_partido='"+a+"-"+m+"-"+d+"';");
            System.out.println("SELECT * FROM partidos where fecha_partido='"+a+"-0"+m+"-"+d+"';");
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
            System.out.println(e);
    }finally{
        Conexion.desconectar();
            System.out.println("Desconectaraaaa");
    }
        return partido;
}
}
