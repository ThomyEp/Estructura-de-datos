/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospital;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author alumnos
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    private ImageIcon imagen;
    private Icon icono;
    public frmPrincipal() {
        initComponents();
        this.setTitle("Hospital UTE");
        this.setLocationRelativeTo(frmPrincipal.this);
        this.setResizable(false);
        this.pintarImagen(this.lblminimizar,"src/hospital/Imagenes/mini.png");
        this.pintarImagen(this.lblcerrar,"src/hospital/Imagenes/cerrar.png");
        this.pintarImagen(this.lblPortada,"src/hospital/Imagenes/portadaHospi.jpg");          
    }
   private void ShowPanel(JPanel p) {
        p.setSize(650,510);
        p.setLocation(0, 0);
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
   }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barra = new javax.swing.JPanel();
        lblcerrar = new javax.swing.JLabel();
        lblminimizar = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        btnGestionarPacientes = new javax.swing.JButton();
        btnGestionarCitas = new javax.swing.JButton();
        btnGestionarVentas = new javax.swing.JButton();
        btnGestionarEmpleados = new javax.swing.JButton();
        btnGestionarMedicamentos = new javax.swing.JButton();
        btnGestionarHorarios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        lblPortada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOSPITAL...");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(800, 550));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra.setBackground(new java.awt.Color(102, 255, 255));
        barra.setForeground(new java.awt.Color(0, 204, 204));
        barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMouseDragged(evt);
            }
        });
        barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMousePressed(evt);
            }
        });

        lblcerrar.setBorder(new javax.swing.border.MatteBorder(null));
        lblcerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblcerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcerrarMouseClicked(evt);
            }
        });

        lblminimizar.setBorder(new javax.swing.border.MatteBorder(null));
        lblminimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblminimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLayout.createSequentialGroup()
                .addGap(0, 720, Short.MAX_VALUE)
                .addComponent(lblminimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblcerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblminimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        panel.setBackground(new java.awt.Color(54, 33, 89));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGestionarPacientes.setBackground(new java.awt.Color(85, 55, 118));
        btnGestionarPacientes.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionarPacientes.setText("Gestionar Pacientes");
        btnGestionarPacientes.setBorder(null);
        btnGestionarPacientes.setBorderPainted(false);
        btnGestionarPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGestionarPacientes.setPreferredSize(new java.awt.Dimension(162, 22));
        btnGestionarPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarPacientesActionPerformed(evt);
            }
        });
        panel.add(btnGestionarPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 150, 39));

        btnGestionarCitas.setBackground(new java.awt.Color(85, 55, 118));
        btnGestionarCitas.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionarCitas.setText("Gestionar Citas");
        btnGestionarCitas.setBorder(null);
        btnGestionarCitas.setPreferredSize(new java.awt.Dimension(162, 22));
        btnGestionarCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarCitasActionPerformed(evt);
            }
        });
        panel.add(btnGestionarCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 150, 38));

        btnGestionarVentas.setBackground(new java.awt.Color(85, 55, 118));
        btnGestionarVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionarVentas.setText("Gestionar Ventas");
        btnGestionarVentas.setBorder(null);
        btnGestionarVentas.setPreferredSize(new java.awt.Dimension(162, 22));
        panel.add(btnGestionarVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 150, 41));

        btnGestionarEmpleados.setBackground(new java.awt.Color(85, 55, 118));
        btnGestionarEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionarEmpleados.setText("Gestionar Empleados");
        btnGestionarEmpleados.setBorder(null);
        btnGestionarEmpleados.setPreferredSize(new java.awt.Dimension(162, 22));
        panel.add(btnGestionarEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 150, 38));

        btnGestionarMedicamentos.setBackground(new java.awt.Color(85, 55, 118));
        btnGestionarMedicamentos.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionarMedicamentos.setText("Gestionar Medicamentos");
        btnGestionarMedicamentos.setBorder(null);
        btnGestionarMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarMedicamentosActionPerformed(evt);
            }
        });
        panel.add(btnGestionarMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 150, 39));

        btnGestionarHorarios.setBackground(new java.awt.Color(85, 55, 118));
        btnGestionarHorarios.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionarHorarios.setText("Gestionar Horarios");
        btnGestionarHorarios.setBorder(null);
        btnGestionarHorarios.setPreferredSize(new java.awt.Dimension(162, 22));
        panel.add(btnGestionarHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 150, 38));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Hospital UTE");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 153, 0)));
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 150, 510));

        content.setForeground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(570, 320));

        lblPortada.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addComponent(lblPortada, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPortada, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 650, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimizarMouseClicked
        // TODO add your handling code here:
        this.setState(frmPrincipal.ICONIFIED);
    }//GEN-LAST:event_lblminimizarMouseClicked

    private void lblcerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcerrarMouseClicked
        // TODO add your handling code here:
        int dialog = JOptionPane.YES_NO_CANCEL_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir", "Exist", dialog);
        if (result == 0) {
             System.exit(0);//cierra la ventana
        }
       
    }//GEN-LAST:event_lblcerrarMouseClicked

    private void btnGestionarMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarMedicamentosActionPerformed
        // TODO add your handling code here:
        pnlMedicamentos pm = new pnlMedicamentos();
        ShowPanel(pm);
 

        clasesHospital.Medicamentos cm = new clasesHospital.Medicamentos(); //instanciar paquete claseHospital
        cm.crearArchivoMedicamentos();
    }//GEN-LAST:event_btnGestionarMedicamentosActionPerformed

    private void btnGestionarPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarPacientesActionPerformed
        // TODO add your handling code here:
        pnlPacientes pp = new pnlPacientes();
        ShowPanel(pp);
        clasesHospital.Pacientes cp = new clasesHospital.Pacientes(); //instanciar paquete claseHospital
        cp.crearArchivoPacientes();
    }//GEN-LAST:event_btnGestionarPacientesActionPerformed
 
    int xx;
    int xy;
    private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_barraMousePressed

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_barraMouseDragged

    private void btnGestionarCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarCitasActionPerformed
        // TODO add your handling code here:
        pnlCitas pc = new pnlCitas();
        ShowPanel(pc);
    }//GEN-LAST:event_btnGestionarCitasActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }
     private void pintarImagen(JLabel lbl, String ruta) {
         this.imagen = new ImageIcon(ruta);
         this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(
                 lbl.getWidth(), 
                 lbl.getHeight(),
                 Image.SCALE_DEFAULT)
         );
         lbl.setIcon(this.icono);//convierte imagen en icono
         this.repaint();
     }//Todo -- pintarImagen

    @Override
    public boolean isDisplayable() {
        return super.isDisplayable(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra;
    private javax.swing.JButton btnGestionarCitas;
    private javax.swing.JButton btnGestionarEmpleados;
    private javax.swing.JButton btnGestionarHorarios;
    private javax.swing.JButton btnGestionarMedicamentos;
    private javax.swing.JButton btnGestionarPacientes;
    private javax.swing.JButton btnGestionarVentas;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPortada;
    private javax.swing.JLabel lblcerrar;
    private javax.swing.JLabel lblminimizar;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
