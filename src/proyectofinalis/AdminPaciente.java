/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalis;

import Servicio.Servicio;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pojos.Paciente;

/**
 *
 * @author MoisesGamerPro
 */
public class AdminPaciente extends javax.swing.JFrame {
    Servicio ser = new Servicio();
    int cod = 0;
    /**
     * Creates new form AdminPaciente
     */
    public AdminPaciente() {
        initComponents();
        this.setTitle("Administracion Paciente");
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
//        setSize(width/2, height/2);		
        setLocationRelativeTo(null);		
        setVisible(true);
        
        cargarTabla();
    }
    
    public void cargarTabla(){
        List<Paciente> lista = ser.consultarPacientes("http://localhost:8084/EasyNutritionService/webresources/Nutrition/getPacientes");

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Id", "Nombre", "Apellidos","Domicilio","Telefono"});
        int con= 0;
        try{
            for(Paciente r:lista){
                String a = r.getEstatus();
                String b = "Activo";
                System.out.println(a);
                if (a.equals(b)){
                    Vector v = new Vector();
                    v.add(r.getIdPaciente());
                    v.add(r.getNombre());
                    v.add(r.getApellidos());
                    v.add(r.getDomicilio());
                    v.add(r.getTelefono());
                    modelo.addRow(v);
                }
            }
            modelo.fireTableDataChanged();
            txt_tabla.setModel(modelo);
            this.setLocationRelativeTo(null);
        }catch(Exception e){
            System.out.println(e);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txt_tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_activardesactivar = new javax.swing.JButton();
        btn_Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_tabla = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        txt_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        txt_tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txt_tabla);

        jLabel1.setText("Buscar");

        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });

        btn_registrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_registrar.setText("Registrar Paciente");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_actualizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_actualizar.setText("Actualizar Paciente");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_activardesactivar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_activardesactivar.setText("Activar / Desactivar");
        btn_activardesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_activardesactivarActionPerformed(evt);
            }
        });

        btn_Regresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Regresar.setText("Regresar");
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btn_activardesactivar))
                            .addGap(38, 38, 38))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btn_Regresar)
                            .addGap(30, 30, 30)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_registrar)
                        .addGap(29, 29, 29)
                        .addComponent(btn_actualizar)
                        .addGap(105, 105, 105))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_activardesactivar)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar)
                    .addComponent(btn_actualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btn_Regresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        RegistroPaciente rp = new RegistroPaciente();
        rp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_activardesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_activardesactivarActionPerformed
        ActivarPaciente ap = new ActivarPaciente();
        ap.setVisible(true);
    }//GEN-LAST:event_btn_activardesactivarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        ActualizarPaciente ap = new ActualizarPaciente();
        ap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        VentanaAdministracion va = new VentanaAdministracion();
        va.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void txt_tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_tablaMouseClicked
        txt_tabla.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                int select = txt_tabla.getSelectedRow();
                cod = (int) txt_tabla.getValueAt(select, 0);
            }
        });
    }//GEN-LAST:event_txt_tablaMouseClicked

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
            java.util.logging.Logger.getLogger(AdminPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JButton btn_activardesactivar;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTable txt_tabla;
    // End of variables declaration//GEN-END:variables
}
