/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.p2t1.vista;

import com.mycompany.p2t1.controlador.ActivoFijoControlador;
import java.awt.TextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author PSI
 */
public class ActivoFijoVista extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialog
     */
    public ActivoFijoControlador activoFijoControlador;
    public ActivoFijoVista(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        activoFijoControlador=new ActivoFijoControlador();
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
        textFieldCode = new java.awt.TextField();
        textFieldNombre = new java.awt.TextField();
        textFieldPrecio = new java.awt.TextField();
        textFieldMarca = new java.awt.TextField();
        textFieldProveedor = new java.awt.TextField();
        textFieldNExistencias = new java.awt.TextField();
        textFieldVidaUtil = new java.awt.TextField();
        textFieldUbicacion = new java.awt.TextField();
        button3 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        textFieldCode.setText("000");
        textFieldCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldCodeKeyTyped(evt);
            }
        });

        textFieldNombre.setText("LOREM IPSUM");

        textFieldPrecio.setText("00.00");
        textFieldPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldPrecioKeyTyped(evt);
            }
        });

        textFieldMarca.setText("LOREM IPSUM");

        textFieldProveedor.setText("LOREM IPSUM");

        textFieldNExistencias.setText("999");
        textFieldNExistencias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldNExistenciasKeyTyped(evt);
            }
        });

        textFieldVidaUtil.setText("0");
        textFieldVidaUtil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldVidaUtilKeyTyped(evt);
            }
        });

        textFieldUbicacion.setText("LOREM IPSUM");

        button3.setLabel("Crear");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        jLabel1.setText("CODIGO");

        jLabel2.setText("NOMBRE");

        jLabel3.setText("PRECIO");

        jLabel4.setText("MARCA");

        jLabel5.setText("N. EXISTENCIAS");

        jLabel6.setText("PROVEEDOR");

        jLabel7.setText("VIDA UTIL");

        jLabel8.setText("UBICACION");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("CREAR ACTIVO FIJO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldNExistencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldVidaUtil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(155, 155, 155)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(textFieldUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(textFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(75, 75, 75))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldNExistencias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldVidaUtil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        if(textFieldCode.getText().equals("") || 
                textFieldNombre.getText().equals("") || 
                textFieldPrecio.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Un activo fijo debe tener al menos código, nombre y precio");
        }else{
            activoFijoControlador.crearActivoFijo(textFieldCode.getText(), textFieldNombre.getText(),
                     Double.parseDouble(textFieldPrecio.getText()), textFieldUbicacion.getText(),  
                     Integer.parseInt(textFieldNExistencias.getText()), 
                    Integer.parseInt(textFieldVidaUtil.getText()), 
                    textFieldMarca.getText(), textFieldProveedor.getText());

            JOptionPane.showMessageDialog(null, "Activo fijo creado. \n Codigo: " 
                    + textFieldCode.getText()+ " \n Nombre: "+
                        textFieldNombre.getText()+ " \n Precio: "+
                        textFieldPrecio.getText()+ " \n Marca: "+
                        textFieldMarca.getText()+ " \n NExistencias: "+
                        textFieldNExistencias.getText()+ " \n Proveedor: "+
                        textFieldProveedor.getText()+ " \n VidaUtil: "+
                        textFieldVidaUtil.getText()+ " \n Ubicacion: "+
                        textFieldUbicacion.getText()
            );

        }
    }//GEN-LAST:event_button3ActionPerformed

    private void textFieldCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldCodeKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_textFieldCodeKeyTyped

    private void textFieldPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldPrecioKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        TextField textField = (TextField) evt.getSource();
        String text = textField.getText();

        if (!Character.isDigit(c) && c != '.' || (c == '.' && text.contains("."))) {
            evt.consume();
        }
    }//GEN-LAST:event_textFieldPrecioKeyTyped

    private void textFieldNExistenciasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldNExistenciasKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_textFieldNExistenciasKeyTyped

    private void textFieldVidaUtilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldVidaUtilKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_textFieldVidaUtilKeyTyped

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
            java.util.logging.Logger.getLogger(ActivoFijoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActivoFijoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActivoFijoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActivoFijoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ActivoFijoVista dialog = new ActivoFijoVista(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private java.awt.TextField textFieldCode;
    private java.awt.TextField textFieldMarca;
    private java.awt.TextField textFieldNExistencias;
    private java.awt.TextField textFieldNombre;
    private java.awt.TextField textFieldPrecio;
    private java.awt.TextField textFieldProveedor;
    private java.awt.TextField textFieldUbicacion;
    private java.awt.TextField textFieldVidaUtil;
    // End of variables declaration//GEN-END:variables
}
