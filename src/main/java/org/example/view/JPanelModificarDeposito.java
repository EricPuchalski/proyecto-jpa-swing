/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.example.view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.example.controller.DepositoController;
import org.example.controller.EmpleadoController;
import org.example.controller.JFrameController;
import org.example.dao.DepositoJpaController;
import org.example.dao.EmpleadoJpaController;
import org.example.model.Deposito;
import org.example.model.Empleado;
import org.example.model.Posicion;
import org.example.service.DepositoService;
import org.example.service.EmpleadoService;
import org.example.util.EntityManagerFactoryUTIL;

/**
 *
 * @author ericp
 */
public class JPanelModificarDeposito extends javax.swing.JPanel {
    private Deposito d;
    private DepositoController depositoController;
    private EmpleadoController empleadoController;
    private Long id;
    /**
     * Creates new form JPanelModificarDeposito
     */
    public JPanelModificarDeposito(Long id) {
        this.id = id;
        this.depositoController = new DepositoController(new DepositoService(new DepositoJpaController(EntityManagerFactoryUTIL.getEntityManagerFactory())));
        this.empleadoController = new EmpleadoController(new EmpleadoService(new EmpleadoJpaController(EntityManagerFactoryUTIL.getEntityManagerFactory())));

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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAdress = new javax.swing.JLabel();
        txtAdress = new javax.swing.JTextField();
        lblCuit = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        lblCuit1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblCuit2 = new javax.swing.JLabel();
        cbContinente = new javax.swing.JComboBox<>();
        lblCuit3 = new javax.swing.JLabel();
        txtLat = new javax.swing.JTextField();
        lblCuit4 = new javax.swing.JLabel();
        txtLon = new javax.swing.JTextField();
        lblCuit5 = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        btnModify = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 153));
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(232, 245, 255));
        jLabel2.setText("MODIFICAR DÉPOSITO");

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 255));
        jLabel1.setText("Por favor ingrese los nuevos datos");

        lblName.setFont(new java.awt.Font("Roboto Light", 1, 15)); // NOI18N
        lblName.setForeground(new java.awt.Color(204, 255, 255));
        lblName.setText("Codigo");

        txtCod.setBackground(new java.awt.Color(34, 131, 210));
        txtCod.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCod.setForeground(new java.awt.Color(0, 0, 0));
        txtCod.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtCod.setVerifyInputWhenFocusTarget(false);
        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Roboto Light", 1, 15)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(204, 255, 255));
        lblEmail.setText("Nombre");

        txtName.setBackground(new java.awt.Color(34, 131, 210));
        txtName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtName.setVerifyInputWhenFocusTarget(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblAdress.setFont(new java.awt.Font("Roboto Light", 1, 15)); // NOI18N
        lblAdress.setForeground(new java.awt.Color(204, 255, 255));
        lblAdress.setText("Dirección");

        txtAdress.setBackground(new java.awt.Color(34, 131, 210));
        txtAdress.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtAdress.setForeground(new java.awt.Color(0, 0, 0));
        txtAdress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtAdress.setVerifyInputWhenFocusTarget(false);
        txtAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdressnone(evt);
            }
        });

        lblCuit.setFont(new java.awt.Font("Roboto Light", 1, 15)); // NOI18N
        lblCuit.setForeground(new java.awt.Color(204, 255, 255));
        lblCuit.setText("Teléfono");

        txtTel.setBackground(new java.awt.Color(34, 131, 210));
        txtTel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtTel.setForeground(new java.awt.Color(0, 0, 0));
        txtTel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtTel.setVerifyInputWhenFocusTarget(false);
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });

        lblCuit1.setFont(new java.awt.Font("Roboto Light", 1, 15)); // NOI18N
        lblCuit1.setForeground(new java.awt.Color(204, 255, 255));
        lblCuit1.setText("Email");

        txtEmail.setBackground(new java.awt.Color(34, 131, 210));
        txtEmail.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtEmail.setVerifyInputWhenFocusTarget(false);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblCuit2.setFont(new java.awt.Font("Roboto Light", 1, 15)); // NOI18N
        lblCuit2.setForeground(new java.awt.Color(204, 255, 255));
        lblCuit2.setText("Continente");

        cbContinente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "América", "Asia", "Africa", "Europa", "Oceania" }));

        lblCuit3.setFont(new java.awt.Font("Roboto Light", 1, 15)); // NOI18N
        lblCuit3.setForeground(new java.awt.Color(204, 255, 255));
        lblCuit3.setText("Latitud");

        txtLat.setBackground(new java.awt.Color(34, 131, 210));
        txtLat.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtLat.setForeground(new java.awt.Color(0, 0, 0));
        txtLat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtLat.setVerifyInputWhenFocusTarget(false);
        txtLat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLatActionPerformed(evt);
            }
        });

        lblCuit4.setFont(new java.awt.Font("Roboto Light", 1, 15)); // NOI18N
        lblCuit4.setForeground(new java.awt.Color(204, 255, 255));
        lblCuit4.setText("Longitud");

        txtLon.setBackground(new java.awt.Color(34, 131, 210));
        txtLon.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtLon.setForeground(new java.awt.Color(0, 0, 0));
        txtLon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtLon.setVerifyInputWhenFocusTarget(false);
        txtLon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLonActionPerformed(evt);
            }
        });

        lblCuit5.setFont(new java.awt.Font("Roboto Light", 1, 15)); // NOI18N
        lblCuit5.setForeground(new java.awt.Color(204, 255, 255));
        lblCuit5.setText("Empleado");

        txtEmpleado.setBackground(new java.awt.Color(34, 131, 210));
        txtEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtEmpleado.setText("Por favor ingrese el cuit");
        txtEmpleado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtEmpleado.setVerifyInputWhenFocusTarget(false);
        txtEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmpleadoMouseClicked(evt);
            }
        });
        txtEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpleadonone(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(51, 51, 255));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(204, 255, 255));
        btnSearch.setText("Buscar");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblEmpleados);

        btnModify.setBackground(new java.awt.Color(0, 51, 255));
        btnModify.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnModify.setForeground(new java.awt.Color(232, 245, 255));
        btnModify.setText("Modificar");
        btnModify.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(153, 0, 0));
        btnCancel.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(232, 245, 255));
        btnCancel.setText("Cancelar");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblAdress)
                            .addComponent(lblCuit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblEmail)
                                .addGap(18, 18, 18)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCuit1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmail))
                            .addComponent(txtAdress)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblCuit5)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCuit3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLat, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(lblCuit4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtLon, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(19, 19, 19)))
                .addGap(464, 464, 464))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(lblCuit2)
                        .addGap(18, 18, 18)
                        .addComponent(cbContinente, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdress)
                    .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuit)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCuit1)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuit2)
                    .addComponent(cbContinente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuit3)
                    .addComponent(txtLat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCuit4)
                    .addComponent(txtLon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuit5)
                    .addComponent(txtEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAdressnone(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdressnone
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdressnone

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtLatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLatActionPerformed

    private void txtLonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLonActionPerformed

    private void txtEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmpleadoMouseClicked
        txtEmpleado.setText("");
    }//GEN-LAST:event_txtEmpleadoMouseClicked

    private void txtEmpleadonone(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpleadonone

    }//GEN-LAST:event_txtEmpleadonone

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        List<Empleado> empleadosBuscados = empleadoController.buscarPorCuitParcial(txtEmpleado.getText()+"%");
        DefaultTableModel modeloNuevo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };

        String titulos[] = {"Id", "Nombre", "Apellido", "Dirección", "Teléfono", "Cuit"};
        modeloNuevo.setColumnIdentifiers(titulos);
        List<Empleado> listEMpleados = empleadoController.findAll();

        if(!empleadosBuscados.isEmpty()){
            for (Empleado e: empleadosBuscados){
                Object[] obj = {e.getId(), e.getNombre(), e.getApellido(), e.getDireccion(),e.getTelefono(), e.getCUIT()};
                modeloNuevo.addRow(obj);
            }
        }

        tblEmpleados.setModel(modeloNuevo);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        try{
            if(!(txtCod.getText().isEmpty()|| txtName.getText().isEmpty() || txtAdress.getText().isEmpty() || txtTel.getText().isEmpty()|| txtEmail.getText().isEmpty()|| txtLat.getText().isEmpty()|| txtLon.getText().isEmpty())){
                if(tblEmpleados.getRowCount() > 0){
                    if(tblEmpleados.getSelectedRow()!=-1){
                        Long idEmpleado = Long.parseLong(String.valueOf(tblEmpleados.getValueAt(tblEmpleados.getSelectedRow(),0)));
                        Empleado emp = empleadoController.findOne(idEmpleado);
                        d.setNombre(txtName.getText());
                        d.setCodigo(txtCod.getText());
                        d.setDireccion(txtAdress.getText());
                        d.setTelefono(txtTel.getText());
                        d.setEmail(txtEmail.getText());
                        d.setContinente(cbContinente.getSelectedItem().toString());
                        d.getPosicion().setLatitud(Double.valueOf(txtLat.getText()));
                        d.getPosicion().setLongitud(Double.valueOf(txtLon.getText()));
                        d.setEmpleado(emp);
                        depositoController.upDate(d);
                        JOptionPane.showMessageDialog(this, "Deposito modificado con exito", "Creación exitosa", JOptionPane.INFORMATION_MESSAGE);
                        JFrameController.cambiarPanel(this, new JPanelConsultaDeposito(), this);
                }
                else{
                  JOptionPane.showMessageDialog(null, "Por favor elija un empleado", "Advertencia", JOptionPane.WARNING_MESSAGE);

                }
            } 
        }
                    else{
            JOptionPane.showMessageDialog(null, "Un campo no puede estar vacio", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Verifique los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        JFrameController.cambiarPanel(this, new JPanelDeposito(), this);
    }//GEN-LAST:event_btnCancelActionPerformed
        private void cargarTabla(){
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        //String cuit, String nombre, String direccion, String telefono, String email
        String titulos[] = {"Id", "Nombre", "Apellido", "Dirección", "Teléfono", "Cuit"};
        modeloTabla.setColumnIdentifiers(titulos);
        List<Empleado> listEMpleados = empleadoController.findAll();
//(String codigo, String nombre, double ancho, double altura, double largo,
//double peso, CategoriaProducto categoria, Proveedor proveedor) {
        if(!listEMpleados.isEmpty()){
            for (Empleado e: listEMpleados){
                Object[] obj = {e.getId(), e.getNombre(), e.getApellido(), e.getDireccion(),e.getTelefono(), e.getCUIT()};
                modeloTabla.addRow(obj);
            }
        }

        tblEmpleados.setModel(modeloTabla);
    }
    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        cargarDatos();
        cargarTabla();
    }//GEN-LAST:event_formAncestorAdded

        public void cargarDatos(){
        d = depositoController.findOne(id);
        txtCod.setText(d.getCodigo());
        txtName.setText(d.getNombre());
        txtAdress.setText(d.getDireccion());
        txtTel.setText(d.getTelefono());
        txtEmail.setText(d.getEmail());
        txtLat.setText(String.valueOf(d.getPosicion().getLatitud()));
        txtLon.setText(String.valueOf(d.getPosicion().getLongitud()));
        cbContinente.setSelectedItem(d.getContinente());
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbContinente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdress;
    private javax.swing.JLabel lblCuit;
    private javax.swing.JLabel lblCuit1;
    private javax.swing.JLabel lblCuit2;
    private javax.swing.JLabel lblCuit3;
    private javax.swing.JLabel lblCuit4;
    private javax.swing.JLabel lblCuit5;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextField txtLat;
    private javax.swing.JTextField txtLon;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
