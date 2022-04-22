/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author 34684
 */
public class Consultas{
   
    

    public Consultas() throws SQLException {
        
    }
    public boolean ejecutarInsertDeleteUpdate (String consulta) throws SQLException{
        Conexion.getConexion();
        try{
            Statement st;
            st = Conexion.createdStatement();
            int filas = st.executeUpdate(consulta);
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
                Conexion.desconectar();
    }
    }
}
