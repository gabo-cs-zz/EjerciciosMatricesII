/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GABRIEL
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        JButton botonesT[] = {cmdCrear, cmdLimpiar};
        JButton botonesF[] = {cmdLlenadoManual, cmdLlenadoAuto, cmdCalcular};
        Helper.habilitarBotones(botonesT);
        Helper.deshabilitarBotones(botonesF);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroColumnas = new javax.swing.JTextField();
        txtNumeroFilas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdLlenadoManual = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdLlenadoAuto = new javax.swing.JButton();
        cmdCrear = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblTablaResultado = new javax.swing.JTable();
        cmbOperacion = new javax.swing.JComboBox<>();
        cmdCalcular = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("MATRICES - LETRAS Y FIGURAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos iniciales:"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("No. de columnas:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 68, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("No. de filas:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 33, -1, -1));
        jPanel2.add(txtNumeroColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 67, 40, -1));
        jPanel2.add(txtNumeroFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 32, 40, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 110));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Acciones:"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdLlenadoManual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdLlenadoManual.setText("LlenarManual");
        cmdLlenadoManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoManualActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenadoManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 65, 110, 30));

        cmdLimpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 65, 100, 30));

        cmdLlenadoAuto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdLlenadoAuto.setText("LlenarAuto");
        cmdLlenadoAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoAutoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenadoAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 25, 100, 30));

        cmdCrear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 25, 110, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 250, 110));

        tblTablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblTablaResultado);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 250, 190));

        cmbOperacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Letra B", "Letra K", "Letra M", "Letra W", "Letra Q", "Letra J", "Letra G", "Letra R", "Figura 1", "Figura 2", "Figura 3", "Figura 4" }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 250, 110, 30));

        cmdCalcular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 290, 110, 30));

        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 250, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(699, 457));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        // TODO add your handling code here:
         try {
            int nc, nf;
            DefaultTableModel tm, tm2;
            nf = Integer.parseInt(txtNumeroFilas.getText());
            nc = Integer.parseInt(txtNumeroColumnas.getText());
            tm = (DefaultTableModel) tblTablaInicial.getModel();
            tm2 = (DefaultTableModel) tblTablaResultado.getModel();
            if (nf < 5 || nc < 5) {
                Helper.mensaje(this, "Por favor considere 5 como el mínimo para filas y columnas.", 2);
                txtNumeroFilas.setText("");
                txtNumeroColumnas.setText("");
                txtNumeroFilas.requestFocusInWindow();
            }
            else if (nf > 10 || nc > 10) {
                Helper.mensaje(this, "Por favor considere 10 como el máximo para filas y columnas.", 2);
                txtNumeroFilas.setText("");
                txtNumeroColumnas.setText("");
                txtNumeroFilas.requestFocusInWindow();
            }
            else {
                Helper.mensaje(this, "Matriz creada exitosamente.", 1);
                tm.setRowCount(nf);
                tm.setColumnCount(nc);
                tm2.setRowCount(nf);
                tm2.setColumnCount(nc);
                txtNumeroFilas.setEditable(false);
                txtNumeroColumnas.setEditable(false);
                JButton botonesT[] = {cmdLlenadoManual, cmdLlenadoAuto, cmdLimpiar};
                JButton botonesF[] = {cmdCrear};
                Helper.habilitarBotones(botonesT);
                Helper.deshabilitarBotones(botonesF);
            }
        } catch (NumberFormatException e) {
            Helper.mensaje(this, "Campo(s) Inválido(s).", 3);
            txtNumeroFilas.setText("");
            txtNumeroColumnas.setText("");
            txtNumeroFilas.requestFocusInWindow();
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLlenadoAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoAutoActionPerformed
        // TODO add your handling code here:
        int nf, nc, n;
        nf = tblTablaInicial.getRowCount();
        nc = tblTablaInicial.getColumnCount();
        Helper.mensaje(this, "Matriz llenada exitosamente.", 1);
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 50 + 1);
                tblTablaInicial.setValueAt(n, i, j);
            }
        }
        JButton botonesT[] = {cmdCalcular, cmdLimpiar};
        JButton botonesF[] = {cmdCrear, cmdLlenadoManual, cmdLlenadoAuto};
        Helper.habilitarBotones(botonesT);
        Helper.deshabilitarBotones(botonesF);
    }//GEN-LAST:event_cmdLlenadoAutoActionPerformed

    private void cmdLlenadoManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoManualActionPerformed
        // TODO add your handling code here:
        int nf, nc, n, sw, res;
        boolean aux = true;
        nf = tblTablaInicial.getRowCount();
        nc = tblTablaInicial.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    sw = 1;
                    try {
                        n = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el elemento en la posición ["+i+"]" + "["+j+"]").trim());
                        tblTablaInicial.setValueAt(n, i, j);
                    } catch (NumberFormatException e) {
                        Helper.mensaje(this, "Digite un número válido", 3);
                        sw = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "¿Estás seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
                        if (res == 0) {
                            Helper.mensaje(this, "Debe llenar la matriz.", 2);
                            sw = 1;
                            i = nf;
                            j = nc;
                            aux = false;
                            Helper.limpiadoTabla(tblTablaInicial);
                            Helper.limpiadoTabla(tblTablaResultado);
                        }
                        else {
                            sw = 0;
                        }
                    }
                } while (sw == 0);
            }
        }
        //Controlo los botones de llenar para  cuando se salgan del confirm dialog:
        if (aux == false) {
            cmdLlenadoAuto.setEnabled(true);
            cmdLlenadoManual.setEnabled(true);
        }
        else {
            Helper.mensaje(this, "Matriz llenada exitosamente.", 1);
            cmdLlenadoAuto.setEnabled(false);
            cmdLlenadoManual.setEnabled(false);
        }//

        cmdCalcular.setEnabled(aux);
        JButton botonesT[] = {cmdLimpiar};
        JButton botonesF[] = {cmdCrear};
        Helper.habilitarBotones(botonesT);
        Helper.deshabilitarBotones(botonesF);
    }//GEN-LAST:event_cmdLlenadoManualActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        // TODO add your handling code here:
        Helper.porDefectoTabla(tblTablaInicial);
        Helper.porDefectoTabla(tblTablaResultado);
        txtNumeroFilas.setText("");
        txtNumeroFilas.setEditable(true);
        txtNumeroColumnas.setText("");
        txtNumeroColumnas.setEditable(true);
        txtNumeroFilas.requestFocusInWindow();
        cmbOperacion.setSelectedIndex(0);
        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdLlenadoManual, cmdLlenadoAuto, cmdCalcular};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        // TODO add your handling code here:
        Helper.limpiadoTabla(tblTablaResultado);
        int nf, nc, op;
        DefaultTableModel tm2;
        nf = Integer.parseInt(txtNumeroFilas.getText());
        nc = Integer.parseInt(txtNumeroColumnas.getText());
        tm2 = (DefaultTableModel)tblTablaResultado.getModel();
        tm2.setRowCount(nf);
        tm2.setColumnCount(nc);
        op = cmbOperacion.getSelectedIndex();
        switch (op) {
            case 0:
                if ((nf % 2 == 0 && nc % 2 == 0) || (nf != nc)) {
                    Helper.mensaje(this, "Para visualizar la letra B, el número de filas y columnas deben ser iguales e impares.", 3);
                }
                else {
                    Helper.letraB(tblTablaInicial, tblTablaResultado);
                }
                break;
            case 1:
                if ((nc*2 - 3) != nf ) {
                    Helper.mensaje(this, "Asegúrese de que se pueda visalizar la letra K correctamente.", 3);
                }
                else {
                    Helper.letraK(tblTablaInicial, tblTablaResultado);
                }
                break;
            case 2:
                if ((nf % 2 == 0 && nc % 2 == 0) || (nf != nc)) {
                    Helper.mensaje(this, "Para visualizar la letra M, el número de filas y columnas deben ser iguales e impares.", 3);
                }
                else {
                    Helper.letraM(tblTablaInicial, tblTablaResultado);
                }
                break;
            case 3:
                if ((nf % 2 == 0 || nc % 2 == 0)) {
                    Helper.mensaje(this, "Para visualizar la letra W, el número de filas y columnas deben ser impares.", 3);
                
                }else {
                    Helper.letraW(tblTablaInicial, tblTablaResultado);
                }
                break;
            case 4:
                Helper.letraQ(tblTablaInicial, tblTablaResultado);
                break;
            case 5:
                if (nc % 2 == 0) {
                    Helper.mensaje(this, "Para visualizar la letra J, el número de columnas debe ser impar.", 3);
                }
                else{ 
                    Helper.letraJ(tblTablaInicial, tblTablaResultado);
                }
                break;
            case 11:
                if ((nf % 2 == 0 && nc % 2 == 0) || (nf != nc)) {
                    Helper.mensaje(this, "Para visualizar esta figura, el número de filas y columnas deben ser iguales e impares.", 3);
                }
                else{ 
                    Helper.figura4(tblTablaInicial, tblTablaResultado);
                }
                break;
        }
        JButton botonesT[] = {cmdLimpiar};
        JButton botonesF[] = {cmdCrear, cmdLlenadoManual, cmdLlenadoAuto};
        Helper.habilitarBotones(botonesT);
        Helper.deshabilitarBotones(botonesF);
    }//GEN-LAST:event_cmdCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdLlenadoAuto;
    private javax.swing.JButton cmdLlenadoManual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTable tblTablaResultado;
    private javax.swing.JTextField txtNumeroColumnas;
    private javax.swing.JTextField txtNumeroFilas;
    // End of variables declaration//GEN-END:variables
}
