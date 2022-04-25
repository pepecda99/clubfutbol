/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Conexion;
import Modelo.Partido;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author MEDAC
 */
public class TableControlador extends AbstractTableModel {
    private static final String[] columnNames = {"Equipo local", "Goles Local", "Goles Visitante","Equipo Visitante"};
    private final LinkedList<Partido> list;
    private final ControladorPartido conp;
    private int codigoequipo1;
    private String fechapartido;
    private int codigoequipo2;
    private int golescasa;
    private int golesvisita;
    private int codigopartido;

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
    
    public TableControlador() throws SQLException {
        list = new LinkedList<>();
        Conexion.getConexion();
        conp= new ControladorPartido();
    }
    public Partido getValueAt(int rowIndex) {
        return list.get(rowIndex);
    }
    public void cargarPeliculas() throws SQLException {
        // Obtiene la lista de peliculas de la BD
        ArrayList<Partido> partido = conp.sacarPartido();
        System.out.println(partido.size());
        // Borra el contenido anterior y añade el nuevo.
        list.clear();
        list.addAll(partido);
        // Notifica a la vista que el contenido ha cambiado para que se refresque.
        fireTableDataChanged();
    }
    public void insertar(String titulo, int año, int puntuacion, String sinopsis) 
throws SQLException {
        /*** COMPLETAR CÓDIGO ***/
        cargarPeliculas();
    }
    public void eliminar(String titulo) throws SQLException {
        /*** COMPLETAR CÓDIGO ***/
        cargarPeliculas();
    }
    public int actualizar(String tituloOriginal, String titulo, int año, int 
puntuacion, String sinopsis) throws SQLException {
        int nfilas =0;
        /*** COMPLETAR CÓDIGO ***/
        cargarPeliculas();
        return nfilas;
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
                return list.get(rowIndex).getE1();
            case 1:
                return list.get(rowIndex).getGoles_en_casa();
            case 2:
                return list.get(rowIndex).getGoloes_visita();
            case 3:
                return list.get(rowIndex).getE2();
        }
        return null;
    }
}
