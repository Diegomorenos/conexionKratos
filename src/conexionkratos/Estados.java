/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conexionkratos;

import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author SENA
 */
public class Estados extends javax.swing.JFrame {

    /**
     * Creates new form Estados
     */
    public Estados() {
        initComponents();
    }
    
    void mostrarDatos(String valor){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Estado");
        
        tbEstados.setModel(modelo);
        String sql = "";
        if (valor.equals("")){
            sql = "SELECT * FROM estados";
        }else{
            sql = "SELECT * FROM estados WHERE est_id = '" + valor +"'";
        }
        String []datos = new String[2];
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                
                modelo.addRow(datos);
            }
            tbEstados.setModel(modelo);
        }
        catch(SQLException ex){
            
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        boxNroEstado = new javax.swing.JTextField();
        boxEstado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        listar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEstados = new javax.swing.JTable();
        borrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADMINISTRACION ESTADOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 580, -1));

        boxNroEstado.setBackground(new java.awt.Color(255, 255, 255));
        boxNroEstado.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        boxNroEstado.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(boxNroEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 100, 30));

        boxEstado.setBackground(new java.awt.Color(255, 255, 255));
        boxEstado.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        boxEstado.setForeground(new java.awt.Color(51, 51, 51));
        boxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(boxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 170, 30));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre Estado");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, 30));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Codigo Estado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 140, 30));

        volver.setBackground(new java.awt.Color(0, 51, 51));
        volver.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        volver.setText("VOLVER");
        volver.setToolTipText("");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel1.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 610, 150, 50));

        listar.setBackground(new java.awt.Color(51, 102, 255));
        listar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        listar.setText("LISTAR");
        listar.setToolTipText("");
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });
        jPanel1.add(listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 150, 50));

        guardar.setBackground(new java.awt.Color(0, 153, 102));
        guardar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        guardar.setText("GUARDAR");
        guardar.setToolTipText("");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 150, 50));

        eliminar.setBackground(new java.awt.Color(153, 0, 51));
        eliminar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        eliminar.setText("ELIMINAR");
        eliminar.setToolTipText("");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 150, 50));

        tbEstados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbEstados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, 280));

        borrar1.setBackground(new java.awt.Color(204, 102, 0));
        borrar1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        borrar1.setText("BORRAR");
        borrar1.setToolTipText("");
        borrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(borrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 150, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEstadoActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        formularioCRUD opcionVolver = new formularioCRUD();
        opcionVolver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        // TODO add your handling code here:
        mostrarDatos("");
    }//GEN-LAST:event_listarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:

        try{
            PreparedStatement pst = cn.prepareStatement("INSERT INTO estados VALUES (?,?)");
            pst.setString(1,boxNroEstado.getText());
            pst.setString(2,boxEstado.getText());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Datos Almacenados");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Datos NO Almacenados");
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        String el = boxNroEstado.getText();
        PreparedStatement pst;
        try {
            pst = cn.prepareStatement("DELETE FROM estados WHERE est_id = '"+el+"'");
            pst.execute();
            JOptionPane.showMessageDialog(null, "Estado eliminado con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo");
        }

    }//GEN-LAST:event_eliminarActionPerformed

    private void borrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar1ActionPerformed
        // TODO add your handling code here:
            boxNroEstado.setText("");
            boxEstado.setText("");
    }//GEN-LAST:event_borrar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Estados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar1;
    private javax.swing.JTextField boxEstado;
    private javax.swing.JTextField boxNroEstado;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listar;
    private javax.swing.JTable tbEstados;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
    
    Conectar cc = new Conectar();
    Connection cn = cc.conexion();
}
