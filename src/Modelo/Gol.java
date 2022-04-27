/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author MEDAC
 */
public class Gol {
   private int momento_del_gol;
   private String Descripcion_del_gol;
   private Partido p;

    public Gol(int momento_del_gol, String Descripcion_del_gol, int codigo_partido) {
        this.momento_del_gol = momento_del_gol;
        this.Descripcion_del_gol = Descripcion_del_gol;
        codigo_partido=p.getCodigo_del_partido();
    }

   
   public int getMomento_del_gol() {
        return momento_del_gol;
    }

    public String getDescripcion_del_gol() {
        return Descripcion_del_gol;
    }

    public void setMomento_del_gol(int momento_del_gol) {
        this.momento_del_gol = momento_del_gol;
    }

    public void setDescripcion_del_gol(String Descripcion_del_gol) {
        this.Descripcion_del_gol = Descripcion_del_gol;
    }

    @Override
    public String toString() {
        return "Gol{" + "momento_del_gol=" + momento_del_gol + ", Descripcion_del_gol=" + Descripcion_del_gol + '}';
    }
    
    
}
