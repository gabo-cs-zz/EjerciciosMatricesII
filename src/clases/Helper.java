/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GABRIEL
 */
public class Helper {

    public static void mensaje(Component ventana, String mensaje, int tipo_mensaje) {
        switch (tipo_mensaje) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "INFO", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "ERROR", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    public static void limpiadoTabla(JTable tabla1) {
        int nf, nc;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);
            }
        }
    }

    public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla1.getModel();
        tm.setRowCount(0);
        tm.setColumnCount(0);
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);
        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);
        }
    }
    
    public static void letraB(JTable tabla1, JTable tabla2){
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (((i == 0 || j == 0 || i == nf/2 ||i == nf - 1) && j!=nc-1) || ((i != 0 && i!= nf/2 && i != nf-1) && j == nc-1)) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }
    
    public static void figura4(JTable tabla1, JTable tabla2){
        int nf, m;
        nf = tabla1.getRowCount();
        m = nf/2;
        for (int i = 0; i <= m; i++) {
            tabla2.setValueAt(tabla1.getValueAt(i, m-i), i, m-i);
            tabla2.setValueAt(tabla1.getValueAt(i, m+i), i, m+i);
            tabla2.setValueAt(tabla1.getValueAt(nf-i-1, m-i), nf-i-1, m-i);
            tabla2.setValueAt(tabla1.getValueAt(nf-i-1, m+i), nf-i-1, m+i);
        }
    }
    
}
