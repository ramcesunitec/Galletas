/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import datos.Conexion;
import datos.RegistroDAO;
import datos.RegistroDaoJDBC;
import domain.Registro;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ramce
 */
public class bb_venta extends javax.swing.JFrame {

    /**
     * Creates new form bb_venta
     */
    public bb_venta() {
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
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Paquetes Vendidos");
        jLabel1.setVerifyInputWhenFocusTarget(false);

        jLabel2.setText("Precio de Venta ");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("VENTA O GANANCIA");

        jButton2.setText("Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("Consultar informacion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(95, 95, 95)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                    .addComponent(jTextField2)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        b_menu menu = new b_menu();
        dispose();
        menu.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Registro r = new Registro();
        try {
            //Registros de la base de datos
            int paquetes = r.getPaquetes();
            int precio_pts = r.getPrecio_paquetes();
            int total = r.getTotal();
            String fecha = r.getFecha();

            //Registros introducidos por el usuario
            int intrpaquetesve = Integer.parseInt(jTextField1.getText());
            int intrpreciove = Integer.parseInt(jTextField2.getText());

            //Operaciones Finales
            int totalvendido = intrpaquetesve * intrpreciove;
            int totalfinal = total + totalvendido;
            int paquetesfinales = paquetes - intrpaquetesve;

            if (paquetesfinales >= 0) {
                System.out.println("\nAntes del UPDATE\nPaquetes de la Base de Datos=" + paquetes + "\nPrecio de Paquetes de la Base de Datos= " + precio_pts);
                System.out.println("Total en la Base de Datos=" + total + "\nPaquetes vendidos=" + intrpaquetesve + "\nPrecio en el que se vendieron=" + intrpreciove);
                System.out.println("Paquetes que hay=" + paquetesfinales + "\nGanancia inical=" + totalvendido + "\nFecha" + fecha + "\nTotal=" + totalfinal);

                Connection conexion = null;
                try {
                    conexion = Conexion.getConnection();
                    if (conexion.getAutoCommit()) {
                        conexion.setAutoCommit(false);
                    }

                    RegistroDAO registroDAO = new RegistroDaoJDBC(conexion);
                    Registro g = new Registro();
                    g.setPaquetes(paquetesfinales);
                    g.setPrecio_paquetes(precio_pts);
                    g.setTotal(totalfinal);
                    g.setFecha(fecha);
                    registroDAO.actualizar(g);

                    System.out.println("DESPUES DEL UPDATE\n " + g.getPaquetes() + " " + g.getPrecio_paquetes() + " " + g.getFecha() + " " + g.getTotal());
                    List<Registro> rgs = registroDAO.seleccionar();

                    for (Registro rg : rgs) {
                        System.out.println(" 2.- Registro DTO= " + rg);
                    }
                    conexion.commit();

                    JOptionPane.showMessageDialog(this, "Ganancia Insertada\nGanacia de la venta=" + totalvendido + "\nPaquetes en existencia=" + g.getPaquetes() + "\nTOTAL=" + g.getTotal());
                    b_menu menu = new b_menu();
                    dispose();
                    menu.show();
                } catch (SQLException ex) {
                    ex.printStackTrace(System.out);
                    System.out.println("Entramos al rollback");
                    try {
                        conexion.rollback();
                    } catch (SQLException ex1) {
                        ex1.printStackTrace(System.out);
                    }
                }

            } else {
                JOptionPane.showMessageDialog(this, "Favor de verificar la cantidad de Paquetes Vendidos por que no hay la cantidad que quieres vender\nTienes disponible=" + paquetes + " paquetes y quieres vender=" + intrpaquetesve);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Deben ser numeros enteros");

        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Registro r = new Registro();
        JOptionPane.showMessageDialog(this, "INFORMACION\nPaquetes de galletas en existencia=" + r.getPaquetes() + "\nPrecio en el que se compraron esos paquetes=" + r.getPrecio_paquetes() + "\nFecha de compra de galletas=" + r.getFecha() + "\nTOTAL=" + r.getTotal());
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(bb_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bb_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bb_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bb_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Registro r = new Registro();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bb_venta().setVisible(true);
            }
        });

        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            RegistroDAO registroDAO = new RegistroDaoJDBC(conexion);

            //MOSTRAR PAQUETES PRECIO_PAQUETES TOTAL
            List<Registro> registros = registroDAO.seleccionar();
            for (Registro registro : registros) {
                System.out.println("Registro DTO= " + registro);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }

        int paquetes = r.getPaquetes();
        int precio_paquetes = r.getPrecio_paquetes();
        int total = r.getTotal();
        String fecha = r.getFecha();

        System.out.println("paquetes= " + paquetes + ", precio_paquetes= " + precio_paquetes + ", total= " + total + ", fecha= " + fecha);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}