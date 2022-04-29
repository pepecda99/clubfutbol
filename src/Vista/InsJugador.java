package Vista;

import Controlador.ControladorEquipo;
import Controlador.ControladorGol;
import Controlador.ControladorJugador;
import Controlador.ControladorPartido;
import Controlador.ControladorPresidente;
import Controlador.TableControlador2;
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author MEDC
 */
public class InsJugador extends javax.swing.JFrame {
    ControladorJugador cj;
    TableControlador2 Tb2 = new TableControlador2();
    /** Creates new form insertar */
    public InsJugador() throws SQLException {
        initComponents();
        cj = new ControladorJugador();
        this.setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage();
        setIconImage(icon);
        this.setTitle("Insertar datos");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insJugador = new javax.swing.JButton();
        actJugador = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        diaNacJug = new javax.swing.JSpinner();
        posicionJugador = new javax.swing.JTextField();
        nombreJugador = new javax.swing.JTextField();
        mesNacJug = new javax.swing.JSpinner();
        añoNacJug = new javax.swing.JSpinner();
        codigoJugador = new javax.swing.JTextField();
        codigoEquipoFk = new javax.swing.JTextField();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        insJugador.setText("INSERTAR JUGADOR");
        insJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insJugadorActionPerformed(evt);
            }
        });
        getContentPane().add(insJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 170, 30));

        actJugador.setText("ACTUALIZAR JUGADOR");
        actJugador.setPreferredSize(new java.awt.Dimension(133, 23));
        actJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actJugadorActionPerformed(evt);
            }
        });
        getContentPane().add(actJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 170, 30));
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, -1, -1));

        jLabel37.setText("Código Jugador:");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel38.setText("Fecha Nacimiento");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 110, -1));

        jLabel40.setText("Código Equipo");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel41.setText("Posición");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        jLabel43.setText("Nombre del Jugador");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        diaNacJug.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        getContentPane().add(diaNacJug, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        getContentPane().add(posicionJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 160, -1));
        getContentPane().add(nombreJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 160, -1));

        mesNacJug.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        getContentPane().add(mesNacJug, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        añoNacJug.setModel(new javax.swing.SpinnerNumberModel(1950, 1950, 2050, 1));
        getContentPane().add(añoNacJug, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));
        getContentPane().add(codigoJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 110, -1));
        getContentPane().add(codigoEquipoFk, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insJugadorActionPerformed
         try { 
            if((codigoJugador.getText().length()==0) ||(nombreJugador.getText().length()==0) || (posicionJugador.getText().length()==0) || (codigoEquipoFk.getText().length()==0)){
             JOptionPane.showMessageDialog(null,"No se han insertado los datos correctamente");

            }else{ 
            int codeJugador = Integer.parseInt(codigoJugador.getText());
            int codeEquipo = Integer.parseInt(codigoEquipoFk.getText());
            String nombre = nombreJugador.getText();
            String posicion = posicionJugador.getText();
            String fechaNacimiento = añoNacJug.getValue().toString() + "-" + mesNacJug.getValue().toString() + "-" + diaNacJug.getValue().toString();
            cj.insertarbuscareliminarj("INSERT INTO jugador(codigo, nombre, fech_nacimiento, posicion, codigo_equipo)VALUES('" + codeJugador + "','" + nombre + "','" + fechaNacimiento + "','" + posicion + "','" + codeEquipo + "');");
            JOptionPane.showMessageDialog(null, "Se ha insertado correctamente");
            codigoJugador.setText("");
            nombreJugador.setText("");
            posicionJugador.setText("");
            codigoEquipoFk.setText("");
            Tb2.cargarJugador();
            
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
      
    }//GEN-LAST:event_insJugadorActionPerformed

    private void actJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actJugadorActionPerformed
        
        try {
            if((codigoJugador.getText().length()==0) ||(nombreJugador.getText().length()==0) || (posicionJugador.getText().length()==0) || (codigoEquipoFk.getText().length()==0)){
             JOptionPane.showMessageDialog(null,"No se han insertado los datos correctamente");

            }else{ 
            int codeJugador = Integer.parseInt(codigoJugador.getText());
            int codeEquipo = Integer.parseInt(codigoEquipoFk.getText());
            String nombre = nombreJugador.getText();
            String posicion = posicionJugador.getText();
            String fechaNacimiento = añoNacJug.getValue().toString() + "-" + mesNacJug.getValue().toString() + "-" + diaNacJug.getValue().toString();
            cj.insertarbuscareliminarj("UPDATE jugador SET nombre='"+nombre+"', fech_nacimiento='"+fechaNacimiento+"',posicion='"+posicion+"', codigo_equipo='"+codeEquipo+"' WHERE codigo='"+codeJugador+"';");
            }
            } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_actJugadorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InsJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InsJugador().setVisible(true);
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actJugador;
    private javax.swing.JSpinner añoNacJug;
    private javax.swing.JTextField codigoEquipoFk;
    private javax.swing.JTextField codigoJugador;
    private javax.swing.JSpinner diaNacJug;
    private javax.swing.JButton insJugador;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JSpinner mesNacJug;
    private javax.swing.JTextField nombreJugador;
    private javax.swing.JTextField posicionJugador;
    // End of variables declaration//GEN-END:variables

}
