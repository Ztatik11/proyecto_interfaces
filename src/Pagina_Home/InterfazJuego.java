/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pagina_Home;

import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.openide.util.Exceptions;

/**
 *
 * @author JoseManuelRodriguezC
 */

public class InterfazJuego extends javax.swing.JFrame {
    consultas_sql conexion_db;
    boolean sesion_iniciada=false;
    String usuario = null;
    int IDjuego;
    Juego juego;
    Usuario usuario_i;
    
    
    public InterfazJuego(Juego juego, Usuario usuario) throws SQLException {
        this.usuario_i=usuario;
        initComponents();
        ajustes2.setVisible(false);
        miniMenu2.setVisible(false);
        comprobarInicioS(usuario_i);
        this.Confirmacion_compra.setVisible(false);
        this.Confirmacion_compra.setEnabled(false);
        this.panel_excepcion_compra.setVisible(false);
        this.panel_excepcion_compra.setEnabled(false);
        consultas_sql conexion_db = new consultas_sql("mango_games","root","root");
        this.conexion_db = new consultas_sql("mango_games","root","root");
        this.juego = juego;
        this.LabelDescripcion.setEditable(false);
        this.LabelDescripcion.setLineWrap(true);
        this.LabelDescripcion.setWrapStyleWord(true);
        
        this.ImagenJuego.setIcon((new ImageIcon(convertir_imagen())));
        this.LabelTitulo.setText(this.juego.getTitulo());
        this.LabelDescripcion.setText(this.juego.getDescripcion());
        this.LabelDesarrolladora.setText("Desarrolladora: " +this.juego.getDesarrolladora());
        this.LabelPrecio.setText("Precio: " + String.valueOf(this.juego.getPrecio()) + "€");
        this.LabelNota.setText("Nota: " +this.juego.getNota() + "/10");
        this.LabelNjugadores.setText(this.juego.getNumero_jugadores() + " jugadores");
        this.LabelGenero.setText(this.juego.getGenero());
    }
    
    public Image convertir_imagen(){
        System.out.println(this.juego.getImagen());
        Image img=getToolkit().getImage(this.juego.getImagen());
        img=img.getScaledInstance(ImagenJuego.getWidth(), ImagenJuego.getHeight(), Image.SCALE_DEFAULT);
        return img;
    }
    
     public void comprobarInicioS(Usuario usuario){
        if(usuario.getNombre_usuario().equals("")==false){
            esAdmin(usuario_i.getAdmin());
            ajustes2.setVisible(true);
            this.UserLabel.setText("Bienvenido "+this.usuario_i.getNombre_usuario());
            UserLabel.setVisible(true);
            Boton_login.setVisible(false);
            Boton_registro.setVisible(false);
        }else{
            ajustes2.setVisible(false);
            UserLabel.setVisible(false);
            Boton_login.setVisible(true);
            Boton_registro.setVisible(true);
        }
    }
    
    public void esAdmin(boolean admin){
        if(admin==true){
            botonAdmin2.setVisible(true);
        }else{
            botonAdmin2.setVisible(false);
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

        Ventana_juego = new javax.swing.JPanel();
        panel_excepcion_compra = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Boton_inicio_sesion_compra1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        Boton_registro_compra = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        Confirmacion_compra = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Boton_confirmacion_compra = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Banner = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Boton_login = new javax.swing.JButton();
        Boton_registro = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        menuButton = new javax.swing.JButton();
        UserLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        miniMenu2 = new javax.swing.JPanel();
        botonAdmin2 = new javax.swing.JButton();
        cerrarSButon2 = new javax.swing.JButton();
        ajustes2 = new javax.swing.JButton();
        BotonInformacion = new javax.swing.JButton();
        informacion_juego = new javax.swing.JPanel();
        Imagenes_precio = new javax.swing.JPanel();
        Boton_comprar = new javax.swing.JButton();
        LabelPrecio = new javax.swing.JLabel();
        ImagenJuego = new javax.swing.JButton();
        LabelNota = new javax.swing.JLabel();
        Informacion_juego = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        LabelGenero = new javax.swing.JLabel();
        LabelDesarrolladora = new javax.swing.JLabel();
        LabelNjugadores = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LabelDescripcion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MangoGames");
        setIconImages(null);

        Ventana_juego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_excepcion_compra.setBackground(new java.awt.Color(178, 89, 249));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setText("Debes iniciar sesion");

        Boton_inicio_sesion_compra1.setBackground(new java.awt.Color(0, 153, 255));
        Boton_inicio_sesion_compra1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton_inicio_sesion_compra1.setForeground(new java.awt.Color(255, 255, 255));
        Boton_inicio_sesion_compra1.setText("INICIAR SESIÓN");
        Boton_inicio_sesion_compra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_inicio_sesion_compra1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel14.setText("Registrarte");

        Boton_registro_compra.setBackground(new java.awt.Color(0, 153, 255));
        Boton_registro_compra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton_registro_compra.setForeground(new java.awt.Color(255, 255, 255));
        Boton_registro_compra.setText("REGISTRARSE");
        Boton_registro_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_registro_compraActionPerformed(evt);
            }
        });

        jLabel15.setText("O");

        javax.swing.GroupLayout panel_excepcion_compraLayout = new javax.swing.GroupLayout(panel_excepcion_compra);
        panel_excepcion_compra.setLayout(panel_excepcion_compraLayout);
        panel_excepcion_compraLayout.setHorizontalGroup(
            panel_excepcion_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_excepcion_compraLayout.createSequentialGroup()
                .addGroup(panel_excepcion_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_excepcion_compraLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel8))
                    .addGroup(panel_excepcion_compraLayout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_excepcion_compraLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(Boton_inicio_sesion_compra1))
                    .addGroup(panel_excepcion_compraLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(panel_excepcion_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton_registro_compra)
                            .addComponent(jLabel14))))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        panel_excepcion_compraLayout.setVerticalGroup(
            panel_excepcion_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_excepcion_compraLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_inicio_sesion_compra1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_registro_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        Ventana_juego.add(panel_excepcion_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        Confirmacion_compra.setBackground(new java.awt.Color(178, 89, 249));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("¡COMPRA REALIZADA!");

        Boton_confirmacion_compra.setBackground(new java.awt.Color(0, 153, 255));
        Boton_confirmacion_compra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton_confirmacion_compra.setForeground(new java.awt.Color(255, 255, 255));
        Boton_confirmacion_compra.setText("OK");
        Boton_confirmacion_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_confirmacion_compraActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pagina_Home/images/Smile.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout Confirmacion_compraLayout = new javax.swing.GroupLayout(Confirmacion_compra);
        Confirmacion_compra.setLayout(Confirmacion_compraLayout);
        Confirmacion_compraLayout.setHorizontalGroup(
            Confirmacion_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Confirmacion_compraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Boton_confirmacion_compra)
                .addGap(264, 264, 264))
            .addGroup(Confirmacion_compraLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(Confirmacion_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Confirmacion_compraLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        Confirmacion_compraLayout.setVerticalGroup(
            Confirmacion_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Confirmacion_compraLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(Boton_confirmacion_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        Ventana_juego.add(Confirmacion_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        Banner.setBackground(new java.awt.Color(0, 153, 255));
        Banner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MANGO GAMES");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        Banner.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 6, -1, 119));

        Boton_login.setBackground(new java.awt.Color(0, 153, 255));
        Boton_login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Boton_login.setForeground(new java.awt.Color(255, 255, 255));
        Boton_login.setText("login");
        Boton_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_loginMouseClicked(evt);
            }
        });
        Boton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_loginActionPerformed(evt);
            }
        });
        Banner.add(Boton_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, 20));

        Boton_registro.setBackground(new java.awt.Color(0, 153, 255));
        Boton_registro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Boton_registro.setForeground(new java.awt.Color(255, 255, 255));
        Boton_registro.setText("register");
        Boton_registro.setToolTipText("");
        Boton_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_registroActionPerformed(evt);
            }
        });
        Banner.add(Boton_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pagina_Home/images/MicrosoftTeams-image (2).png"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 100));
        Banner.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 6, 126, 128));

        menuButton.setBackground(new java.awt.Color(0, 153, 255));
        menuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pagina_Home/images/homeIcon.png"))); // NOI18N
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });
        Banner.add(menuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 76, -1, -1));

        UserLabel.setForeground(new java.awt.Color(255, 255, 255));
        Banner.add(UserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 103, 20));

        jPanel6.setBackground(new java.awt.Color(0, 153, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Banner.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, -1));

        miniMenu2.setBackground(new java.awt.Color(0, 102, 204));

        botonAdmin2.setText("Admin");
        botonAdmin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdmin2ActionPerformed(evt);
            }
        });

        cerrarSButon2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        cerrarSButon2.setText("Cerrar Sesion");
        cerrarSButon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSButon2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout miniMenu2Layout = new javax.swing.GroupLayout(miniMenu2);
        miniMenu2.setLayout(miniMenu2Layout);
        miniMenu2Layout.setHorizontalGroup(
            miniMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miniMenu2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(miniMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAdmin2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cerrarSButon2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addContainerGap())
        );
        miniMenu2Layout.setVerticalGroup(
            miniMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miniMenu2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAdmin2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cerrarSButon2)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        Banner.add(miniMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, -1, -1));

        ajustes2.setBackground(new java.awt.Color(0, 153, 255));
        ajustes2.setForeground(new java.awt.Color(255, 255, 255));
        ajustes2.setText("Ajustes");
        ajustes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajustes2ActionPerformed(evt);
            }
        });
        Banner.add(ajustes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 90, -1));

        BotonInformacion.setBackground(new java.awt.Color(0, 153, 255));
        BotonInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pagina_Home/images/info.png"))); // NOI18N
        BotonInformacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonInformacionMouseClicked(evt);
            }
        });
        BotonInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInformacionActionPerformed(evt);
            }
        });
        Banner.add(BotonInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        Ventana_juego.add(Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 140));

        informacion_juego.setBackground(new java.awt.Color(0, 102, 204));
        informacion_juego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Imagenes_precio.setBackground(new java.awt.Color(255, 255, 255));

        Boton_comprar.setBackground(new java.awt.Color(0, 153, 255));
        Boton_comprar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton_comprar.setForeground(new java.awt.Color(255, 255, 255));
        Boton_comprar.setText("Comprar");
        Boton_comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_comprarActionPerformed(evt);
            }
        });

        LabelPrecio.setBackground(new java.awt.Color(255, 255, 255));
        LabelPrecio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelPrecio.setText("Precio:");

        ImagenJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImagenJuegoActionPerformed(evt);
            }
        });

        LabelNota.setText("10/10");

        javax.swing.GroupLayout Imagenes_precioLayout = new javax.swing.GroupLayout(Imagenes_precio);
        Imagenes_precio.setLayout(Imagenes_precioLayout);
        Imagenes_precioLayout.setHorizontalGroup(
            Imagenes_precioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Imagenes_precioLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(Boton_comprar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Imagenes_precioLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(Imagenes_precioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Imagenes_precioLayout.createSequentialGroup()
                        .addComponent(LabelPrecio)
                        .addGap(192, 192, 192)
                        .addComponent(LabelNota, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                    .addComponent(ImagenJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        Imagenes_precioLayout.setVerticalGroup(
            Imagenes_precioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Imagenes_precioLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(ImagenJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(Imagenes_precioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPrecio)
                    .addComponent(LabelNota))
                .addGap(28, 28, 28)
                .addComponent(Boton_comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        informacion_juego.add(Imagenes_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 460, 430));

        Informacion_juego.setBackground(new java.awt.Color(102, 204, 255));
        Informacion_juego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelTitulo.setText("Titulo");
        Informacion_juego.add(LabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 44, -1, -1));

        LabelGenero.setText("Genero");
        Informacion_juego.add(LabelGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 80, 20));

        LabelDesarrolladora.setText("Desarrolladora");
        Informacion_juego.add(LabelDesarrolladora, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 360, 20));

        LabelNjugadores.setText("Nº de jugadores");
        Informacion_juego.add(LabelNjugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, 30));

        LabelDescripcion.setBackground(new java.awt.Color(102, 204, 255));
        LabelDescripcion.setColumns(20);
        LabelDescripcion.setRows(5);
        jScrollPane1.setViewportView(LabelDescripcion);

        Informacion_juego.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 76, 350, 110));

        informacion_juego.add(Informacion_juego, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 420, 438));

        Ventana_juego.add(informacion_juego, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 880, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ventana_juego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ventana_juego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void Boton_comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_comprarActionPerformed
        // TODO add your handling code here:
        this.Confirmacion_compra.setVisible(true); //Lo he puesto a true para que se active al pulsar de momento, al ejecutar he puesto que sea invisible(YONLEE)
        LocalDate fecha = LocalDate.now();
        
        if(this.usuario_i.getNombre_usuario()!=""){
           conexion_db.insertar_una_nueva_fila_en_una_tabla("compras", "id_usuario,id_juego,precio_transaccion,fecha_de_compra", conexion_db.parsear_cadena(usuario_i.getId())+","+conexion_db.parsear_cadena(juego.getID())+","+this.juego.getPrecio()+","+conexion_db.parsear_cadena(conexion_db.formatear_fecha(fecha)));
           this.Confirmacion_compra.setVisible(true);
           this.Confirmacion_compra.setEnabled(true);
        }else{
            //NECESITAS INICIAR SESION O REGISTRARTE
            this.panel_excepcion_compra.setVisible(true);
            this.panel_excepcion_compra.setEnabled(true);
        }
        
        
    }//GEN-LAST:event_Boton_comprarActionPerformed

    private void ImagenJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImagenJuegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImagenJuegoActionPerformed

    private void Boton_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_loginMouseClicked
       
    }//GEN-LAST:event_Boton_loginMouseClicked

    private void Boton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_loginActionPerformed
       inicio_sesion a = null;
        try {
            a = new inicio_sesion(usuario_i);
        } catch (SQLException ex) {
            Logger.getLogger(InterfazJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
       a.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_Boton_loginActionPerformed

    private void Boton_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_registroActionPerformed
       registro b = null;
        try {
            b = new registro(this.usuario_i);
        } catch (SQLException ex) {
            Logger.getLogger(InterfazJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
       b.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_Boton_registroActionPerformed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
       homeInterface c = null;
        try {
            c = new homeInterface(usuario_i);
        } catch (SQLException ex) {
            Logger.getLogger(InterfazJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
       c.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jLabel4MousePressed

    private void Boton_confirmacion_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_confirmacion_compraActionPerformed
        // TODO add your handling code here:
        this.Confirmacion_compra.setVisible(false);
        this.Confirmacion_compra.setEnabled(false);
    }//GEN-LAST:event_Boton_confirmacion_compraActionPerformed

    private void Boton_inicio_sesion_compra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_inicio_sesion_compra1ActionPerformed
        // TODO add your handling code here:
        inicio_sesion a = null;
        try {
            a = new inicio_sesion(usuario_i);
        } catch (SQLException ex) {
            Logger.getLogger(InterfazJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
       a.setVisible(true);
       this.setVisible(false);
        
    }//GEN-LAST:event_Boton_inicio_sesion_compra1ActionPerformed

    private void Boton_registro_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_registro_compraActionPerformed
        // TODO add your handling code here:
        registro b = null;
        try {
            b = new registro(this.usuario_i);
        } catch (SQLException ex) {
            Logger.getLogger(InterfazJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
       b.setVisible(true);
    }//GEN-LAST:event_Boton_registro_compraActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        // TODO add your handling code here:
        homeInterface a = null;
        try {
            a = new homeInterface(usuario_i);
        } catch (SQLException ex) {
            Logger.getLogger(homeInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
       a.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_menuButtonActionPerformed

    private void ajustes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajustes2ActionPerformed
        if(miniMenu2.isVisible()==true){
            miniMenu2.setVisible(false);
        }else{
            miniMenu2.setVisible(true);
        }
    }//GEN-LAST:event_ajustes2ActionPerformed

    private void botonAdmin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdmin2ActionPerformed
        // TODO add your handling code here:
        Registro_juegos a = null;
        try {
            a = new Registro_juegos(usuario_i);
        } catch (SQLException ex) {
            Logger.getLogger(Registro_juegos.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonAdmin2ActionPerformed

    private void cerrarSButon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSButon2ActionPerformed
       usuario_i.setAdmin(false);
        usuario_i.setId("");
        usuario_i.setNombre_usuario("");
        comprobarInicioS(usuario_i);
        miniMenu2.setVisible(false);
    }//GEN-LAST:event_cerrarSButon2ActionPerformed

    private void BotonInformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInformacionMouseClicked
        File htmlFile = new File("resources/Pagina_manual/interfazJuego.html");
        try {
            Desktop.getDesktop().browse(htmlFile.toURI());
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_BotonInformacionMouseClicked

    private void BotonInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInformacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonInformacionActionPerformed
    
    
    /**@param args the command line arguments
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
            java.util.logging.Logger.getLogger(InterfazJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
   /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InterfazJuego(juego).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(InterfazJuego.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Banner;
    private javax.swing.JButton BotonInformacion;
    private javax.swing.JButton Boton_comprar;
    private javax.swing.JButton Boton_confirmacion_compra;
    private javax.swing.JButton Boton_inicio_sesion_compra1;
    private javax.swing.JButton Boton_login;
    private javax.swing.JButton Boton_registro;
    private javax.swing.JButton Boton_registro_compra;
    public javax.swing.JPanel Confirmacion_compra;
    private javax.swing.JButton ImagenJuego;
    private javax.swing.JPanel Imagenes_precio;
    private javax.swing.JPanel Informacion_juego;
    private javax.swing.JLabel LabelDesarrolladora;
    private javax.swing.JTextArea LabelDescripcion;
    private javax.swing.JLabel LabelGenero;
    private javax.swing.JLabel LabelNjugadores;
    private javax.swing.JLabel LabelNota;
    private javax.swing.JLabel LabelPrecio;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JPanel Ventana_juego;
    private javax.swing.JButton ajustes2;
    private javax.swing.JButton botonAdmin2;
    private javax.swing.JButton cerrarSButon2;
    private javax.swing.JPanel informacion_juego;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menuButton;
    private javax.swing.JPanel miniMenu2;
    public javax.swing.JPanel panel_excepcion_compra;
    // End of variables declaration//GEN-END:variables
}
