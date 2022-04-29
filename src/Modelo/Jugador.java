/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Equipo;
import java.sql.Date;

/**
 *
 * @author MEDAC
 */
public class Jugador {
    private String nombre;
    private Date fecha_de_nacimiento;
    private String posicion;
    private int codigo_jugador;
    private int codigo_equipo;
    private Equipo e;

   public Jugador(String nombre, Date fecha_de_nacimineto, String posicion, int codigo_jugador,int codigoequipo) {
        this.nombre = nombre;
        this.fecha_de_nacimiento = fecha_de_nacimineto;
        this.posicion = posicion;
        this.codigo_jugador = codigo_jugador;
        codigoequipo=e.getCodigo_equipo();
    }
    public Jugador() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }
     public void setFecha_de_nacimiento(Date fecha_de_nacimineto) {
        this.fecha_de_nacimiento = fecha_de_nacimineto;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getCodigo_jugador() {
        return codigo_jugador;
    }

     public int getCodigo_equipo() {
        return codigo_equipo;
    }

    public void setCodigo_equipo(int codigo_equipo) {
        this.codigo_equipo = codigo_equipo;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha_de_nacimineto(Date fecha_de_nacimineto) {
        this.fecha_de_nacimiento = fecha_de_nacimineto;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setCodigo_jugador(int codigo_jugador) {
        this.codigo_jugador = codigo_jugador;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", fecha_de_nacimineto=" + fecha_de_nacimiento + ", posicion=" + posicion + ", codigo_jugador=" + codigo_jugador + '}';
    }

    
   
}