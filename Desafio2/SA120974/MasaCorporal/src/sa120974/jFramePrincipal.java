/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa120974;

import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author sanch
 */
public class jFramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form jFramePrincipal
     */
    public jFramePrincipal() {
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

        buttonGroupPeso = new javax.swing.ButtonGroup();
        buttonGroupAltura = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBtnLimpiar = new javax.swing.JButton();
        jBtnEnviar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTxtNombres = new javax.swing.JTextField();
        jTxtEdad = new javax.swing.JTextField();
        jTxtPeso = new javax.swing.JTextField();
        jTxtAltura = new javax.swing.JTextField();
        jCmbGenero = new javax.swing.JComboBox<>();
        jRbtnKilos = new javax.swing.JRadioButton();
        jRbtnLibras = new javax.swing.JRadioButton();
        jRbtnMetros = new javax.swing.JRadioButton();
        jRbtnPies = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombres:");

        jLabel2.setText("Edad:");

        jLabel3.setText("Genero:");

        jLabel4.setText("Altura:");

        jBtnLimpiar.setText("Limpiar");
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        jBtnEnviar.setText("Enviar");
        jBtnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEnviarActionPerformed(evt);
            }
        });

        jLabel5.setText("Peso:");

        jTxtNombres.setToolTipText("");

        jTxtEdad.setToolTipText("");

        jTxtPeso.setToolTipText("");

        jCmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        buttonGroupPeso.add(jRbtnKilos);
        jRbtnKilos.setText("Kilos");

        buttonGroupPeso.add(jRbtnLibras);
        jRbtnLibras.setText("Libras");

        buttonGroupAltura.add(jRbtnMetros);
        jRbtnMetros.setText("Metros");

        buttonGroupAltura.add(jRbtnPies);
        jRbtnPies.setText("Pies");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRbtnMetros)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                                .addComponent(jRbtnPies))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRbtnKilos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRbtnLibras))
                            .addComponent(jTxtNombres)
                            .addComponent(jTxtEdad)
                            .addComponent(jCmbGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTxtPeso)
                            .addComponent(jTxtAltura)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBtnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnEnviar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRbtnKilos)
                    .addComponent(jRbtnLibras))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRbtnMetros)
                    .addComponent(jRbtnPies))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnEnviar)
                    .addComponent(jBtnLimpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
        // TODO add your handling code here:
        this.jTxtNombres.setText("");
        this.jTxtEdad.setText("");
        this.jTxtAltura.setText("");
        this.jTxtPeso.setText("");
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    private void jBtnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEnviarActionPerformed
        // TODO add your handling code here:
        try
        {
            double dPeso, dAltura, dIMC;
            int edad = Integer.parseInt(jTxtEdad.getText());
            Color color;
            JFrame jFrameResultado = new JFrame("Resultado");
            jFrameResultado.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

            String respuesta = "El diagnostico para ";
            if (jCmbGenero.getSelectedIndex() == 0)
                respuesta += "el ";
            else
                respuesta += "la ";
            respuesta += "paciente " + jTxtNombres.getText() + " de " + jTxtEdad.getText() + " años de edad,"
                    + "\ntiene un indice de masa corporal de ";

            if (jRbtnLibras.isSelected())
                dPeso = Double.parseDouble(jTxtPeso.getText()) / 2.20462;
            else
                dPeso = Double.parseDouble(jTxtPeso.getText());
            if (jRbtnPies.isSelected())
                dAltura = Double.parseDouble(jTxtAltura.getText()) / 3.28084;
            else
                dAltura = Double.parseDouble(jTxtAltura.getText());

            dIMC = dPeso / (dAltura*dAltura);

            respuesta += round(dIMC, 2) + ":\nSu clasificacion es de:\n";

            if (jCmbGenero.getSelectedIndex() == 0)
            {
                if (dIMC > 40)
                {
                    respuesta += "Fuerte obesidad.";
                    color = new Color(102, 29, 3);
                }
                else if (dIMC > 31)
                {
                    respuesta += "Obesidad";
                    color = new Color(216, 50, 20);
                }
                else if (dIMC > 26)
                {
                    respuesta += "Sobrepeso";
                    color = new Color(227, 161, 13);
                }
                else if (dIMC > 20)
                {
                    respuesta += "Peso normal";
                    color = new Color(70, 125, 7);
                }
                else
                {
                    respuesta += "Falta de peso";
                    color = new Color(119, 201, 205);
                }
            }
            else
            {
                if (dIMC > 40)
                {
                    respuesta += "Fuerte obesidad.";
                    color = new Color(119, 201, 205);
                }
                else if (dIMC > 31)
                {
                    respuesta += "Obesidad";
                    color = new Color(70, 125, 7);
                }
                else if (dIMC > 25)
                {
                    respuesta += "Sobrepeso";
                    color = new Color(227, 161, 13);
                }
                else if (dIMC > 19)
                {
                    respuesta += "Peso normal";
                    color = new Color(216, 50, 20);
                }
                else
                {
                    respuesta += "Falta de peso";
                    color = new Color(102, 29, 3);
                }
            }
            ColorJPanel colorJPanel = new ColorJPanel(respuesta, color);
            jFrameResultado.add(colorJPanel);
            jFrameResultado.setSize(400, 180);
            jFrameResultado.setVisible(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Ocurrio una excepcion");
        }
    }//GEN-LAST:event_jBtnEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(jFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFramePrincipal().setVisible(true);
            }
        });
    }
    
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupAltura;
    private javax.swing.ButtonGroup buttonGroupPeso;
    private javax.swing.JButton jBtnEnviar;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JComboBox<String> jCmbGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRbtnKilos;
    private javax.swing.JRadioButton jRbtnLibras;
    private javax.swing.JRadioButton jRbtnMetros;
    private javax.swing.JRadioButton jRbtnPies;
    private javax.swing.JTextField jTxtAltura;
    private javax.swing.JTextField jTxtEdad;
    private javax.swing.JTextField jTxtNombres;
    private javax.swing.JTextField jTxtPeso;
    // End of variables declaration//GEN-END:variables
}
