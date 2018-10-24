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
import javax.swing.table.DefaultTableModel;
import pojos.Paciente;

/**
 *
 * @author MoisesGamerPro
 */
public class ActivarPaciente extends javax.swing.JFrame {
    Servicio ser = new Servicio();
    int cod = 0;
    
    public ActivarPaciente() {
        initComponents();
        this.setTitle("Activar Paciente");
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
        modelo.setColumnIdentifiers(new Object[]{"Id", "Nombre", "Apellidos","Domicilio","Telefono","Estatus"});
        int con= 0;
        try{
            for(Paciente r:lista){
                Vector v = new Vector();
                v.add(r.getIdPaciente());
                v.add(r.getNombre());
                v.add(r.getApellidos());
                v.add(r.getDomicilio());
                v.add(r.getTelefono());
                v.add(r.getEstatus());
                modelo.addRow(v);
            }
            modelo.fireTableDataChanged();
            txt_tabla.setModel(modelo);
            this.setLocationRelativeTo(null);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Regresar = new javax.swing.JButton();
        btn_activar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_buscar5 = new javax.swing.JTextField();
        btn_desactivar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Regresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Regresar.setText("Regresar");
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });

        btn_activar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_activar.setText("Activar ");
        btn_activar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_activarActionPerformed(evt);
            }
        });

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

        txt_buscar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscar5ActionPerformed(evt);
            }
        });

        btn_desactivar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_desactivar.setText("Desactivar");
        btn_desactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desactivarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_buscar5, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_activar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_desactivar)
                        .addGap(22, 22, 22))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Regresar)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txt_buscar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_desactivar)
                        .addComponent(btn_activar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btn_Regresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        //AdminPaciente ap = new AdminPaciente();
        //ap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void btn_activarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_activarActionPerformed

        //AdminPaciente ap = new AdminPaciente();
        //ap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_activarActionPerformed

    private void txt_tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_tablaMouseClicked
        txt_tabla.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                int select = txt_tabla.getSelectedRow();
                cod = (int) txt_tabla.getValueAt(select, 0);
            }
        });
    }//GEN-LAST:event_txt_tablaMouseClicked

    private void txt_buscar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscar5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscar5ActionPerformed

    private void btn_desactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desactivarActionPerformed
        //AdminPaciente ap = new AdminPaciente();
        //ap.setVisible(true);
        this.dispose();
        //teste
    }//GEN-LAST:event_btn_desactivarActionPerformed

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
            java.util.logging.Logger.getLogger(ActivarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActivarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActivarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActivarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActivarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JButton btn_activar;
    private javax.swing.JButton btn_desactivar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_buscar5;
    private javax.swing.JTable txt_tabla;
    // End of variables declaration//GEN-END:variables
}
