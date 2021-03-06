package prii_u301_agencia;

//<<<<<<< HEAD
import agregar_gestionar.AgenciaAgregar;
import agregar_gestionar.AgenciaGestionar;
import agregar_gestionar.ClienteGestionar;
import agregar_gestionar.ClienteAgregar;
import agregar_gestionar.GarajeAgregar;
import agregar_gestionar.GarajeGestionar;
import agregar_gestionar.ReservaAgregar;
import agregar_gestionar.ReservaGestionar;
import agregar_gestionar.VehiculoAgregar;
import agregar_gestionar.VehiculoGestionar;
//=======
//>>>>>>> f289be80d4a9e9abe0472f884b97ea1fc25a2481
import java.io.FileNotFoundException;
import static java.lang.System.exit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 * @author Katherine Arzate Serrano
 * @author Carlos Sebastian Madrigal Rodriguez
 */
public class Principal extends javax.swing.JFrame {
    
    private final JDesktopPane escritorio;
    public Principal() {
        escritorio = new JDesktopPane();
        this.setContentPane(escritorio);
        this.pack();
        initComponents();
        this.setSize(720,720);
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mit_Agencia = new javax.swing.JMenuItem();
        jmClientes = new javax.swing.JMenu();
        miAgCliente = new javax.swing.JMenuItem();
        miGeCliente = new javax.swing.JMenuItem();
        jmVehiculos = new javax.swing.JMenu();
        miAgVehiculo = new javax.swing.JMenuItem();
        miGeVehiculo = new javax.swing.JMenuItem();
        jmGarajes = new javax.swing.JMenu();
        miAgGaraje = new javax.swing.JMenuItem();
        miGeGaraje = new javax.swing.JMenuItem();
        jmAgencias = new javax.swing.JMenu();
        miAgAgencia = new javax.swing.JMenuItem();
        miGeAgencia = new javax.swing.JMenuItem();
        mitExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miAgReserva = new javax.swing.JMenuItem();
        miGeReserva = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Catalogos");

        mit_Agencia.setText("Clientes");
        mit_Agencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mit_AgenciaActionPerformed(evt);
            }
        });
        jMenu1.add(mit_Agencia);

        jmClientes.setText("Clientes");

        miAgCliente.setText("Agregar cliente");
        miAgCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAgClienteActionPerformed(evt);
            }
        });
        jmClientes.add(miAgCliente);

        miGeCliente.setText("Gestionar cliente");
        miGeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGeClienteActionPerformed(evt);
            }
        });
        jmClientes.add(miGeCliente);

        jMenu1.add(jmClientes);

        jmVehiculos.setText("Vehiculos");

        miAgVehiculo.setText("Agregar vehiculo");
        miAgVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAgVehiculoActionPerformed(evt);
            }
        });
        jmVehiculos.add(miAgVehiculo);

        miGeVehiculo.setText("Gestionar vehiculo");
        miGeVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGeVehiculoActionPerformed(evt);
            }
        });
        jmVehiculos.add(miGeVehiculo);

        jmGarajes.setText("Garajes");

        miAgGaraje.setText("Agregar garaje");
        miAgGaraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAgGarajeActionPerformed(evt);
            }
        });
        jmGarajes.add(miAgGaraje);

        miGeGaraje.setText("Gestionar garaje");
        miGeGaraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGeGarajeActionPerformed(evt);
            }
        });
        jmGarajes.add(miGeGaraje);

        jmVehiculos.add(jmGarajes);

        jMenu1.add(jmVehiculos);

        jmAgencias.setText("Agencias");

        miAgAgencia.setText("Agregar agencia");
        miAgAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAgAgenciaActionPerformed(evt);
            }
        });
        jmAgencias.add(miAgAgencia);

        miGeAgencia.setText("Gestionar agencia");
        miGeAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGeAgenciaActionPerformed(evt);
            }
        });
        jmAgencias.add(miGeAgencia);

        jMenu1.add(jmAgencias);

        mitExit.setText("Exit");
        mitExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitExitActionPerformed(evt);
            }
        });
        jMenu1.add(mitExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reservas");

        miAgReserva.setText("Agregar reserva");
        miAgReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAgReservaActionPerformed(evt);
            }
        });
        jMenu2.add(miAgReserva);

        miGeReserva.setText("Gestionar reserva");
        miGeReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGeReservaActionPerformed(evt);
            }
        });
        jMenu2.add(miGeReserva);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mit_AgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mit_AgenciaActionPerformed
        try {
            // TODO add your handling code here:
            JInternalFrame vhija = new JInternalFrame("Orden de trabajo",false,true,false,false);
            Visualizador hijo = new Visualizador();
            vhija.add(hijo);
            vhija.pack();
            vhija.setVisible(true);
             
            escritorio.add(vhija);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mit_AgenciaActionPerformed

    private void mitExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitExitActionPerformed
        exit(0);
    }//GEN-LAST:event_mitExitActionPerformed

    private void miAgReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAgReservaActionPerformed
        JInternalFrame vhija = new JInternalFrame("Nueva Reserva", false, true, false, false);
        ReservaAgregar  hijo = new ReservaAgregar();
        vhija.add(hijo);
        vhija.pack();
        vhija.setVisible(true);
        escritorio.add(vhija);
    }//GEN-LAST:event_miAgReservaActionPerformed

    private void miAgClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAgClienteActionPerformed
        JInternalFrame vhija = new JInternalFrame("Nuevo Cliente", false, true, false, false);
        ClienteAgregar  hijo = new ClienteAgregar();
        vhija.add(hijo);
        vhija.pack();
        vhija.setVisible(true);
        escritorio.add(vhija);
            
    }//GEN-LAST:event_miAgClienteActionPerformed

    private void miGeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGeClienteActionPerformed
        JInternalFrame vhija = new JInternalFrame("Gestionar Clientes", false, true, false, false);
        ClienteGestionar  hijo = new ClienteGestionar();
        vhija.add(hijo);
        vhija.pack();
        vhija.setVisible(true);
        escritorio.add(vhija);
    }//GEN-LAST:event_miGeClienteActionPerformed

    private void miAgAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAgAgenciaActionPerformed
        JInternalFrame vhija = new JInternalFrame("Nueva Agencia", false, true, false, false);
        AgenciaAgregar  hijo = new AgenciaAgregar();
        vhija.add(hijo);
        vhija.pack();
        vhija.setVisible(true);
        escritorio.add(vhija);
    }//GEN-LAST:event_miAgAgenciaActionPerformed

    private void miAgVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAgVehiculoActionPerformed
        JInternalFrame vhija = new JInternalFrame("Nuevo Vehiculo", false, true, false, false);
        VehiculoAgregar  hijo = new VehiculoAgregar();
        vhija.add(hijo);
        vhija.pack();
        vhija.setVisible(true);
        escritorio.add(vhija);
    }//GEN-LAST:event_miAgVehiculoActionPerformed

    private void miAgGarajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAgGarajeActionPerformed
        JInternalFrame vhija = new JInternalFrame("Nuevo Garaje", false, true, false, false);
        GarajeAgregar  hijo = new GarajeAgregar();
        vhija.add(hijo);
        vhija.pack();
        vhija.setVisible(true);
        escritorio.add(vhija);
    }//GEN-LAST:event_miAgGarajeActionPerformed

    private void miGeVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGeVehiculoActionPerformed
        JInternalFrame vhija = new JInternalFrame("Gestionar Vehiculos", false, true, false, false);
        VehiculoGestionar  hijo = new VehiculoGestionar();
        vhija.add(hijo);
        vhija.pack();
        vhija.setVisible(true);
        escritorio.add(vhija);
    }//GEN-LAST:event_miGeVehiculoActionPerformed

    private void miGeGarajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGeGarajeActionPerformed
        JInternalFrame vhija = new JInternalFrame("Gestionar Garajes", false, true, false, false);
        GarajeGestionar  hijo = new GarajeGestionar();
        vhija.add(hijo);
        vhija.pack();
        vhija.setVisible(true);
        escritorio.add(vhija);
    }//GEN-LAST:event_miGeGarajeActionPerformed

    private void miGeAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGeAgenciaActionPerformed
        JInternalFrame vhija = new JInternalFrame("Gestionar Agencias", false, true, false, false);
        AgenciaGestionar  hijo = new AgenciaGestionar();
        vhija.add(hijo);
        vhija.pack();
        vhija.setVisible(true);
        escritorio.add(vhija);    }//GEN-LAST:event_miGeAgenciaActionPerformed

    private void miGeReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGeReservaActionPerformed
        JInternalFrame vhija = new JInternalFrame("Gestionar Reservas", false, true, false, false);
        ReservaGestionar  hijo = new ReservaGestionar();
        vhija.add(hijo);
        vhija.pack();
        vhija.setVisible(true);
        escritorio.add(vhija);
    }//GEN-LAST:event_miGeReservaActionPerformed

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAgencias;
    private javax.swing.JMenu jmClientes;
    private javax.swing.JMenu jmGarajes;
    private javax.swing.JMenu jmVehiculos;
    private javax.swing.JMenuItem miAgAgencia;
    private javax.swing.JMenuItem miAgCliente;
    private javax.swing.JMenuItem miAgGaraje;
    private javax.swing.JMenuItem miAgReserva;
    private javax.swing.JMenuItem miAgVehiculo;
    private javax.swing.JMenuItem miGeAgencia;
    private javax.swing.JMenuItem miGeCliente;
    private javax.swing.JMenuItem miGeGaraje;
    private javax.swing.JMenuItem miGeReserva;
    private javax.swing.JMenuItem miGeVehiculo;
    private javax.swing.JMenuItem mitExit;
    private javax.swing.JMenuItem mit_Agencia;
    // End of variables declaration//GEN-END:variables
}
