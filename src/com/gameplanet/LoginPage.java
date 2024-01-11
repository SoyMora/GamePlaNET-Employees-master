package com.gameplanet;

import java.awt.Color;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class LoginPage extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public LoginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        btnSalir = new javax.swing.JPanel();
        txtExit = new javax.swing.JLabel();
        logoBackground = new javax.swing.JLabel();
        txtBackgroundGamePlanet = new javax.swing.JLabel();
        txtBackgroundGamePlanet1 = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        btnEntrar = new javax.swing.JPanel();
        txtEntrar = new javax.swing.JLabel();
        faviconGP = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        separador2 = new javax.swing.JSeparator();
        labelContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        panelOpciones = new javax.swing.JPanel();
        gpBackground = new javax.swing.JLabel();
        labelDatos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GamePlaNET Panel");
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(255, 153, 153));
        btnSalir.setOpaque(false);
        btnSalir.setPreferredSize(new java.awt.Dimension(804, 40));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSalirMousePressed(evt);
            }
        });

        txtExit.setBackground(new java.awt.Color(255, 255, 255));
        txtExit.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        txtExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtExit.setText("X");
        txtExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtExit.setOpaque(true);
        txtExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtExit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtExit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        background.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        logoBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/GamePlanet.png"))); // NOI18N
        background.add(logoBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 150, 109));

        txtBackgroundGamePlanet.setFont(new java.awt.Font("Roboto Black", 1, 25)); // NOI18N
        txtBackgroundGamePlanet.setText("ADMIN PANEL");
        txtBackgroundGamePlanet.setToolTipText("");
        background.add(txtBackgroundGamePlanet, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 180, 20));

        txtBackgroundGamePlanet1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        txtBackgroundGamePlanet1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBackgroundGamePlanet1.setText("GAMEPLANET");
        txtBackgroundGamePlanet1.setToolTipText("");
        background.add(txtBackgroundGamePlanet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 190, 30));

        separador1.setForeground(new java.awt.Color(51, 51, 51));
        separador1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        background.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 510, 10));

        btnEntrar.setBackground(new java.awt.Color(255, 236, 114));

        txtEntrar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        txtEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEntrar.setText("ENTRAR");
        txtEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEntrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnEntrarLayout = new javax.swing.GroupLayout(btnEntrar);
        btnEntrar.setLayout(btnEntrarLayout);
        btnEntrarLayout.setHorizontalGroup(
            btnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        btnEntrarLayout.setVerticalGroup(
            btnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        background.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 190, 60));

        faviconGP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/faviconGP.png"))); // NOI18N
        background.add(faviconGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 170, 70));

        title.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title.setText("INICIAR SESIÓN");
        background.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 190, 50));

        labelUsuario.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelUsuario.setText("USUARIO");
        background.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 70, -1));

        txtUsuario.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setText("Ingrese su nombre de usuario");
        txtUsuario.setBorder(null);
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        background.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 510, 40));

        separador2.setForeground(new java.awt.Color(51, 51, 51));
        separador2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        background.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 510, 10));

        labelContraseña.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        labelContraseña.setText("CONTRASEÑA");
        background.add(labelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 100, -1));

        txtContraseña.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(204, 204, 204));
        txtContraseña.setText("********");
        txtContraseña.setBorder(null);
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraseñaMousePressed(evt);
            }
        });
        background.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 510, 40));

        panelOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        panelOpciones.setOpaque(false);
        panelOpciones.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelOpcionesMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        background.add(panelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 0, 760, 40));

        gpBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/backgroundGamePlanet.png"))); // NOI18N
        background.add(gpBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 0, 200, 500));

        labelDatos.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        labelDatos.setForeground(new java.awt.Color(255, 51, 51));
        background.add(labelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 290, 30));

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

    private void btnSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_btnSalirMousePressed

    private void panelOpcionesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionesMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelOpcionesMouseDragged

    private void txtExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtExitMouseClicked

    private void txtExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseEntered
        txtExit.setBackground(Color.RED);
        txtExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_txtExitMouseEntered

    private void txtExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseExited
        txtExit.setBackground(Color.WHITE);
        txtExit.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtExitMouseExited

    private void txtEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEntrarMouseEntered
        //[255,236,114] Original
        //[216,199,95] Cambiado
        btnEntrar.setBackground(new Color(216, 199,95));
    }//GEN-LAST:event_txtEntrarMouseEntered

    private void txtEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEntrarMouseExited
        btnEntrar.setBackground(new Color(255, 236, 114));
    }//GEN-LAST:event_txtEntrarMouseExited

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        
        
        
        if(txtUsuario.getText().equals("Ingrese su nombre de usuario")){
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.BLACK);
        }
        if(String.valueOf(txtContraseña.getPassword()).isEmpty()){
            txtContraseña.setText("********");
            txtContraseña.setForeground(new Color(204,204,204)); // Color gris
        }
        
        
         
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMousePressed
        if(String.valueOf(txtContraseña.getPassword()).equals("********")){
            txtContraseña.setText("");
            txtContraseña.setForeground(Color.BLACK);
        }
        
        if(txtUsuario.getText().isEmpty()){
            txtUsuario.setText("Ingrese su nombre de usuario");
            txtUsuario.setForeground(new Color(204,204,204)); // Color gris
        }
        
        
        
    }//GEN-LAST:event_txtContraseñaMousePressed

    private void txtEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEntrarMouseClicked
        if(txtUsuario.getText().equals("Mora") && String.valueOf(txtContraseña.getPassword()).equals("gameplanet")){
            
            new EmpleadosPage().setVisible(true);
            this.setVisible(false);
        } else if(txtUsuario.getText().equals("Ingrese su nombre de usuario") || String.valueOf(txtContraseña.getPassword()).equals("********") || txtUsuario.getText().isEmpty()){
            labelDatos.setForeground(Color.ORANGE);
            labelDatos.setText("Porfavor ingrese sus datos");
        } else{
            labelDatos.setForeground(Color.RED);
            labelDatos.setText("Datos ingresados incorrectamente");
        }
    }//GEN-LAST:event_txtEntrarMouseClicked

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnEntrar;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JLabel faviconGP;
    private javax.swing.JLabel gpBackground;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelDatos;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel logoBackground;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JLabel title;
    private javax.swing.JLabel txtBackgroundGamePlanet;
    private javax.swing.JLabel txtBackgroundGamePlanet1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JLabel txtEntrar;
    private javax.swing.JLabel txtExit;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
