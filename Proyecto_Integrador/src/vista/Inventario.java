
package vista;

import gestores.GestorProducto;
import javax.swing.JOptionPane;

import javax.swing.JCheckBox;
import modelo.*;
import javax.swing.table.DefaultTableModel;

public class Inventario extends javax.swing.JFrame {
    
    private GestorProducto gestor;

    private DefaultTableModel modeloTablaProductos;

    public Inventario() {
        initComponents();
        gestor = new GestorProducto();
        modeloTablaProductos = new DefaultTableModel();
        tablaProductos.setModel(modeloTablaProductos);
         modeloTablaProductos.addColumn("Codigo:");
        modeloTablaProductos.addColumn("Categoria:");
        modeloTablaProductos.addColumn("PrecioUnd:");
        modeloTablaProductos.addColumn("Impuesto:");
        modeloTablaProductos.addColumn("Impuesto:");
        modeloTablaProductos.addColumn("Descuento:");
        modeloTablaProductos.addColumn("Disponible:");
        
    }
    
    public Inventario(GestorProducto gestorEquipo) {
        initComponents();
        gestor = gestorEquipo;

        modeloTablaProductos = new DefaultTableModel();
        tablaProductos.setModel(modeloTablaProductos);
        tablaProductos.setModel(modeloTablaProductos);
        modeloTablaProductos.addColumn("Codigo:");
        modeloTablaProductos.addColumn("Categoria:");
        modeloTablaProductos.addColumn("PrecioUnd:");
        modeloTablaProductos.addColumn("Impuesto:");
        modeloTablaProductos.addColumn("Impuesto:");
        modeloTablaProductos.addColumn("Descuento:");
        modeloTablaProductos.addColumn("Disponible:");
        actualizarTablaProductos();
    }
    
    
    public void limpiarTablaEquipos(){
        for (int i = modeloTablaProductos.getRowCount()-1; i >=0 ; i--) {
            modeloTablaProductos.removeRow(i);
        }        
    }

    public void actualizarTablaProductos(){
        limpiarTablaEquipos();
        for (int i = 0; i < gestor.longitud(); i++) {
            Producto objProducto = gestor.iesimo(i);
            String[] fila = new String[7];
            fila[0] = String.valueOf(objProducto.getCodigo());
            fila[1] = String.valueOf(objProducto.getCategoria());
            fila[2] = String.valueOf(objProducto.getNombre());
            fila[3] = String.valueOf(objProducto.getPrecioUnd());
            fila[4] = String.valueOf(objProducto.getImpuesto());
            fila[5] = String.valueOf(objProducto.getDescuento());
            fila[6] = String.valueOf(objProducto.getDisponible());
           
            
            
            modeloTablaProductos.addRow(fila);                       
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

        bgSexo = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEstadistica = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rbLacteos = new javax.swing.JRadioButton();
        rbAbarrotes = new javax.swing.JRadioButton();
        rbGolosinas = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        btnOrdenarPorCategoria = new javax.swing.JButton();
        txtImpuesto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPrecioUnd = new javax.swing.JTextField();
        cbDisponible = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Personas");

        jLabel2.setText("Codigo");

        jLabel3.setText("Nombre");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEstadistica.setText("Estadistica");
        btnEstadistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticaActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria del Producto"));
        jPanel1.setToolTipText("");

        bgSexo.add(rbLacteos);
        rbLacteos.setText("Lacteos");
        rbLacteos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLacteosActionPerformed(evt);
            }
        });

        bgSexo.add(rbAbarrotes);
        rbAbarrotes.setText("Abarrotes");

        bgSexo.add(rbGolosinas);
        rbGolosinas.setText("Golosinas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbLacteos)
                    .addComponent(rbAbarrotes)
                    .addComponent(rbGolosinas))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbLacteos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbAbarrotes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbGolosinas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Impuesto:");

        btnOrdenarPorCategoria.setText("Ordenar por Categoria");
        btnOrdenarPorCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarPorCategoriaActionPerformed(evt);
            }
        });

        jLabel1.setText("Precio");

        cbDisponible.setText("Disponible");
        cbDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDisponibleActionPerformed(evt);
            }
        });

        jLabel5.setText("Descuento");

        txtDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuentoActionPerformed(evt);
            }
        });

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Categoria", "Nombre", "Impuesto", "Descuento", "Precio", "Disponible"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(txtCodigo)
                                    .addComponent(txtImpuesto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(btnEliminar)
                                                .addGap(11, 11, 11)
                                                .addComponent(btnOrdenarPorCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtDescuento)
                                                    .addComponent(txtPrecioUnd, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEstadistica))
                                    .addComponent(cbDisponible))
                                .addGap(0, 214, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPrecioUnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar)
                    .addComponent(btnOrdenarPorCategoria)
                    .addComponent(btnEstadistica))
                .addGap(10, 10, 10)
                .addComponent(cbDisponible)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstadisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticaActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_btnEstadisticaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        String disponible ="";
        int codigo = Integer.valueOf(txtCodigo.getText());
        String nombre = txtNombre.getText();
        int impuesto = Integer.valueOf(txtImpuesto.getText());
        int precioUnd = Integer.valueOf(txtPrecioUnd.getText());
        String categoria = "";
        if (rbLacteos.isSelected()){
            categoria = "Lacteos";
        }if (rbAbarrotes.isSelected()){
            categoria = "Abarrotes";
        }else if(rbGolosinas.isSelected()){
            categoria = "Golosinas";
        }
        float descuento = Float.valueOf(txtDescuento.getText()) ;
        Producto objEquipo;
        objEquipo = new Producto(codigo,categoria,nombre,precioUnd,descuento,impuesto,disponible);
        boolean resultado = gestor.agregar(objEquipo);
        if (resultado==true){
            actualizarTablaProductos();
            JOptionPane.showMessageDialog(rootPane, "Se guardo correctamente");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Problemas al Guardar");
        }
        if (cbDisponible.isSelected()){
            disponible = "Si";
        }
        else{
             disponible = "No";
            }
 
        txtCodigo.setText("");
        txtNombre.setText("");
        txtDescuento.setText("");
        txtImpuesto.setText("");
        cbDisponible.setSelected(false);
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int index = tablaProductos.getSelectedRow();
        if (index>=0){
            int resultado = JOptionPane.showConfirmDialog(rootPane, 
                    "Eliminar Equipo", "Desea eliminar?", JOptionPane.YES_NO_OPTION);
            if (resultado == JOptionPane.YES_OPTION){
                Object temp = tablaProductos.getValueAt(index, 0);
                int serie = Integer.valueOf(String.valueOf(temp));
                int pos = gestor.ubicacion(serie); 
                boolean r = gestor.eliminar(pos);
                if (r==true){
                    JOptionPane.showMessageDialog(rootPane, "Se elimino correctamente");
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Problemas al eliminar");
                }
                // Actualizar la vista de la tabla
                actualizarTablaProductos();
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un registro");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed

    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnOrdenarPorCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarPorCategoriaActionPerformed

        gestor.ordenarPorMarca();
        actualizarTablaProductos();
    }//GEN-LAST:event_btnOrdenarPorCategoriaActionPerformed

    private void rbLacteosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLacteosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbLacteosActionPerformed

    private void txtDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuentoActionPerformed

    private void cbDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDisponibleActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbDisponibleActionPerformed

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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEstadistica;
    private javax.swing.JButton btnOrdenarPorCategoria;
    private javax.swing.JCheckBox cbDisponible;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbAbarrotes;
    private javax.swing.JRadioButton rbGolosinas;
    private javax.swing.JRadioButton rbLacteos;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtImpuesto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioUnd;
    // End of variables declaration//GEN-END:variables
}
