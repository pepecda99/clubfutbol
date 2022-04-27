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
public class Partido {
    
    private Date fecha_del_partido;
    private int goles_en_casa;
    private int goloes_visita;
    private int codigo_del_partido;
    private int codigo_equipo1;
    private int codigo_equipo2;
    private String nombre_equipo1;
    private String nombre_equipo2;
    private Equipo e1;
    private Equipo e2;

    public int getCodigo_equipo1() {
        return codigo_equipo1;
    }

    public void setCodigo_equipo1(int codigo_equipo1) {
        this.codigo_equipo1 = codigo_equipo1;
    }

    public int getCodigo_equipo2() {
        return codigo_equipo2;
    }

    public void setCodigo_equipo2(int codigo_equipo2) {
        this.codigo_equipo2 = codigo_equipo2;
    }

    

    public Partido(Date fecha_del_partido, int goles_en_casa, int goloes_visita, int codigo_del_partido, int codigo_equipo1, int codigo_equipo2) {
        this.fecha_del_partido = fecha_del_partido;
        this.goles_en_casa = goles_en_casa;
        this.goloes_visita = goloes_visita;
        this.codigo_del_partido = codigo_del_partido;
        this.codigo_equipo1=e1.getCodigo_equipo();
        this.codigo_equipo2=e2.getCodigo_equipo();
    }
    public Partido(){
        
    }


    public Date getFecha_del_partido() {
        return fecha_del_partido;
    }

    public int getGoles_en_casa() {
        return goles_en_casa;
    }

    public int getGoloes_visita() {
        return goloes_visita;
    }

    public int getCodigo_del_partido() {
        return codigo_del_partido;
    }

    public void setFecha_del_partido(Date fecha_del_partido) {
        this.fecha_del_partido = fecha_del_partido;
    }

    public void setGoles_en_casa(int goles_en_casa) {
        this.goles_en_casa = goles_en_casa;
    }

    public void setGoloes_visita(int goloes_visita) {
        this.goloes_visita = goloes_visita;
    }

    public void setCodigo_del_partido(int codigo_del_partido) {
        this.codigo_del_partido = codigo_del_partido;
    }

    @Override
    public String toString() {
        return "Partido{" + "fecha_del_partido=" + fecha_del_partido + ", goles_en_casa=" + goles_en_casa + ", goloes_visita=" + goloes_visita + ", codigo_del_partido=" + codigo_del_partido + '}';
    }
    
    
    
    

}
