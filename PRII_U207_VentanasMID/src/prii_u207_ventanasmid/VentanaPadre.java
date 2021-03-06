package prii_u207_ventanasmid;

import static java.lang.System.exit;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
/**
 * @author Katherine Arzate Serrano
 * @author Carlos Sebastian Madrigal Rodriguez
 */
public class VentanaPadre extends javax.swing.JFrame {

    private final JDesktopPane escritorio ; 
    
    public VentanaPadre() {
    escritorio = new JDesktopPane();
    this.setContentPane(escritorio);
    this.pack();     
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        mbarAutores = new javax.swing.JMenuBar();
        menuOrdenTrabajo = new javax.swing.JMenu();
        mitemNuevaOrden = new javax.swing.JMenuItem();
        mitemSalir = new javax.swing.JMenuItem();
        menuAcerca = new javax.swing.JMenu();
        mitemAutores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );

        menuOrdenTrabajo.setText("Orden de trabajo");

        mitemNuevaOrden.setText("Nueva orden");
        mitemNuevaOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemNuevaOrdenActionPerformed(evt);
            }
        });
        menuOrdenTrabajo.add(mitemNuevaOrden);

        mitemSalir.setText("Salir");
        mitemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemSalirActionPerformed(evt);
            }
        });
        menuOrdenTrabajo.add(mitemSalir);

        mbarAutores.add(menuOrdenTrabajo);

        menuAcerca.setText("Acerca de ");

        mitemAutores.setText("Autores");
        mitemAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemAutoresActionPerformed(evt);
            }
        });
        menuAcerca.add(mitemAutores);

        mbarAutores.add(menuAcerca);

        setJMenuBar(mbarAutores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitemAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemAutoresActionPerformed
        JOptionPane.showMessageDialog(null, "Alumnos: \nKatherine Arzate Serrano \nCarlos Sebastian Madrigal Rodriguez");
    }//GEN-LAST:event_mitemAutoresActionPerformed

    private void mitemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemSalirActionPerformed
        exit(0);
    }//GEN-LAST:event_mitemSalirActionPerformed

    private void mitemNuevaOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemNuevaOrdenActionPerformed
        // TODO add your handling code here:
        JInternalFrame vhija= new JInternalFrame("Orden de trabajo",true,true,false,true);

        PanelHijo hijo=new PanelHijo();
        vhija.add(hijo);
        vhija.pack();
        vhija.setVisible(true);

        escritorio.add(vhija); 
    }//GEN-LAST:event_mitemNuevaOrdenActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPadre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar mbarAutores;
    private javax.swing.JMenu menuAcerca;
    private javax.swing.JMenu menuOrdenTrabajo;
    private javax.swing.JMenuItem mitemAutores;
    private javax.swing.JMenuItem mitemNuevaOrden;
    private javax.swing.JMenuItem mitemSalir;
    // End of variables declaration//GEN-END:variables
}
