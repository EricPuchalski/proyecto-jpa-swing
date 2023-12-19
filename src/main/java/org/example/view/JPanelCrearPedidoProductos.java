/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.example.view;

import java.util.List;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import org.example.controller.JFrameController;
import org.example.controller.LineaPedidoController;
import org.example.controller.PedidoController;
import org.example.controller.ProductoController;
import org.example.dao.CategoriaProductoJpaController;
import org.example.dao.PedidoJpaController;
import org.example.dao.ProductoJpaController;
import org.example.dao.ProveedorJpaController;
import org.example.model.Cliente;
import org.example.model.Deposito;
import org.example.model.LineaPedido;
import org.example.model.Pedido;
import org.example.model.Producto;
import org.example.model.Transportista;
import org.example.service.ProductoService;
import org.example.util.CargarDatos;
import org.example.util.Conexion;

/**
 *
 * @author ericp
 */
public class JPanelCrearPedidoProductos extends javax.swing.JPanel {
    private ProductoController productoController; 
    private PedidoController pedidoController;
    private LineaPedidoController lineaPedidoController;
    private Cliente cliente;
    private Transportista transportista;
    private Deposito depositoOrigen;
    private Deposito depositoDestino;

    /**
     * Creates new form JPanelCrearPedidoProductos
     */
    public JPanelCrearPedidoProductos(Cliente cliente, Transportista transportista, Deposito depositoOrigen, Deposito depositoDestino) {
        this.cliente = cliente;
        this.transportista = transportista;
        this.depositoDestino = depositoDestino;
        this.depositoOrigen = depositoOrigen;
        this.productoController = new ProductoController(new ProductoService(new ProductoJpaController(Conexion.getEmf(),new ProveedorJpaController(Conexion.getEmf()),new CategoriaProductoJpaController(Conexion.getEmf()))));
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblLineaPedidos = new javax.swing.JTable();
        btnCreateLP = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        spCantidad = new javax.swing.JSpinner();
        btnCancel1 = new javax.swing.JButton();
        btnRegister1 = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();

        setBackground(new java.awt.Color(34, 131, 210));
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(232, 245, 255));
        jLabel2.setText("SELECCIONAR PRODUCTOS");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Producto");

        tblLineaPedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tblLineaPedidos);

        btnCreateLP.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnCreateLP.setText("Agregar");
        btnCreateLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateLPActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Lineas de pedido");

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tblProductos);

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Cantidad");

        spCantidad.setMaximumSize(new java.awt.Dimension(5555, 5555));
        spCantidad.setName(""); // NOI18N

        btnCancel1.setBackground(new java.awt.Color(204, 0, 0));
        btnCancel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnCancel1.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel1.setText("Cancelar");
        btnCancel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel1ActionPerformed(evt);
            }
        });

        btnRegister1.setBackground(new java.awt.Color(0, 102, 255));
        btnRegister1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnRegister1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister1.setText("Confirmar");
        btnRegister1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister1ActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearch)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(spCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btnCreateLP))
                            .addComponent(jScrollPane5)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateLP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegister1ActionPerformed

    private void btnCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel1ActionPerformed
        JFrameController.cambiarPanel(this,this, this);
    }//GEN-LAST:event_btnCancel1ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
                List<Producto> productosBuscados = productoController.buscarPorNombreParcial(txtProducto.getText()+"%");
                DefaultTableModel modeloNuevo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        }; 

        String titulos[] = {"Id", "Nombre", "Proveedor", "Peso"};
        modeloNuevo.setColumnIdentifiers(titulos);
        List<Producto> listProductos = productoController.findAll();

        if(!productosBuscados.isEmpty()){
            for (Producto e: productosBuscados){
                Object[] obj = {e.getId(), e.getNombre(), e.getProveedor().getNombre(), e.getPeso()};
                modeloNuevo.addRow(obj);
            }
        }

        tblProductos.setModel(modeloNuevo);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        crearTabla();
        modificarSpinner();
        cargarLineas();
    }//GEN-LAST:event_formComponentAdded

    private void btnCreateLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateLPActionPerformed
        
//        lineaPedidoController.create(new LineaPedido(producto, WIDTH, pedido));
    }//GEN-LAST:event_btnCreateLPActionPerformed
    public void cargarLineas(){
        DefaultTableModel modeloNuevo = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column){
                return false;
            }
        };

        String titulos[] = {"Id", "Producto", "Cantidad"};
        modeloNuevo.setColumnIdentifiers(titulos);


        tblLineaPedidos.setModel(modeloNuevo);
    }
    public void modificarSpinner(){
        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, 200, 1);
        spCantidad.setModel(model);
    }
    
    public void crearTabla(){
        DefaultTableModel modeloNuevo = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column){
            return false;
        }
        };

        String titulos[] = {"Id", "Nombre", "Proveedor", "Peso"};
        modeloNuevo.setColumnIdentifiers(titulos);
        List<Producto> listProductos = productoController.findAll();

        if(!listProductos.isEmpty()){
            for (Producto e: listProductos){
                Object[] obj = {e.getId(), e.getNombre(), e.getProveedor().getNombre(), e.getPeso()};
                modeloNuevo.addRow(obj);
            }
        }

        tblProductos.setModel(modeloNuevo);
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel1;
    private javax.swing.JButton btnCreateLP;
    private javax.swing.JButton btnRegister1;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JTable tblLineaPedidos;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
