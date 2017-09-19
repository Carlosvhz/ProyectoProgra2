package principal;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Pantalla_Principal extends javax.swing.JFrame {
    
    AdministradorUsuarios adminUsuario;
    AdministradorUsuarios AdminUsuarioActivado;
    Usuario UsuarioActivado;
    ArrayList<Usuario> usuarios = new ArrayList();
    ImageIcon fotografia;
    
    public Pantalla_Principal() {
        initComponents();
        AdministradorUsuarios adm = new AdministradorUsuarios();
        try {
            usuarios = adm.cargarUsuarios();
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*System.out.println("#############Amigos del usuario prueba2");
        for (Usuario u : usuarios.get(0).getAmigos()) {
            System.out.println("Nombre: "+u.getNombreCompleto()+"| Nickname: "+u.getNickname());
        }
        System.out.println("##############Solicitudes del usuario2");
        for (String a : usuarios.get(1).getSolicitudes()) {
            System.out.println("Nombre: "+a);
        }
        System.out.println("############Lista de usuarios");
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: "+usuario.getNombreCompleto()+"| Nickname: "+usuario.getNickname());
        }*/
        usuarios.add(new Administrador("Administrador Principal", "123", "Administrador", "Honduras", new Date()));
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_agregar_usuario = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_nombrecompleto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_nicknameIngresar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pf_contraseñaIngresar = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        cbx_paisIngresar = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        dc_fechadenacimiento = new com.toedter.calendar.JDateChooser();
        jb_agregarUsuario = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        rb_administrador = new javax.swing.JRadioButton();
        rb_regular = new javax.swing.JRadioButton();
        jd_iniciar_sesion = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_nicknameIniciarSesion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        pf_contraseñainiciarsesion = new javax.swing.JPasswordField();
        bt_LogIn = new javax.swing.JButton();
        jd_muro = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jp_mimuro = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jp_murogeneral = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        mb_componentes = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mi_solicitudes = new javax.swing.JMenuItem();
        mi_misAmigos = new javax.swing.JMenuItem();
        mi_mensajeria = new javax.swing.JMenuItem();
        mi_LogOut = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mi_agenda = new javax.swing.JMenuItem();
        mi_reproductorMusical = new javax.swing.JMenuItem();
        mi_reproductorVideo = new javax.swing.JMenuItem();
        mi_publicaciones = new javax.swing.JMenuItem();
        Menu_administrador = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        mi_AdministradorAgregarUsuario = new javax.swing.JMenuItem();
        mi_AdministradorModificarUsuario = new javax.swing.JMenuItem();
        mi_AdministradorEliminarUsuario = new javax.swing.JMenuItem();
        ppm_LikeComentShare = new javax.swing.JPopupMenu();
        mi_like = new javax.swing.JMenuItem();
        mi_comentar = new javax.swing.JMenuItem();
        mi_compartir = new javax.swing.JMenuItem();
        ppm_ReadDelete = new javax.swing.JPopupMenu();
        mi_leer = new javax.swing.JMenuItem();
        mi_eliminar = new javax.swing.JMenuItem();
        jd_mensajería = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jl_mensajes = new javax.swing.JList<>();
        jLabel29 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        cbx_mandarMensaje = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        ta_contenidoMensaje = new javax.swing.JTextArea();
        bt_mandarMensaje = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jd_quitar_usuario = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_eliminarUsuario = new javax.swing.JList<>();
        jLabel17 = new javax.swing.JLabel();
        jb_eliminarUsuario = new javax.swing.JButton();
        jd_modificar_usuario = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_modifiarUsuarios = new javax.swing.JList<>();
        bt_modifiarUsuario = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        tf_nuevoNombre = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tf_nuevoNickname = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        pf_nuevaContraseña = new javax.swing.JPasswordField();
        jLabel23 = new javax.swing.JLabel();
        cbx_nuevaRegion = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        dc_nuevaFecha = new com.toedter.calendar.JDateChooser();
        jLabel30 = new javax.swing.JLabel();
        Tipo_UsuarioIngresado = new javax.swing.ButtonGroup();
        jd_amigos = new javax.swing.JDialog();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_noAmigos = new javax.swing.JList<>();
        bt_EnviarSolicitud = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jl_amigos = new javax.swing.JList<>();
        jLabel50 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jd_misSolicitudes = new javax.swing.JDialog();
        jPanel16 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_solicitudes = new javax.swing.JList<>();
        bt_rechazarSolicitud = new javax.swing.JButton();
        bt_aceptarSolicitud = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jd_agenda = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jc_calendario = new com.toedter.calendar.JCalendar();
        jLabel44 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        chb_recordar = new javax.swing.JCheckBox();
        jPanel20 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        tf_titulo = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        sp_recordatorio = new javax.swing.JSpinner();
        jLabel34 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        cbx_tipoActividad = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        bt_Agenda = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jd_Tarea = new javax.swing.JDialog();
        jPanel22 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        ta_notaciones = new javax.swing.JTextArea();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        ta_contenido = new javax.swing.JTextArea();
        bt_AgregarNotacion = new javax.swing.JButton();
        bt_AgregarTarea = new javax.swing.JButton();
        jd_Evento = new javax.swing.JDialog();
        jPanel25 = new javax.swing.JPanel();
        bt_AgregarActividad = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        sp_minuto1 = new javax.swing.JSpinner();
        sp_hora1 = new javax.swing.JSpinner();
        jPanel32 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        sp_minuto2 = new javax.swing.JSpinner();
        sp_hora2 = new javax.swing.JSpinner();
        jd_leerMensaje = new javax.swing.JDialog();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        ta_contenidoLeerMensaje = new javax.swing.JTextArea();
        jPanel29 = new javax.swing.JPanel();
        lb_emisor = new javax.swing.JLabel();
        lb_fecha = new javax.swing.JLabel();
        jd_publicaciones = new javax.swing.JDialog();
        jPanel17 = new javax.swing.JPanel();
        bt_publicar = new javax.swing.JButton();
        tp_publicaciones = new javax.swing.JTabbedPane();
        tp_comentario = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ta_comentario = new javax.swing.JTextArea();
        tp_fotografia = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        lb_fotografia = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        tf_rutaFotografia = new javax.swing.JTextField();
        bt_buscarFotografia = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        tp_video = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        tf_rutaVideo = new javax.swing.JTextField();
        bt_buscarVideo = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        tp_album = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        tf_rutaFotografias = new javax.swing.JTextField();
        tb_buscarFotografias = new javax.swing.JButton();
        tf_tituloAlbum = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        lb_añadirfotografia = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mi_Editar = new javax.swing.JMenu();
        mi_editarComentarios = new javax.swing.JMenuItem();
        mi_albumesModificar = new javax.swing.JMenuItem();
        mi_fotografiasModificar = new javax.swing.JMenuItem();
        jd_Reproductor = new javax.swing.JDialog();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        bt_pausa = new javax.swing.JButton();
        bt_stop = new javax.swing.JButton();
        bt_play = new javax.swing.JButton();
        tf_rutaMP3 = new javax.swing.JTextField();
        Buscar_MP3 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jd_ReproductorVideo = new javax.swing.JDialog();
        jPanel39 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jl_videos = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jd_comentariosModificar = new javax.swing.JDialog();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel42 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        ta_contenidoMostrar = new javax.swing.JTextArea();
        jLabel56 = new javax.swing.JLabel();
        bt_EliminarComentario = new javax.swing.JButton();
        jPanel41 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        ta_ContenidoModificar = new javax.swing.JTextArea();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        dc_fechaComentario = new com.toedter.calendar.JDateChooser();
        bt_modificarComentario = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jl_comentarios = new javax.swing.JList<>();
        jd_albumesModificar = new javax.swing.JDialog();
        jPanel44 = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jtree_albumes = new javax.swing.JTree();
        jPanel45 = new javax.swing.JPanel();
        ppm_DeleteModificate = new javax.swing.JPopupMenu();
        mi_eliminarFoto = new javax.swing.JMenuItem();
        mi_modificarAlbum = new javax.swing.JMenuItem();
        jd_ModificarAlbum = new javax.swing.JDialog();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        tf_rutaModificarAlbum = new javax.swing.JTextField();
        bt_buscarfotografia = new javax.swing.JButton();
        tf_tituloModificarAlbum = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        bt_ModificarAlbum = new javax.swing.JButton();
        jd_ModificarFotografia = new javax.swing.JDialog();
        bt_modificarFotografia = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        tf_rutaModificarFotografia = new javax.swing.JTextField();
        bt_buscarImagen = new javax.swing.JButton();
        bt_modificarFotrografia = new javax.swing.JButton();
        jPanel50 = new javax.swing.JPanel();
        lb_FotografíaModificar = new javax.swing.JLabel();
        jd_fotografiasModificar = new javax.swing.JDialog();
        jScrollPane17 = new javax.swing.JScrollPane();
        jl_ModificarFotografias = new javax.swing.JList<>();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel52 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        dc_FechaFotografiaModificar = new com.toedter.calendar.JDateChooser();
        jLabel68 = new javax.swing.JLabel();
        tf_rutafotografiaModificar = new javax.swing.JTextField();
        bt_BuscarFotografiaModificar = new javax.swing.JButton();
        bt_AplicarCambiosFotografia = new javax.swing.JButton();
        jPanel57 = new javax.swing.JPanel();
        lb_fotografiaModificar = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        bt_eliminarFotografia = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        lb_informacionFotografia = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        lb_imagenFotografia = new javax.swing.JLabel();
        bt_iniciarsesion = new javax.swing.JButton();
        bt_ingresarusuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        jd_agregar_usuario.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jd_agregar_usuario.setTitle("Agregar usuario");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(124, 124, 151));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/añadir.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Añadir nuevo usuario.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jLabel6.setText("Nombre completo: ");

        jLabel7.setText("Nickname: ");

        jLabel8.setText("Contraseña: ");

        jLabel9.setText("País o Region: ");

        cbx_paisIngresar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Honduras", "Estados Unidos", "Canada", "Panama", "Nicaragua", "Costa Rica", "Guatemala", "Alemania", "Alahu Akbar" }));

        jLabel10.setText("Fecha de nacimiento: ");

        jb_agregarUsuario.setText("Agregar");
        jb_agregarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarUsuarioMouseClicked(evt);
            }
        });

        jLabel26.setText("Tipo de usuario");

        rb_administrador.setBackground(new java.awt.Color(255, 255, 255));
        Tipo_UsuarioIngresado.add(rb_administrador);
        rb_administrador.setText("Administrador");
        rb_administrador.setEnabled(false);

        rb_regular.setBackground(new java.awt.Color(255, 255, 255));
        Tipo_UsuarioIngresado.add(rb_regular);
        rb_regular.setSelected(true);
        rb_regular.setText("Usuario Regular");
        rb_regular.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx_paisIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jb_agregarUsuario)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(dc_fechadenacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                        .addComponent(pf_contraseñaIngresar, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(97, 97, 97)
                                .addComponent(rb_administrador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_regular))
                            .addComponent(tf_nombrecompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tf_nicknameIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel26)
                        .addGap(77, 77, 77))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_nombrecompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(tf_nicknameIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(pf_contraseñaIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cbx_paisIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rb_administrador)
                        .addComponent(rb_regular)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(dc_fechadenacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jb_agregarUsuario)
                .addGap(0, 55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_agregar_usuarioLayout = new javax.swing.GroupLayout(jd_agregar_usuario.getContentPane());
        jd_agregar_usuario.getContentPane().setLayout(jd_agregar_usuarioLayout);
        jd_agregar_usuarioLayout.setHorizontalGroup(
            jd_agregar_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_agregar_usuarioLayout.setVerticalGroup(
            jd_agregar_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_iniciar_sesion.setTitle("Iniciar Sesion");

        jPanel3.setBackground(new java.awt.Color(0, 95, 96));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/iniciar.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Nickname:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Contraseña:");

        bt_LogIn.setText("Iniciar");
        bt_LogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_LogInMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(pf_contraseñainiciarsesion, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(bt_LogIn))
                    .addComponent(tf_nicknameIniciarSesion, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.CENTER))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel12)
                .addGap(33, 33, 33)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(tf_nicknameIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(pf_contraseñainiciarsesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_LogIn)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_iniciar_sesionLayout = new javax.swing.GroupLayout(jd_iniciar_sesion.getContentPane());
        jd_iniciar_sesion.getContentPane().setLayout(jd_iniciar_sesionLayout);
        jd_iniciar_sesionLayout.setHorizontalGroup(
            jd_iniciar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_iniciar_sesionLayout.setVerticalGroup(
            jd_iniciar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_muro.setTitle("Muros");

        jPanel5.setBackground(new java.awt.Color(128, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane11.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 337, Short.MAX_VALUE)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jp_mimuroLayout = new javax.swing.GroupLayout(jp_mimuro);
        jp_mimuro.setLayout(jp_mimuroLayout);
        jp_mimuroLayout.setHorizontalGroup(
            jp_mimuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_mimuroLayout.setVerticalGroup(
            jp_mimuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Mi Muro", jp_mimuro);

        jPanel6.setBackground(new java.awt.Color(219, 86, 53));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1028, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jp_murogeneralLayout = new javax.swing.GroupLayout(jp_murogeneral);
        jp_murogeneral.setLayout(jp_murogeneralLayout);
        jp_murogeneralLayout.setHorizontalGroup(
            jp_murogeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_murogeneralLayout.setVerticalGroup(
            jp_murogeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Muro General", jp_murogeneral);

        jMenu1.setText("Inicio");

        mi_solicitudes.setText("Solicitudes");
        mi_solicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_solicitudesActionPerformed(evt);
            }
        });
        jMenu1.add(mi_solicitudes);

        mi_misAmigos.setText("Mis amigos");
        mi_misAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_misAmigosActionPerformed(evt);
            }
        });
        jMenu1.add(mi_misAmigos);

        mi_mensajeria.setText("Mensajería");
        mi_mensajeria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_mensajeriaActionPerformed(evt);
            }
        });
        jMenu1.add(mi_mensajeria);

        mi_LogOut.setText("LogOut");
        mi_LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_LogOutActionPerformed(evt);
            }
        });
        jMenu1.add(mi_LogOut);

        mb_componentes.add(jMenu1);

        jMenu2.setText("Herramientas");

        mi_agenda.setText("Agenda");
        mi_agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_agendaActionPerformed(evt);
            }
        });
        jMenu2.add(mi_agenda);

        mi_reproductorMusical.setText("Reproductor Musical");
        mi_reproductorMusical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_reproductorMusicalActionPerformed(evt);
            }
        });
        jMenu2.add(mi_reproductorMusical);

        mi_reproductorVideo.setText("Reproductor de Video");
        mi_reproductorVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_reproductorVideoActionPerformed(evt);
            }
        });
        jMenu2.add(mi_reproductorVideo);

        mi_publicaciones.setText("Publicaciones");
        mi_publicaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_publicacionesActionPerformed(evt);
            }
        });
        jMenu2.add(mi_publicaciones);

        mb_componentes.add(jMenu2);

        Menu_administrador.setText("Administrador");
        Menu_administrador.setEnabled(false);

        jMenu5.setText("Usuarios");

        mi_AdministradorAgregarUsuario.setText("Agregar");
        mi_AdministradorAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_AdministradorAgregarUsuarioActionPerformed(evt);
            }
        });
        jMenu5.add(mi_AdministradorAgregarUsuario);

        mi_AdministradorModificarUsuario.setText("Modificar");
        mi_AdministradorModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_AdministradorModificarUsuarioActionPerformed(evt);
            }
        });
        jMenu5.add(mi_AdministradorModificarUsuario);

        mi_AdministradorEliminarUsuario.setText("Eliminar");
        mi_AdministradorEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_AdministradorEliminarUsuarioActionPerformed(evt);
            }
        });
        jMenu5.add(mi_AdministradorEliminarUsuario);

        Menu_administrador.add(jMenu5);

        mb_componentes.add(Menu_administrador);

        jd_muro.setJMenuBar(mb_componentes);

        javax.swing.GroupLayout jd_muroLayout = new javax.swing.GroupLayout(jd_muro.getContentPane());
        jd_muro.getContentPane().setLayout(jd_muroLayout);
        jd_muroLayout.setHorizontalGroup(
            jd_muroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jd_muroLayout.setVerticalGroup(
            jd_muroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        mi_like.setText("Me gusta");
        ppm_LikeComentShare.add(mi_like);

        mi_comentar.setText("Comentar");
        ppm_LikeComentShare.add(mi_comentar);

        mi_compartir.setText("Compartir");
        ppm_LikeComentShare.add(mi_compartir);

        mi_leer.setText("Leer");
        mi_leer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_leerActionPerformed(evt);
            }
        });
        ppm_ReadDelete.add(mi_leer);

        mi_eliminar.setText("Eliminar");
        mi_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_eliminarActionPerformed(evt);
            }
        });
        ppm_ReadDelete.add(mi_eliminar);

        jd_mensajería.setTitle("Mensajeria");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jl_mensajes.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jl_mensajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_mensajesMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jl_mensajes);

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/nuevoMensaje.png"))); // NOI18N

        jPanel8.setBackground(new java.awt.Color(136, 130, 136));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        ta_contenidoMensaje.setColumns(20);
        ta_contenidoMensaje.setLineWrap(true);
        ta_contenidoMensaje.setRows(5);
        jScrollPane6.setViewportView(ta_contenidoMensaje);

        bt_mandarMensaje.setText("Mandar Mensaje");
        bt_mandarMensaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_mandarMensajeMouseClicked(evt);
            }
        });

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/mendarmensaje.png"))); // NOI18N

        jLabel65.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Lista de amigos");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(cbx_mandarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))
                            .addComponent(jLabel65))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(bt_mandarMensaje)
                .addGap(92, 92, 92))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_mandarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_mandarMensaje)
                .addGap(20, 20, 20))
        );

        jLabel27.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel27.setText("Buzon de entrada");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_mensajeríaLayout = new javax.swing.GroupLayout(jd_mensajería.getContentPane());
        jd_mensajería.getContentPane().setLayout(jd_mensajeríaLayout);
        jd_mensajeríaLayout.setHorizontalGroup(
            jd_mensajeríaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jd_mensajeríaLayout.setVerticalGroup(
            jd_mensajeríaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_quitar_usuario.setTitle("Quitar usuario");

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(181, 41, 41));
        jPanel11.setPreferredSize(new java.awt.Dimension(512, 146));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/quitar.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Eliminar usuario.");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(138, 138, 138)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );

        jScrollPane1.setViewportView(jl_eliminarUsuario);

        jLabel17.setText("Lista de usuarios: ");

        jb_eliminarUsuario.setBackground(new java.awt.Color(153, 0, 0));
        jb_eliminarUsuario.setText("Eliminar Usuario.");
        jb_eliminarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_eliminarUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jb_eliminarUsuario))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel17)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jb_eliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jd_quitar_usuarioLayout = new javax.swing.GroupLayout(jd_quitar_usuario.getContentPane());
        jd_quitar_usuario.getContentPane().setLayout(jd_quitar_usuarioLayout);
        jd_quitar_usuarioLayout.setHorizontalGroup(
            jd_quitar_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_quitar_usuarioLayout.setVerticalGroup(
            jd_quitar_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_modificar_usuario.setTitle("Modificar usuario");

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jPanel13.setBackground(new java.awt.Color(157, 148, 163));
        jPanel13.setPreferredSize(new java.awt.Dimension(512, 146));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Modificar usuario.");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/modificar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jl_modifiarUsuarios);

        bt_modifiarUsuario.setText("Aplicar Cambios");
        bt_modifiarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modifiarUsuarioMouseClicked(evt);
            }
        });

        jLabel18.setText("Nuevo nombre: ");

        jLabel21.setText("Nuevo nickname:");

        jLabel22.setText("Nueva contraseña:");

        jLabel23.setText("Region: ");

        cbx_nuevaRegion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Honduras", "Estados Unidos", "Canada", "Panama", "Nicaragua", "Costa Rica", "Guatemala", "Alemania", "Alahu Akbar" }));

        jLabel24.setText("Nueva Fecha de nacimiento: ");

        jLabel30.setText("Seleccione un usuario");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jLabel30))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel18)
                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx_nuevaRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pf_nuevaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(bt_modifiarUsuario))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(tf_nuevoNickname))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(tf_nuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dc_nuevaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_nuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_nuevoNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pf_nuevaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(cbx_nuevaRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(dc_nuevaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(bt_modifiarUsuario))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_modificar_usuarioLayout = new javax.swing.GroupLayout(jd_modificar_usuario.getContentPane());
        jd_modificar_usuario.getContentPane().setLayout(jd_modificar_usuarioLayout);
        jd_modificar_usuarioLayout.setHorizontalGroup(
            jd_modificar_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_modificar_usuarioLayout.setVerticalGroup(
            jd_modificar_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_amigos.setTitle("Lista de amigos");

        jPanel14.setBackground(new java.awt.Color(102, 102, 102));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jl_noAmigos.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jl_noAmigos.setModel( new DefaultListModel());
        jScrollPane3.setViewportView(jl_noAmigos);

        bt_EnviarSolicitud.setText("Enviar Solicitud");
        bt_EnviarSolicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_EnviarSolicitudMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(bt_EnviarSolicitud)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_EnviarSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/AgregarAmigos.png"))); // NOI18N

        jLabel46.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel46.setText("No amigos");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel46)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jTabbedPane2.addTab("No amigos", jPanel14);

        jPanel30.setBackground(new java.awt.Color(102, 102, 102));
        jPanel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jl_amigos.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jScrollPane12.setViewportView(jl_amigos);

        jLabel50.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel50.setText("Aleros");

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/Amigos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Amigos", jPanel30);

        javax.swing.GroupLayout jd_amigosLayout = new javax.swing.GroupLayout(jd_amigos.getContentPane());
        jd_amigos.getContentPane().setLayout(jd_amigosLayout);
        jd_amigosLayout.setHorizontalGroup(
            jd_amigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jd_amigosLayout.setVerticalGroup(
            jd_amigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );

        jPanel16.setBackground(new java.awt.Color(153, 153, 153));

        jPanel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jl_solicitudes.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jl_solicitudes.setModel( new DefaultListModel());
        jScrollPane4.setViewportView(jl_solicitudes);

        bt_rechazarSolicitud.setText("Rechazar");
        bt_rechazarSolicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_rechazarSolicitudMouseClicked(evt);
            }
        });

        bt_aceptarSolicitud.setText("Aceptar");
        bt_aceptarSolicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_aceptarSolicitudMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(bt_rechazarSolicitud)
                        .addGap(18, 18, 18)
                        .addComponent(bt_aceptarSolicitud)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_rechazarSolicitud)
                    .addComponent(bt_aceptarSolicitud))
                .addGap(22, 22, 22))
        );

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/Solicitudes.png"))); // NOI18N

        jLabel48.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel48.setText("Solicitudes");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel48)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel47))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel48)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_misSolicitudesLayout = new javax.swing.GroupLayout(jd_misSolicitudes.getContentPane());
        jd_misSolicitudes.getContentPane().setLayout(jd_misSolicitudesLayout);
        jd_misSolicitudesLayout.setHorizontalGroup(
            jd_misSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_misSolicitudesLayout.setVerticalGroup(
            jd_misSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_agenda.setTitle("Agenda");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/Actividad.png"))); // NOI18N

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        chb_recordar.setText("Recordatorio");
        chb_recordar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_recordarActionPerformed(evt);
            }
        });

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel32.setText("Titulo:");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(tf_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Recordarme dentro de: ");

        sp_recordatorio.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Minutos");

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbx_tipoActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarea", "Evento" }));

        jLabel35.setText("Tipo:");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addGap(18, 18, 18)
                .addComponent(cbx_tipoActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_tipoActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addContainerGap())
        );

        bt_Agenda.setText("Siguiente");
        bt_Agenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_AgendaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chb_recordar)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addComponent(jLabel33)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sp_recordatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel34))))
                        .addContainerGap())
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_Agenda)
                .addGap(79, 79, 79))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(chb_recordar)
                .addGap(28, 28, 28)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(sp_recordatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(45, 45, 45)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_Agenda)
                .addGap(62, 62, 62))
        );

        jLabel45.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel45.setText("Actvidades");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel45))
                    .addComponent(jc_calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel45)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jc_calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_agendaLayout = new javax.swing.GroupLayout(jd_agenda.getContentPane());
        jd_agenda.getContentPane().setLayout(jd_agendaLayout);
        jd_agendaLayout.setHorizontalGroup(
            jd_agendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_agendaLayout.setVerticalGroup(
            jd_agendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_Tarea.setTitle("Agregar Tarea");

        jPanel22.setBackground(new java.awt.Color(153, 153, 153));

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Contenido:");

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Notaciones:");

        jPanel23.setBackground(new java.awt.Color(102, 102, 102));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ta_notaciones.setColumns(20);
        ta_notaciones.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ta_notaciones.setLineWrap(true);
        ta_notaciones.setRows(5);
        jScrollPane8.setViewportView(ta_notaciones);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8)
                .addContainerGap())
        );

        jPanel24.setBackground(new java.awt.Color(102, 102, 102));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ta_contenido.setColumns(20);
        ta_contenido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ta_contenido.setLineWrap(true);
        ta_contenido.setRows(5);
        jScrollPane7.setViewportView(ta_contenido);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_AgregarNotacion.setText("Agregar notacion");
        bt_AgregarNotacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_AgregarNotacionMouseClicked(evt);
            }
        });

        bt_AgregarTarea.setText("Agregar Tarea");
        bt_AgregarTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_AgregarTareaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(bt_AgregarNotacion)))
                        .addGap(60, 60, 60)
                        .addComponent(bt_AgregarTarea)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel37)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(bt_AgregarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_AgregarNotacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_TareaLayout = new javax.swing.GroupLayout(jd_Tarea.getContentPane());
        jd_Tarea.getContentPane().setLayout(jd_TareaLayout);
        jd_TareaLayout.setHorizontalGroup(
            jd_TareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_TareaLayout.setVerticalGroup(
            jd_TareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_Evento.setTitle("Agregar Actividad");

        jPanel25.setBackground(new java.awt.Color(102, 102, 102));
        jPanel25.setForeground(new java.awt.Color(102, 102, 102));

        bt_AgregarActividad.setText("Agregar Actividad");
        bt_AgregarActividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_AgregarActividadMouseClicked(evt);
            }
        });

        jPanel26.setBackground(new java.awt.Color(204, 204, 204));

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Hora de inicio:");

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Hora de finalización:");

        jLabel40.setBackground(new java.awt.Color(204, 204, 204));
        jLabel40.setForeground(new java.awt.Color(181, 158, 181));
        jLabel40.setText(":");

        sp_minuto1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));

        sp_hora1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 24, 1));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sp_hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp_minuto1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sp_minuto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sp_hora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel40)))
                .addContainerGap())
        );

        jLabel42.setBackground(new java.awt.Color(204, 204, 204));
        jLabel42.setForeground(new java.awt.Color(181, 158, 181));
        jLabel42.setText(":");

        sp_minuto2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));

        sp_hora2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 24, 1));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sp_hora2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp_minuto2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sp_minuto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sp_hora2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel42)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel38)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel39)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bt_AgregarActividad)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_AgregarActividad)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_EventoLayout = new javax.swing.GroupLayout(jd_Evento.getContentPane());
        jd_Evento.getContentPane().setLayout(jd_EventoLayout);
        jd_EventoLayout.setHorizontalGroup(
            jd_EventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_EventoLayout.setVerticalGroup(
            jd_EventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel27.setBackground(new java.awt.Color(0, 51, 51));

        ta_contenidoLeerMensaje.setColumns(20);
        ta_contenidoLeerMensaje.setRows(5);
        jScrollPane10.setViewportView(ta_contenidoLeerMensaje);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel29.setBackground(new java.awt.Color(102, 94, 106));

        lb_emisor.setForeground(new java.awt.Color(255, 255, 255));
        lb_emisor.setText("jLabel41");

        lb_fecha.setForeground(new java.awt.Color(255, 255, 255));
        lb_fecha.setText("jLabel42");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_emisor, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lb_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_emisor)
                    .addComponent(lb_fecha))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_leerMensajeLayout = new javax.swing.GroupLayout(jd_leerMensaje.getContentPane());
        jd_leerMensaje.getContentPane().setLayout(jd_leerMensajeLayout);
        jd_leerMensajeLayout.setHorizontalGroup(
            jd_leerMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_leerMensajeLayout.setVerticalGroup(
            jd_leerMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_publicaciones.setTitle("Publicaciones");

        jPanel17.setBackground(new java.awt.Color(102, 102, 102));

        bt_publicar.setText("Publicar");
        bt_publicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_publicarMouseClicked(evt);
            }
        });

        tp_comentario.setBackground(new java.awt.Color(255, 255, 255));
        tp_comentario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel41.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel41.setText("Comentario:");

        ta_comentario.setColumns(20);
        ta_comentario.setLineWrap(true);
        ta_comentario.setRows(5);
        jScrollPane5.setViewportView(ta_comentario);

        javax.swing.GroupLayout tp_comentarioLayout = new javax.swing.GroupLayout(tp_comentario);
        tp_comentario.setLayout(tp_comentarioLayout);
        tp_comentarioLayout.setHorizontalGroup(
            tp_comentarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tp_comentarioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(tp_comentarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tp_comentarioLayout.setVerticalGroup(
            tp_comentarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tp_comentarioLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tp_publicaciones.addTab("Comentario", tp_comentario);

        tp_fotografia.setBackground(new java.awt.Color(255, 255, 255));
        tp_fotografia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tp_fotografia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel35.setBackground(new java.awt.Color(153, 153, 153));
        jPanel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel35.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_fotografia, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_fotografia, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
        );

        tp_fotografia.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 130, 120));

        jPanel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bt_buscarFotografia.setText("Buscar");
        bt_buscarFotografia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_buscarFotografiaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_rutaFotografia, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_buscarFotografia)
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_rutaFotografia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_buscarFotografia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tp_fotografia.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 50));

        jLabel63.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel63.setText("Añadir imagen:");
        tp_fotografia.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        tp_publicaciones.addTab("Fotografía", tp_fotografia);

        tp_video.setBackground(new java.awt.Color(204, 204, 204));
        tp_video.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bt_buscarVideo.setText("Buscar");
        bt_buscarVideo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_buscarVideoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_rutaVideo, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_buscarVideo)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_rutaVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_buscarVideo))
                .addContainerGap())
        );

        jLabel62.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel62.setText("Añadir video:");

        javax.swing.GroupLayout tp_videoLayout = new javax.swing.GroupLayout(tp_video);
        tp_video.setLayout(tp_videoLayout);
        tp_videoLayout.setHorizontalGroup(
            tp_videoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tp_videoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tp_videoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tp_videoLayout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tp_videoLayout.setVerticalGroup(
            tp_videoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tp_videoLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        tp_publicaciones.addTab("Video", tp_video);

        tp_album.setBackground(new java.awt.Color(255, 255, 255));
        tp_album.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tb_buscarFotografias.setText("Buscar");
        tb_buscarFotografias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_buscarFotografiasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_rutaFotografias, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tb_buscarFotografias)
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_rutaFotografias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_buscarFotografias))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel59.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel59.setText("Nombre del album:");

        jLabel61.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel61.setText("Añadir imagenes al album:");

        jPanel51.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_añadirfotografia, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_añadirfotografia, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout tp_albumLayout = new javax.swing.GroupLayout(tp_album);
        tp_album.setLayout(tp_albumLayout);
        tp_albumLayout.setHorizontalGroup(
            tp_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tp_albumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_tituloAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tp_albumLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tp_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addContainerGap())
        );
        tp_albumLayout.setVerticalGroup(
            tp_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tp_albumLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(tp_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(tf_tituloAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(tp_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tp_albumLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        tp_publicaciones.addTab("Album", tp_album);

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/Publicaciones.png"))); // NOI18N

        jLabel51.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(51, 51, 51));
        jLabel51.setText("Publicaciones");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(tp_publicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(bt_publicar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tp_publicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_publicar)
                .addContainerGap())
        );

        mi_Editar.setText("Editar");

        mi_editarComentarios.setText("Comentarios");
        mi_editarComentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_editarComentariosActionPerformed(evt);
            }
        });
        mi_Editar.add(mi_editarComentarios);

        mi_albumesModificar.setText("Albumes");
        mi_albumesModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_albumesModificarActionPerformed(evt);
            }
        });
        mi_Editar.add(mi_albumesModificar);

        mi_fotografiasModificar.setText("Fotografías");
        mi_fotografiasModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_fotografiasModificarActionPerformed(evt);
            }
        });
        mi_Editar.add(mi_fotografiasModificar);

        jMenuBar1.add(mi_Editar);

        jd_publicaciones.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jd_publicacionesLayout = new javax.swing.GroupLayout(jd_publicaciones.getContentPane());
        jd_publicaciones.getContentPane().setLayout(jd_publicacionesLayout);
        jd_publicacionesLayout.setHorizontalGroup(
            jd_publicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_publicacionesLayout.setVerticalGroup(
            jd_publicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_publicacionesLayout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jd_Reproductor.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(0, 92, 95));
        jPanel18.setForeground(new java.awt.Color(40, 86, 108));

        bt_pausa.setText("Pause");
        bt_pausa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_pausaMouseClicked(evt);
            }
        });

        bt_stop.setText("Stop");
        bt_stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_stopMouseClicked(evt);
            }
        });

        bt_play.setText("Play");
        bt_play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_playMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(bt_pausa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_stop, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_play))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_pausa)
                    .addComponent(bt_stop)
                    .addComponent(bt_play)))
        );

        Buscar_MP3.setText("Buscar");
        Buscar_MP3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Buscar_MP3MouseClicked(evt);
            }
        });

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/Musica.png"))); // NOI18N

        jLabel53.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel53.setText("Reproductor");

        jPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addGap(118, 118, 118)
                            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel18Layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(tf_rutaMP3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(Buscar_MP3))
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(115, 115, 115))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_rutaMP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar_MP3))
                .addGap(53, 53, 53)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        jd_Reproductor.getContentPane().add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 380));

        jPanel39.setBackground(new java.awt.Color(77, 118, 118));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/Video.png"))); // NOI18N

        jLabel55.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel55.setText("Reproductor de video");

        jl_videos.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jScrollPane13.setViewportView(jl_videos);

        jButton2.setText("Reproducir");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel55))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jButton2)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_ReproductorVideoLayout = new javax.swing.GroupLayout(jd_ReproductorVideo.getContentPane());
        jd_ReproductorVideo.getContentPane().setLayout(jd_ReproductorVideoLayout);
        jd_ReproductorVideoLayout.setHorizontalGroup(
            jd_ReproductorVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_ReproductorVideoLayout.setVerticalGroup(
            jd_ReproductorVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel42.setBackground(new java.awt.Color(126, 118, 118));

        jPanel48.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ta_contenidoMostrar.setEditable(false);
        ta_contenidoMostrar.setColumns(20);
        ta_contenidoMostrar.setLineWrap(true);
        ta_contenidoMostrar.setRows(5);
        jScrollPane15.setViewportView(ta_contenidoMostrar);

        jLabel56.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel56.setText("Contenido:");

        bt_EliminarComentario.setText("Eliminar");
        bt_EliminarComentario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_EliminarComentarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane15))
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel48Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel56))
                            .addGroup(jPanel48Layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(bt_EliminarComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 158, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_EliminarComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Eliminar", jPanel42);

        jPanel41.setBackground(new java.awt.Color(126, 118, 118));

        jPanel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ta_ContenidoModificar.setColumns(20);
        ta_ContenidoModificar.setRows(5);
        jScrollPane16.setViewportView(ta_ContenidoModificar);

        jLabel57.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel57.setText("Contenido:");

        jLabel58.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel58.setText("Fecha:");

        bt_modificarComentario.setText("Modificar");
        bt_modificarComentario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modificarComentarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(bt_modificarComentario)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel57)
                    .addComponent(jLabel58)
                    .addComponent(dc_fechaComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dc_fechaComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_modificarComentario)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Modificar", jPanel41);

        jPanel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jl_comentarios.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jl_comentarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_comentariosMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(jl_comentarios);

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14)
                .addContainerGap())
        );

        javax.swing.GroupLayout jd_comentariosModificarLayout = new javax.swing.GroupLayout(jd_comentariosModificar.getContentPane());
        jd_comentariosModificar.getContentPane().setLayout(jd_comentariosModificarLayout);
        jd_comentariosModificarLayout.setHorizontalGroup(
            jd_comentariosModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_comentariosModificarLayout.createSequentialGroup()
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane3))
        );
        jd_comentariosModificarLayout.setVerticalGroup(
            jd_comentariosModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
            .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel44.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Albumes");
        jtree_albumes.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jtree_albumes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtree_albumesMouseClicked(evt);
            }
        });
        jScrollPane18.setViewportView(jtree_albumes);

        jPanel45.setBackground(new java.awt.Color(153, 153, 153));
        jPanel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane18)
                    .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_albumesModificarLayout = new javax.swing.GroupLayout(jd_albumesModificar.getContentPane());
        jd_albumesModificar.getContentPane().setLayout(jd_albumesModificarLayout);
        jd_albumesModificarLayout.setHorizontalGroup(
            jd_albumesModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_albumesModificarLayout.setVerticalGroup(
            jd_albumesModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mi_eliminarFoto.setText("Eliminar");
        mi_eliminarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_eliminarFotoActionPerformed(evt);
            }
        });
        ppm_DeleteModificate.add(mi_eliminarFoto);

        mi_modificarAlbum.setText("Modificar");
        mi_modificarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_modificarAlbumActionPerformed(evt);
            }
        });
        ppm_DeleteModificate.add(mi_modificarAlbum);

        jPanel46.setBackground(new java.awt.Color(102, 102, 102));

        bt_buscarfotografia.setText("Buscar");
        bt_buscarfotografia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_buscarfotografiaMouseClicked(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel60.setText("Titulo del album:");

        bt_ModificarAlbum.setText("Aplicar cambios");
        bt_ModificarAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_ModificarAlbumMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(bt_ModificarAlbum)
                            .addComponent(tf_tituloModificarAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(tf_rutaModificarAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_buscarfotografia)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_rutaModificarAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_buscarfotografia))
                .addGap(18, 18, 18)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_tituloModificarAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(bt_ModificarAlbum)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_ModificarAlbumLayout = new javax.swing.GroupLayout(jd_ModificarAlbum.getContentPane());
        jd_ModificarAlbum.getContentPane().setLayout(jd_ModificarAlbumLayout);
        jd_ModificarAlbumLayout.setHorizontalGroup(
            jd_ModificarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_ModificarAlbumLayout.setVerticalGroup(
            jd_ModificarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bt_modificarFotografia.setBackground(new java.awt.Color(102, 102, 102));

        jLabel64.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Reemplazar Imagen:");

        jPanel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bt_buscarImagen.setText("Buscar");
        bt_buscarImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_buscarImagenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_rutaModificarFotografia, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_buscarImagen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_rutaModificarFotografia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_buscarImagen))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_modificarFotrografia.setText("Aplicar cambios");
        bt_modificarFotrografia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modificarFotrografiaMouseClicked(evt);
            }
        });

        jPanel50.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_FotografíaModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_FotografíaModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bt_modificarFotografiaLayout = new javax.swing.GroupLayout(bt_modificarFotografia);
        bt_modificarFotografia.setLayout(bt_modificarFotografiaLayout);
        bt_modificarFotografiaLayout.setHorizontalGroup(
            bt_modificarFotografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bt_modificarFotografiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bt_modificarFotografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bt_modificarFotografiaLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(bt_modificarFotografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64))
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(bt_modificarFotografiaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_modificarFotrografia)
                        .addGap(201, 201, 201))))
        );
        bt_modificarFotografiaLayout.setVerticalGroup(
            bt_modificarFotografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bt_modificarFotografiaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(bt_modificarFotrografia)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bt_modificarFotografiaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jd_ModificarFotografiaLayout = new javax.swing.GroupLayout(jd_ModificarFotografia.getContentPane());
        jd_ModificarFotografia.getContentPane().setLayout(jd_ModificarFotografiaLayout);
        jd_ModificarFotografiaLayout.setHorizontalGroup(
            jd_ModificarFotografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_modificarFotografia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_ModificarFotografiaLayout.setVerticalGroup(
            jd_ModificarFotografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_modificarFotografia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jl_ModificarFotografias.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jl_ModificarFotografias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_ModificarFotografiasMouseClicked(evt);
            }
        });
        jScrollPane17.setViewportView(jl_ModificarFotografias);

        jPanel52.setBackground(new java.awt.Color(102, 102, 102));
        jPanel52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel52.setForeground(new java.awt.Color(102, 102, 102));

        jLabel66.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Cambiar fecha:");

        jLabel68.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Cambiar imagen:");

        bt_BuscarFotografiaModificar.setText("Buscar");
        bt_BuscarFotografiaModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_BuscarFotografiaModificarMouseClicked(evt);
            }
        });

        bt_AplicarCambiosFotografia.setText("Aplicar cambios");
        bt_AplicarCambiosFotografia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_AplicarCambiosFotografiaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_fotografiaModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_fotografiaModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel52Layout.createSequentialGroup()
                                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bt_AplicarCambiosFotografia)
                                    .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel68)
                                        .addComponent(tf_rutafotografiaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dc_FechaFotografiaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_BuscarFotografiaModificar))
                            .addComponent(jLabel66)))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_rutafotografiaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_BuscarFotografiaModificar))
                .addGap(11, 11, 11)
                .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dc_FechaFotografiaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_AplicarCambiosFotografia)
                .addGap(30, 30, 30))
        );

        jTabbedPane4.addTab("Modificar", jPanel52);

        jPanel53.setBackground(new java.awt.Color(102, 102, 102));
        jPanel53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel53.setForeground(new java.awt.Color(102, 102, 102));

        bt_eliminarFotografia.setText("Eliminar");

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel53Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(bt_eliminarFotografia, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(bt_eliminarFotografia, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Eliminar", jPanel53);

        jLabel67.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel67.setText("Información:");

        lb_informacionFotografia.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        lb_imagenFotografia.setPreferredSize(new java.awt.Dimension(190, 190));

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addComponent(lb_imagenFotografia, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_imagenFotografia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_fotografiasModificarLayout = new javax.swing.GroupLayout(jd_fotografiasModificar.getContentPane());
        jd_fotografiasModificar.getContentPane().setLayout(jd_fotografiasModificarLayout);
        jd_fotografiasModificarLayout.setHorizontalGroup(
            jd_fotografiasModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_fotografiasModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_fotografiasModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_fotografiasModificarLayout.createSequentialGroup()
                        .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_fotografiasModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_fotografiasModificarLayout.createSequentialGroup()
                                .addComponent(jLabel67)
                                .addGap(0, 75, Short.MAX_VALUE))
                            .addComponent(lb_informacionFotografia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jd_fotografiasModificarLayout.setVerticalGroup(
            jd_fotografiasModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jd_fotografiasModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_fotografiasModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_fotografiasModificarLayout.createSequentialGroup()
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_informacionFotografia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jd_fotografiasModificarLayout.createSequentialGroup()
                        .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MYRedSocial");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        bt_iniciarsesion.setText("Iniciar");
        bt_iniciarsesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_iniciarsesionMouseClicked(evt);
            }
        });

        bt_ingresarusuario.setText("Ingresar");
        bt_ingresarusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_ingresarusuarioMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(">:v");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Ingresar Usuario");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Iniciar Sesion");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/Home.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(bt_iniciarsesion, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(bt_ingresarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel3))
            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(bt_iniciarsesion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(bt_ingresarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel3))
            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void jb_agregarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarUsuarioMouseClicked
        Usuario nuevoUsuario;
        String pais;
        boolean igual = false;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getNickname().equals(tf_nicknameIngresar.getText())) {
                igual = true;
            }
        }
        if (igual) {
            JOptionPane.showMessageDialog(this, "Nickname ya existente, ingrese otro");
        }else{
            if (tf_nicknameIngresar.getText().equals("")||tf_nombrecompleto.getText().equals("")||
                    pf_contraseñaIngresar.getText().equals("")||dc_fechadenacimiento.getDate()==null) {
                    JOptionPane.showMessageDialog(jd_agregar_usuario, "Llene todos los requisitos");
            }else{
                try {
                    if (cbx_paisIngresar.getSelectedItem().equals("Alahu Akbar")) {
                        pais = "Arabia";
                    }else{
                        pais = cbx_paisIngresar.getSelectedItem().toString();
                    }
                    if (rb_administrador.isSelected()) { 
                        nuevoUsuario = new Administrador(tf_nombrecompleto.getText(), pf_contraseñaIngresar.getText(), 
                                tf_nicknameIngresar.getText(), pais, dc_fechadenacimiento.getDate());
                    }else{
                        nuevoUsuario = new Regular(tf_nombrecompleto.getText(), pf_contraseñaIngresar.getText(), 
                                tf_nicknameIngresar.getText(), pais, dc_fechadenacimiento.getDate());
                    }
                    
                    usuarios.add(nuevoUsuario);
                    adminUsuario = new AdministradorUsuarios(nuevoUsuario);
                    adminUsuario.crearDirectorioArchivo();
                    
                    JOptionPane.showMessageDialog(jd_agregar_usuario, "Usuario agregado");
                    tf_nicknameIngresar.setText("");
                    tf_nombrecompleto.setText("");
                    pf_contraseñaIngresar.setText("");
                    dc_fechadenacimiento.setDate(null);
                    cbx_paisIngresar.setSelectedIndex(0);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(jd_agregar_usuario, "Dato mal ingresado");
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_jb_agregarUsuarioMouseClicked
    
    private void bt_ingresarusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ingresarusuarioMouseClicked
        tf_nicknameIngresar.setText("");
        tf_nombrecompleto.setText("");
        pf_contraseñaIngresar.setText("");
        dc_fechadenacimiento.setDate(null);
        cbx_paisIngresar.setSelectedIndex(0);
        jd_agregar_usuario.pack();
        jd_agregar_usuario.setLocationRelativeTo(null);
        jd_agregar_usuario.setModal(true);
        jd_agregar_usuario.setVisible(true);
        rb_administrador.setEnabled(false);
        rb_regular.setEnabled(false);
    }//GEN-LAST:event_bt_ingresarusuarioMouseClicked

    private void bt_iniciarsesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_iniciarsesionMouseClicked
        tf_nicknameIniciarSesion.setText("");
        pf_contraseñainiciarsesion.setText("");
        jd_iniciar_sesion.pack();
        jd_iniciar_sesion.setLocationRelativeTo(null);
        jd_iniciar_sesion.setModal(true);
        jd_iniciar_sesion.setVisible(true);
    }//GEN-LAST:event_bt_iniciarsesionMouseClicked

    private void bt_LogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_LogInMouseClicked
        String nombre, contraseña;
        nombre = tf_nicknameIniciarSesion.getText();
        contraseña = pf_contraseñainiciarsesion.getText();
        if ( (UsuarioActivado=verificarCuenta(nombre, contraseña)) != null) {
            if (UsuarioActivado instanceof Administrador) {
                Menu_administrador.setEnabled(true);
            }else{
                 Menu_administrador.setEnabled(false);
            }
            JOptionPane.showMessageDialog(null, "¡Bienvenido "+UsuarioActivado.getNickname()+"!");
            AdmHilos(UsuarioActivado, true);
            AdminUsuarioActivado = new AdministradorUsuarios(UsuarioActivado);
            
            tf_nicknameIniciarSesion.setText("");
            pf_contraseñainiciarsesion.setText("");
            
            jd_iniciar_sesion.dispose();
            
            jd_muro.pack();
            jd_muro.setModal(true);
            jd_muro.setLocationRelativeTo(this);
            jd_muro.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Nickname o contraseña incorrecta");
        }
    }//GEN-LAST:event_bt_LogInMouseClicked

    
    
    
    
    private void mi_misAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_misAmigosActionPerformed
        reload();
        bt_EnviarSolicitud.setEnabled(true);
        jd_amigos.pack();
        jd_amigos.setModal(true);
        jd_amigos.setLocationRelativeTo(this);
        jd_amigos.setVisible(true);
    }//GEN-LAST:event_mi_misAmigosActionPerformed

    private void mi_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_LogOutActionPerformed
        int numero = JOptionPane.showConfirmDialog(jd_muro, "LogOut", "¿Desea cerrar sesion?", 0, 1);
        if (numero==0) {
            AdmHilos(UsuarioActivado, false);
            AdminUsuarioActivado = null;
            UsuarioActivado = null;
            jd_muro.dispose();
        }
    }//GEN-LAST:event_mi_LogOutActionPerformed

    private void mi_mensajeriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_mensajeriaActionPerformed
        DefaultComboBoxModel modeloComboBox = new DefaultComboBoxModel();
        for (Usuario amigo : UsuarioActivado.getAmigos()) {
            modeloComboBox.addElement(amigo);
        }    
        cbx_mandarMensaje.setModel(modeloComboBox);   
        reload();
        jd_mensajería.pack();
        jd_mensajería.setModal(true);
        jd_mensajería.setLocationRelativeTo(this);
        jd_mensajería.setVisible(true);
    }//GEN-LAST:event_mi_mensajeriaActionPerformed

    private void mi_AdministradorAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_AdministradorAgregarUsuarioActionPerformed
        tf_nicknameIngresar.setText("");
        tf_nombrecompleto.setText("");
        pf_contraseñaIngresar.setText("");
        dc_fechadenacimiento.setDate(null);
        cbx_paisIngresar.setSelectedIndex(0);
        jd_agregar_usuario.pack();
        jd_agregar_usuario.setLocationRelativeTo(null);
        jd_agregar_usuario.setModal(true);
        jd_agregar_usuario.setVisible(true);
        rb_administrador.setEnabled(true);
        rb_regular.setEnabled(true);
    }//GEN-LAST:event_mi_AdministradorAgregarUsuarioActionPerformed

    private void mi_AdministradorModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_AdministradorModificarUsuarioActionPerformed
        reload();
        jd_modificar_usuario.pack();
        jd_modificar_usuario.setLocationRelativeTo(null);
        jd_modificar_usuario.setModal(true);
        jd_modificar_usuario.setVisible(true);
        jd_modificar_usuario.setEnabled(true);
    }//GEN-LAST:event_mi_AdministradorModificarUsuarioActionPerformed

    private void mi_AdministradorEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_AdministradorEliminarUsuarioActionPerformed
        reload();
        jd_quitar_usuario.pack();
        jd_quitar_usuario.setLocationRelativeTo(null);
        jd_quitar_usuario.setModal(true);
        jd_quitar_usuario.setVisible(true);
        jd_quitar_usuario.setEnabled(true);
    }//GEN-LAST:event_mi_AdministradorEliminarUsuarioActionPerformed

    
    
    

    private void bt_EnviarSolicitudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_EnviarSolicitudMouseClicked
        Usuario usuarioMandar;
        DefaultListModel modelo = (DefaultListModel)jl_noAmigos.getModel();
        try {
            int posicion = jl_noAmigos.getSelectedIndex();
            usuarioMandar = (Usuario)modelo.getElementAt(posicion);
            if (posicion>-1) {
                if (UsuarioActivado.getSolicitudes().contains(usuarioMandar.getNickname())) {
                    JOptionPane.showMessageDialog(jd_amigos, "Tiene pendiente una solicitud de este usuario");
                }else{
                    usuarios.get(usuarios.indexOf(usuarioMandar)).setSolicitudes(UsuarioActivado.getNickname());
                    reload();
                    adminUsuario = new AdministradorUsuarios(usuarioMandar);
                    adminUsuario.escribirUsuario();
                    JOptionPane.showMessageDialog(jd_amigos, "Solicitud enviada");
                }
            }else{
                JOptionPane.showMessageDialog(jd_amigos, "Seleccione un usuario");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_EnviarSolicitudMouseClicked

    
    
    

    private void mi_solicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_solicitudesActionPerformed
        reload();
        jd_misSolicitudes.pack();
        jd_misSolicitudes.setModal(true);
        jd_misSolicitudes.setLocationRelativeTo(this);
        jd_misSolicitudes.setVisible(true);
    }//GEN-LAST:event_mi_solicitudesActionPerformed
    
    private void bt_aceptarSolicitudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_aceptarSolicitudMouseClicked
        DefaultListModel modelo = (DefaultListModel)jl_solicitudes.getModel();
        int posicion = jl_solicitudes.getSelectedIndex();
        if (posicion > -1) {
            String usuarioAceptado = jl_solicitudes.getSelectedValue();
            for (Usuario t : usuarios) {
                if (t.getNickname().equals(usuarioAceptado)) {
                    UsuarioActivado.setAmigos(t);
                    t.setAmigos(UsuarioActivado);
                    UsuarioActivado.getSolicitudes().remove(usuarioAceptado);
                    adminUsuario = new AdministradorUsuarios(t);
                    AdminUsuarioActivado = new AdministradorUsuarios(UsuarioActivado);
                }
            }
            reload();
            JOptionPane.showMessageDialog(jd_amigos, "Solicitud aceptada");
            try {
                adminUsuario.escribirUsuario();
                AdminUsuarioActivado.escribirUsuario();
            } catch (Exception e) {
            }
        }else{
            JOptionPane.showMessageDialog(jd_amigos, "Elija a un usuario para aceptar solicitud");
        }
    }//GEN-LAST:event_bt_aceptarSolicitudMouseClicked
    
    private void bt_rechazarSolicitudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_rechazarSolicitudMouseClicked
        DefaultListModel modelo = (DefaultListModel)jl_solicitudes.getModel();
        int posicion = jl_solicitudes.getSelectedIndex();
        if (posicion>=0) {
            try {
                String usuarioRechazado = (String)modelo.getElementAt(posicion);
                UsuarioActivado.getSolicitudes().remove(usuarioRechazado);
                AdminUsuarioActivado.escribirUsuario();
            reload();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(jd_misSolicitudes, "Ocurrio un problema");
            }
            JOptionPane.showMessageDialog(jd_amigos, "Solicitud Rechazada");
        }else{
            JOptionPane.showMessageDialog(jd_amigos, "Elija alguna solicitud");
        }
    }//GEN-LAST:event_bt_rechazarSolicitudMouseClicked
    //------------------------------------------------------------
    
    
    

    private void bt_mandarMensajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_mandarMensajeMouseClicked
        if (!ta_contenidoMensaje.getText().equals("")){
            Mensaje mandarMensaje = new Mensaje(UsuarioActivado.getNickname(), new Date(), ta_contenidoMensaje.getText());
            Usuario receptor = (Usuario)cbx_mandarMensaje.getSelectedItem();
            try {
                for (Usuario usuario : usuarios) {
                    if (usuario.getNickname().equals(receptor.getNickname())) {
                        usuario.setMisMensajes(mandarMensaje);
                        adminUsuario = new AdministradorUsuarios(usuario);
                        JOptionPane.showMessageDialog(jd_mensajería, "Mensaje enviado");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                adminUsuario.escribirUsuario();
                AdminUsuarioActivado.escribirUsuario();
            } catch (Exception e) {
                e.printStackTrace();
            }
            cbx_mandarMensaje.setSelectedIndex(0);
           ta_contenidoMensaje.setText("");
        }else{
            JOptionPane.showMessageDialog(jd_mensajería, "Escriba algo...");
        }
    }//GEN-LAST:event_bt_mandarMensajeMouseClicked

    private void mi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_eliminarActionPerformed
        DefaultListModel modelo = (DefaultListModel)jl_mensajes.getModel();
        int seleccion = jl_mensajes.getSelectedIndex();
        Mensaje eliminar;
        if (seleccion>-1){
            try {
                eliminar = (Mensaje)modelo.getElementAt(seleccion);
                UsuarioActivado.getMisMensajes().remove(eliminar);
                JOptionPane.showMessageDialog(jd_mensajería, "Mensaje eliminado");
                AdminUsuarioActivado.escribirUsuario();
                reload();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(jd_mensajería, "Se produjo un error");
            }
        }
    }//GEN-LAST:event_mi_eliminarActionPerformed

    
    
    private void jb_eliminarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_eliminarUsuarioMouseClicked
        DefaultListModel modelo = (DefaultListModel)jl_eliminarUsuario.getModel();
        Usuario eliminar = (Usuario)modelo.getElementAt(jl_eliminarUsuario.getSelectedIndex());
        usuarios.remove(eliminar);
        reload();
        JOptionPane.showMessageDialog(jd_quitar_usuario, "Usuario eliminado");
    }//GEN-LAST:event_jb_eliminarUsuarioMouseClicked

    private void bt_modifiarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modifiarUsuarioMouseClicked
        if (tf_nuevoNombre.getText().equals("")||tf_nuevoNickname.getText().equals("")
                ||pf_nuevaContraseña.getText().equals("")||dc_nuevaFecha.getDate()==null) {
            JOptionPane.showMessageDialog(jd_modificar_usuario, "Llene todos los requisitos");
        }else{
            try {
                DefaultListModel modelo = (DefaultListModel)jl_modifiarUsuarios.getModel();
                Usuario seleccionado = (Usuario)modelo.getElementAt(jl_modifiarUsuarios.getSelectedIndex());
                seleccionado.setNombreCompleto(tf_nuevoNombre.getText());
                seleccionado.setNickname(tf_nuevoNickname.getText());
                seleccionado.setContraseña(pf_nuevaContraseña.getText());
                seleccionado.setPaís(cbx_nuevaRegion.getSelectedItem().toString());
                seleccionado.setFecha(dc_nuevaFecha.getDate());
                reload();
                JOptionPane.showMessageDialog(jd_modificar_usuario, "Usuario Modificado");
            } catch (Exception e) {
            }            
        }
    }//GEN-LAST:event_bt_modifiarUsuarioMouseClicked

    
    
    
    private void bt_AgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_AgendaMouseClicked
        try {
            if (tf_titulo.getText().equals("")) {
                JOptionPane.showMessageDialog(jd_agenda, "Ingrese titulo");
            }else{
                if (cbx_tipoActividad.getSelectedItem().toString().equals("Tarea")) {
                    jd_Tarea.pack();
                    jd_Tarea.setModal(true);
                    jd_Tarea.setLocationRelativeTo(null);
                    jd_Tarea.setVisible(true);
                }else{
                    jd_Evento.pack();
                    jd_Evento.setModal(true);
                    jd_Evento.setLocationRelativeTo(null);
                    jd_Evento.setVisible(true);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_AgendaMouseClicked

    private void bt_AgregarTareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_AgregarTareaMouseClicked
        Tarea tarea;
        if (ta_contenido.getText().equals("")) {
            JOptionPane.showMessageDialog(jd_Tarea, "Ingrese algo de contenido");
        }else{
            try {
                JOptionPane.showMessageDialog(jd_Evento, "Tarea agregada");
                cbx_tipoActividad.setSelectedIndex(0);
                jd_Tarea.dispose();
                tarea = new Tarea(ta_contenido.getText(), jc_calendario.getDate(), (int)sp_recordatorio.getValue(), tf_titulo.getText(), chb_recordar.isSelected());
                tarea.start();
                UsuarioActivado.setMisActividades(tarea);
                AdminUsuarioActivado.escribirUsuario();
                tf_titulo.setText("");
                ta_contenido.setText("");
                sp_recordatorio.setValue(0);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(jd_Evento, "Ingrese datos correctamente");
            }
        }
    }//GEN-LAST:event_bt_AgregarTareaMouseClicked

    private void bt_AgregarNotacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_AgregarNotacionMouseClicked
        notaciones.add(ta_notaciones.getText());
        ta_notaciones.setText("");
    }//GEN-LAST:event_bt_AgregarNotacionMouseClicked

    
    
    
    private void mi_agendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_agendaActionPerformed
        jd_agenda.pack();
        jd_agenda.setModal(true);
        jd_agenda.setLocationRelativeTo(null);
        jd_agenda.setVisible(true);
    }//GEN-LAST:event_mi_agendaActionPerformed

    private void jl_mensajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_mensajesMouseClicked
        if (evt.isMetaDown()) {
            ppm_ReadDelete.show(jl_mensajes, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jl_mensajesMouseClicked

    private void mi_leerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_leerActionPerformed
        DefaultListModel modelo = (DefaultListModel)jl_mensajes.getModel();
        int seleccion = jl_mensajes.getSelectedIndex();
        Mensaje leer;
        if (seleccion>-1){
            try {
                leer = (Mensaje)modelo.getElementAt(seleccion);
                leer.setEstado(true);
                reload();
                lb_emisor.setText("Emisor: "+leer.getEmisor());
                lb_fecha.setText("Fecha: "+leer.getFecha());
                ta_contenidoLeerMensaje.setText(leer.getContenido());
                jd_leerMensaje.pack();
                jd_leerMensaje.setModal(true);
                jd_leerMensaje.setLocationRelativeTo(null);
                jd_leerMensaje.setVisible(true);
                AdminUsuarioActivado.escribirUsuario();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(jd_mensajería, "Se produjo un error");
            }
        }
    }//GEN-LAST:event_mi_leerActionPerformed

    
    

    private void mi_reproductorMusicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_reproductorMusicalActionPerformed
        jd_Reproductor.pack();
        jd_Reproductor.setModal(true);
        jd_Reproductor.setLocationRelativeTo(null);
        jd_Reproductor.setVisible(true);
    }//GEN-LAST:event_mi_reproductorMusicalActionPerformed

    
    private void bt_publicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_publicarMouseClicked
        if (tp_comentario.isShowing()) {
            if (ta_comentario.getText().equals("")) {
            }else{
                UsuarioActivado.setMiPublicacion(new Comentario(ta_contenido.getText(), new Date()));
                
                ta_comentario.setText("");
                JOptionPane.showMessageDialog(jd_publicaciones,"Publicacion agregada");
            }
        }else if (tp_fotografia.isShowing()) {
            if (fotografia!=null) {
                UsuarioActivado.setMiPublicacion(new Fotografia(fotografia, new Date()));
                tf_rutaFotografia.setText("");
                lb_fotografia.setIcon(new ImageIcon());
                fotografia = null;
                JOptionPane.showMessageDialog(jd_publicaciones,"Publicacion agregada");
            }else{
                JOptionPane.showMessageDialog(jd_publicaciones, "Seleccione alguna imagen");
            }
        }else if (tp_album.isShowing()) {
            if (album.size()>0) {
                UsuarioActivado.setMiPublicacion(new AlbumFotos(album,new Date(),tf_tituloAlbum.getText())); 
                lb_añadirfotografia.setIcon(new ImageIcon());
                album = new ArrayList();
                tf_rutaFotografias.setText("");
                tf_tituloAlbum.setText("");
                JOptionPane.showMessageDialog(jd_publicaciones,"Publicacion agregada");
            }else{
                JOptionPane.showMessageDialog(jd_publicaciones, "Añada una fotografía");
            }
        }else if (tp_video.isShowing()) {
            if (video!=null) {
                UsuarioActivado.setMiPublicacion(new Video(video, new Date()));
                video = null;
                JOptionPane.showMessageDialog(jd_publicaciones,"Publicacion agregada");
            }else{
                JOptionPane.showMessageDialog(jd_publicaciones, "Añada un video");
            }
        }
        AdminUsuarioActivado.escribirUsuario();
    }//GEN-LAST:event_bt_publicarMouseClicked

    private void bt_buscarFotografiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_buscarFotografiaMouseClicked
        JFileChooser jf = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagenes", "png","jpg","jpeg");
        jf.setFileFilter(filtro);
        int Seleccion = jf.showOpenDialog(jd_publicaciones);
        if (Seleccion == JFileChooser.APPROVE_OPTION) {
            fotografia = new ImageIcon(Toolkit.getDefaultToolkit().createImage(jf.getSelectedFile().getPath()).getScaledInstance(198, 180, 0));
            tf_rutaFotografia.setText(jf.getSelectedFile().getPath());
            lb_fotografia.setIcon(fotografia);
        }   
    }//GEN-LAST:event_bt_buscarFotografiaMouseClicked

    
    
    
    private void bt_AgregarActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_AgregarActividadMouseClicked
        try {
            if ((int)sp_hora1.getValue()==0||(int)sp_hora2.getValue()==0) {
                JOptionPane.showMessageDialog(jd_Evento, "Llene todos los requisitos");
            }else{
                Date hora1 = new Date();
                hora1.setHours((int)sp_hora1.getValue());
                hora1.setMinutes((int)sp_minuto1.getValue());
                Date hora2 = new Date();
                hora2.setHours((int)sp_hora2.getValue());
                hora1.setMinutes((int)sp_minuto2.getValue());
                Evento evento = new Evento(hora1, hora2, (int)sp_recordatorio.getValue(), tf_titulo.getText(), chb_recordar.isSelected(), jc_calendario.getDate());
                JOptionPane.showMessageDialog(jd_agenda, "Actividad agregada");
                UsuarioActivado.setMisActividades(evento);
                evento.start();
                AdminUsuarioActivado.escribirUsuario();
                sp_recordatorio.setEnabled(false);
                sp_hora1.setValue(0);
                sp_hora2.setValue(0);
                sp_minuto1.setValue(0);
                sp_minuto2.setValue(0);
                tf_titulo.setText("");
                sp_recordatorio.setValue(0);
                cbx_tipoActividad.setSelectedIndex(0);
                jd_Evento.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_agenda, "Ingrese datos correctamente");
        }
    }//GEN-LAST:event_bt_AgregarActividadMouseClicked

    private void chb_recordarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_recordarActionPerformed
        if (chb_recordar.isSelected()) {
            sp_recordatorio.setEnabled(true);
        }else{
            sp_recordatorio.setEnabled(false);
        }
    }//GEN-LAST:event_chb_recordarActionPerformed

    private void mi_publicacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_publicacionesActionPerformed
        tf_rutaFotografia.setText("");
        tf_rutaFotografias.setText("");
        tf_rutaMP3.setText("");
        tf_rutaVideo.setText("");
        tf_tituloAlbum.setText("");
        lb_fotografia.setIcon(new ImageIcon());
        album = new ArrayList();
        fotografia = null;
        
        jd_publicaciones.pack();
        jd_publicaciones.setModal(true);
        jd_publicaciones.setLocationRelativeTo(null);
        jd_publicaciones.setVisible(true);
    }//GEN-LAST:event_mi_publicacionesActionPerformed

    private void tb_buscarFotografiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_buscarFotografiasMouseClicked
        JFileChooser jf = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagenes","png","jpg","jpeg");
        jf.setFileFilter(filtro);
        int seleccion = jf.showSaveDialog(jd_publicaciones);
        ImageIcon foto;
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = jf.getSelectedFile();
            foto = new ImageIcon(Toolkit.getDefaultToolkit().createImage(archivo.getPath()).getScaledInstance(120, 120, 0));
            album.add(new Fotografia(foto, new Date()));
            
            JOptionPane.showMessageDialog(jd_publicaciones, "Fotografía agregada al album");
            lb_añadirfotografia.setIcon(foto);
            tf_rutaFotografias.setText(archivo.getPath());
        }
    }//GEN-LAST:event_tb_buscarFotografiasMouseClicked

    private void bt_buscarVideoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_buscarVideoMouseClicked
        JFileChooser jf = new JFileChooser();
        int seleccion = jf.showOpenDialog(jd_publicaciones);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            video = jf.getSelectedFile();
        }
    }//GEN-LAST:event_bt_buscarVideoMouseClicked

    
    
    private void Buscar_MP3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buscar_MP3MouseClicked
        JFileChooser jf = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos MP3","mp3");
        jf.setFileFilter(filtro);
        int seleccion = jf.showOpenDialog(jd_Reproductor);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            MP3 = jf.getSelectedFile();
            tf_rutaMP3.setText(MP3.getPath());
        }
    }//GEN-LAST:event_Buscar_MP3MouseClicked

    private void bt_playMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_playMouseClicked
        if (MP3!=null) {
            try {
                Player ap1 = new Player(new FileInputStream(MP3));
                ap1.play();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_bt_playMouseClicked

    private void bt_pausaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_pausaMouseClicked
       
    }//GEN-LAST:event_bt_pausaMouseClicked

    private void bt_stopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_stopMouseClicked
        
    }//GEN-LAST:event_bt_stopMouseClicked

    private void mi_reproductorVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_reproductorVideoActionPerformed
        jd_ReproductorVideo.pack();
        jd_ReproductorVideo.setModal(true);
        jd_ReproductorVideo.setLocationRelativeTo(null);
        jd_ReproductorVideo.setVisible(true);
    }//GEN-LAST:event_mi_reproductorVideoActionPerformed

    
    
    
    private void mi_editarComentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_editarComentariosActionPerformed
        DefaultListModel modelo = new DefaultListModel();
        for (Publicacion p : UsuarioActivado.getMisPublicaciones()) {
            if (p instanceof Comentario) {
                modelo.addElement(p);
            }
        }
        jl_comentarios.setModel(modelo);
        ta_ContenidoModificar.setText("");
        ta_contenidoMostrar.setText("");
        dc_fechaComentario.setDate(null);
        jd_comentariosModificar.pack();
        jd_comentariosModificar.setModal(true);
        jd_comentariosModificar.setLocationRelativeTo(null);
        jd_comentariosModificar.setVisible(true);
    }//GEN-LAST:event_mi_editarComentariosActionPerformed

    private void bt_EliminarComentarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_EliminarComentarioMouseClicked
        DefaultListModel modelo = (DefaultListModel)jl_comentarios.getModel();
        if (jl_comentarios.getSelectedIndex()>-1) {
            Comentario comentarioEliminado = (Comentario)modelo.getElementAt(jl_comentarios.getSelectedIndex());
            UsuarioActivado.getMisPublicaciones().remove(comentarioEliminado);
            JOptionPane.showMessageDialog(jd_comentariosModificar, "Comentario Eliminado");
            AdminUsuarioActivado.escribirUsuario();
            modelo.remove(jl_comentarios.getSelectedIndex());
            ta_contenidoMostrar.setText("");
        }else{
            JOptionPane.showMessageDialog(jd_comentariosModificar, "Seleccione un comentario");
        }
    }//GEN-LAST:event_bt_EliminarComentarioMouseClicked

    private void bt_modificarComentarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modificarComentarioMouseClicked
        DefaultListModel modelo = (DefaultListModel)jl_comentarios.getModel();
        if (jl_comentarios.getSelectedIndex()>-1) {
            if (ta_ContenidoModificar.getText().equals("")||dc_fechaComentario.getDate()==null) {
            JOptionPane.showMessageDialog(jd_comentariosModificar, "Llene todos los requisitos");
            }else{
                Comentario editarComentario = (Comentario)modelo.getElementAt(jl_comentarios.getSelectedIndex());
                editarComentario.setContenido(ta_ContenidoModificar.getText());
                editarComentario.setFecha(dc_fechaComentario.getDate());
                JOptionPane.showMessageDialog(jd_comentariosModificar, "Comentario editado");
                AdminUsuarioActivado.escribirUsuario();
                ta_ContenidoModificar.setText("");
                dc_fechaComentario.setDate(null);
            }
        }else{
            JOptionPane.showMessageDialog(jd_comentariosModificar, "Seleccione un comentario");
        }
        
    }//GEN-LAST:event_bt_modificarComentarioMouseClicked

    private void jl_comentariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_comentariosMouseClicked
        if (jl_comentarios.getSelectedIndex()>-1) {
            DefaultListModel modelo = (DefaultListModel)jl_comentarios.getModel();
            ta_contenidoMostrar.setText(((Comentario)modelo.getElementAt(jl_comentarios.getSelectedIndex())).getContenido());
        }
    }//GEN-LAST:event_jl_comentariosMouseClicked

    private void mi_albumesModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_albumesModificarActionPerformed
        DefaultTreeModel modelo = (DefaultTreeModel)jtree_albumes.getModel();
        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Albumes");
        for (Publicacion p : UsuarioActivado.getMisPublicaciones()) {
            if (p instanceof AlbumFotos) {
                DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(p);
                for (Fotografia foto : ((AlbumFotos)p).getFotos()) {
                    DefaultMutableTreeNode nodoHijo = new DefaultMutableTreeNode(foto);
                    nodo.add(nodoHijo);
                }
                raiz.add(nodo);
            }
        }
        modelo.setRoot(raiz);
        modelo.reload();
        jd_albumesModificar.pack();
        jd_albumesModificar.setModal(true);
        jd_albumesModificar.setLocationRelativeTo(null);
        jd_albumesModificar.setVisible(true);
    }//GEN-LAST:event_mi_albumesModificarActionPerformed

    private void jtree_albumesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtree_albumesMouseClicked
        if (evt.isMetaDown()) {
            posicion = jtree_albumes.getClosestRowForLocation(evt.getX(), evt.getY());
            if (posicion>0) {
               ppm_DeleteModificate.show(jtree_albumes, evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jtree_albumesMouseClicked

    private void mi_eliminarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_eliminarFotoActionPerformed
        DefaultTreeModel model = (DefaultTreeModel)jtree_albumes.getModel();
        DefaultMutableTreeNode nodo;
        Object n = jtree_albumes.getSelectionPath().getLastPathComponent();
        nodo = (DefaultMutableTreeNode)n;
        if (nodo.getUserObject() instanceof Fotografia) {
            Fotografia foto = (Fotografia)nodo.getUserObject();
            UsuarioActivado.getMisPublicaciones().remove(foto);
            nodo.removeFromParent();
        }else if (nodo.getUserObject() instanceof AlbumFotos){
            AlbumFotos album = (AlbumFotos)nodo.getUserObject();
            UsuarioActivado.getMisPublicaciones().remove(album);
            nodo.removeFromParent();
        }
        model.reload();
        JOptionPane.showMessageDialog(jd_albumesModificar, "Elemento eliminado");
    }//GEN-LAST:event_mi_eliminarFotoActionPerformed

    private void mi_modificarAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_modificarAlbumActionPerformed
        DefaultTreeModel model = (DefaultTreeModel)jtree_albumes.getModel();
        Object n = jtree_albumes.getSelectionPath().getLastPathComponent();
        nodoModificar = (DefaultMutableTreeNode)n;
        if (nodoModificar.getUserObject() instanceof Fotografia) {
            jd_ModificarFotografia.pack();
            jd_ModificarFotografia.setModal(true);
            jd_ModificarFotografia.setLocationRelativeTo(null);
            jd_ModificarFotografia.setVisible(true);
        }else if (nodoModificar.getUserObject() instanceof AlbumFotos){
            jd_ModificarAlbum.pack();
            jd_ModificarAlbum.setModal(true);
            jd_ModificarAlbum.setLocationRelativeTo(null);
            jd_ModificarAlbum.setVisible(true);
        }
    }//GEN-LAST:event_mi_modificarAlbumActionPerformed

    private void bt_buscarfotografiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_buscarfotografiaMouseClicked
        JFileChooser jf = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagenes","jpeg","jpg","png");
        jf.setFileFilter(filtro);
        int seleccion = jf.showSaveDialog(jd_ModificarAlbum);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            album.add(new Fotografia(new ImageIcon(Toolkit.getDefaultToolkit().createImage(jf.getSelectedFile().getPath()).getScaledInstance(120, 120, 0)), new Date()));
            tf_rutaModificarAlbum.setText(jf.getSelectedFile().getPath());
            JOptionPane.showMessageDialog(jd_ModificarAlbum, "Fotografía agregada");
        }
    }//GEN-LAST:event_bt_buscarfotografiaMouseClicked

    private void bt_ModificarAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ModificarAlbumMouseClicked
        DefaultTreeModel modelo = (DefaultTreeModel)jtree_albumes.getModel();
        if (tf_tituloModificarAlbum.getText().equals("")) {
            JOptionPane.showMessageDialog(jd_ModificarAlbum, "Ingrese un titulo nuevo");
        }else{
            AlbumFotos albumModificar = (AlbumFotos)nodoModificar.getUserObject();
            for (Fotografia foto : album) {
                albumModificar.setFoto(foto);
            }
            albumModificar.setTitulo(tf_tituloModificarAlbum.getText());
            JOptionPane.showMessageDialog(jd_albumesModificar, "Album Modificado");
            AdminUsuarioActivado.escribirUsuario();
            album = new ArrayList();
            tf_tituloModificarAlbum.setText("");
            tf_rutaModificarAlbum.setText("");
            jd_ModificarAlbum.dispose();
        }       
        modelo.reload();
    }//GEN-LAST:event_bt_ModificarAlbumMouseClicked

    private void bt_buscarImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_buscarImagenMouseClicked
        JFileChooser jf = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagenes","jpeg","jpg","png");
        jf.setFileFilter(filtro);
        int seleccion = jf.showSaveDialog(jd_ModificarAlbum);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            fotografia = new ImageIcon(Toolkit.getDefaultToolkit().createImage(jf.getSelectedFile().getPath()).getScaledInstance(120, 120, 0));
            tf_rutaModificarFotografia.setText(jf.getSelectedFile().getPath());
            lb_FotografíaModificar.setIcon(fotografia);
        }
    }//GEN-LAST:event_bt_buscarImagenMouseClicked

    private void bt_modificarFotrografiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modificarFotrografiaMouseClicked
        Fotografia fotoModificar = (Fotografia)nodoModificar.getUserObject();
        if (fotografia!=null) {
            fotoModificar.setFotografia(fotografia);
            JOptionPane.showMessageDialog(jd_ModificarFotografia, "Fotografía modificada");
            AdminUsuarioActivado.escribirUsuario();
            jd_ModificarFotografia.dispose();
            tf_rutaModificarFotografia.setText("");
            fotografia = null;
        }
    }//GEN-LAST:event_bt_modificarFotrografiaMouseClicked

    private void mi_fotografiasModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_fotografiasModificarActionPerformed
        DefaultListModel modelo = new DefaultListModel();
        for (Publicacion p : UsuarioActivado.getMisPublicaciones()) {
            if (p instanceof Fotografia) {
                modelo.addElement(p);
            }
        }
        jl_ModificarFotografias.setModel(modelo);
        fotoSeleccionada=null;
        fotografia=null;
        jd_fotografiasModificar.pack();
        jd_fotografiasModificar.setModal(true);
        jd_fotografiasModificar.setLocationRelativeTo(null);
        jd_fotografiasModificar.setVisible(true);
    }//GEN-LAST:event_mi_fotografiasModificarActionPerformed

    private void jl_ModificarFotografiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_ModificarFotografiasMouseClicked
        if (jl_ModificarFotografias.getSelectedIndex()>-1) {
            DefaultListModel modelo = (DefaultListModel)jl_ModificarFotografias.getModel();
            fotoSeleccionada = (Fotografia)modelo.getElementAt(jl_ModificarFotografias.getSelectedIndex());
            lb_imagenFotografia.setIcon(fotoSeleccionada.getFotografia());
            lb_informacionFotografia.setText(fotoSeleccionada.getFecha().toString());
        }
    }//GEN-LAST:event_jl_ModificarFotografiasMouseClicked

    private void bt_BuscarFotografiaModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_BuscarFotografiaModificarMouseClicked
        JFileChooser jf = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagenes", "png","jpg","jpeg");
        jf.setFileFilter(filtro);
        int Seleccion = jf.showOpenDialog(jd_publicaciones);
        if (Seleccion == JFileChooser.APPROVE_OPTION) {
            fotografia = new ImageIcon(Toolkit.getDefaultToolkit().createImage(jf.getSelectedFile().getPath()).getScaledInstance(190, 190, 0));
            tf_rutafotografiaModificar.setText(jf.getSelectedFile().getPath());
            lb_fotografiaModificar.setIcon(fotografia);
        }   
    }//GEN-LAST:event_bt_BuscarFotografiaModificarMouseClicked

    private void bt_AplicarCambiosFotografiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_AplicarCambiosFotografiaMouseClicked
        if (fotografia!=null&&jl_ModificarFotografias.getSelectedIndex()>-1) {
            if (dc_FechaFotografiaModificar.getDate()!=null) {
                fotoSeleccionada.setFecha(dc_FechaFotografiaModificar.getDate());
                fotoSeleccionada.setFotografia(fotografia);
                JOptionPane.showMessageDialog(jd_fotografiasModificar,"Fotografia modificada");
                tf_rutaModificarFotografia.setText("");
                lb_fotografiaModificar.setIcon(new ImageIcon());
                AdminUsuarioActivado.escribirUsuario();
                fotografia=null;
                fotoSeleccionada = null;
            }else{
                JOptionPane.showMessageDialog(jd_fotografiasModificar,"Llene todos los espacios");
            }
        }
    }//GEN-LAST:event_bt_AplicarCambiosFotografiaMouseClicked

    
       
    
    
    

    public Usuario verificarCuenta(String nickname, String contraseña){
        for (Usuario usuario : usuarios) {
            if (usuario.getNickname().equals(nickname)&&usuario.getContraseña().equals(contraseña)) {
                return usuario;
            }
        }
        return null;
    }
   
    public void AdmHilos(Usuario usuario, boolean activo){
        if (activo) {
            for (Actividad a : usuario.getMisActividades()) {
                if (a.isAlive()) {
                    a.setRecordar(true);
                }
            }
        }else{
            for (Actividad a : usuario.getMisActividades()) {
                if (a.isAlive()) {
                    a.setRecordar(false);
                }
            }
        }
    }
 
    public void reload(){
        DefaultListModel modeloamigos = new DefaultListModel();
        DefaultListModel modeloSolicitudes = new DefaultListModel();
        DefaultListModel modeloNoamigos = new DefaultListModel();
        DefaultListModel modelomensajes = new DefaultListModel();
        DefaultListModel modelo = new DefaultListModel();
        //Solicitudes
        for (String solicitud : UsuarioActivado.getSolicitudes()) {
            modeloSolicitudes.addElement(solicitud);
        }
        //No amigos
        for (Usuario usuario : usuarios) {
            if (!usuario.getNickname().equals(UsuarioActivado.getNickname())&&!UsuarioActivado.getAmigos().contains(usuario)
                &&!usuario.getSolicitudes().contains(UsuarioActivado.getNickname())) {
                    modeloNoamigos.addElement(usuario);
            }
        }
        //Amigos
        for (Usuario usuario : UsuarioActivado.getAmigos()) {
            modeloamigos.addElement(usuario);
        }
        //Mensajes
        for (Mensaje miMensaje : UsuarioActivado.getMisMensajes()) {
            modelomensajes.addElement(miMensaje);
        }
        //Modificar y eliminar
        for (Usuario usuario : usuarios) {
            if (!usuario.equals(UsuarioActivado)) {
                modelo.addElement(usuario);
            }
        }
        jl_solicitudes.setModel(modeloSolicitudes);
        jl_eliminarUsuario.setModel(modelo);
        jl_modifiarUsuarios.setModel(modelo);
        jl_mensajes.setModel(modelomensajes);
        jl_noAmigos.setModel(modeloNoamigos);
        jl_amigos.setModel(modeloamigos);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Principal().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar_MP3;
    private javax.swing.JMenu Menu_administrador;
    private javax.swing.ButtonGroup Tipo_UsuarioIngresado;
    private javax.swing.JButton bt_Agenda;
    private javax.swing.JButton bt_AgregarActividad;
    private javax.swing.JButton bt_AgregarNotacion;
    private javax.swing.JButton bt_AgregarTarea;
    private javax.swing.JButton bt_AplicarCambiosFotografia;
    private javax.swing.JButton bt_BuscarFotografiaModificar;
    private javax.swing.JButton bt_EliminarComentario;
    private javax.swing.JButton bt_EnviarSolicitud;
    private javax.swing.JButton bt_LogIn;
    private javax.swing.JButton bt_ModificarAlbum;
    private javax.swing.JButton bt_aceptarSolicitud;
    private javax.swing.JButton bt_buscarFotografia;
    private javax.swing.JButton bt_buscarImagen;
    private javax.swing.JButton bt_buscarVideo;
    private javax.swing.JButton bt_buscarfotografia;
    private javax.swing.JButton bt_eliminarFotografia;
    private javax.swing.JButton bt_ingresarusuario;
    private javax.swing.JButton bt_iniciarsesion;
    private javax.swing.JButton bt_mandarMensaje;
    private javax.swing.JButton bt_modifiarUsuario;
    private javax.swing.JButton bt_modificarComentario;
    private javax.swing.JPanel bt_modificarFotografia;
    private javax.swing.JButton bt_modificarFotrografia;
    private javax.swing.JButton bt_pausa;
    private javax.swing.JButton bt_play;
    private javax.swing.JButton bt_publicar;
    private javax.swing.JButton bt_rechazarSolicitud;
    private javax.swing.JButton bt_stop;
    private javax.swing.JComboBox<String> cbx_mandarMensaje;
    private javax.swing.JComboBox<String> cbx_nuevaRegion;
    private javax.swing.JComboBox<String> cbx_paisIngresar;
    private javax.swing.JComboBox<String> cbx_tipoActividad;
    private javax.swing.JCheckBox chb_recordar;
    private com.toedter.calendar.JDateChooser dc_FechaFotografiaModificar;
    private com.toedter.calendar.JDateChooser dc_fechaComentario;
    private com.toedter.calendar.JDateChooser dc_fechadenacimiento;
    private com.toedter.calendar.JDateChooser dc_nuevaFecha;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JButton jb_agregarUsuario;
    private javax.swing.JButton jb_eliminarUsuario;
    private com.toedter.calendar.JCalendar jc_calendario;
    private javax.swing.JDialog jd_Evento;
    private javax.swing.JDialog jd_ModificarAlbum;
    private javax.swing.JDialog jd_ModificarFotografia;
    private javax.swing.JDialog jd_Reproductor;
    private javax.swing.JDialog jd_ReproductorVideo;
    private javax.swing.JDialog jd_Tarea;
    private javax.swing.JDialog jd_agenda;
    private javax.swing.JDialog jd_agregar_usuario;
    private javax.swing.JDialog jd_albumesModificar;
    private javax.swing.JDialog jd_amigos;
    private javax.swing.JDialog jd_comentariosModificar;
    private javax.swing.JDialog jd_fotografiasModificar;
    private javax.swing.JDialog jd_iniciar_sesion;
    private javax.swing.JDialog jd_leerMensaje;
    private javax.swing.JDialog jd_mensajería;
    private javax.swing.JDialog jd_misSolicitudes;
    private javax.swing.JDialog jd_modificar_usuario;
    private javax.swing.JDialog jd_muro;
    private javax.swing.JDialog jd_publicaciones;
    private javax.swing.JDialog jd_quitar_usuario;
    private javax.swing.JList<String> jl_ModificarFotografias;
    private javax.swing.JList<String> jl_amigos;
    private javax.swing.JList<String> jl_comentarios;
    private javax.swing.JList<String> jl_eliminarUsuario;
    private javax.swing.JList<String> jl_mensajes;
    private javax.swing.JList<String> jl_modifiarUsuarios;
    private javax.swing.JList<String> jl_noAmigos;
    private javax.swing.JList<String> jl_solicitudes;
    private javax.swing.JList<String> jl_videos;
    private javax.swing.JPanel jp_mimuro;
    private javax.swing.JPanel jp_murogeneral;
    private javax.swing.JTree jtree_albumes;
    private javax.swing.JLabel lb_FotografíaModificar;
    private javax.swing.JLabel lb_añadirfotografia;
    private javax.swing.JLabel lb_emisor;
    private javax.swing.JLabel lb_fecha;
    private javax.swing.JLabel lb_fotografia;
    private javax.swing.JLabel lb_fotografiaModificar;
    private javax.swing.JLabel lb_imagenFotografia;
    private javax.swing.JLabel lb_informacionFotografia;
    private javax.swing.JMenuBar mb_componentes;
    private javax.swing.JMenuItem mi_AdministradorAgregarUsuario;
    private javax.swing.JMenuItem mi_AdministradorEliminarUsuario;
    private javax.swing.JMenuItem mi_AdministradorModificarUsuario;
    private javax.swing.JMenu mi_Editar;
    private javax.swing.JMenuItem mi_LogOut;
    private javax.swing.JMenuItem mi_agenda;
    private javax.swing.JMenuItem mi_albumesModificar;
    private javax.swing.JMenuItem mi_comentar;
    private javax.swing.JMenuItem mi_compartir;
    private javax.swing.JMenuItem mi_editarComentarios;
    private javax.swing.JMenuItem mi_eliminar;
    private javax.swing.JMenuItem mi_eliminarFoto;
    private javax.swing.JMenuItem mi_fotografiasModificar;
    private javax.swing.JMenuItem mi_leer;
    private javax.swing.JMenuItem mi_like;
    private javax.swing.JMenuItem mi_mensajeria;
    private javax.swing.JMenuItem mi_misAmigos;
    private javax.swing.JMenuItem mi_modificarAlbum;
    private javax.swing.JMenuItem mi_publicaciones;
    private javax.swing.JMenuItem mi_reproductorMusical;
    private javax.swing.JMenuItem mi_reproductorVideo;
    private javax.swing.JMenuItem mi_solicitudes;
    private javax.swing.JPasswordField pf_contraseñaIngresar;
    private javax.swing.JPasswordField pf_contraseñainiciarsesion;
    private javax.swing.JPasswordField pf_nuevaContraseña;
    private javax.swing.JPopupMenu ppm_DeleteModificate;
    private javax.swing.JPopupMenu ppm_LikeComentShare;
    private javax.swing.JPopupMenu ppm_ReadDelete;
    private javax.swing.JRadioButton rb_administrador;
    private javax.swing.JRadioButton rb_regular;
    private javax.swing.JSpinner sp_hora1;
    private javax.swing.JSpinner sp_hora2;
    private javax.swing.JSpinner sp_minuto1;
    private javax.swing.JSpinner sp_minuto2;
    private javax.swing.JSpinner sp_recordatorio;
    private javax.swing.JTextArea ta_ContenidoModificar;
    private javax.swing.JTextArea ta_comentario;
    private javax.swing.JTextArea ta_contenido;
    private javax.swing.JTextArea ta_contenidoLeerMensaje;
    private javax.swing.JTextArea ta_contenidoMensaje;
    private javax.swing.JTextArea ta_contenidoMostrar;
    private javax.swing.JTextArea ta_notaciones;
    private javax.swing.JButton tb_buscarFotografias;
    private javax.swing.JTextField tf_nicknameIngresar;
    private javax.swing.JTextField tf_nicknameIniciarSesion;
    private javax.swing.JTextField tf_nombrecompleto;
    private javax.swing.JTextField tf_nuevoNickname;
    private javax.swing.JTextField tf_nuevoNombre;
    private javax.swing.JTextField tf_rutaFotografia;
    private javax.swing.JTextField tf_rutaFotografias;
    private javax.swing.JTextField tf_rutaMP3;
    private javax.swing.JTextField tf_rutaModificarAlbum;
    private javax.swing.JTextField tf_rutaModificarFotografia;
    private javax.swing.JTextField tf_rutaVideo;
    private javax.swing.JTextField tf_rutafotografiaModificar;
    private javax.swing.JTextField tf_titulo;
    private javax.swing.JTextField tf_tituloAlbum;
    private javax.swing.JTextField tf_tituloModificarAlbum;
    private javax.swing.JPanel tp_album;
    private javax.swing.JPanel tp_comentario;
    private javax.swing.JPanel tp_fotografia;
    private javax.swing.JTabbedPane tp_publicaciones;
    private javax.swing.JPanel tp_video;
    // End of variables declaration//GEN-END:variables
    ArrayList<Fotografia> album = new ArrayList();
    ArrayList<String> notaciones = new ArrayList();
    DefaultMutableTreeNode nodoModificar;
    Fotografia fotoSeleccionada;
    File MP3, video;
    int posicion;
}
