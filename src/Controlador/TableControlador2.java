package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Modelo.Conexion;
import Modelo.Consultas;
import Modelo.Jugador;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.EventListenerList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author MEDAC
 */
public class TableControlador2 extends AbstractTableModel {
    private static final String[] columnNames = {"Codigo", "Nombre", "Fecha nacimiento","Posicion","Codigo Equipo"};
    private final LinkedList<Jugador> list;
    private final ControladorJugador conp;    
    private String nombre;
    private String fecha_de_nacimiento;
    private String posicion;
    private int codigo_jugador;
    private int codigo_equipo;
    private Consultas cons=new Consultas();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getCodigo_jugador() {
        return codigo_jugador;
    }

    public void setCodigo_jugador(int codigo_jugador) {
        this.codigo_jugador = codigo_jugador;
    }

    public int getCodigo_equipo() {
        return codigo_equipo;
    }

    public void setCodigo_equipo(int codigo_equipo) {
        this.codigo_equipo = codigo_equipo;
    }

    public Consultas getCons() {
        return cons;
    }

    public void setCons(Consultas cons) {
        this.cons = cons;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }
    
    
    public TableControlador2() throws SQLException {
        list = new LinkedList<>();
        Conexion.getConexion();
        conp= new ControladorJugador();
    }
    public Jugador getValueAt(int rowIndex) {
        return list.get(rowIndex);
    }
    public void cargarJugador() throws SQLException {
        // Obtiene la lista de peliculas de la BD
        ArrayList<Jugador> jugador = conp.sacarJugador();
        System.out.println(jugador.size());
        // Borra el contenido anterior y añade el nuevo.
        list.clear();
        list.addAll(jugador);
        // Notifica a la vista que el contenido ha cambiado para que se refresque.
        fireTableDataChanged();
    }
    public void insertar(String titulo, int año, int puntuacion, String sinopsis) 
    throws SQLException {
        /*** COMPLETAR CÓDIGO ***/
        cargarJugador();
    }
    public void eliminar(String titulo) throws SQLException {
        /*** COMPLETAR CÓDIGO ***/
        cargarJugador();
    }
    public int actualizar(String tituloOriginal, String titulo, int año, int 
puntuacion, String sinopsis) throws SQLException {
        int nfilas =0;
        /*** COMPLETAR CÓDIGO ***/
        cargarJugador();
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
    public String sacarJugador(String consulta) throws SQLException{
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
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getCodigo_jugador();
            case 1:
                return list.get(rowIndex).getNombre();
            case 2:
                return list.get(rowIndex).getFecha_de_nacimiento();
            case 3:
                return list.get(rowIndex).getPosicion();
            case 4:
            int codigo=list.get(rowIndex).getCodigo_equipo();
                System.out.println(codigo);
                String Consulta="Select nombre_equipo from equipo where codigo='"+codigo+"';";
                System.out.println(Consulta + "esto");
            try {
                return this.sacarJugador(Consulta);
            } catch (SQLException ex) {
                Logger.getLogger(TableControlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
