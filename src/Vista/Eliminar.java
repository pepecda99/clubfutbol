/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author MEDAC-INVITADO
 */
public class Eliminar extends javax.swing.JFrame {

    /**
     * Creates new form Eliminar
     */
    public Eliminar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        B_Eliminar_Jugador = new javax.swing.JButton();
        T_Insertar_Jugador = new javax.swing.JTextField();
        B_Eliminar_Equipo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        T_Insertar_Equipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        T_Insertar_Partido = new javax.swing.JTextField();
        B_Eliminar_Partido = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        T_Insertar_Presidente = new javax.swing.JTextField();
        B_Eliminar_Presidente = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        T_Insertar_Gol = new javax.swing.JTextField();
        B_Eliminar_Gol = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Inserte el Jugador");

        B_Eliminar_Jugador.setBackground(new java.awt.Color(204, 204, 204));
        B_Eliminar_Jugador.setText("Eliminar");
        B_Eliminar_Jugador.setContentAreaFilled(false);
        B_Eliminar_Jugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Eliminar_JugadorActionPerformed(evt);
            }
        });

        B_Eliminar_Equipo.setBackground(new java.awt.Color(204, 204, 204));
        B_Eliminar_Equipo.setText("Eliminar");
        B_Eliminar_Equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Eliminar_EquipoActionPerformed(evt);
            }
        });

        jLabel2.setText("Inserte el Equipo");

        jLabel3.setText("Inserte el Partido");

        B_Eliminar_Partido.setBackground(new java.awt.Color(204, 204, 204));
        B_Eliminar_Partido.setText("Eliminar");
        B_Eliminar_Partido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Eliminar_PartidoActionPerformed(evt);
            }
        });

        jLabel4.setText("Inserte el Presidente");

        B_Eliminar_Presidente.setBackground(new java.awt.Color(204, 204, 204));
        B_Eliminar_Presidente.setText("Eliminar");
        B_Eliminar_Presidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Eliminar_PresidenteActionPerformed(evt);
            }
        });

        jLabel5.setText("Inserte el Gol");

        B_Eliminar_Gol.setBackground(new java.awt.Color(204, 204, 204));
        B_Eliminar_Gol.setText("Eliminar");
        B_Eliminar_Gol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Eliminar_GolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(T_Insertar_Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B_Eliminar_Jugador)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(T_Insertar_Partido, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B_Eliminar_Partido))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(T_Insertar_Equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B_Eliminar_Equipo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(T_Insertar_Presidente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B_Eliminar_Presidente))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(T_Insertar_Gol, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B_Eliminar_Gol))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(334, 334, 334)))
                .addGap(69, 69, 69))
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(B_Eliminar_Jugador)
                    .addComponent(T_Insertar_Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(T_Insertar_Equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(B_Eliminar_Equipo))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(T_Insertar_Partido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(B_Eliminar_Partido))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(T_Insertar_Presidente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(B_Eliminar_Presidente))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(T_Insertar_Gol, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(B_Eliminar_Gol))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_Eliminar_JugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Eliminar_JugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_Eliminar_JugadorActionPerformed

    private void B_Eliminar_EquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Eliminar_EquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_Eliminar_EquipoActionPerformed

    private void B_Eliminar_PartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Eliminar_PartidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_Eliminar_PartidoActionPerformed

    private void B_Eliminar_PresidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Eliminar_PresidenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_Eliminar_PresidenteActionPerformed

    private void B_Eliminar_GolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Eliminar_GolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_Eliminar_GolActionPerformed

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
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Eliminar_Equipo;
    private javax.swing.JButton B_Eliminar_Gol;
    private javax.swing.JButton B_Eliminar_Jugador;
    private javax.swing.JButton B_Eliminar_Partido;
    private javax.swing.JButton B_Eliminar_Presidente;
    private javax.swing.JTextField T_Insertar_Equipo;
    private javax.swing.JTextField T_Insertar_Gol;
    private javax.swing.JTextField T_Insertar_Jugador;
    private javax.swing.JTextField T_Insertar_Partido;
    private javax.swing.JTextField T_Insertar_Presidente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
