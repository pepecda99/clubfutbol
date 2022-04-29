/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Consultas;
import Modelo.Equipo;
import Modelo.Partido;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 34684
 */
public class ControladorEquipo {
       private Consultas cons;
       private ArrayList equipo=new ArrayList();
        
    public ArrayList<Equipo> sacarEquipo(){
        System.out.println("Ha entrado controlador");
        try{
            equipo.clear();
            Conexion.getConexion();
            Statement st = Conexion.createdStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM equipo;");
            while(rs.next()){
                Equipo e = new Equipo();
                e.setCodigo_equipo(rs.getInt("codigo"));
                e.setNombre_Equipo(rs.getString("nombre_equipo"));
                e.setNombre_EStadio(rs.getString("nombre_estadio"));
                e.setAforo(rs.getInt("aforo"));
                e.setAño_fundacion_del_equipo(null);
                e.setCiudad(rs.getString("ciudad"));
                equipo.add(e);
    }
    }catch(SQLException e){
            System.out.println(e);
    }finally{
            Conexion.desconectar();
        }
            return equipo;
    }    
    
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

   

 

