/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Consultas;
import Modelo.Equipo;
import Modelo.Gol;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 34684
 */
public class TableControladorGoles extends AbstractTableModel {
  private static final String[] columnNames = {"Momento", "Descripción"};
    private LinkedList<Gol> list;
    private ControladorGol cong;
    private int codigoequipo1;
    private int momento_del_gol;
    private String Descripcion_del_gol;
    private Consultas cons;

    public TableControladorGoles() throws SQLException {
        this.cons = new Consultas();
        list = new LinkedList<>();
        Conexion.getConexion();
        cong= new ControladorGol();
    } 

    public int getMomento_del_gol() {
        return momento_del_gol;
    }

    public void setMomento_del_gol(int momento_del_gol) {
        this.momento_del_gol = momento_del_gol;
    }

    public String getDescripcion_del_gol() {
        return Descripcion_del_gol;
    }

    public void setDescripcion_del_gol(String Descripcion_del_gol) {
        this.Descripcion_del_gol = Descripcion_del_gol;
    }
    
    public int getCodigoequipo1() {
        return codigoequipo1;
    }

    public void setCodigoequipo1(int codigoequipo1) {
        this.codigoequipo1 = codigoequipo1;
    }
    

    public Gol getValueAt(int rowIndex) {
        return list.get(rowIndex);
    }
    public void cargarGoles(int codigo) throws SQLException {
        // Obtiene la lista de peliculas de la BD
        ArrayList <Gol> goles = cong.sacargoles(codigo);
        
        // Borra el contenido anterior y añade el nuevo.
        list.clear();
        list.addAll(goles);
        // Notifica a la vista que el contenido ha cambiado para que se refresque.
        fireTableDataChanged();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getMomento_del_gol();
                       
            case 1:
                return list.get(rowIndex).getDescripcion_del_gol();
        }
        return null;
    }
}
