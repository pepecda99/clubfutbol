/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Controlador.ControladorPresidente;
import Modelo.Conexion;
import Modelo.Consultas;
import Modelo.Presidente;
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
public class TableControlador3 extends AbstractTableModel {
    private static final String[] columnNames = {"DNI", "Nombre", "Apellidos", "Fecha nacimiento","Equipo Presidente","Año Presidente"};
    private final LinkedList<Presidente> list;
    private final ControladorPresidente conp;    
    private String dni;
    private String fecha_de_nacimiento;
    private String nombre;
    private String apellidos;
    private String equipo_presidente;
    private int año_presidente;
    private int codigo_equipo;
    private Consultas cons=new Consultas();

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEquipo_presidente() {
        return equipo_presidente;
    }

    public void setEquipo_presidente(String equipo_presidente) {
        this.equipo_presidente = equipo_presidente;
    }

    public int getAño_presidente() {
        return año_presidente;
    }

    public void setAño_presidente(int año_presidente) {
        this.año_presidente = año_presidente;
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
    
    
    public TableControlador3() throws SQLException {
        list = new LinkedList<>();
        Conexion.getConexion();
        conp= new ControladorPresidente();
    }
    public Presidente getValueAt(int rowIndex) {
        return list.get(rowIndex);
    }
    public void cargarPresidente() throws SQLException {
        // Obtiene la lista de peliculas de la BD
        ArrayList<Presidente> presidente = conp.sacarPresidente();
        System.out.println(presidente.size());
        // Borra el contenido anterior y añade el nuevo.
        list.clear();
        list.addAll(presidente);
        // Notifica a la vista que el contenido ha cambiado para que se refresque.
        fireTableDataChanged();
    }
    public void insertar(String titulo, int año, int puntuacion, String sinopsis) 
    throws SQLException {
        /*** COMPLETAR CÓDIGO ***/
        cargarPresidente();
    }
    public void eliminar(String titulo) throws SQLException {
        /*** COMPLETAR CÓDIGO ***/
        cargarPresidente();
    }
    public int actualizar(String tituloOriginal, String titulo, int año, int 
    puntuacion, String sinopsis) throws SQLException {
        int nfilas =0;
        /*** COMPLETAR CÓDIGO ***/
        cargarPresidente();
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
    public String sacarPresidente(String consulta) throws SQLException{
         String nombre = null;
        try{
            Conexion.getConexion();
            Statement st = Conexion.createdStatement();
            ResultSet rs = st.executeQuery(consulta);
            
            while(rs.next()){
                nombre=rs.getString("nombre_equipo"); 
                
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
                return list.get(rowIndex).getDni();
            case 1:
                return list.get(rowIndex).getNombre();
            case 2:
                return list.get(rowIndex).getApellidos();
            case 3:
                return list.get(rowIndex).getFecha_nacimiento();
            case 4:
                return list.get(rowIndex).getEquipo_del_que_es_presidente();
            case 5:
                return list.get(rowIndex).getAño_de_presidente();  
          
                  
        }
        return null;
    }
}
