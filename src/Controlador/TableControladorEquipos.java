package Controlador;
import Modelo.Conexion;
import Modelo.Consultas;
import Modelo.Equipo;
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
 * @author MEDAC
 */
public class TableControladorEquipos extends AbstractTableModel {
    private static final String[] columnNames = {"Codigo", "Nombre", "Estadio","Aforo","Ciudad"};
    private LinkedList<Equipo> list;
    private ControladorEquipo cone;
    private int codigoequipo1;
    private String fechapartido;
    private int codigoequipo2;
    private int golescasa;
    private int golesvisita;
    private int codigopartido;
    private Consultas cons;

    public TableControladorEquipos() throws SQLException {
        this.cons = new Consultas();
        list = new LinkedList<>();
        Conexion.getConexion();
        cone= new ControladorEquipo();
    }
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
    

    public Equipo getValueAt(int rowIndex) {
        return list.get(rowIndex);
    }
    public void cargarEquipo() throws SQLException {
        // Obtiene la lista de peliculas de la BD
        ArrayList<Equipo> equipo = cone.sacarEquipo();
        
        // Borra el contenido anterior y añade el nuevo.
        list.clear();
        list.addAll(equipo);
        // Notifica a la vista que el contenido ha cambiado para que se refresque.
        fireTableDataChanged();
    }
    public void insertar(String titulo, int año, int puntuacion, String sinopsis) 
throws SQLException {
        /*** COMPLETAR CÓDIGO ***/
        cargarEquipo();
    }
    public void eliminar(String titulo) throws SQLException {
        /*** COMPLETAR CÓDIGO ***/
        cargarEquipo();
    }
    public int actualizar(String tituloOriginal, String titulo, int año, int 
puntuacion, String sinopsis) throws SQLException {
        int nfilas =0;
        /*** COMPLETAR CÓDIGO ***/
        cargarEquipo();
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
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getCodigo_equipo();
                       
            case 1:
                return list.get(rowIndex).getNombre_Equipo();
            case 2:
                return list.get(rowIndex).getNombre_EStadio();
            case 3:
                return list.get(rowIndex).getAforo();
            case 4:
                return list.get(rowIndex).getCiudad();
        }
        return null;
    }
}
