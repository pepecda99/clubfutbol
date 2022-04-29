/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Conexion;
import Modelo.Consultas;
import Modelo.Partido;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 34684
 */
public class TableControladorPartidosBuscados extends AbstractTableModel {
 private static final String[] columnNames = {"Equipo local", "Goles Local", "Goles Visitante","Equipo Visitante"};
    private final LinkedList<Partido> list;
    private final ControladorPartido conp;
    private int codigoequipo1;
    private String fechapartido;
    private int codigoequipo2;
    private int golescasa;
    private int golesvisita;
    private int codigopartido;
    private Consultas cons=new Consultas();
    
    public int getCodigoequipo1() {
        return codigoequipo1;
    }

    public void setCodigoequipo1(int codigoequipo1) {
        this.codigoequipo1 = codigoequipo1;
    }

    public String getFechapartido() {
        return fechapartido;
    }

    public void setFechapartido(String fechapartido) {
        this.fechapartido = fechapartido;
    }

    public int getCodigoequipo2() {
        return codigoequipo2;
    }

    public void setCodigoequipo2(int codigoequipo2) {
        this.codigoequipo2 = codigoequipo2;
    }

    public int getGolescasa() {
        return golescasa;
    }

    public void setGolescasa(int golescasa) {
        this.golescasa = golescasa;
    }

    public int getGolesvisita() {
        return golesvisita;
    }

    public void setGolesvisita(int golesvisita) {
        this.golesvisita = golesvisita;
    }

    public int getCodigopartido() {
        return codigopartido;
    }

    public void setCodigopartido(int codigopartido) {
        this.codigopartido = codigopartido;
    }
    
    public TableControladorPartidosBuscados() throws SQLException {
        list = new LinkedList<>();
        Conexion.getConexion();
        conp= new ControladorPartido();
    }
    public Partido getValueAt(int rowIndex) {
        return list.get(rowIndex);
    }
    public void cargarPartido(int d, int m, int a) throws SQLException {
        // Obtiene la lista de peliculas de la BD
        ArrayList<Partido> partido = conp.sacarPartidob( d, m ,  a);
        System.out.println(partido.size());
        // Borra el contenido anterior y añade el nuevo.
        list.clear();
        list.addAll(partido);
        // Notifica a la vista que el contenido ha cambiado para que se refresque.
        fireTableDataChanged();
    }


    public int getColumnCount() {
        return columnNames.length;
    }
    public String getColumnName(int column) {
        return columnNames[column];
    }
    public int getRowCount() {
        return list.size();
    }
    public String sacarPartido(String consulta) throws SQLException{
        String nombre = null;
        try{
            Conexion.getConexion();
            Statement st = Conexion.createdStatement();
            ResultSet rs = st.executeQuery(consulta);
            
            while(rs.next()){
                nombre=rs.getString("nombre_equipo"); 
                System.out.println(nombre+"nofunciona");
            }
        }catch(SQLException e){
        
        }finally{
        Conexion.desconectar();
        System.out.println("nombre");
        
        
        }
        System.out.println(nombre);
        return nombre;
    }
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                int codigo=list.get(rowIndex).getCodigo_equipo1();
                System.out.println(codigo);
                String Consulta="Select nombre_equipo from equipo where codigo='"+codigo+"';";
                System.out.println(Consulta + "esto");
            try {
                return this.sacarPartido(Consulta);
            } catch (SQLException ex) {
                Logger.getLogger(TableControlador.class.getName()).log(Level.SEVERE, null, ex);
            }
                       
            case 1:
                return list.get(rowIndex).getGoles_en_casa();
            case 2:
                return list.get(rowIndex).getGoloes_visita();
            case 3:
                int codigo1=list.get(rowIndex).getCodigo_equipo2();
                System.out.println(codigo1);
                String Consulta1="Select nombre_equipo from equipo where codigo='"+codigo1+"';";
                System.out.println(Consulta1 + "esto");
            try {
                return this.sacarPartido(Consulta1);
            } catch (SQLException ex) {
                Logger.getLogger(TableControlador.class.getName()).log(Level.SEVERE, null, ex);
            }
                       
        }
        return null;
    }
}

