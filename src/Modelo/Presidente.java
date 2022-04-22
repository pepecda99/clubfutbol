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
public class Presidente {
   private int Dni;
   private String nombre;
   private String apellidos;
   private Date fecha_nacimiento;
   private String equipo_del_que_es_presidente;
   private int año_de_presidente;
   private Equipo e;

    public Presidente(int Dni, String nombre, String apellidos, Date fecha_nacimiento, String equipo_del_que_es_presidente, int año_de_presidente,int codigoequipo) {
        this.Dni = Dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.equipo_del_que_es_presidente = equipo_del_que_es_presidente;
        this.año_de_presidente = año_de_presidente;
        codigoequipo=e.getCodigo_equipo();
    }

    public int getDni() {
        return Dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getEquipo_del_que_es_presidente() {
        return equipo_del_que_es_presidente;
    }

    public int getAño_de_presidente() {
        return año_de_presidente;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setEquipo_del_que_es_presidente(String equipo_del_que_es_presidente) {
        this.equipo_del_que_es_presidente = equipo_del_que_es_presidente;
    }

    public void setAño_de_presidente(int año_de_presidente) {
        this.año_de_presidente = año_de_presidente;
    }

    @Override
    public String toString() {
        return "Presidente{" + "Dni=" + Dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fecha_nacimiento=" + fecha_nacimiento + ", equipo_del_que_es_presidente=" + equipo_del_que_es_presidente + ", a\u00f1o_de_presidente=" + año_de_presidente + '}';
    }
   
   


}
