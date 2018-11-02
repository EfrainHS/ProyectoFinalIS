/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import Servicio.Servicio;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;
import pojos.Paciente;

/**
 *
 * @author MoisesGamerPro
 */
public class ActualizarPaciente extends javax.swing.JFrame {
    public static int idpaciente;
     Servicio ser = new Servicio();
     boolean estado = false;
    /**
     * Creates new form ActualizarPaciente
     */
    public ActualizarPaciente() {
        initComponents();
        this.setTitle("Actualizar Paciente");
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
//        setSize(width/2, height/2);		
        setLocationRelativeTo(null);		
        setVisible(true);
        llenarDatos();
    }
    
    public void llenarDatos(){
        List<Paciente> lista = ser.consultarPacientes("http://localhost:8084/EasyNutritionService/webresources/Nutrition/getPacientes");
        
        for(Paciente r:lista){
            if (r.getIdPaciente().equals(idpaciente)){
                txt_nombre.setText(r.getNombre());
                txt_apellidos.setText(r.getApellidos());
                txt_genero.setSelectedItem(r.getGenero());
                txt_iddoctor.setText(r.getIdDoctor().toString());
                txt_domicilio.setText(r.getDomicilio());
                txt_correo.setText(r.getCorreo());
                txt_contra.setText(r.getPassword());
                txt_telefono.setText(r.getTelefono());
            }
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

        txt_nombre1 = new javax.swing.JTextField();
        txt_domicilio1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_correo1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_contra1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_telefono1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_genero1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txt_estatus1 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txt_iddoctor1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btn_actualizar1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        btn_Regresar1 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txt_apellidos1 = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_domicilio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_contra = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_genero = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_iddoctor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btn_Regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        doctores = new javax.swing.JButton();
        baja = new javax.swing.JButton();

        jLabel12.setText("Apellidos");

        jLabel13.setText("Genero");

        jLabel14.setText("Fecha de Nacimiento");

        jLabel15.setText("Domicilio");

        txt_genero1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        jLabel16.setText("Correo");

        txt_estatus1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        txt_estatus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_estatus1ActionPerformed(evt);
            }
        });

        jLabel17.setText("Contraseña");

        jLabel18.setText("Telefono");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel19.setText("Actualizar Paciente");

        jLabel20.setText("Estatus");

        btn_actualizar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_actualizar1.setText("Actualizar");
        btn_actualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar1ActionPerformed(evt);
            }
        });

        jLabel21.setText("idDoctor");

        btn_Regresar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Regresar1.setText("Regresar");

        jLabel22.setText("Nombre");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_nombre.setEnabled(false);

        txt_domicilio.setEnabled(false);

        jLabel2.setText("Apellidos");

        txt_correo.setEnabled(false);

        jLabel3.setText("Genero");

        txt_contra.setEnabled(false);

        txt_telefono.setEnabled(false);

        jLabel5.setText("Domicilio");

        txt_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        txt_genero.setEnabled(false);

        jLabel6.setText("Correo");

        jLabel7.setText("Contraseña");

        txt_iddoctor.setEnabled(false);

        jLabel8.setText("Telefono");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setText("Actualizar Paciente");

        btn_actualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        jLabel10.setText("idDoctor");

        btn_Regresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Regresar.setText("Regresar");
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        txt_apellidos.setEnabled(false);

        doctores.setText("+");
        doctores.setEnabled(false);

        baja.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        baja.setText("Desabilitar");
        baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txt_nombre))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(baja)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Regresar)
                                .addGap(23, 23, 23)
                                .addComponent(btn_actualizar)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_iddoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doctores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_domicilio)
                                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txt_contra))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_telefono)
                                .addGap(122, 122, 122)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel11)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_iddoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctores))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_actualizar)
                        .addComponent(btn_Regresar))
                    .addComponent(baja))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        if(estado == false){
            txt_nombre.setEnabled(true);
            txt_apellidos.setEnabled(true);
            txt_genero.setEnabled(true);
            txt_iddoctor.setEnabled(true);
            doctores.setEnabled(true);
            txt_domicilio.setEnabled(true);
            txt_correo.setEnabled(true);
            txt_contra.setEnabled(true);
            txt_telefono.setEnabled(true);
            btn_actualizar.setText("Guardar");
            btn_Regresar.setText("Cancelar");
            baja.setVisible(false);
            estado = true;
        }else{
            String a = txt_nombre.getText();
            String b = txt_apellidos.getText();
            String c = txt_genero.getSelectedItem().toString();
            String d = txt_iddoctor.getText();
            String e = txt_domicilio.getText();
            String f = txt_correo.getText();
            String g = txt_contra.getText();
            String h = txt_telefono.getText();
            
            String parametros = "idPaciente="+idpaciente+"&nombre="+a+"&apellidos="+b+"&domicilio="+e+"&genero="+c+"&correo="+f+"&password="+g+"&telefono="+h+"&idDoctor="+d;
            ser.actualizar("http://localhost:8084/EasyNutritionService/webresources/Nutrition/actualizarPaciente", parametros);
            JOptionPane.showMessageDialog(null, "La informacion del cliente ha sido actualizado exitosamente!");
            
            AdminPaciente ap = new AdminPaciente();
            ap.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void txt_estatus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_estatus1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estatus1ActionPerformed

    private void btn_actualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar1ActionPerformed
        
    }//GEN-LAST:event_btn_actualizar1ActionPerformed

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        if(btn_Regresar.getText() == "Cancelar"){
            txt_nombre.setEnabled(false);
            txt_apellidos.setEnabled(false);
            txt_genero.setEnabled(false);
            txt_iddoctor.setEnabled(false);
            doctores.setEnabled(false);
            txt_domicilio.setEnabled(false);
            txt_correo.setEnabled(false);
            txt_contra.setEnabled(false);
            txt_telefono.setEnabled(false);
            btn_actualizar.setText("Actualizar");
            btn_Regresar.setText("Regresar");
            baja.setVisible(true);
            estado = false;
        }else{
            AdminPaciente ap = new AdminPaciente();
            ap.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Se Inabilitará el usuario, ¿desea continuar?",
        "Desactivar Usuario", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            String parametros = "idPaciente="+idpaciente+"&estatus=Inactivo";
            ser.actualizar("http://localhost:8084/EasyNutritionService/webresources/Nutrition/altabaja", parametros);
            AdminPaciente ap = new AdminPaciente();
            ap.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_bajaActionPerformed

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
            java.util.logging.Logger.getLogger(ActualizarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton baja;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JButton btn_Regresar1;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_actualizar1;
    private javax.swing.JButton doctores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_apellidos1;
    private javax.swing.JTextField txt_contra;
    private javax.swing.JTextField txt_contra1;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_correo1;
    private javax.swing.JTextField txt_domicilio;
    private javax.swing.JTextField txt_domicilio1;
    private javax.swing.JComboBox<String> txt_estatus1;
    private javax.swing.JComboBox<String> txt_genero;
    private javax.swing.JComboBox<String> txt_genero1;
    private javax.swing.JTextField txt_iddoctor;
    private javax.swing.JTextField txt_iddoctor1;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nombre1;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_telefono1;
    // End of variables declaration//GEN-END:variables
}
