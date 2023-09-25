/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.example.view;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.swing.JOptionPane;
import javax.swing.*;
import org.example.controller.CategoriaProductoController;
import org.example.controller.JFrameController;
import org.example.controller.ProductoController;
import org.example.controller.ProveedorController;
import org.example.dao.CategoriaProductoJpaController;
import org.example.dao.ProductoJpaController;
import org.example.dao.ProveedorJpaController;
import org.example.model.CategoriaProducto;
import org.example.model.Producto;
import org.example.model.Proveedor;
import org.example.service.CategoriaProductoService;
import org.example.service.ProductoService;
import org.example.service.ProveedorService;
import org.example.util.EntityManagerFactoryUTIL;

/**
 *
 * @author ericp
 */
public class JPanelModificarProducto extends javax.swing.JPanel {
    private Long idProducto;
    private Producto pr;
    ProveedorController proveedorController;
    CategoriaProductoController categoriaProductoController;
    ProductoController productoController;
    ProveedorJpaController pJpa;
    CategoriaProductoJpaController cJpa;
    EntityManagerFactory emf = EntityManagerFactoryUTIL.getEntityManagerFactory();
            ;
    /**
     * Creates new form JPanelModificarProducto
     */
    public JPanelModificarProducto(Long idProdu) {
        this.idProducto= idProdu;
        this.setSize(785,700);
        this.proveedorController = new ProveedorController(new ProveedorService(pJpa = new ProveedorJpaController(emf)));
        this.categoriaProductoController = new CategoriaProductoController(new CategoriaProductoService(cJpa = new CategoriaProductoJpaController(emf)));
        this.productoController = new ProductoController(new ProductoService(new ProductoJpaController(emf, pJpa, cJpa)));
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

        jLabel3 = new javax.swing.JLabel();
        cmbProveedor = new javax.swing.JComboBox<>();
        lblName = new javax.swing.JLabel();
        cmbCategorias = new javax.swing.JComboBox<>();
        lblSurname2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        lblAdress1 = new javax.swing.JLabel();
        lblAdress = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        txtBroad = new javax.swing.JTextField();
        txtHigh = new javax.swing.JTextField();
        lblSurname1 = new javax.swing.JLabel();
        txtLong = new javax.swing.JTextField();
        lblSurname3 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 204));
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Proveedor");

        cmbProveedor.setBackground(new java.awt.Color(34, 131, 210));
        cmbProveedor.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        cmbProveedor.setForeground(new java.awt.Color(0, 0, 0));
        cmbProveedor.setBorder(null);
        cmbProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProveedorActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(204, 255, 255));
        lblName.setText("Categoria");

        cmbCategorias.setBackground(new java.awt.Color(34, 131, 210));
        cmbCategorias.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        cmbCategorias.setForeground(new java.awt.Color(0, 0, 0));
        cmbCategorias.setBorder(null);
        cmbCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriasActionPerformed(evt);
            }
        });

        lblSurname2.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lblSurname2.setForeground(new java.awt.Color(204, 255, 255));
        lblSurname2.setText("Nombre");

        txtName.setBackground(new java.awt.Color(34, 131, 210));
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtName.setVerifyInputWhenFocusTarget(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtPeso.setBackground(new java.awt.Color(34, 131, 210));
        txtPeso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtPeso.setVerifyInputWhenFocusTarget(false);
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });

        lblAdress1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lblAdress1.setForeground(new java.awt.Color(204, 255, 255));
        lblAdress1.setText("Peso");

        lblAdress.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lblAdress.setForeground(new java.awt.Color(204, 255, 255));
        lblAdress.setText("Alto");

        lblSurname.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lblSurname.setForeground(new java.awt.Color(204, 255, 255));
        lblSurname.setText("Ancho");

        txtBroad.setBackground(new java.awt.Color(34, 131, 210));
        txtBroad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtBroad.setVerifyInputWhenFocusTarget(false);
        txtBroad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBroadActionPerformed(evt);
            }
        });

        txtHigh.setBackground(new java.awt.Color(34, 131, 210));
        txtHigh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtHigh.setVerifyInputWhenFocusTarget(false);
        txtHigh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHighActionPerformed(evt);
            }
        });

        lblSurname1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lblSurname1.setForeground(new java.awt.Color(204, 255, 255));
        lblSurname1.setText("Largo");

        txtLong.setBackground(new java.awt.Color(34, 131, 210));
        txtLong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtLong.setVerifyInputWhenFocusTarget(false);
        txtLong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLongActionPerformed(evt);
            }
        });

        lblSurname3.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lblSurname3.setForeground(new java.awt.Color(204, 255, 255));
        lblSurname3.setText("Codigo");

        txtCod.setBackground(new java.awt.Color(34, 131, 210));
        txtCod.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtCod.setVerifyInputWhenFocusTarget(false);
        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(0, 102, 255));
        btnRegister.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Modificar");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(204, 0, 0));
        btnCancel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("MODIFICAR PRODUCTO");

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Por favor ingrese los datos requeridos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(lblSurname3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblSurname2)
                                .addGap(18, 18, 18)
                                .addComponent(txtName)
                                .addGap(36, 36, 36)
                                .addComponent(lblAdress1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(lblName)
                                .addGap(18, 18, 18)
                                .addComponent(cmbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSurname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBroad, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(lblAdress)
                                .addGap(30, 30, 30)
                                .addComponent(txtHigh, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSurname1)
                                .addGap(24, 24, 24)
                                .addComponent(txtLong, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName)
                    .addComponent(cmbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblSurname2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAdress1)
                        .addComponent(txtPeso)))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSurname)
                            .addComponent(txtBroad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAdress)
                            .addComponent(txtHigh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSurname1)
                        .addComponent(txtLong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSurname3)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProveedorActionPerformed

    private void cmbCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoriasActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void txtBroadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBroadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBroadActionPerformed

    private void txtHighActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHighActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHighActionPerformed

    private void txtLongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLongActionPerformed

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        Proveedor pro = proveedorController.findByName(cmbProveedor.getSelectedItem().toString());
        CategoriaProducto cP = categoriaProductoController.findByName(cmbCategorias.getSelectedItem().toString());

        try {
            pr.setAltura(Double.valueOf(txtBroad.getText()));
            pr.setPeso(Double.valueOf(txtPeso.getText()));
            pr.setAncho(Double.valueOf(txtHigh.getText()));
            pr.setLargo(Double.valueOf(txtLong.getText()));
            pr.setCodigo(txtCod.getText());
            pr.setNombre(txtName.getText());
            pr.setProveedor(pro);
            pr.setCategoria(cP);

            productoController.upDate(pr);
            JOptionPane.showMessageDialog(this, "Producto modificado con exito", "Creación exitosa", JOptionPane.INFORMATION_MESSAGE);
            JFrameController.cambiarPanel(this, new JPanelConsultaProducto(), this);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Datos incorrectos", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        JFrameController.cambiarPanel(this, new JPanelConsultaProducto(), this);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        this.cargarDatosExistentes(idProducto);
        this.cargarComboBox();
    }//GEN-LAST:event_formAncestorAdded
    public void cargarDatosExistentes(Long id){
        pr = productoController.findOne(id);
        cmbProveedor.setSelectedItem(pr.getProveedor().getNombre());
        cmbCategorias.setSelectedItem(pr.getCategoria().getNombre());
        txtName.setText(pr.getNombre());
        txtPeso.setText(String.valueOf(pr.getPeso()));
        txtBroad.setText(String.valueOf(pr.getAncho()));
        txtHigh.setText(String.valueOf(pr.getAltura()));
        txtLong.setText(String.valueOf(pr.getLargo()));
        txtCod.setText(pr.getCodigo());
    }

    private void cargarComboBox() {
        List<Proveedor> proveedores = proveedorController.findAll();
        for (Proveedor p : proveedores) {
            cmbProveedor.addItem(p.getNombre());
        }
        
        List<CategoriaProducto> categoriaProductos = categoriaProductoController.findAll();
                for (CategoriaProducto p : categoriaProductos) {
            cmbCategorias.addItem(p.getNombre());
        }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cmbCategorias;
    private javax.swing.JComboBox<String> cmbProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblAdress;
    private javax.swing.JLabel lblAdress1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblSurname1;
    private javax.swing.JLabel lblSurname2;
    private javax.swing.JLabel lblSurname3;
    private javax.swing.JTextField txtBroad;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtHigh;
    private javax.swing.JTextField txtLong;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}