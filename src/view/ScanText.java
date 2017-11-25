/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import clasespersonalizadas.PanelImagenesMiniaturas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author alan
 */
public class ScanText extends javax.swing.JFrame {

    /**
     * Creates new form ScanText
     */
    public ScanText() {
        initComponents();
        PanelImagenesMiniaturas lbl = new PanelImagenesMiniaturas("1","/home/alan/NetBeansProjects/LectorOCR/src/tmp/10");
        lbl.setSize(200, 200);
        PanelImagenesMiniaturas lbl2;
        lbl2 = new PanelImagenesMiniaturas("2","/home/alan/NetBeansProjects/LectorOCR/src/tmp/11");
        lbl.setToolTipText("1");
        lbl2.setToolTipText("2");
     
        jPanelVistaMiniatura.add(lbl2);
        jPanelVistaMiniatura.add(lbl);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jPanelAreaTrabajo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelVistaMiniatura = new javax.swing.JPanel();
        jTabbedPaneTrabajo = new javax.swing.JTabbedPane();
        jPanelPalabrasClaves = new javax.swing.JPanel();
        jPanelSectorBusqueda = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanelListaPalabras = new javax.swing.JPanel();
        jScrollPanePalabrasClaves = new javax.swing.JScrollPane();
        jListPalabrasClaves = new javax.swing.JList<>();
        jButtonProcesar = new javax.swing.JButton();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuHojas = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPrincipal.setLayout(new java.awt.BorderLayout());

        jPanelAreaTrabajo.setLayout(new java.awt.BorderLayout());

        jPanelVistaMiniatura.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout();
        flowLayout1.setAlignOnBaseline(true);
        jPanelVistaMiniatura.setLayout(flowLayout1);
        jScrollPane1.setViewportView(jPanelVistaMiniatura);

        jPanelAreaTrabajo.add(jScrollPane1, java.awt.BorderLayout.SOUTH);

        jPanelPrincipal.add(jPanelAreaTrabajo, java.awt.BorderLayout.CENTER);

        jPanelPalabrasClaves.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelPalabrasClaves.setLayout(new java.awt.BorderLayout());

        jPanelSectorBusqueda.setLayout(new javax.swing.BoxLayout(jPanelSectorBusqueda, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setText("Buscar palabra");
        jPanelSectorBusqueda.add(jLabel2);

        jTextField1.setColumns(20);
        jPanelSectorBusqueda.add(jTextField1);

        jPanelPalabrasClaves.add(jPanelSectorBusqueda, java.awt.BorderLayout.PAGE_START);

        jPanelListaPalabras.setLayout(new java.awt.BorderLayout());

        jScrollPanePalabrasClaves.setViewportView(jListPalabrasClaves);

        jPanelListaPalabras.add(jScrollPanePalabrasClaves, java.awt.BorderLayout.CENTER);

        jButtonProcesar.setText("Procesar");
        jPanelListaPalabras.add(jButtonProcesar, java.awt.BorderLayout.PAGE_END);

        jPanelPalabrasClaves.add(jPanelListaPalabras, java.awt.BorderLayout.CENTER);

        jTabbedPaneTrabajo.addTab("Palabras", jPanelPalabrasClaves);

        jPanelPrincipal.add(jTabbedPaneTrabajo, java.awt.BorderLayout.WEST);

        getContentPane().add(jPanelPrincipal, java.awt.BorderLayout.CENTER);

        jMenuBarPrincipal.setToolTipText("");

        jMenuArchivo.setText("File");
        jMenuArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuArchivoMouseClicked(evt);
            }
        });
        jMenuBarPrincipal.add(jMenuArchivo);

        jMenuHojas.setText("Edit");
        jMenuBarPrincipal.add(jMenuHojas);

        setJMenuBar(jMenuBarPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuArchivoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuArchivoMouseClicked

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
            java.util.logging.Logger.getLogger(ScanText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScanText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScanText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScanText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScanText().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonProcesar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jListPalabrasClaves;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenu jMenuHojas;
    private javax.swing.JPanel jPanelAreaTrabajo;
    private javax.swing.JPanel jPanelListaPalabras;
    private javax.swing.JPanel jPanelPalabrasClaves;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelSectorBusqueda;
    private javax.swing.JPanel jPanelVistaMiniatura;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPanePalabrasClaves;
    private javax.swing.JTabbedPane jTabbedPaneTrabajo;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
