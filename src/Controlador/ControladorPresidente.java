/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Consultas;
import Modelo.Presidente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 34684
 */
public class ControladorPresidente {
    Consultas cons;
    ArrayList presidente=new ArrayList();
   public ControladorPresidente() throws SQLException{
       cons= new Consultas();
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

    public ArrayList<Presidente> sacarPresidente() {
        try{
            Conexion.getConexion();
            presidente.clear();
            Statement st = Conexion.createdStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM presidentes;");
            while(rs.next()){
                Presidente p = new Presidente();
                p.setDni(rs.getString("dni"));
                p.setNombre(rs.getString("nombre"));
                p.setApellidos(rs.getString("apellidos"));
                p.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                p.setEquipo_del_que_es_presidente(rs.getString("equipo_presidente"));
                p.setAño_de_presidente(rs.getInt("año_presidente"));
                p.setCodigo_equipo(rs.getInt("codigo_equipo"));
               
                presidente.add(p);
                
            }
           
  
            
    }catch(SQLException e){
        
    }finally{
        Conexion.desconectar();
        return presidente;
    }
}
}
