
package Vista;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Vista extends javax.swing.JFrame {


    public Vista() {
        initComponents();
    }

    public JTextField getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(JTextField antiguedad) {
        this.antiguedad = antiguedad;
    }

    public JRadioButton getAuto() {
        return auto;
    }

    public void setAuto(JRadioButton auto) {
        this.auto = auto;
    }

    public JButton getCalcular() {
        return calcular;
    }

    public void setCalcular(JButton calcular) {
        this.calcular = calcular;
    }

    public JRadioButton getCamion() {
        return camion;
    }

    public void setCamion(JRadioButton camion) {
        this.camion = camion;
    }

    public JRadioButton getCamioneta() {
        return camioneta;
    }

    public void setCamioneta(JRadioButton camioneta) {
        this.camioneta = camioneta;
    }

    public JTextField getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(JTextField capacidad) {
        this.capacidad = capacidad;
    }

    public JTextField getCilindro() {
        return cilindro;
    }

    public void setCilindro(JTextField cilindro) {
        this.cilindro = cilindro;
    }

    public JTextField getSalida() {
        return salida;
    }

    public void setSalida(JTextField salida) {
        this.salida = salida;
    }

    public JTextField getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(JTextField tonelaje) {
        this.tonelaje = tonelaje;
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        auto = new javax.swing.JRadioButton();
        camioneta = new javax.swing.JRadioButton();
        camion = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        antiguedad = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cilindro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        capacidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tonelaje = new javax.swing.JTextField();
        salida = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Modelo");

        jLabel2.setText("Calculo de Matricula");

        grupo1.add(auto);
        auto.setText("Auto");
        auto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoActionPerformed(evt);
            }
        });

        grupo1.add(camioneta);
        camioneta.setText("Camioneta");
        camioneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camionetaActionPerformed(evt);
            }
        });

        grupo1.add(camion);
        camion.setText("Camion");
        camion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camionActionPerformed(evt);
            }
        });

        jLabel3.setText("Antiguedad");

        antiguedad.setText("0");
        antiguedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antiguedadActionPerformed(evt);
            }
        });

        calcular.setText("Calcular Matricula");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        jLabel4.setText("Cilindraje");

        cilindro.setText("0");
        cilindro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cilindroActionPerformed(evt);
            }
        });

        jLabel5.setText("Capacidad");

        capacidad.setText("0");
        capacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacidadActionPerformed(evt);
            }
        });

        jLabel6.setText("Tonelaje");

        tonelaje.setText("0");
        tonelaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tonelajeActionPerformed(evt);
            }
        });

        salida.setEditable(false);
        salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tonelaje))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(calcular))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(salida, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(auto)
                                        .addGap(18, 18, 18)
                                        .addComponent(camioneta)
                                        .addGap(18, 18, 18)
                                        .addComponent(camion))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cilindro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                        .addComponent(antiguedad, javax.swing.GroupLayout.Alignment.LEADING)))))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(auto)
                    .addComponent(camioneta)
                    .addComponent(camion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(antiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cilindro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tonelaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(calcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void autoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoActionPerformed
        
    }//GEN-LAST:event_autoActionPerformed

    private void camionetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camionetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camionetaActionPerformed

    private void camionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camionActionPerformed

    private void antiguedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antiguedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_antiguedadActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
     //
    }//GEN-LAST:event_calcularActionPerformed

    private void cilindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cilindroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cilindroActionPerformed

    private void capacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capacidadActionPerformed

    private void tonelajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tonelajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tonelajeActionPerformed

    private void salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salidaActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField antiguedad;
    public javax.swing.JRadioButton auto;
    public javax.swing.JButton calcular;
    public javax.swing.JRadioButton camion;
    public javax.swing.JRadioButton camioneta;
    public javax.swing.JTextField capacidad;
    public javax.swing.JTextField cilindro;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField salida;
    public javax.swing.JTextField tonelaje;
    // End of variables declaration//GEN-END:variables


}
