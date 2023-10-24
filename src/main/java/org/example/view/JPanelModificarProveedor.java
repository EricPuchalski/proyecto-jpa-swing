/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.example.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.example.controller.JFrameController;
import org.example.controller.ProveedorController;
import org.example.dao.ProveedorJpaController;
import org.example.model.Proveedor;
import org.example.service.ProveedorService;
import org.example.util.Conexion;

/**
 *
 * @author ericp
 */
public class JPanelModificarProveedor extends javax.swing.JPanel {
    private Proveedor p = new Proveedor();
    private ProveedorController proveedorController;
    private Long id;
    /**
     * Creates new form JPanelModificarProveedor
     */
    public JPanelModificarProveedor(Long id) {
        this.id = id;
        proveedorController = new ProveedorController(new ProveedorService(new ProveedorJpaController(Conexion.getEmf())));
        initComponents();
        this.setSize(800,700);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnModify = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtTel = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        txtCuit = new javax.swing.JTextField();
        lblCuit = new javax.swing.JLabel();
        txtAdress = new javax.swing.JTextField();
        lblAdress = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(34, 131, 210));
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        btnModify.setBackground(new java.awt.Color(0, 51, 255));
        btnModify.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnModify.setForeground(new java.awt.Color(232, 245, 255));
        btnModify.setText("Modificar");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(153, 0, 0));
        btnCancel.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(232, 245, 255));
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtTel.setBackground(new java.awt.Color(34, 131, 210));
        txtTel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtTel.setForeground(new java.awt.Color(51, 51, 51));
        txtTel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtTel.setVerifyInputWhenFocusTarget(false);
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });

        lblTel.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lblTel.setForeground(new java.awt.Color(204, 255, 255));
        lblTel.setText("Telefono");

        txtCuit.setBackground(new java.awt.Color(34, 131, 210));
        txtCuit.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCuit.setForeground(new java.awt.Color(51, 51, 51));
        txtCuit.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtCuit.setVerifyInputWhenFocusTarget(false);
        txtCuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuitActionPerformed(evt);
            }
        });

        lblCuit.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lblCuit.setForeground(new java.awt.Color(204, 255, 255));
        lblCuit.setText("Cuit");

        txtAdress.setBackground(new java.awt.Color(34, 131, 210));
        txtAdress.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtAdress.setForeground(new java.awt.Color(51, 51, 51));
        txtAdress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtAdress.setVerifyInputWhenFocusTarget(false);
        txtAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdressActionPerformed(evt);
            }
        });

        lblAdress.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lblAdress.setForeground(new java.awt.Color(204, 255, 255));
        lblAdress.setText("Dirección");

        txtMail.setBackground(new java.awt.Color(34, 131, 210));
        txtMail.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtMail.setForeground(new java.awt.Color(51, 51, 51));
        txtMail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtMail.setVerifyInputWhenFocusTarget(false);
        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(204, 255, 255));
        lblEmail.setText("Email");

        txtName.setBackground(new java.awt.Color(34, 131, 210));
        txtName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(51, 51, 51));
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtName.setVerifyInputWhenFocusTarget(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(204, 255, 255));
        lblName.setText("Nombre");

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 255));
        jLabel1.setText("Por favor ingrese los nuevos datos");

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(232, 245, 255));
        jLabel2.setText("MODIFICAR PROVEEDOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(lblName))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(lblEmail))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(lblAdress))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(lblCuit))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(txtCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(lblTel))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(31, 31, 31)
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(lblName)
                    .addGap(6, 6, 6)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lblEmail)
                    .addGap(6, 6, 6)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lblAdress)
                    .addGap(6, 6, 6)
                    .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lblCuit)
                    .addGap(6, 6, 6)
                    .addComponent(txtCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lblTel)
                    .addGap(6, 6, 6)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(39, 39, 39)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed

        if(!(txtName.getText().isEmpty()|| txtMail.getText().isEmpty() || txtAdress.getText().isEmpty() || txtTel.getText().isEmpty() || txtCuit.getText().isEmpty())){
        p.setNombre(txtName.getText());
        p.setEmail(txtMail.getText());
        p.setCuit(txtCuit.getText());
        p.setDireccion(txtAdress.getText());
        p.setTelefono(txtTel.getText());
        proveedorController.upDate(p);
        JOptionPane.showMessageDialog(null, "Proveedor modificado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        JFrameController.cambiarPanel(this, new JPanelConsultaProveedor(), this);

        } else{
            JOptionPane.showMessageDialog(null, "Un campo no puede estar vacio", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        JFrameController.cambiarPanel(this, new JPanelConsultaProveedor(), this);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void txtCuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuitActionPerformed

    private void txtAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdressActionPerformed

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        cargarDatos(id); 
    }//GEN-LAST:event_formAncestorAdded

    public void cargarDatos(Long id){
        p = proveedorController.findOne(id);
        txtCuit.setText(p.getCuit());
        txtName.setText(p.getNombre());
        txtMail.setText(p.getEmail());
        txtAdress.setText(p.getDireccion());
        txtTel.setText(p.getTelefono());
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnModify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAdress;
    private javax.swing.JLabel lblCuit;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTel;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtCuit;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
