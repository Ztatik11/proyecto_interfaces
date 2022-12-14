package Pagina_Home;

import java.awt.event.ActionEvent;
import static java.lang.Short.toString;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openide.util.Exceptions;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author AlvaroCarrascoGarcia
 */
public class inicio_sesion extends javax.swing.JFrame {
    consultas_sql conexion_db;
    /**
     * Creates new form inicio_sesion
     */
    public inicio_sesion() throws SQLException {
        initComponents();
        this.UserButton.setVisible(false);
        this.UserButton.setText("");
        
        this.Errorclave.setVisible(false);
        this.ErrorUsuario.setVisible(false);
         this.conexion_db = new consultas_sql("mango_games","root","root");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        botonRegistro = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        UserButton = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        clave_inicio = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        usuario_correo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        boton_inicion_sesion = new javax.swing.JButton();
        ErrorUsuario = new javax.swing.JLabel();
        Errorclave = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 153, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MANGO GAMES");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        botonRegistro.setBackground(new java.awt.Color(0, 153, 255));
        botonRegistro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonRegistro.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistro.setText("registro");
        botonRegistro.setToolTipText("");
        botonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MicrosoftTeams-image (2).png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 100));

        UserButton.setBackground(new java.awt.Color(0, 153, 255));
        UserButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UserButton.setForeground(new java.awt.Color(255, 255, 255));
        UserButton.setText("usuario");
        UserButton.setToolTipText("");
        UserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserButtonActionPerformed(evt);
            }
        });

        menuButton.setBackground(new java.awt.Color(0, 153, 255));
        menuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeIcon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuButton)
                .addGap(87, 87, 87)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UserButton)
                        .addGap(18, 18, 18)))
                .addComponent(botonRegistro)
                .addGap(21, 21, 21))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 114, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(menuButton))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 140));

        jPanel5.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("CONTRASEÑA:");
        jLabel1.setAutoscrolls(true);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("CONTRASEÑA:");
        jLabel7.setAutoscrolls(true);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        clave_inicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clave_inicio.setMaximumSize(new java.awt.Dimension(880, 560));
        clave_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clave_inicioActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");

        usuario_correo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usuario_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuario_correoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jPanel7.setBackground(new java.awt.Color(0, 102, 153));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("INICIO DE SESIÓN");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(183, 183, 183))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("USUARIO/CORREO ELECTRÓNICO:");
        jLabel6.setAutoscrolls(true);
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        boton_inicion_sesion.setText("INICIAR SESIÓN");
        boton_inicion_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_inicion_sesionActionPerformed(evt);
            }
        });

        ErrorUsuario.setForeground(new java.awt.Color(255, 0, 0));
        ErrorUsuario.setText("El usuario no se ha encontrado");

        Errorclave.setForeground(new java.awt.Color(255, 0, 0));
        Errorclave.setText("La contraseña es errónea");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(clave_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(usuario_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_inicion_sesion)
                            .addComponent(jButton2))))
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Errorclave)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ErrorUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(244, 244, 244))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuario_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrorUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clave_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Errorclave)
                .addGap(24, 24, 24)
                .addComponent(boton_inicion_sesion)
                .addGap(35, 35, 35)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 433, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 880, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuario_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuario_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuario_correoActionPerformed

    private void clave_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clave_inicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clave_inicioActionPerformed

    private void botonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroActionPerformed
       registro b = null;
        try {
            b = new registro();
        } catch (SQLException ex) {
            Logger.getLogger(inicio_sesion.class.getName()).log(Level.SEVERE, null, ex);
        }
       b.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_botonRegistroActionPerformed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        homeInterface c = null;
        try {
            c = new homeInterface();
        } catch (SQLException ex) {
            Logger.getLogger(inicio_sesion.class.getName()).log(Level.SEVERE, null, ex);
        }
       c.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jLabel4MousePressed
 
    private void comprobarClave(String claveUser,String clave, String validNom) {
        
        if(claveUser.equalsIgnoreCase(clave)){
            boolean sesion_iniciada=true;
            this.Errorclave.setVisible(false);
            this.UserButton.setText(validNom);
            this.UserButton.setVisible(true);
            this.botonRegistro.setVisible(false);
        }
        else if(!claveUser.equalsIgnoreCase(clave)){
            this.Errorclave.setVisible(true);
        }
    }
     
    private void boton_inicion_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_inicion_sesionActionPerformed
        // TODO add your handling code here:
        
        java.sql.ResultSet nom_usuario = null;
        java.sql.ResultSet correo_usuario = null;
        java.sql.ResultSet claveEm = null;
        java.sql.ResultSet claveNom = null;
        String validNom = null;
        String validEm = null;
        String validClave = null;
        String clave = null;
        
        char[] caracteresClave = this.clave_inicio.getPassword();
            for(int i = 0; i< caracteresClave.length;i++){
                clave = String.valueOf(caracteresClave);
            }
        
        try {
            nom_usuario =this.conexion_db.realizar_consulta("Select Usuario from usuarios where Usuario =  '"  + this.usuario_correo.getText() + "'");
            
            while (nom_usuario.next()){
            validNom = (nom_usuario.getString("Usuario"));
            }
            
            correo_usuario=this.conexion_db.realizar_consulta("Select Email from usuarios where Email = '"  + this.usuario_correo.getText() + "'");
            
            while (correo_usuario.next()){
            validEm = (correo_usuario.getString("Email"));
            }
            
        } catch (SQLException ex) {
            this.ErrorUsuario.setVisible(true);
            Exceptions.printStackTrace(ex);
        }
        
        boolean correcto = false;
        
        if (this.usuario_correo.getText().equalsIgnoreCase(validEm)){
            this.ErrorUsuario.setVisible(false);
            correcto = true;
            usuario_correo.setText("");
            
            try {
            claveEm =this.conexion_db.realizar_consulta("Select clave from usuarios where Email = " + "'" + validEm+ "'");
            } catch (SQLException ex) {
                this.Errorclave.setVisible(true);
            Exceptions.printStackTrace(ex);
            }
            
            try{
            while (claveEm.next()){
            validClave = claveEm.getString("clave");
            }}catch (SQLException ex) {
            Exceptions.printStackTrace(ex);
            }
           
            comprobarClave(validClave, clave, validNom);
           
            usuario_correo.setText("");
            clave_inicio.setText("");
        }
        else if(this.usuario_correo.getText().equalsIgnoreCase(validNom)){
            this.ErrorUsuario.setVisible(false);
            correcto = true;
            usuario_correo.setText("");
            
            try {
            claveNom =this.conexion_db.realizar_consulta("Select clave from usuarios where usuario = " + "'" + validNom+ "'");
            } catch (SQLException ex) {
                this.Errorclave.setVisible(true);
                Exceptions.printStackTrace(ex);
            }
            
            try{
            while (claveNom.next()){
            validClave = claveNom.getString("clave");
            }}catch (SQLException ex) {
            Exceptions.printStackTrace(ex);
            }
            
            
            comprobarClave(validClave, clave,validNom);
           
            usuario_correo.setText("");
            clave_inicio.setText("");
        }
        if (correcto == false){
            this.ErrorUsuario.setVisible(true);
        }
        else{
            usuario_correo.setText("");
            clave_inicio.setText("");
        }              
    }//GEN-LAST:event_boton_inicion_sesionActionPerformed

    private void UserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserButtonActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new inicio_sesion().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(inicio_sesion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrorUsuario;
    private javax.swing.JLabel Errorclave;
    private javax.swing.JButton UserButton;
    private javax.swing.JButton botonRegistro;
    private javax.swing.JButton boton_inicion_sesion;
    private javax.swing.JPasswordField clave_inicio;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton menuButton;
    private javax.swing.JTextField usuario_correo;
    // End of variables declaration//GEN-END:variables

    

    


}