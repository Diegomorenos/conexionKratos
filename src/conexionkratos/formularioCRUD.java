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
public class formularioCRUD extends javax.swing.JFrame {

    /**
     * Creates new form formularioCRUD
     */
    public formularioCRUD() {
        initComponents();
    }
    
    void mostrarDatos(String valor){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Numero");
        modelo.addColumn("Estado");
        modelo.addColumn("Tipo");
        modelo.addColumn("Tarifa");
        modelo.addColumn("Capacidad");
        modelo.addColumn("Imagen");
        
        tablaHab.setModel(modelo);
        String sql = "";
        if (valor.equals("")){
            sql = "SELECT * FROM habitacion";
        }else{
            sql = "SELECT * FROM habitacion WHERE hab_numero = '" + valor +"'";
        }
        String []datos = new String[6];
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                
                modelo.addRow(datos);
            }
            tablaHab.setModel(modelo);
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
        jLabel1 = new javax.swing.JLabel();
        boxEstado = new javax.swing.JTextField();
        boxNro = new javax.swing.JTextField();
        boxTarifa = new javax.swing.JTextField();
        boxTipo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        boxCap = new javax.swing.JTextField();
        boxImagen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        borrar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        listar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHab = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMINISTRACION HABITACIONES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 28, 770, -1));

        boxEstado.setBackground(new java.awt.Color(255, 255, 255));
        boxEstado.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        boxEstado.setForeground(new java.awt.Color(51, 51, 51));
        boxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(boxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 292, 30));

        boxNro.setBackground(new java.awt.Color(255, 255, 255));
        boxNro.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        boxNro.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(boxNro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 140, 30));

        boxTarifa.setBackground(new java.awt.Color(255, 255, 255));
        boxTarifa.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        boxTarifa.setForeground(new java.awt.Color(51, 51, 51));
        boxTarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTarifaActionPerformed(evt);
            }
        });
        jPanel1.add(boxTarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 292, 30));

        boxTipo.setBackground(new java.awt.Color(255, 255, 255));
        boxTipo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        boxTipo.setForeground(new java.awt.Color(51, 51, 51));
        boxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoActionPerformed(evt);
            }
        });
        jPanel1.add(boxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 292, 30));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Numero habitacion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 212, 30));

        boxCap.setBackground(new java.awt.Color(255, 255, 255));
        boxCap.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        boxCap.setForeground(new java.awt.Color(51, 51, 51));
        boxCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCapActionPerformed(evt);
            }
        });
        jPanel1.add(boxCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 292, 30));

        boxImagen.setBackground(new java.awt.Color(255, 255, 255));
        boxImagen.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        boxImagen.setForeground(new java.awt.Color(51, 51, 51));
        boxImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxImagenActionPerformed(evt);
            }
        });
        jPanel1.add(boxImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 292, 30));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Estado");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 212, 30));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Tipo habitacion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 212, 30));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Tarifa");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 212, 30));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Capacidad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 212, 30));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Imagen");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 212, 30));

        borrar.setBackground(new java.awt.Color(204, 102, 0));
        borrar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        borrar.setText("BORRAR");
        borrar.setToolTipText("");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        jPanel1.add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 150, 50));

        buscar.setBackground(new java.awt.Color(102, 102, 102));
        buscar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        buscar.setText("BUSCAR");
        buscar.setToolTipText("");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 150, 50));

        guardar.setBackground(new java.awt.Color(0, 153, 102));
        guardar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        guardar.setText("GUARDAR");
        guardar.setToolTipText("");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 150, 50));

        listar.setBackground(new java.awt.Color(51, 102, 255));
        listar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        listar.setText("LISTAR");
        listar.setToolTipText("");
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });
        jPanel1.add(listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 150, 50));

        eliminar.setBackground(new java.awt.Color(153, 0, 51));
        eliminar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        eliminar.setText("ELIMINAR");
        eliminar.setToolTipText("");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 150, 50));

        tablaHab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaHab);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 690, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEstadoActionPerformed

    private void boxTarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTarifaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTarifaActionPerformed

    private void boxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTipoActionPerformed

    private void boxCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCapActionPerformed

    private void boxImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxImagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxImagenActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        // TODO add your handling code here:
                boxNro.setText("");
                boxEstado.setText("");
                boxTipo.setText("");
                boxTarifa.setText("");
                boxCap.setText("");
                boxImagen.setText("");
        
    }//GEN-LAST:event_borrarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:

        try{
            PreparedStatement pst = cn.prepareStatement("INSERT INTO habitacion VALUES (?,?,?,?,?,?)");
            pst.setString(1,boxNro.getText());
            pst.setString(2,boxEstado.getText());
            pst.setString(3,boxTipo.getText());
            pst.setString(4,boxTarifa.getText());
            pst.setString(5,boxCap.getText());
            pst.setString(6,boxImagen.getText());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Datos Almacenados");
            
        }
        catch(Exception e){
                  JOptionPane.showMessageDialog(null, "Datos NO Almacenados"); 
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        String el = boxNro.getText();
        PreparedStatement pst;
        try {
            pst = cn.prepareStatement("DELETE FROM habitacion WHERE hab_numero = '"+el+"'");
            pst.execute();
            JOptionPane.showMessageDialog(null, "Habitacion eliminada con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo");
        }
        
    }//GEN-LAST:event_eliminarActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        // TODO add your handling code here:
        mostrarDatos("");
    }//GEN-LAST:event_listarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        mostrarDatos(boxNro.getText());
    }//GEN-LAST:event_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(formularioCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JTextField boxCap;
    private javax.swing.JTextField boxEstado;
    private javax.swing.JTextField boxImagen;
    private javax.swing.JTextField boxNro;
    private javax.swing.JTextField boxTarifa;
    private javax.swing.JTextField boxTipo;
    private javax.swing.JButton buscar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listar;
    private javax.swing.JTable tablaHab;
    // End of variables declaration//GEN-END:variables

    Conectar cc = new Conectar();
    Connection cn = cc.conexion();
}
