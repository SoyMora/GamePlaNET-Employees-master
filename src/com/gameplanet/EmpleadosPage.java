package com.gameplanet;

import java.awt.Color;
import java.awt.Font;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mora
 */
public class EmpleadosPage extends javax.swing.JFrame {
    DefaultTableModel tabla = new DefaultTableModel();
    int idCounter = 0;
    private void agregarRegistro() {
        String[] agregar = new String[7];
        idCounter++;
        agregar[0] = String.valueOf(idCounter);
        agregar[1] = txtNombre.getText();
        agregar[2] = txtApellidoP.getText();
        agregar[3] = txtApellidoM.getText();
        agregar[4] = txtEdad.getText();
        agregar[5] = (String) cbxArea.getSelectedItem();
        agregar[6] = (String) cbxTurno.getSelectedItem();
        tabla.addRow(agregar);
    }
    private void eliminarRegistro() {
    int filaSeleccionada = tablaEmpleados.getSelectedRow();

    if (filaSeleccionada != -1) {
        tabla.removeRow(filaSeleccionada);
        
        reiniciarContador(); // Reinicia el contador después de eliminar una fila
        
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, selecciona una fila para eliminar");
    }
}
    public EmpleadosPage() {
        initComponents();
        tabla.addColumn("ID");
        tabla.addColumn("Nombre");
        tabla.addColumn("Apellido P");
        tabla.addColumn("Apellido M");
        tabla.addColumn("Edad");
        tabla.addColumn("Area");
        tabla.addColumn("Turno");
        this.tablaEmpleados.setModel(tabla);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelIzquierdo = new javax.swing.JPanel();
        favicongp = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JPanel();
        txtAgregar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        txtEliminar = new javax.swing.JLabel();
        btnModificar = new javax.swing.JPanel();
        txtModificar = new javax.swing.JLabel();
        btnEliminarTodo = new javax.swing.JPanel();
        txtEliminarTodo = new javax.swing.JLabel();
        labelEdad = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelApellidoP = new javax.swing.JLabel();
        labelApellidoM = new javax.swing.JLabel();
        labelArea = new javax.swing.JLabel();
        labelTurno = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        cbxArea = new javax.swing.JComboBox<>();
        cbxTurno = new javax.swing.JComboBox<>();
        scrollPane = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tabla Empleados GamePlaNET");

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelIzquierdo.setBackground(new java.awt.Color(255, 236, 114));
        panelIzquierdo.setFocusTraversalPolicyProvider(true);
        panelIzquierdo.setPreferredSize(new java.awt.Dimension(200, 500));

        favicongp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/faviconGP.png"))); // NOI18N
        favicongp.setText("jLabel6");

        btnAgregar.setBackground(new java.awt.Color(255, 255, 204));

        txtAgregar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        txtAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAgregar.setText("AGREGAR");
        txtAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtAgregarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarLayout.createSequentialGroup()
                .addComponent(txtAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnEliminar.setBackground(new java.awt.Color(255, 255, 204));

        txtEliminar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        txtEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEliminar.setText("ELIMINAR");
        txtEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEliminarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarLayout.createSequentialGroup()
                .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnModificar.setBackground(new java.awt.Color(255, 255, 204));

        txtModificar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        txtModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtModificar.setText("MODIFICAR");
        txtModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtModificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtModificarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnModificarLayout = new javax.swing.GroupLayout(btnModificar);
        btnModificar.setLayout(btnModificarLayout);
        btnModificarLayout.setHorizontalGroup(
            btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );
        btnModificarLayout.setVerticalGroup(
            btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnEliminarTodo.setBackground(new java.awt.Color(255, 255, 204));

        txtEliminarTodo.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        txtEliminarTodo.setText("ELIMINAR TODO");
        txtEliminarTodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEliminarTodoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEliminarTodoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEliminarTodoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnEliminarTodoLayout = new javax.swing.GroupLayout(btnEliminarTodo);
        btnEliminarTodo.setLayout(btnEliminarTodoLayout);
        btnEliminarTodoLayout.setHorizontalGroup(
            btnEliminarTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEliminarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnEliminarTodoLayout.setVerticalGroup(
            btnEliminarTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarTodoLayout.createSequentialGroup()
                .addComponent(txtEliminarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelIzquierdoLayout = new javax.swing.GroupLayout(panelIzquierdo);
        panelIzquierdo.setLayout(panelIzquierdoLayout);
        panelIzquierdoLayout.setHorizontalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(favicongp, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        panelIzquierdoLayout.setVerticalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEliminarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(favicongp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(panelIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 70));

        labelEdad.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        labelEdad.setText("EDAD");
        background.add(labelEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 80, 20));

        labelNombre.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        labelNombre.setText("NOMBRE");
        background.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 100, 80, 20));

        labelApellidoP.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        labelApellidoP.setText("APELLIDO P");
        background.add(labelApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 100, 20));

        labelApellidoM.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        labelApellidoM.setText("APELLIDO M");
        background.add(labelApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 110, 20));

        labelArea.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        labelArea.setText("AREA");
        background.add(labelArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 80, 20));

        labelTurno.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        labelTurno.setText("TURNO");
        background.add(labelTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 80, 20));
        background.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 50, -1));
        background.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 90, -1));
        background.add(txtApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 100, -1));
        background.add(txtApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 100, -1));

        cbxArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cajero", "Limpieza", "Encargado", "Bodega", "Piso" }));
        background.add(cbxArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 110, -1));

        cbxTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TM 8:30-15:30", "TV 14:00 20:00" }));
        background.add(cbxTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 130, -1));

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido P", "Apellido M", "Edad", "Area", "Turno"
            }
        ));
        tablaEmpleados.setFocusable(false);
        tablaEmpleados.setOpaque(false);
        tablaEmpleados.setRowHeight(25);
        tablaEmpleados.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tablaEmpleados.getTableHeader().setReorderingAllowed(false);
        scrollPane.setViewportView(tablaEmpleados);

        background.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 750, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarMouseClicked
        String []agregar = new String[7];
        idCounter++;
        agregar[0]=String.valueOf(idCounter);
        agregar[1]=txtNombre.getText();
        agregar[2]=txtApellidoP.getText();
        agregar[3]=txtApellidoM.getText();
        agregar[4]=txtEdad.getText();
        agregar[5]=(String)cbxArea.getSelectedItem();
        agregar[6]=(String)cbxTurno.getSelectedItem();
        tabla.addRow(agregar);
    }//GEN-LAST:event_txtAgregarMouseClicked

    private void txtModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModificarMouseClicked
       int filaSeleccionada = tablaEmpleados.getSelectedRow();

    if (filaSeleccionada != -1) {
        // Obtiene el ID de la fila seleccionada
        Object valorId = tablaEmpleados.getValueAt(filaSeleccionada, 0);

        if (valorId != null) {
            int idAModificar = Integer.parseInt(valorId.toString());

            // Obtiene los nuevos valores de los campos de texto y combobox
            String nuevoNombre = txtNombre.getText();
            String nuevoApellidoP = txtApellidoP.getText();
            String nuevoApellidoM = txtApellidoM.getText();
            String nuevaEdad = txtEdad.getText();
            String nuevaArea = (String) cbxArea.getSelectedItem();
            String nuevoTurno = (String) cbxTurno.getSelectedItem();

            // Actualiza los valores en la tabla
            tablaEmpleados.setValueAt(nuevoNombre, filaSeleccionada, 1);
            tablaEmpleados.setValueAt(nuevoApellidoP, filaSeleccionada, 2);
            tablaEmpleados.setValueAt(nuevoApellidoM, filaSeleccionada, 3);
            tablaEmpleados.setValueAt(nuevaEdad, filaSeleccionada, 4);
            tablaEmpleados.setValueAt(nuevaArea, filaSeleccionada, 5);
            tablaEmpleados.setValueAt(nuevoTurno, filaSeleccionada, 6);
            
            // Puedes agregar más campos según sea necesario

            // Informa al usuario que la modificación se realizó con éxito
            JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, selecciona una fila para modificar");
    }
    }//GEN-LAST:event_txtModificarMouseClicked

    private void txtEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarMouseClicked
                    
    int filaSeleccionada = tablaEmpleados.getSelectedRow();

    // Verifica si hay una fila seleccionada
    if (filaSeleccionada != -1) {
    // Obtiene el valor de la columna 0 (que contiene el ID) de la fila seleccionada
        Object valorId = tabla.getValueAt(filaSeleccionada, 0);

    // Verifica que el valor sea válido
        if (valorId != null) {
        // Convierte el valor a un entero para obtener el ID a eliminar
            int idToDelete = Integer.parseInt(valorId.toString());

        // Resto del código para eliminar la fila y reorganizar los IDs si es necesario
            int indexToDelete = filaSeleccionada;
            tabla.removeRow(indexToDelete);

        // Reorganiza los IDs después de eliminar el usuario
            for (int i = indexToDelete; i < tabla.getRowCount(); i++) {
                tabla.setValueAt(String.valueOf(i + 1), i, 0);
            }
        }
        JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
    } else {
    // No hay fila seleccionada, muestra un mensaje o realiza alguna acción apropiada
        JOptionPane.showMessageDialog(null, "Por favor selecciona una fila para eliminar");
}

    }//GEN-LAST:event_txtEliminarMouseClicked

    private void txtAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarMouseEntered
        //[255,255,204] Color original
        //[229,229,184] Color cuando el mouse entra en contacto con el boton
        btnAgregar.setBackground(new Color(229,229,184));
    }//GEN-LAST:event_txtAgregarMouseEntered

    private void txtModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModificarMouseEntered
        btnModificar.setBackground(new Color(229,229,184));
    }//GEN-LAST:event_txtModificarMouseEntered

    private void txtEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarMouseEntered
        btnEliminar.setBackground(new Color(229,229,184)); 
        
    }//GEN-LAST:event_txtEliminarMouseEntered

    private void txtAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarMouseExited
        btnAgregar.setBackground(new Color(255,255,204)); 
    }//GEN-LAST:event_txtAgregarMouseExited

    private void txtModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModificarMouseExited
        btnModificar.setBackground(new Color(255,255,204)); 
    }//GEN-LAST:event_txtModificarMouseExited

    private void txtEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarMouseExited
        btnEliminar.setBackground(new Color(255,255,204)); 
    }//GEN-LAST:event_txtEliminarMouseExited

    private void txtEliminarTodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarTodoMouseClicked
        int elitotal = tablaEmpleados.getRowCount();
        for (int i = elitotal-1; i >= 0; i--) {
            tabla.removeRow(i);
        }
    }//GEN-LAST:event_txtEliminarTodoMouseClicked

    private void txtEliminarTodoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarTodoMouseEntered
        btnEliminarTodo.setBackground(new Color(229,229,184));
    }//GEN-LAST:event_txtEliminarTodoMouseEntered

    private void txtEliminarTodoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarTodoMouseExited
        btnEliminarTodo.setBackground(new Color(255,255,204)); 
    }//GEN-LAST:event_txtEliminarTodoMouseExited

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
            java.util.logging.Logger.getLogger(EmpleadosPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpleadosPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpleadosPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpleadosPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpleadosPage().setVisible(true);
            }
        });
    }
    
    private void reiniciarContador() {
    idCounter = 0;
    for (int i = 0; i < tablaEmpleados.getRowCount(); i++) {
        tablaEmpleados.setValueAt(String.valueOf(i + 1), i, 0);
    }
    
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JPanel btnEliminarTodo;
    private javax.swing.JPanel btnModificar;
    private javax.swing.JComboBox<String> cbxArea;
    private javax.swing.JComboBox<String> cbxTurno;
    private javax.swing.JLabel favicongp;
    private javax.swing.JLabel labelApellidoM;
    private javax.swing.JLabel labelApellidoP;
    private javax.swing.JLabel labelArea;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTurno;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JLabel txtAgregar;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JLabel txtEliminar;
    private javax.swing.JLabel txtEliminarTodo;
    private javax.swing.JLabel txtModificar;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
