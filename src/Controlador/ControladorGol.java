/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Consultas;
import Modelo.Gol;
import Modelo.Jugador;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 34684
 */
public class ControladorGol {
        Consultas cons;
        ArrayList goles= new ArrayList();
        public ControladorGol() throws SQLException{
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
    public ArrayList<Gol> sacargoles(int codigo) throws SQLException{
        try{
            Conexion.getConexion();
            goles.clear();
            Statement st = Conexion.createdStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM goles where codigo_partido="+codigo+";");
            System.out.println("SELECT * FROM jugador where codigo_partido="+codigo+"; este es el de partido goles");
            while(rs.next()){
                Gol g = new Gol();
                g.setCodigo_partido(rs.getInt("codigo_partido"));
                g.setMomento_del_gol(rs.getInt("momento_gol"));
                g.setDescripcion_del_gol(rs.getString("descripcion_gol"));
                goles.add(g);
                
            }
                    
    }catch(SQLException e){
        
    }finally{
        Conexion.desconectar();
        return goles;
    }
    }
}
