package com.edu.netbeans.proyectoprograv2jdmg;

// Para leer archivos desde el sistema de archivos.
import com.github.burningwave.core.io.FileInputStream; 
// Mejora la eficiencia de lectura de archivos con un búfer.
import java.io.BufferedInputStream; 

// Permite al usuario seleccionar archivos/directorios.
import javax.swing.JFileChooser; 

// Para mostrar mensajes emergentes (alertas, confirmaciones, etc.).
import javax.swing.JOptionPane; 

// Maneja archivos y directorios.
import java.io.File; 

// Excepción lanzada por errores de entrada/salida.
import java.io.IOException; 

// Modelo de datos para JTable (manejo de filas y columnas). CRUD completo
import javax.swing.table.DefaultTableModel; 

// Para manejar archivos de audio, leer y escribir metadata de archivos de audio.
import org.jaudiotagger.audio.AudioFile; 

// Lee y escribe archivos de audio. Obtener acceso a los metadatos.
import org.jaudiotagger.audio.AudioFileIO; 

// Claves para etiquetas de archivos de audio (artista, álbum, etc.).
import org.jaudiotagger.tag.FieldKey; 

// Representa las etiquetas (metadata) de archivos de audio.
import org.jaudiotagger.tag.Tag; 

// Reproduce archivos MP3, la uso para reproducir lo de audio.
import javazoom.jl.player.Player; 

// Maneja metadatos de varios tipos de archivos. (lo uso para videos)
import org.apache.tika.metadata.Metadata; 

// Detecta el tipo de archivo y extrae contenido o metadata.
import org.apache.tika.parser.AutoDetectParser; 

// Manejador de contenido para parsing en formato SAX.Simple API for XML) normalmente para procesar el contenido durante el parsing.
import org.apache.tika.sax.BodyContentHandler; 

// Excepción para errores durante el análisis de archivos XML/SAX.
import org.xml.sax.SAXException; 

// Clase de la librería VLCJ, Componente para reproducir multimedia incrustado en una ventana.
import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent; 


import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.exif.ExifIFD0Directory;
import java.awt.Image;
//import java.awt.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.swing.ImageIcon;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.JTextField;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author Josue David Martinez Galdámez
 */

//MI CLASE PRINCIPAL
public class ventanaPrincipal extends javax.swing.JFrame {

   private Player reproductorActual;
   private boolean enPausa = false;
   public  String RutaDeAcceso;
   private EmbeddedMediaPlayerComponent mediaPlayerComponent;
   
   //CONSTRUCTOR
    public ventanaPrincipal() {
        
        initComponents();
        
    tablaDatosMyV.getTableHeader().setReorderingAllowed(false);
    tablaDatosMyV.getTableHeader().setResizingAllowed(false);
    tablaDatosFotos.getTableHeader().setReorderingAllowed(false);
    tablaDatosFotos.getTableHeader().setResizingAllowed(false);
    botonVerImagen.setVisible(false);
    botonRegresarMusica.setVisible(false);
    botonReproducirMusica.setVisible(false);
    botonSiguienteMusica.setVisible(false);
    botonPausa.setVisible(false);
    botonReproducirVideo.setVisible(false);  
    verDuplicadosFotos.setVisible(false);
    verDuplicadosMyV.setVisible(false);

    }

    public Player getReproductorActual() {
        return reproductorActual;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Fondo = new javax.swing.JPanel();
        panelAlmacenamiento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textFieldCantidadMusica = new javax.swing.JTextField();
        textFieldCantidadVideo = new javax.swing.JTextField();
        textFieldTotal = new javax.swing.JTextField();
        textFieldFotos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        textFieldMusica2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        textFieldVideo2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        textFieldCantidadFotos = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        textFieldTotal2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        botonRegresarMusica = new javax.swing.JButton();
        botonReproducirMusica = new javax.swing.JButton();
        botonSiguienteMusica = new javax.swing.JButton();
        botonPausa = new javax.swing.JButton();
        botonVerImagen = new javax.swing.JButton();
        botonReproducirVideo = new javax.swing.JButton();
        panelTablas = new javax.swing.JPanel();
        jScrollPaneMyV = new javax.swing.JScrollPane();
        tablaDatosMyV = new javax.swing.JTable();
        jScrollPaneFotos = new javax.swing.JScrollPane();
        tablaDatosFotos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        botonVerDuplicados = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        verDuplicadosFotos = new javax.swing.JButton();
        panelAlmacenamientoDuplicados = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cantidadTotalDuplicados = new javax.swing.JTextField();
        tamañoDuplicadosVideo = new javax.swing.JTextField();
        tamañoTotalDuplicados = new javax.swing.JTextField();
        tamañoDuplicadosFotos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tamañoDuplicadosMusica = new javax.swing.JTextField();
        cantidadDuplicadosMusica = new javax.swing.JTextField();
        cantidadDuplicadosVideo = new javax.swing.JTextField();
        cantidadDuplicadosFotos = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        botonMusica = new javax.swing.JButton();
        botonVideo = new javax.swing.JButton();
        botonFotos = new javax.swing.JButton();
        verDuplicadosMyV = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        seleccionCarpeta = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        ordenXnombre = new javax.swing.JMenuItem();
        ordenarXartista = new javax.swing.JMenuItem();
        ordenarXalbum = new javax.swing.JMenuItem();
        ordenarXgenero = new javax.swing.JMenuItem();
        ordenarXduracion = new javax.swing.JMenuItem();
        ordenarXaño = new javax.swing.JMenuItem();
        ordenarXtamaño = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REPRODUCTOR DE MEDIOS");
        setBackground(new java.awt.Color(153, 0, 51));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Fondo.setBackground(new java.awt.Color(0, 153, 153));
        Panel_Fondo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                Panel_FondoComponentShown(evt);
            }
        });
        Panel_Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAlmacenamiento.setBackground(new java.awt.Color(68, 169, 169));
        panelAlmacenamiento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAlmacenamiento.setAutoscrolls(true);
        panelAlmacenamiento.setEnabled(false);
        panelAlmacenamiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Imágenes:");
        panelAlmacenamiento.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 80, -1));

        textFieldCantidadMusica.setEditable(false);
        textFieldCantidadMusica.setBackground(new java.awt.Color(0, 0, 0));
        textFieldCantidadMusica.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textFieldCantidadMusica.setForeground(new java.awt.Color(255, 255, 255));
        textFieldCantidadMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCantidadMusicaActionPerformed(evt);
            }
        });
        panelAlmacenamiento.add(textFieldCantidadMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 100, 30));

        textFieldCantidadVideo.setEditable(false);
        textFieldCantidadVideo.setBackground(new java.awt.Color(0, 0, 0));
        textFieldCantidadVideo.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textFieldCantidadVideo.setForeground(new java.awt.Color(255, 255, 255));
        textFieldCantidadVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCantidadVideoActionPerformed(evt);
            }
        });
        panelAlmacenamiento.add(textFieldCantidadVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 100, 30));

        textFieldTotal.setEditable(false);
        textFieldTotal.setBackground(new java.awt.Color(0, 0, 0));
        textFieldTotal.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textFieldTotal.setForeground(new java.awt.Color(255, 255, 255));
        panelAlmacenamiento.add(textFieldTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 100, -1));

        textFieldFotos.setEditable(false);
        textFieldFotos.setBackground(new java.awt.Color(0, 0, 0));
        textFieldFotos.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textFieldFotos.setForeground(new java.awt.Color(255, 255, 255));
        textFieldFotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldFotosActionPerformed(evt);
            }
        });
        panelAlmacenamiento.add(textFieldFotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 100, 30));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("ALMACENAMIENTO GENERAL");
        panelAlmacenamiento.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 200, 20));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad:");
        panelAlmacenamiento.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 70, 30));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Video:");
        panelAlmacenamiento.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 60, -1));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Musica:");
        panelAlmacenamiento.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 60, -1));

        textFieldMusica2.setEditable(false);
        textFieldMusica2.setBackground(new java.awt.Color(0, 0, 0));
        textFieldMusica2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textFieldMusica2.setForeground(new java.awt.Color(255, 255, 255));
        textFieldMusica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldMusica2ActionPerformed(evt);
            }
        });
        panelAlmacenamiento.add(textFieldMusica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 100, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jSeparator1.setEnabled(false);
        jSeparator1.setOpaque(true);
        panelAlmacenamiento.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 250, 10));

        textFieldVideo2.setEditable(false);
        textFieldVideo2.setBackground(new java.awt.Color(0, 0, 0));
        textFieldVideo2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textFieldVideo2.setForeground(new java.awt.Color(255, 255, 255));
        textFieldVideo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldVideo2ActionPerformed(evt);
            }
        });
        panelAlmacenamiento.add(textFieldVideo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 100, 30));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Cantidad:");
        panelAlmacenamiento.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jSeparator2.setEnabled(false);
        jSeparator2.setOpaque(true);
        panelAlmacenamiento.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 250, 10));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Total Peso:");
        panelAlmacenamiento.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 90, 30));

        textFieldCantidadFotos.setEditable(false);
        textFieldCantidadFotos.setBackground(new java.awt.Color(0, 0, 0));
        textFieldCantidadFotos.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textFieldCantidadFotos.setForeground(new java.awt.Color(255, 255, 255));
        textFieldCantidadFotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCantidadFotosActionPerformed(evt);
            }
        });
        panelAlmacenamiento.add(textFieldCantidadFotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 100, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jSeparator3.setEnabled(false);
        jSeparator3.setOpaque(true);
        panelAlmacenamiento.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 250, 10));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Cantidad:");
        panelAlmacenamiento.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 70, 30));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Cant. Total:");
        panelAlmacenamiento.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 90, 30));

        textFieldTotal2.setEditable(false);
        textFieldTotal2.setBackground(new java.awt.Color(0, 0, 0));
        textFieldTotal2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textFieldTotal2.setForeground(new java.awt.Color(255, 255, 255));
        panelAlmacenamiento.add(textFieldTotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 100, -1));

        Panel_Fondo.add(panelAlmacenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 230, 370));

        jPanel2.setBackground(new java.awt.Color(68, 169, 169));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonRegresarMusica.setBackground(new java.awt.Color(0, 102, 102));
        botonRegresarMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/paso-atras.png"))); // NOI18N
        botonRegresarMusica.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonRegresarMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegresarMusica.setEnabled(false);
        botonRegresarMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarMusicaActionPerformed(evt);
            }
        });
        jPanel2.add(botonRegresarMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        botonReproducirMusica.setBackground(new java.awt.Color(0, 102, 102));
        botonReproducirMusica.setForeground(new java.awt.Color(255, 255, 255));
        botonReproducirMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tocar.png"))); // NOI18N
        botonReproducirMusica.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonReproducirMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonReproducirMusica.setEnabled(false);
        botonReproducirMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReproducirMusicaActionPerformed(evt);
            }
        });
        jPanel2.add(botonReproducirMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 50, 40));

        botonSiguienteMusica.setBackground(new java.awt.Color(0, 102, 102));
        botonSiguienteMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/un-paso-adelante.png"))); // NOI18N
        botonSiguienteMusica.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonSiguienteMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSiguienteMusica.setEnabled(false);
        botonSiguienteMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteMusicaActionPerformed(evt);
            }
        });
        jPanel2.add(botonSiguienteMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 40, 40));

        botonPausa.setBackground(new java.awt.Color(0, 102, 102));
        botonPausa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/circulo-de-pausa.png"))); // NOI18N
        botonPausa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonPausa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonPausa.setEnabled(false);
        botonPausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPausaActionPerformed(evt);
            }
        });
        jPanel2.add(botonPausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 50, 40));

        botonVerImagen.setBackground(new java.awt.Color(0, 102, 102));
        botonVerImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/verImagen.png"))); // NOI18N
        botonVerImagen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonVerImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVerImagen.setEnabled(false);
        botonVerImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerImagenActionPerformed(evt);
            }
        });
        jPanel2.add(botonVerImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 60, 40));

        botonReproducirVideo.setBackground(new java.awt.Color(0, 51, 51));
        botonReproducirVideo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonReproducirVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/play1.png"))); // NOI18N
        botonReproducirVideo.setToolTipText("");
        botonReproducirVideo.setEnabled(false);
        botonReproducirVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReproducirVideoActionPerformed(evt);
            }
        });
        jPanel2.add(botonReproducirVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 60, 40));

        Panel_Fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 1060, 40));

        panelTablas.setBackground(new java.awt.Color(0, 102, 102));
        panelTablas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelTablas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPaneMyV.setBackground(new java.awt.Color(0, 51, 51));

        tablaDatosMyV.setBackground(new java.awt.Color(68, 169, 169));
        tablaDatosMyV.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaDatosMyV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaDatosMyV.setForeground(new java.awt.Color(255, 255, 255));
        tablaDatosMyV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Ext.", "Artista", "Álbum", "Género", "Duración", "Año", "Ruta", "Tamaño"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDatosMyV.setFocusable(false);
        tablaDatosMyV.setGridColor(new java.awt.Color(255, 255, 255));
        tablaDatosMyV.setSelectionBackground(new java.awt.Color(0, 51, 51));
        tablaDatosMyV.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaDatosMyV.setShowGrid(true);
        jScrollPaneMyV.setViewportView(tablaDatosMyV);
        if (tablaDatosMyV.getColumnModel().getColumnCount() > 0) {
            tablaDatosMyV.getColumnModel().getColumn(0).setMinWidth(300);
            tablaDatosMyV.getColumnModel().getColumn(0).setMaxWidth(400);
            tablaDatosMyV.getColumnModel().getColumn(7).setMinWidth(200);
            tablaDatosMyV.getColumnModel().getColumn(7).setMaxWidth(300);
        }

        panelTablas.add(jScrollPaneMyV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1040, 220));

        jScrollPaneFotos.setBackground(new java.awt.Color(102, 0, 0));

        tablaDatosFotos.setBackground(new java.awt.Color(68, 169, 169));
        tablaDatosFotos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.yellow, null, null));
        tablaDatosFotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Extensión", "Ruta", "Fecha Creación", "Fecha Modif", "Tamaño", "Dispositivo", "Modelo Disp."
            }
        ));
        tablaDatosFotos.setFocusable(false);
        tablaDatosFotos.setGridColor(new java.awt.Color(255, 255, 255));
        tablaDatosFotos.setSelectionBackground(new java.awt.Color(0, 51, 51));
        tablaDatosFotos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaDatosFotos.setShowGrid(true);
        jScrollPaneFotos.setViewportView(tablaDatosFotos);

        panelTablas.add(jScrollPaneFotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1040, 220));

        Panel_Fondo.add(panelTablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 1060, 240));

        jTextPane1.setBackground(new java.awt.Color(0, 102, 102));
        jTextPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextPane1.setContentType("ACÁ IRA EL KARAOKE"); // NOI18N
        jTextPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane1.setText("ACÁ IRA LA LETRA DE LAS CANCIONES");
        jScrollPane3.setViewportView(jTextPane1);

        Panel_Fondo.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 840, 30));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 32)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("REPRODUCTOR MULTIMEDIA JOSH");
        Panel_Fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 670, -1));

        botonVerDuplicados.setBackground(new java.awt.Color(51, 51, 51));
        botonVerDuplicados.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        botonVerDuplicados.setForeground(new java.awt.Color(255, 255, 255));
        botonVerDuplicados.setText("VER DUPLICADOS");
        botonVerDuplicados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonVerDuplicados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVerDuplicados.setEnabled(false);
        botonVerDuplicados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerDuplicadosActionPerformed(evt);
            }
        });
        Panel_Fondo.add(botonVerDuplicados, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 40, 30));

        jProgressBar1.setBackground(new java.awt.Color(0, 0, 204));
        Panel_Fondo.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 1060, 10));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setText("Ingresa tu búsqueda aquí");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        Panel_Fondo.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 260, 30));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton1.setText("+ PLAYLIST");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel_Fondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 80, 30));

        jButton2.setBackground(new java.awt.Color(102, 0, 51));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton2.setText("OK");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel_Fondo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 70, 30));

        jList2.setBackground(new java.awt.Color(0, 51, 51));
        jList2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Playlist1", "Playlist2", "Playlist3", "Playlist4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        Panel_Fondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 200));

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton3.setText("MÁS PESADOS");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel_Fondo.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, 110, 40));

        verDuplicadosFotos.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        verDuplicadosFotos.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        verDuplicadosFotos.setForeground(new java.awt.Color(255, 255, 255));
        verDuplicadosFotos.setText("DUPLICADOS");
        verDuplicadosFotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDuplicadosFotosActionPerformed(evt);
            }
        });
        Panel_Fondo.add(verDuplicadosFotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 250, 130, 40));

        panelAlmacenamientoDuplicados.setBackground(new java.awt.Color(51, 51, 51));
        panelAlmacenamientoDuplicados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAlmacenamientoDuplicados.setAutoscrolls(true);
        panelAlmacenamientoDuplicados.setEnabled(false);
        panelAlmacenamientoDuplicados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fotos:");
        panelAlmacenamientoDuplicados.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 50, -1));

        cantidadTotalDuplicados.setEditable(false);
        cantidadTotalDuplicados.setBackground(new java.awt.Color(0, 0, 0));
        cantidadTotalDuplicados.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        cantidadTotalDuplicados.setForeground(new java.awt.Color(255, 255, 255));
        cantidadTotalDuplicados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadTotalDuplicadosActionPerformed(evt);
            }
        });
        panelAlmacenamientoDuplicados.add(cantidadTotalDuplicados, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 60, 30));

        tamañoDuplicadosVideo.setEditable(false);
        tamañoDuplicadosVideo.setBackground(new java.awt.Color(0, 0, 0));
        tamañoDuplicadosVideo.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        panelAlmacenamientoDuplicados.add(tamañoDuplicadosVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 70, 30));

        tamañoTotalDuplicados.setEditable(false);
        tamañoTotalDuplicados.setBackground(new java.awt.Color(0, 0, 0));
        tamañoTotalDuplicados.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        panelAlmacenamientoDuplicados.add(tamañoTotalDuplicados, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 70, 30));

        tamañoDuplicadosFotos.setEditable(false);
        tamañoDuplicadosFotos.setBackground(new java.awt.Color(0, 0, 0));
        tamañoDuplicadosFotos.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        tamañoDuplicadosFotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamañoDuplicadosFotosActionPerformed(evt);
            }
        });
        panelAlmacenamientoDuplicados.add(tamañoDuplicadosFotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 70, 30));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CANTIDAD");
        panelAlmacenamientoDuplicados.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 80, 20));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Totales:");
        panelAlmacenamientoDuplicados.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 90, 30));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Música:");
        panelAlmacenamientoDuplicados.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, -1));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Video:");
        panelAlmacenamientoDuplicados.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 50, -1));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TAMAÑO");
        panelAlmacenamientoDuplicados.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 70, 20));

        tamañoDuplicadosMusica.setEditable(false);
        tamañoDuplicadosMusica.setBackground(new java.awt.Color(0, 0, 0));
        tamañoDuplicadosMusica.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        tamañoDuplicadosMusica.setForeground(new java.awt.Color(255, 255, 255));
        tamañoDuplicadosMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamañoDuplicadosMusicaActionPerformed(evt);
            }
        });
        panelAlmacenamientoDuplicados.add(tamañoDuplicadosMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 70, 30));

        cantidadDuplicadosMusica.setEditable(false);
        cantidadDuplicadosMusica.setBackground(new java.awt.Color(0, 0, 0));
        cantidadDuplicadosMusica.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        cantidadDuplicadosMusica.setForeground(new java.awt.Color(255, 255, 255));
        cantidadDuplicadosMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadDuplicadosMusicaActionPerformed(evt);
            }
        });
        panelAlmacenamientoDuplicados.add(cantidadDuplicadosMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 60, 30));

        cantidadDuplicadosVideo.setEditable(false);
        cantidadDuplicadosVideo.setBackground(new java.awt.Color(0, 0, 0));
        cantidadDuplicadosVideo.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        cantidadDuplicadosVideo.setForeground(new java.awt.Color(255, 255, 255));
        cantidadDuplicadosVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadDuplicadosVideoActionPerformed(evt);
            }
        });
        panelAlmacenamientoDuplicados.add(cantidadDuplicadosVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 60, 30));

        cantidadDuplicadosFotos.setEditable(false);
        cantidadDuplicadosFotos.setBackground(new java.awt.Color(0, 0, 0));
        cantidadDuplicadosFotos.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        cantidadDuplicadosFotos.setForeground(new java.awt.Color(255, 255, 255));
        cantidadDuplicadosFotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadDuplicadosFotosActionPerformed(evt);
            }
        });
        panelAlmacenamientoDuplicados.add(cantidadDuplicadosFotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 60, 30));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 102));
        jLabel15.setText("ALMACENAMIENTO DUPLICADOS");
        panelAlmacenamientoDuplicados.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Panel_Fondo.add(panelAlmacenamientoDuplicados, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 380, 230, 240));

        botonMusica.setBackground(new java.awt.Color(0, 102, 102));
        botonMusica.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonMusica.setForeground(new java.awt.Color(255, 255, 255));
        botonMusica.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josue\\OneDrive - Universidad Mariano Gálvez\\4. CUARTO SEMESTRE\\PROGRAMACION II\\Proyecto_PrograV3\\src\\main\\resources\\iconos\\musica-alternativa.png")); // NOI18N
        botonMusica.setText("MUSICA");
        botonMusica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMusicaActionPerformed(evt);
            }
        });
        Panel_Fondo.add(botonMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 130, 40));

        botonVideo.setBackground(new java.awt.Color(0, 102, 102));
        botonVideo.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonVideo.setForeground(new java.awt.Color(255, 255, 255));
        botonVideo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josue\\OneDrive - Universidad Mariano Gálvez\\4. CUARTO SEMESTRE\\PROGRAMACION II\\Proyecto_PrograV3\\src\\main\\resources\\iconos\\videocamara.png")); // NOI18N
        botonVideo.setText("VIDEO");
        botonVideo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonVideo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVideoActionPerformed(evt);
            }
        });
        Panel_Fondo.add(botonVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 130, 40));

        botonFotos.setBackground(new java.awt.Color(0, 102, 102));
        botonFotos.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonFotos.setForeground(new java.awt.Color(255, 255, 255));
        botonFotos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josue\\OneDrive - Universidad Mariano Gálvez\\4. CUARTO SEMESTRE\\PROGRAMACION II\\Proyecto_PrograV3\\src\\main\\resources\\iconos\\FOTOS.png")); // NOI18N
        botonFotos.setText("FOTOS");
        botonFotos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonFotos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonFotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFotosActionPerformed(evt);
            }
        });
        Panel_Fondo.add(botonFotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 130, 40));

        verDuplicadosMyV.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        verDuplicadosMyV.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        verDuplicadosMyV.setForeground(new java.awt.Color(255, 255, 255));
        verDuplicadosMyV.setText("DUPLICADOS");
        verDuplicadosMyV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDuplicadosMyVActionPerformed(evt);
            }
        });
        Panel_Fondo.add(verDuplicadosMyV, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 300, 130, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josue\\OneDrive - Universidad Mariano Gálvez\\4. CUARTO SEMESTRE\\PROGRAMACION II\\Proyecto_PrograV3\\src\\main\\resources\\fondos\\paletota.jpg")); // NOI18N
        jLabel3.setInheritsPopupMenu(false);
        Panel_Fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -520, 1830, 1640));

        getContentPane().add(Panel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, -1, 670));

        Archivo.setText("Archivo");

        seleccionCarpeta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        seleccionCarpeta.setText("Seleccionar Carpeta");
        seleccionCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionCarpetaActionPerformed(evt);
            }
        });
        Archivo.add(seleccionCarpeta);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        Archivo.add(salir);

        jMenuBar1.add(Archivo);

        jMenu1.setText("Ordenar");

        ordenXnombre.setText("Por Nombre A-Z");
        ordenXnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenXnombreActionPerformed(evt);
            }
        });
        jMenu1.add(ordenXnombre);

        ordenarXartista.setText("Por Artista A-Z");
        ordenarXartista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarXartistaActionPerformed(evt);
            }
        });
        jMenu1.add(ordenarXartista);

        ordenarXalbum.setText("Por Álbum A-Z");
        ordenarXalbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarXalbumActionPerformed(evt);
            }
        });
        jMenu1.add(ordenarXalbum);

        ordenarXgenero.setText("Por Género A-Z");
        ordenarXgenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarXgeneroActionPerformed(evt);
            }
        });
        jMenu1.add(ordenarXgenero);

        ordenarXduracion.setText("Por Duración A-Z");
        ordenarXduracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarXduracionActionPerformed(evt);
            }
        });
        jMenu1.add(ordenarXduracion);

        ordenarXaño.setText("Por Año A-Z");
        ordenarXaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarXañoActionPerformed(evt);
            }
        });
        jMenu1.add(ordenarXaño);

        ordenarXtamaño.setText("Por Tamaño A-Z");
        ordenarXtamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarXtamañoActionPerformed(evt);
            }
        });
        jMenu1.add(ordenarXtamaño);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMusicaActionPerformed
        verDuplicadosFotos.setVisible(false);
        verDuplicadosMyV.setVisible(true);
        verDuplicadosMyV.setEnabled(true);
        
       //TABLA FOTOS - OCULTAR
       jScrollPaneFotos.setVisible(false);
       tablaDatosFotos.setVisible(false);
       
       //TABLA MUSICA Y VIDEOS - VER
       jScrollPaneMyV.setVisible(true);
       tablaDatosMyV.setVisible(true);
       
       
       //BOTONES MUSICA - OCULTAR E INACTIVAR ---**
       botonRegresarMusica.setEnabled(true);
       botonReproducirMusica.setEnabled(true);
       botonSiguienteMusica.setEnabled(true);
       botonPausa.setEnabled(true);
       botonRegresarMusica.setVisible(true);
       botonReproducirMusica.setVisible(true);
       botonSiguienteMusica.setVisible(true);
       botonPausa.setVisible(true);
       
       //BOTONES FOTOS - OCULTAR E INACTIVAR
       botonVerImagen.setVisible(false);
       botonVerImagen.setEnabled(false);
               
       //BOTON VIDEO - OCULTAR E INACTIVAR
       botonReproducirVideo.setVisible(false);
       botonReproducirVideo.setEnabled(false);
       
       
    // Verifica si la ruta de acceso está vacía o no ha sido seleccionada   
    if (RutaDeAcceso == null || RutaDeAcceso.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona primero una carpeta.");
        return;
    }
    
    // Crear el modelo de tabla y limpiar cualquier dato previo
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosMyV.getModel(); //obtener el modelo de datos de la Jtable
    modeloTabla.setRowCount(0); // Limpiar datos existentes

    // Llamar al método para buscar archivos .mp3
    buscarArchivosMP3(new File(RutaDeAcceso), modeloTabla);
}

private double calcularPesoMP3(File carpeta) {
    double totalSizeGB = 0.0;
    //Metodo Recursivo
    // Verifica si la ruta es un directorio
    if (carpeta.isDirectory()) {
        File[] archivos = carpeta.listFiles(); //Obtener un arreglo de File con todos los archivos y subdirectorios que contiene la carpeta.
        if (archivos != null) {
            //recorrer cada archivo de la carpeta
            for (File archivo : archivos) {
                if (archivo.isFile() && archivo.getName().toLowerCase().endsWith(".mp3")) { //verificar extensión de archivo.
                    // Sumar el tamaño del archivo en GB
                    totalSizeGB += archivo.length() / (1024.0 * 1024.0 * 1024.0); // Convertir a GB División de Bytes / 1024^3 (bytes → kilobytes → megabytes → gigabytes).
                } else if (archivo.isDirectory()) {
                    // Llamar recursivamente a la misma función para subdirectorios
                    totalSizeGB += calcularPesoMP3(archivo);
                }
            }
        }
    }
    return totalSizeGB;
}

private double calcularPesoMP4(File carpeta) {
    //Lo mismo que MP3 pero con MP4.
    double totalSizeGB = 0.0;

    // Verifica si la ruta es un directorio
    if (carpeta.isDirectory()) {
        File[] archivos = carpeta.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isFile() && archivo.getName().toLowerCase().endsWith(".mp4")) {
                    // Sumar el tamaño del archivo en GB
                    totalSizeGB += archivo.length() / (1024.0 * 1024.0 * 1024.0); // Convertir a GB
                } else if (archivo.isDirectory()) {
                    // Llamar recursivamente a la misma función para subdirectorios
                    totalSizeGB += calcularPesoMP4(archivo);
                }
            }
        }
    }
    return totalSizeGB;
}
    
private double calcularPesoImagenes(File carpeta) {
    double totalSizeGB = 0.0;

    // Verifica si la ruta es un directorio
    if (carpeta.isDirectory()) {
        File[] archivos = carpeta.listFiles(); // Obtiene un arreglo de File con todos los archivos y subdirectorios que contiene la carpeta.
        if (archivos != null) {
            // Recorre cada archivo de la carpeta
            for (File archivo : archivos) {
                if (archivo.isFile() && (archivo.getName().toLowerCase().endsWith(".jpg") || archivo.getName().toLowerCase().endsWith(".png"))) { // Verifica las extensiones de imagen
                    // Sumar el tamaño del archivo en GB
                    totalSizeGB += archivo.length() / (1024.0 * 1024.0 * 1024.0); // Convertir a GB
                } else if (archivo.isDirectory()) {
                    // Llamar recursivamente a la misma función para subdirectorios
                    totalSizeGB += calcularPesoImagenes(archivo);
                }
            }
        }
    }
    return totalSizeGB;
}


private void buscarArchivosMP3(File directorio, DefaultTableModel modeloTabla) {
    // Obtener la lista de archivos y directorios dentro del directorio proporcionado
    File[] archivos = directorio.listFiles();

    // Verificar que la carpeta no esté vacía
    if (archivos != null) {
        // Recorrer todos los archivos y carpetas
        for (File archivo : archivos) {
            // Si es un directorio, buscar archivos MP3 de manera recursiva
            if (archivo.isDirectory()) {
                buscarArchivosMP3(archivo, modeloTabla);
            } 
            // Si es un archivo MP3, procesarlo
            else if (archivo.isFile() && archivo.getName().toLowerCase().endsWith(".mp3")) {
                try {
                    // Leer el archivo de audio utilizando la librería jaudiotagger (librería externa)
                    AudioFile audioFile = AudioFileIO.read(archivo);
                    
                    // Obtener los metadatos (tags) del archivo
                    Tag tag = audioFile.getTag();

                    // Asignar los valores de los metadatos (o "Desconocido" si no están disponibles)
                    String nombre = archivo.getName();
                    String artista = tag != null ? tag.getFirst(FieldKey.ARTIST) : "Desconocido";
                    String album = tag != null ? tag.getFirst(FieldKey.ALBUM) : "Desconocido";
                    String genero = tag != null ? tag.getFirst(FieldKey.GENRE) : "Desconocido";
                    String duracion = audioFile.getAudioHeader().getTrackLength() + " segundos";
                    String año = tag != null ? tag.getFirst(FieldKey.YEAR) : "Desconocido";
                    
                    double tamañoMB= archivo.length()/(1024.0*1024.0);

                    // Crear una fila de datos para agregarla al modelo de tabla
                    Object[] fila = {
                        nombre,             // Nombre del archivo
                        "mp3",              // Extensión del archivo
                        artista,            // Artista
                        album,              // Álbum
                        genero,             // Género
                        duracion,           // Duración en segundos
                        año,                // Año de publicación
                        archivo.getAbsolutePath(),  // Ruta completa del archivo
                        String.format("%.2f MB", tamañoMB)    // Tamaño del archivo en MB
                    };

                    // Agregar la fila al modelo de la tabla
                    modeloTabla.addRow(fila);
                } catch (Exception e) {
                    // Manejar cualquier error que ocurra al leer los metadatos
                    System.err.println("Error al leer metadatos de " + archivo.getName() + ": " + e.getMessage());
                }
            }
        }
    }
    }//GEN-LAST:event_botonMusicaActionPerformed

public void buscarArchivosMP4(File directorio, DefaultTableModel modeloTabla) {
// Obtener la lista de archivos y directorios dentro del directorio proporcionado
    File[] archivos = directorio.listFiles();

    // Verificar que el directorio no esté vacío
    if (archivos != null) {
        // Recorrer todos los archivos y carpetas
        for (File archivo : archivos) {
            // Si es un directorio, buscar archivos MP4 de manera recursiva
            if (archivo.isDirectory()) {
                buscarArchivosMP4(archivo, modeloTabla);
            } 
            // Si es un archivo MP4, procesarlo
            else if (archivo.isFile() && archivo.getName().toLowerCase().endsWith(".mp4")) {
                // Abrir un FileInputStream para leer el archivo
                try (FileInputStream inputStream = new FileInputStream(archivo)) {
                    // Crear un manejador para manejar el contenido
                    BodyContentHandler handler = new BodyContentHandler();
                    // Crear un objeto Metadata para almacenar los metadatos
                    Metadata metadata = new Metadata();
                    // Crear un parser para detectar el tipo de archivo
                    AutoDetectParser parser = new AutoDetectParser();

                    // Analizar el archivo usando el parser de Tika
                    parser.parse(inputStream, handler, metadata);

                    // Obtener los metadatos necesarios
                    String nombre = archivo.getName();  // Nombre del archivo
                    String extension = "mp4";            // Extensión del archivo
                    // Obtener el artista, o "Desconocido" si no está disponible
                    String artista = metadata.get("xmpDM:artist") != null ? metadata.get("xmpDM:artist") : "Desconocido";
                    // Obtener el álbum, o "Desconocido" si no está disponible
                    String album = metadata.get("xmpDM:album") != null ? metadata.get("xmpDM:album") : "Desconocido";
                    // Obtener el género, o "Desconocido" si no está disponible
                    String genero = metadata.get("xmpDM:genre") != null ? metadata.get("xmpDM:genre") : "Desconocido";
                    // Obtener la duración en segundos, o "Desconocido" si no está disponible
                    String duracion = metadata.get("xmpDM:duration") != null ? 
                        (Double.parseDouble(metadata.get("xmpDM:duration")) / 1000) + " segundos" : "Desconocido";
                    // Obtener el año de lanzamiento, o "Desconocido" si no está disponible
                    String año = metadata.get("xmpDM:releaseDate") != null ? metadata.get("xmpDM:releaseDate") : "Desconocido";
                    String ruta = archivo.getAbsolutePath(); // Ruta completa del archivo
                    long tamaño = archivo.length();           // Tamaño del archivo en bytes

                    // Crear una fila con los datos obtenidos
                    Object[] fila = {
                        nombre,        // Nombre del archivo
                        extension,     // Extensión del archivo
                        artista,       // Artista
                        album,         // Álbum
                        genero,        // Género
                        duracion,      // Duración en segundos
                        año,           // Año de publicación
                        ruta,          // Ruta completa del archivo
                        tamaño         // Tamaño del archivo en bytes
                    };

                    // Añadir la fila al modelo de la tabla
                    modeloTabla.addRow(fila);
                } catch (IOException | SAXException | org.apache.tika.exception.TikaException e) {
                    // Manejar cualquier error que ocurra al leer los metadatos
                    System.err.println("Error al leer metadatos de " + archivo.getName() + ": " + e.getMessage());
                }
            }
        }
    }
}

public void buscarArchivosImagen(File directorio, DefaultTableModel modeloTabla) {
    File[] archivos = directorio.listFiles();

    if (archivos != null) {
        for (File archivo : archivos) {
            if (archivo.isDirectory()) {
                buscarArchivosImagen(archivo, modeloTabla);
            } else if (archivo.isFile() && (archivo.getName().toLowerCase().endsWith(".jpg") || archivo.getName().toLowerCase().endsWith(".png"))) {
                try {
                    // Extraer la metadata de la imagen
                    com.drew.metadata.Metadata metadata = ImageMetadataReader.readMetadata(archivo);

                    // Información básica del archivo
                    String nombre = archivo.getName();
                    String extension = nombre.substring(nombre.lastIndexOf(".") + 1);
                    String ruta = archivo.getAbsolutePath();
                    long tamaño = archivo.length(); // En bytes
                    Path filePath = archivo.toPath();
                    BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);
                    String fechaCreacion = attr.creationTime().toString();
                    String fechaModificacion = attr.lastModifiedTime().toString();

                    // Información del dispositivo y modelo (si está disponible)
                    String dispositivo = "Desconocido";
                    String modelo = "Desconocido";
                    
                    for (Directory directory : metadata.getDirectories()) {
                        for (com.drew.metadata.Tag tag : directory.getTags()) {
                            // Imprimir todos los metadatos (opcional, para depuración)
                            System.out.println(tag);

                            // Buscar campos específicos
                            if (directory.containsTag(ExifIFD0Directory.TAG_MAKE)) {
                                dispositivo = directory.getString(ExifIFD0Directory.TAG_MAKE); // Marca del dispositivo
                            }
                            if (directory.containsTag(ExifIFD0Directory.TAG_MODEL)) {
                                modelo = directory.getString(ExifIFD0Directory.TAG_MODEL); // Modelo del dispositivo
                            }
                        }
                    }

                    // Crear fila para la tabla
                    Object[] fila = {
                        nombre,
                        extension,
                        ruta,
                        fechaCreacion,
                        fechaModificacion,
                        tamaño / (1024 * 1024) + " MB", // Tamaño en MB
                        dispositivo,
                        modelo
                    };

                    // Añadir la fila a la tabla
                    modeloTabla.addRow(fila);

                } catch (ImageProcessingException | IOException e) {
                      e.printStackTrace();
                }
            }
        }
    }
}
    private void textFieldCantidadMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCantidadMusicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCantidadMusicaActionPerformed

    private void seleccionCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionCarpetaActionPerformed
    // Clase de Swing que proporciona un diálogo para seleccionar archivos y directorios.
    JFileChooser selectorCarpeta = new JFileChooser(); 
    selectorCarpeta.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); //Mostrar solo directorios, evitando que el usuario seleccione archivos.
    
    // Mostrar el diálogo para seleccionar la carpeta
    int resultado = selectorCarpeta.showOpenDialog(this); //y guarda resultado de la selección
    
    // Verificar si el usuario seleccionó una carpeta
    if (resultado == JFileChooser.APPROVE_OPTION) {
        // Obtener la carpeta seleccionada
        File carpetaSeleccionada = selectorCarpeta.getSelectedFile();
        
        // Almacenar la ruta de la carpeta en la variable global
        RutaDeAcceso = carpetaSeleccionada.getAbsolutePath();
        
        // Mostrar un mensaje al usuario con la ruta seleccionada
        JOptionPane.showMessageDialog(this, "Carpeta seleccionada: " + RutaDeAcceso);
    } else {
        // El usuario no seleccionó ninguna carpeta
        JOptionPane.showMessageDialog(this, "No se seleccionó ninguna carpeta.");
    }
    
    // Calcular el peso total de archivos .mp3 en la carpeta seleccionada
    double totalSizeGB = calcularPesoMP3(new File(RutaDeAcceso));
    // Mostrar el peso total en el JTextField
    textFieldCantidadMusica.setText(String.format("%.2f GB", totalSizeGB));
    
    // Calcular el peso total de archivos .mp4 en la carpeta seleccionada
    double totalSizeGBmp4 = calcularPesoMP4(new File(RutaDeAcceso));
    // Mostrar el peso total en el JTextField
    textFieldCantidadVideo.setText(String.format("%.2f GB", totalSizeGBmp4));
    
        // Calcular el peso total de archivos de imagen en la carpeta seleccionada
    double totalSizeGBJPEG = calcularPesoImagenes(new File(RutaDeAcceso));
    // Mostrar el peso total en el JTextField
    textFieldFotos.setText(String.format("%.2f GB", totalSizeGBJPEG));
    
    
    //TOTAL DE PESO
    // Calcular el peso total
    double totalSizeGBTotal = totalSizeGB + totalSizeGBmp4 + totalSizeGBJPEG;
    // Mostrar el peso total en el JTextField total
    textFieldTotal.setText(String.format("%.2f GB", totalSizeGBTotal));
    
    }//GEN-LAST:event_seleccionCarpetaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
         System.exit(0);
    }//GEN-LAST:event_salirActionPerformed
       

    private void botonReproducirMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReproducirMusicaActionPerformed

        // Obtener el índice de la fila seleccionada en el JTable
        int filaSeleccionada = tablaDatosMyV.getSelectedRow();

        // Verificar si hay una fila seleccionada
        if (filaSeleccionada != -1) {
            // Obtener la ruta del archivo de la columna correspondiente
            String rutaArchivo = (String) tablaDatosMyV.getValueAt(filaSeleccionada, 7); //Ruta está en la columna 7, (índice basado en 0)

            // Comprobar si es un archivo .mp3
            if (rutaArchivo.toLowerCase().endsWith(".mp3")) {
                try {
                    // Si hay un reproductor en uso, detenerlo
                    if (reproductorActual != null) {
                        reproductorActual.close(); // Detener el reproductor anterior
                    }

                    // Crear un nuevo reproductor
                    FileInputStream fis = new FileInputStream(rutaArchivo);
                    BufferedInputStream bis = new BufferedInputStream(fis);
                    reproductorActual = new Player(bis); // Nueva instancia del reproductor

                    // Ejecutar el reproductor en un hilo separado para no bloquear la interfaz gráfica
                    new Thread(() -> {
                        try {
                            reproductorActual.play(); // Reproducir la canción
                        } catch (Exception e) {
                            System.out.println("Error al reproducir el archivo: " + e.getMessage());
                        }
                    }).start();
                } catch (Exception e) {
                    // Mostrar mensaje de error si hay un problema al crear o reproducir el reproductor
                    JOptionPane.showMessageDialog(this, "Error al reproducir la canción: " + e.getMessage());
                }
            } else {
                // Mostrar mensaje si el archivo no es compatible
                JOptionPane.showMessageDialog(this, "El archivo seleccionado no es un archivo de audio compatible.");
            }
        } else {
             // Mensaje si no se seleccionó ninguna canción
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una canción de la lista.");
        }

    }//GEN-LAST:event_botonReproducirMusicaActionPerformed

    private void botonSiguienteMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteMusicaActionPerformed
     // Obtener el índice de la fila seleccionada en el JTable
    int filaSeleccionada = tablaDatosMyV.getSelectedRow();

    // Verificar si hay una fila seleccionada
    if (filaSeleccionada != -1) {
        // Calcular el índice de la siguiente canción
        int siguienteIndice = filaSeleccionada + 1;

        // Verificar si el siguiente índice está dentro del rango
        if (siguienteIndice < tablaDatosMyV.getRowCount()) {
            // Seleccionar la siguiente canción
            tablaDatosMyV.setRowSelectionInterval(siguienteIndice, siguienteIndice);
            String rutaArchivo = (String) tablaDatosMyV.getValueAt(siguienteIndice, 7); // Asumiendo que la ruta está en la columna 7

            // Comprobar si es un archivo .mp3
            if (rutaArchivo.toLowerCase().endsWith(".mp3")) {
                try {
                    // Si hay un reproductor en uso, detenerlo
                    if (reproductorActual != null) {
                        reproductorActual.close(); // Detener el reproductor anterior
                    }

                    // Crear un nuevo reproductor para la siguiente canción
                    FileInputStream fis = new FileInputStream(rutaArchivo);
                    BufferedInputStream bis = new BufferedInputStream(fis);
                    reproductorActual = new Player(bis); // Nueva instancia del reproductor

                    // Ejecutar el reproductor en un hilo separado para no bloquear la interfaz gráfica
                    new Thread(() -> {
                        try {
                            reproductorActual.play(); // Reproducir la canción
                        } catch (Exception e) {
                            System.out.println("Error al reproducir el archivo: " + e.getMessage());
                        }
                    }).start();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error al reproducir la canción: " + e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "El archivo seleccionado no es un archivo de audio compatible.");
            }
        } else {
            // Si ya está en la última canción, mostrar un mensaje
            JOptionPane.showMessageDialog(this, "Ya estás en la última canción.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una canción de la lista primero.");
    }
    }//GEN-LAST:event_botonSiguienteMusicaActionPerformed

    private void botonRegresarMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarMusicaActionPerformed
    // Obtener el índice de la fila seleccionada en el JTable
    int filaSeleccionada = tablaDatosMyV.getSelectedRow();

    // Verificar si hay una fila seleccionada
    if (filaSeleccionada != -1) {
        // Calcular el índice de la canción anterior
        int anteriorIndice = filaSeleccionada - 1;

        // Verificar si el índice anterior está dentro del rango
        if (anteriorIndice >= 0) {
            // Seleccionar la canción anterior
            tablaDatosMyV.setRowSelectionInterval(anteriorIndice, anteriorIndice);
            String rutaArchivo = (String) tablaDatosMyV.getValueAt(anteriorIndice, 7); // Asumiendo que la ruta está en la columna 7

            // Comprobar si es un archivo .mp3
            if (rutaArchivo.toLowerCase().endsWith(".mp3")) {
                try {
                    // Si hay un reproductor en uso, detenerlo
                    if (reproductorActual != null) {
                        reproductorActual.close(); // Detener el reproductor anterior
                    }

                    // Crear un nuevo reproductor para la canción anterior
                    FileInputStream fis = new FileInputStream(rutaArchivo);
                    BufferedInputStream bis = new BufferedInputStream(fis);
                    reproductorActual = new Player(bis); // Nueva instancia del reproductor

                    // Ejecutar el reproductor en un hilo separado para no bloquear la interfaz gráfica
                    new Thread(() -> {
                        try {
                            reproductorActual.play(); // Reproducir la canción
                        } catch (Exception e) {
                            System.out.println("Error al reproducir el archivo: " + e.getMessage());
                        }
                    }).start();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error al reproducir la canción: " + e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "El archivo seleccionado no es un archivo de audio compatible.");
            }
        } else {
            // Si ya estás en la primera canción, mostrar un mensaje
            JOptionPane.showMessageDialog(this, "Ya estás en la primera canción.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una canción de la lista primero.");
    }  
    }//GEN-LAST:event_botonRegresarMusicaActionPerformed

    private void textFieldFotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldFotosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldFotosActionPerformed

    private void Panel_FondoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Panel_FondoComponentShown
    }//GEN-LAST:event_Panel_FondoComponentShown

    private void botonFotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFotosActionPerformed
        verDuplicadosFotos.setVisible(true);
        verDuplicadosMyV.setVisible(false);
    // Verificar si el reproductor actual no es null y está en uso antes de cerrarlo
    if (reproductorActual != null) {
        reproductorActual.close(); // Detiene el reproductor si está activo
        reproductorActual = null; // Lo resetea a null después de cerrarlo
    }

    // Verificar si la ruta de acceso está vacía
    if (RutaDeAcceso == null || RutaDeAcceso.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona primero una carpeta.");
        return;
    }
        
       jScrollPaneFotos.setVisible(true);
       tablaDatosFotos.setVisible(true);
       
       jScrollPaneMyV.setVisible(false);
       tablaDatosMyV.setVisible(false);
       botonRegresarMusica.setEnabled(false);
       botonReproducirMusica.setEnabled(false);
       botonSiguienteMusica.setEnabled(false);
       botonPausa.setEnabled(false);
       botonRegresarMusica.setVisible(false);
       botonReproducirMusica.setVisible(false);
       botonSiguienteMusica.setVisible(false);
       botonPausa.setVisible(false);
       botonVerImagen.setVisible(true);
       botonVerImagen.setEnabled(true);
       botonReproducirVideo.setVisible(false);
       botonReproducirVideo.setEnabled(false);
       
    // Crear el modelo de tabla para las imágenes y limpiar los datos previos
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosFotos.getModel();
    modeloTabla.setRowCount(0); // Limpiar datos existentes

    // Llamar al método para buscar imágenes
    File directorioSeleccionado = new File(RutaDeAcceso);
      buscarArchivosImagen(directorioSeleccionado, modeloTabla);
       
       
       
    }//GEN-LAST:event_botonFotosActionPerformed

    private void botonVerDuplicadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerDuplicadosActionPerformed
        if (reproductorActual != null) {
        reproductorActual.close(); 
        }
        ventanaDuplicados duplicados = new ventanaDuplicados(this); 
        duplicados.setVisible(true); // Muestra la ventana de duplicados
        this.setVisible(false); // Oculta la ventana principal
    }//GEN-LAST:event_botonVerDuplicadosActionPerformed

    private void botonVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVideoActionPerformed
        verDuplicadosFotos.setVisible(false);
        verDuplicadosMyV.setVisible(true);
// Cerrar el reproductor actual antes de cambiar a la sección de video
    if (reproductorActual != null) {
        reproductorActual.close(); 
    }

    // Verificar si la ruta de acceso está vacía
    if (RutaDeAcceso == null || RutaDeAcceso.isEmpty()) {
        // Mostrar un mensaje de advertencia si no se ha seleccionado ninguna carpeta
        JOptionPane.showMessageDialog(this, "Por favor, selecciona primero una carpeta.");
        return; // Terminar la ejecución si no hay carpeta seleccionada
    }

    // OCULTAR TABLA DATOS FOTOS
    jScrollPaneFotos.setVisible(false); 
    tablaDatosFotos.setVisible(false);  
    
    // MOSTRAR TABLA DE VIDEOS Y MUSICA
    jScrollPaneMyV.setVisible(true);    
    tablaDatosMyV.setVisible(true);     

    // Ocultar botones de música
    botonRegresarMusica.setVisible(false); 
    botonReproducirMusica.setVisible(false); 
    botonSiguienteMusica.setVisible(false); 
    
    // Ocultar botones de fotos
    botonPausa.setVisible(false);          
    botonVerImagen.setVisible(false);      

    
    // Mostrar y habilitar el botón de reproducir video
    botonReproducirVideo.setVisible(true); 
    botonReproducirVideo.setEnabled(true); 

    // Crear el modelo de tabla para la sección de videos y limpiar datos previos
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosMyV.getModel();
    modeloTabla.setRowCount(0); // Limpiar datos existentes en la tabla de videos

    // Llamar al método para buscar archivos .mp4 en la carpeta seleccionada
    buscarArchivosMP4(new File(RutaDeAcceso), modeloTabla); // Iniciar búsqueda de archivos MP4
    }//GEN-LAST:event_botonVideoActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    


    
    private void botonPausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPausaActionPerformed
// Comprobar si el reproductor está activo
    if (reproductorActual != null) {
        try {
            if (enPausa) {
                // Si está en pausa, continuar la reproducción
                reproductorActual.play(); // Reanudar la reproducción
                enPausa = false; // Actualizar el estado a "no en pausa"
            } else {
                // Si no está en pausa, pausar la reproducción
                reproductorActual.close(); // Detener el reproductor (esto simula la pausa)
                enPausa = true; // Actualizar el estado a "en pausa"
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al pausar o continuar la canción: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "No hay canción reproduciéndose.");
    }
    }//GEN-LAST:event_botonPausaActionPerformed

    private void textFieldCantidadVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCantidadVideoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCantidadVideoActionPerformed

    private void botonReproducirVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReproducirVideoActionPerformed
    int filaSeleccionada = tablaDatosMyV.getSelectedRow();
    if (filaSeleccionada != -1) {
        String rutaArchivo = (String) tablaDatosMyV.getValueAt(filaSeleccionada, 7); // Asumiendo que la ruta está en la columna 7
        
        // Crear una instancia de JFrameVideos y pasar la referencia de ventanaPrincipal
        JFrameVideos ventanaVideos = new JFrameVideos(this); // Asegúrate de pasar la instancia actual
        ventanaVideos.metodPlayVideo(rutaArchivo); // Llamar al método para reproducir el video
        ventanaVideos.setVisible(true); // Mostrar la ventana
        this.setVisible(false); // Ocultar la ventana principal
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un video de la lista.");
    }
    }//GEN-LAST:event_botonReproducirVideoActionPerformed

    private void botonVerImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerImagenActionPerformed
  // Obtener la fila seleccionada
    int filaSeleccionada = tablaDatosFotos.getSelectedRow();
    if (filaSeleccionada != -1) { // Verificar si hay una fila seleccionada
        // Obtener la ruta de la imagen desde la columna correspondiente
        String rutaImagen = tablaDatosFotos.getValueAt(filaSeleccionada, 2).toString(); //Se encuentra en la columna 2 la ruta
        
        // Crear el ImageIcon original
        ImageIcon imagenOriginal = new ImageIcon(rutaImagen);
        
        // Escalar la imagen al tamaño deseado
        int ancho = 900; // Ancho fijo
        int alto = 668;  // Alto fijo
        Image imagenEscalada = imagenOriginal.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
        
        // Crear un nuevo ImageIcon a partir de la imagen escalada
        ImageIcon iconoImagenEscalada = new ImageIcon(imagenEscalada);
        
        // Abrir el JFrameFotos y pasarle la instancia de ventanaPrincipal
        JFrameFotos ventanaFotos = new JFrameFotos(this); 
        ventanaFotos.setImageIcon(iconoImagenEscalada); // Configura la imagen escalada en el JLabel
        ventanaFotos.setVisible(true); // Muestra la ventana de fotos
        this.setVisible(false); // Oculta la ventana principal
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila.");
    }
    }//GEN-LAST:event_botonVerImagenActionPerformed


private String obtenerNombreBase(String nombreArchivo) {
    // Expresión regular para detectar "(n)", "- copia", "- Copy" o similares al final del nombre, y extensiones .mp3, .mp4, .jpg, y .png
    String regex = "^(.*?)(\\s*(\\(\\d+\\)|-\\s*[Cc]opia|-\\s*[Cc]opy))?\\s*(\\.mp3|\\.mp4|\\.jpg|\\.png)?$";
    
    /* Explicación detallada de la expresión regular:
       ^(.*?):         Captura el nombre principal del archivo de forma no codiciosa (.*?), sin incluir ningún sufijo o extensión.
       (\\s*(\\(\\d+\\)|-\\s*[Cc]opia|-\\s*[Cc]opy))?:   Esta es la parte que captura y omite los sufijos:
                         \\s*:       Permite un espacio opcional antes del sufijo.
                         (\\(\\d+\\)):   Detecta números entre paréntesis, como (1), (2), etc.
                         |-\\s*[Cc]opia y |-\\s*[Cc]opy:   Detecta sufijos "- copia" o "- Copy", sin distinguir mayúsculas o minúsculas en la palabra.
       (\\.mp3|\\.mp4|\\.jpg|\\.png)?$:   Detecta extensiones al final del nombre (.mp3, .mp4, .jpg, .png) si están presentes.
       
       Al usar matcher.group(1).trim(), el método extrae el nombre principal del archivo sin sufijos ni extensiones.
       Si no hay coincidencia, el método devuelve el nombre original del archivo.
    */
    
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(nombreArchivo);
    
    if (matcher.matches()) {
        // Retorna solo el grupo sin el número en paréntesis o sufijo
        return matcher.group(1).trim();
    }
    
    return nombreArchivo;
}

// Método modificado para buscar duplicados usando el nombre base
private List<Object[]> buscarDuplicados(DefaultTableModel modeloTabla, 
                                        JTextField tamañoDuplicadosMusica, 
                                        JTextField cantidadDuplicadosMusica, 
                                        JTextField tamañoDuplicadosVideo, 
                                        JTextField cantidadDuplicadosVideo) {
    List<Object[]> duplicados = new ArrayList<>();
    Set<String> nombresEncontrados = new HashSet<>();
    Set<String> nombresDuplicados = new HashSet<>();
    
    double totalSizeMp3 = 0.0;
    int countMp3 = 0;
    double totalSizeMp4 = 0.0;
    int countMp4 = 0;

    // Primera pasada: identificar nombres duplicados sin paréntesis o sufijos
    for (int i = 0; i < modeloTabla.getRowCount(); i++) {
        String nombreArchivoOriginal = modeloTabla.getValueAt(i, 0).toString();
        String nombreArchivo = obtenerNombreBase(nombreArchivoOriginal);

        if (nombresEncontrados.contains(nombreArchivo)) {
            nombresDuplicados.add(nombreArchivo);
        } else {
            nombresEncontrados.add(nombreArchivo);
        }
    }

    // Segunda pasada: agregar filas duplicadas y calcular tamaños para mp3 y mp4
    for (int i = 0; i < modeloTabla.getRowCount(); i++) {
        String nombreArchivoOriginal = modeloTabla.getValueAt(i, 0).toString();
        String nombreArchivo = obtenerNombreBase(nombreArchivoOriginal);
        String extension = obtenerExtension(nombreArchivoOriginal); // Método que devuelve la extensión del archivo
        
        if (nombresDuplicados.contains(nombreArchivo)) {
            Object[] fila = new Object[modeloTabla.getColumnCount()];
            for (int j = 0; j < modeloTabla.getColumnCount(); j++) {
                fila[j] = modeloTabla.getValueAt(i, j);
            }
            duplicados.add(fila);
            
            // Dependiendo de la extensión, suma al total correspondiente
            double tamañoArchivo = Double.parseDouble(modeloTabla.getValueAt(i, modeloTabla.findColumn("Tamaño")).toString());
            if (".mp3".equalsIgnoreCase(extension)) {
                totalSizeMp3 += tamañoArchivo;
                countMp3++;
            } else if (".mp4".equalsIgnoreCase(extension)) {
                totalSizeMp4 += tamañoArchivo;
                countMp4++;
            }
        }
    }

    // Mostrar tamaño y cantidad de duplicados en los JTextFields respectivos
    tamañoDuplicadosMusica.setText(String.format("%.2f MB", totalSizeMp3));
    cantidadDuplicadosMusica.setText(String.valueOf(countMp3));
    tamañoDuplicadosVideo.setText(String.format("%.2f MB", totalSizeMp4));
    cantidadDuplicadosVideo.setText(String.valueOf(countMp4));

    return duplicados;
}

// Método auxiliar para obtener la extensión del archivo
private String obtenerExtension(String nombreArchivo) {
    int lastDotIndex = nombreArchivo.lastIndexOf(".");
    return (lastDotIndex != -1) ? nombreArchivo.substring(lastDotIndex).toLowerCase() : "";
}
    
    
    private void verDuplicadosFotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDuplicadosFotosActionPerformed
 // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosFotos.getModel();

    // Buscar filas duplicadas y actualizar JTextField
    List<Object[]> filasDuplicadas = buscarDuplicados(modeloTabla, tamañoDuplicadosMusica, 
                                                      cantidadDuplicadosMusica, tamañoDuplicadosVideo, 
                                                      cantidadDuplicadosVideo);

    // Limpiar la tabla actual
    modeloTabla.setRowCount(0);

    // Agregar las filas duplicadas nuevamente a la tabla
    for (Object[] fila : filasDuplicadas) {
        modeloTabla.addRow(fila); // Volver a agregar cada fila duplicada
    }

    // Mostrar mensaje si no hay duplicados
    if (filasDuplicadas.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No se encontraron archivos duplicados.");
    }
    }//GEN-LAST:event_verDuplicadosFotosActionPerformed

    private void cantidadTotalDuplicadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadTotalDuplicadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadTotalDuplicadosActionPerformed

    private void tamañoDuplicadosFotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamañoDuplicadosFotosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamañoDuplicadosFotosActionPerformed

    private void tamañoDuplicadosMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamañoDuplicadosMusicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamañoDuplicadosMusicaActionPerformed

    private void cantidadDuplicadosMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadDuplicadosMusicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadDuplicadosMusicaActionPerformed

    private void cantidadDuplicadosVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadDuplicadosVideoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadDuplicadosVideoActionPerformed

    private void cantidadDuplicadosFotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadDuplicadosFotosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadDuplicadosFotosActionPerformed

    private void textFieldMusica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldMusica2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldMusica2ActionPerformed

    private void textFieldVideo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldVideo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldVideo2ActionPerformed

    private void textFieldCantidadFotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCantidadFotosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCantidadFotosActionPerformed

    private void ordenXnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenXnombreActionPerformed
    // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosMyV.getModel();
    
    // Crear un TableRowSorter para el modelo
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
    
    // Configurar el sorter en la tabla correspondiente
    tablaDatosMyV.setRowSorter(sorter);
    
    // Establecer el criterio de ordenación en la columna de "Nombre" (índice 0)
    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(0, SortOrder.ASCENDING)));
    
    // Ordenar la tabla
    sorter.sort();
    }//GEN-LAST:event_ordenXnombreActionPerformed

    private void verDuplicadosMyVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDuplicadosMyVActionPerformed
  // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosMyV.getModel();

    // Buscar filas duplicadas y actualizar JTextField
    List<Object[]> filasDuplicadas = buscarDuplicados(modeloTabla, tamañoDuplicadosMusica, 
                                                      cantidadDuplicadosMusica, tamañoDuplicadosVideo, 
                                                      cantidadDuplicadosVideo);

    // Limpiar la tabla actual
    modeloTabla.setRowCount(0);

    // Agregar las filas duplicadas nuevamente a la tabla
    for (Object[] fila : filasDuplicadas) {
        modeloTabla.addRow(fila); // Volver a agregar cada fila duplicada
    }

    // Mostrar mensaje si no hay duplicados
    if (filasDuplicadas.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No se encontraron archivos duplicados.");
    }
    }//GEN-LAST:event_verDuplicadosMyVActionPerformed

    private void ordenarXartistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarXartistaActionPerformed
          // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosMyV.getModel();
    
    // Crear un TableRowSorter para el modelo
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
    
    // Configurar el sorter en la tabla correspondiente
    tablaDatosMyV.setRowSorter(sorter);
    
    // "Artista Indice 2"
    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(2, SortOrder.ASCENDING)));
    
    // Ordenar la tabla
    sorter.sort();
    }//GEN-LAST:event_ordenarXartistaActionPerformed

    private void ordenarXalbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarXalbumActionPerformed
         // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosMyV.getModel();
    
    // Crear un TableRowSorter para el modelo
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
    
    // Configurar el sorter en la tabla correspondiente
    tablaDatosMyV.setRowSorter(sorter);
    
    // "Album Indice 3"
    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(3, SortOrder.ASCENDING)));
    
    // Ordenar la tabla
    sorter.sort();
    }//GEN-LAST:event_ordenarXalbumActionPerformed

    private void ordenarXgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarXgeneroActionPerformed
    // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosMyV.getModel();
    
    // Crear un TableRowSorter para el modelo
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
    
    // Configurar el sorter en la tabla correspondiente
    tablaDatosMyV.setRowSorter(sorter);
    
    // "Genero Indice 4"
    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(4, SortOrder.ASCENDING)));
    
    // Ordenar la tabla
    sorter.sort();
    }//GEN-LAST:event_ordenarXgeneroActionPerformed

    private void ordenarXduracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarXduracionActionPerformed
    // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosMyV.getModel();
    
    // Crear un TableRowSorter para el modelo
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
    
    // Configurar el sorter en la tabla correspondiente
    tablaDatosMyV.setRowSorter(sorter);
    
    // "duracion Indice 5"
    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(5, SortOrder.ASCENDING)));
    
    // Ordenar la tabla
    sorter.sort();
    }//GEN-LAST:event_ordenarXduracionActionPerformed

    private void ordenarXañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarXañoActionPerformed
        // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosMyV.getModel();
    
    // Crear un TableRowSorter para el modelo
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
    
    // Configurar el sorter en la tabla correspondiente
    tablaDatosMyV.setRowSorter(sorter);
    
    // "Año Indice 6"
    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(6, SortOrder.ASCENDING)));
    
    // Ordenar la tabla
    sorter.sort();
    }//GEN-LAST:event_ordenarXañoActionPerformed

    private void ordenarXtamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarXtamañoActionPerformed
    // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosMyV.getModel();
    
    // Crear un TableRowSorter para el modelo
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
    
    // Configurar el sorter en la tabla correspondiente
    tablaDatosMyV.setRowSorter(sorter);
    
    // "Tamaño Indice 8 "
    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(6, SortOrder.ASCENDING)));
    
    // Ordenar la tabla
    sorter.sort();
    }//GEN-LAST:event_ordenarXtamañoActionPerformed


    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Archivo;
    private javax.swing.JPanel Panel_Fondo;
    private javax.swing.JButton botonFotos;
    private javax.swing.JButton botonMusica;
    private javax.swing.JButton botonPausa;
    private javax.swing.JButton botonRegresarMusica;
    private javax.swing.JButton botonReproducirMusica;
    private javax.swing.JButton botonReproducirVideo;
    private javax.swing.JButton botonSiguienteMusica;
    private javax.swing.JButton botonVerDuplicados;
    private javax.swing.JButton botonVerImagen;
    private javax.swing.JButton botonVideo;
    private javax.swing.JTextField cantidadDuplicadosFotos;
    private javax.swing.JTextField cantidadDuplicadosMusica;
    private javax.swing.JTextField cantidadDuplicadosVideo;
    private javax.swing.JTextField cantidadTotalDuplicados;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPaneFotos;
    private javax.swing.JScrollPane jScrollPaneMyV;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JMenuItem ordenXnombre;
    private javax.swing.JMenuItem ordenarXalbum;
    private javax.swing.JMenuItem ordenarXartista;
    private javax.swing.JMenuItem ordenarXaño;
    private javax.swing.JMenuItem ordenarXduracion;
    private javax.swing.JMenuItem ordenarXgenero;
    private javax.swing.JMenuItem ordenarXtamaño;
    private javax.swing.JPanel panelAlmacenamiento;
    private javax.swing.JPanel panelAlmacenamientoDuplicados;
    private javax.swing.JPanel panelTablas;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenuItem seleccionCarpeta;
    private javax.swing.JTable tablaDatosFotos;
    private javax.swing.JTable tablaDatosMyV;
    private javax.swing.JTextField tamañoDuplicadosFotos;
    private javax.swing.JTextField tamañoDuplicadosMusica;
    private javax.swing.JTextField tamañoDuplicadosVideo;
    private javax.swing.JTextField tamañoTotalDuplicados;
    private javax.swing.JTextField textFieldCantidadFotos;
    private javax.swing.JTextField textFieldCantidadMusica;
    private javax.swing.JTextField textFieldCantidadVideo;
    private javax.swing.JTextField textFieldFotos;
    private javax.swing.JTextField textFieldMusica2;
    private javax.swing.JTextField textFieldTotal;
    private javax.swing.JTextField textFieldTotal2;
    private javax.swing.JTextField textFieldVideo2;
    private javax.swing.JButton verDuplicadosFotos;
    private javax.swing.JButton verDuplicadosMyV;
    // End of variables declaration//GEN-END:variables



}

