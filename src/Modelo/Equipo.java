/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author MEDAC
 */
public class Equipo {
    private String nombre_Equipo;
    private String nombre_EStadio;
    private int aforo;
    private Date año_fundacion_del_equipo;
    private String ciudad;
    private int codigo_equipo;
    
    public Equipo(){
        this.nombre_Equipo="";
    }

    public Equipo(String nombre_Equipo, String nombre_EStadio, int aforo, Date año_fundacion_del_equipo, String ciudad, int codigo_equipo) {
        this.nombre_Equipo = nombre_Equipo;
        this.nombre_EStadio = nombre_EStadio;
        this.aforo = aforo;
        this.año_fundacion_del_equipo = año_fundacion_del_equipo;
        this.ciudad = ciudad;
        this.codigo_equipo = codigo_equipo;
    }

    public String getNombre_Equipo() {
        return nombre_Equipo;
    }

    public String getNombre_EStadio() {
        return nombre_EStadio;
    }

    public int getAforo() {
        return aforo;
    }

    public Date getAño_fundacion_del_equipo() {
        return año_fundacion_del_equipo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getCodigo_equipo() {
        return codigo_equipo;
    }

    public void setNombre_Equipo(String nombre_Equipo) {
        this.nombre_Equipo = nombre_Equipo;
    }

    public void setNombre_EStadio(String nombre_EStadio) {
        this.nombre_EStadio = nombre_EStadio;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public void setAño_fundacion_del_equipo(Date año_fundacion_del_equipo) {
        this.año_fundacion_del_equipo = año_fundacion_del_equipo;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setCodigo_equipo(int codigo_equipo) {
        this.codigo_equipo = codigo_equipo;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre_Equipo=" + nombre_Equipo + ", nombre_EStadio=" + nombre_EStadio + ", aforo=" + aforo + ", a\u00f1o_fundacion_del_equipo=" + año_fundacion_del_equipo + ", ciudad=" + ciudad + ", codigo_equipo=" + codigo_equipo + '}';
    }
    


    
    
}
