package com.lumtec.foliadorpdf.interfaz;

import com.lumtec.foliadorpdf.creacion.CrearPdf;
import com.lumtec.foliadorpdf.modelo.NewTab;
import com.lumtec.foliadorpdf.creacion.Settings;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;


public class Foliador extends javax.swing.JFrame {

    //Número de folios se puede entender como el número de pestañas abiertas. Por default, solo hay 1
    int numeroFolios = 1;
    NewTab newTab;
    Settings settings;


    public Foliador() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Foliador");

        // 1. Limpiar la basura del GUI Builder de NetBeans en tiempo de ejecución
        barraPestanias.removeAll();
        workspace.removeAll();

        // 2. Inicializar el creador de pestañas
        newTab = new NewTab();
        numeroFolios = 0; // Reiniciamos la cuenta de la ventana principal

        // 3. Crear el Folio 1 con todas las propiedades avanzadas inyectadas
        newTab.nuevoFolio();
        this.numeroFolios++;

    }



    private void initComponents() {

        JPanel background = new JPanel();
        JPanel vistaPreviaPanel = new JPanel();
        JPanel vistaPrevia = new JPanel();
        JPanel configs = new JPanel();
        JPanel jPanel7 = new JPanel();

        //JTextField
        folioInicialField = new javax.swing.JTextField();
        folioFinalField = new javax.swing.JTextField();
        numeroCopias = new javax.swing.JTextField();
        //JLabel

        JLabel jLabel13 = new JLabel();
        JLabel jLabel14 = new JLabel();
        JLabel jLabel15 = new JLabel();
        JLabel jLabel16 = new JLabel();
        jLabel4 = new JLabel();

        JSeparator jSeparator1 = new JSeparator();

        fontSizeBox = new javax.swing.JComboBox<>();
        JPanel jPanel8 = new JPanel();

        // --- INICIO CONFIGURACIÓN COLOR ---
        jPanel8.setBackground(java.awt.Color.RED); // Color por defecto
        com.lumtec.foliadorpdf.creacion.Settings.setColor(java.awt.Color.RED);
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        // Evento para abrir el mini-menú de colores
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarSelectorDeColor(jPanel8);
            }
        });
        // --- FIN CONFIGURACIÓN COLOR ---

        // (Mantén las líneas originales que añaden jPanel8 a "configs")
        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 21, Short.MAX_VALUE)
        );
        configs.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 10, 60, 21));
        JSeparator jSeparator4 = new JSeparator();
        onOffButton = new javax.swing.JToggleButton();
        JLabel jLabel2 = new JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        JLabel jLabel3 = new JLabel();
        barraPestanias = new javax.swing.JPanel();
        // Variables declaration - do not modify                     
        JPanel folio1Tab = new JPanel();
        JLabel jLabel18 = new JLabel();
        workspace = new javax.swing.JPanel();
        mesaTrabajo0 = new javax.swing.JPanel();
        JTextField cX = new JTextField();
        JTextField cY = new JTextField();
        JSlider sliderX = new JSlider();
        JSlider sliderY = new JSlider();
        JPanel newFolio = new JPanel();
        JLabel jLabel17 = new JLabel();
        JPanel barraInformativa = new JPanel();
        JPanel botonCerrar = new JPanel();
        nombreArchivoTextbox = new javax.swing.JTextField();
        JPanel selectFileButton = new JPanel();
        JLabel jLabel1 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(970, 615));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(51, 51, 51));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vistaPreviaPanel.setBackground(new java.awt.Color(255, 255, 255));
        vistaPreviaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout vistaPreviaLayout = new javax.swing.GroupLayout(vistaPrevia);
        vistaPrevia.setLayout(vistaPreviaLayout);
        vistaPreviaLayout.setHorizontalGroup(
                vistaPreviaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 310, Short.MAX_VALUE)
        );
        vistaPreviaLayout.setVerticalGroup(
                vistaPreviaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 410, Short.MAX_VALUE)
        );

        vistaPreviaPanel.add(vistaPrevia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 310, 410));

        background.add(vistaPreviaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 460, 500));

        configs.setBackground(new java.awt.Color(78, 78, 78));
        configs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked();
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Arial", Font.BOLD, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Crear");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 8, -1, -1));

        configs.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 15, 90, 30));

        // --- INICIO BOTONES JSON ---

        // 1. Botón para Cargar Plantilla
        JPanel btnCargarPlantilla = new JPanel();
        btnCargarPlantilla.setBackground(new java.awt.Color(100, 100, 100));
        btnCargarPlantilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCargarPlantilla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabel lblCargar = new JLabel("Cargar");
        lblCargar.setForeground(new java.awt.Color(255, 255, 255));
        lblCargar.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 12));
        btnCargarPlantilla.add(lblCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 8, -1, -1));

        btnCargarPlantilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cargarPlantilla();
            }
        });
        // Desplazado a la derecha (X: 710) y ancho ajustado a 70px
        configs.add(btnCargarPlantilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 15, 70, 30));


        // 2. Botón para Guardar Plantilla
        JPanel btnGuardarPlantilla = new JPanel();
        btnGuardarPlantilla.setBackground(new java.awt.Color(100, 100, 100));
        btnGuardarPlantilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarPlantilla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabel lblGuardar = new JLabel("Guardar");
        lblGuardar.setForeground(new java.awt.Color(255, 255, 255));
        lblGuardar.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 12));
        btnGuardarPlantilla.add(lblGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, -1, -1));

        btnGuardarPlantilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarPlantilla();
            }
        });
        // Desplazado a la derecha (X: 785) y ancho ajustado a 70px
        configs.add(btnGuardarPlantilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 15, 70, 30));

        // --- FIN BOTONES JSON ---

        folioInicialField.setBackground(new java.awt.Color(73, 75, 78));
        folioInicialField.setForeground(new java.awt.Color(188, 188, 188));
        folioInicialField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        folioInicialField.setText("1");
        configs.add(folioInicialField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 7, 65, 25));

        folioFinalField.setBackground(new java.awt.Color(73, 75, 78));
        folioFinalField.setForeground(new java.awt.Color(188, 188, 188));
        folioFinalField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        folioFinalField.setText("500");
        configs.add(folioFinalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 7, 65, 25));

        numeroCopias.setBackground(new java.awt.Color(73, 75, 78));
        numeroCopias.setBackground(new java.awt.Color(73, 75, 78));
        numeroCopias.setForeground(new java.awt.Color(188, 188, 188));
        numeroCopias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numeroCopias.setText("0");
        configs.add(numeroCopias, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 9, 50, 23));

        jLabel14.setForeground(new java.awt.Color(188, 188, 188));
        jLabel14.setText("Fuente");
        configs.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jLabel15.setForeground(new java.awt.Color(188, 188, 188));
        jLabel15.setText("-");
        configs.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(190, 190, 190));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        configs.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 7, 10, 46));

        jLabel16.setForeground(new java.awt.Color(188, 188, 188));
        jLabel16.setText("No. de Folios");
        configs.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 40, -1, -1));

        fontSizeBox.setEditable(true);
        fontSizeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"11"}));
        fontSizeBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 0, 1, 1));
        configs.add(fontSizeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 50, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        configs.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 10, 60, 21));

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator4.setForeground(new java.awt.Color(190, 190, 190));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        configs.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 7, 10, 46));

        onOffButton.setText("Consecutivo");
        onOffButton.addActionListener(this::onOffButtonActionPerformed);
        configs.add(onOffButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 100, -1));

        jLabel2.setForeground(new java.awt.Color(188, 188, 188));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Orden de Folios");
        configs.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 38, 100, -1));

        jToggleButton1.setText("1er Pagina");
        jToggleButton1.addActionListener(this::jToggleButton1ActionPerformed);
        configs.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 100, -1));

        jLabel3.setForeground(new java.awt.Color(188, 188, 188));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pagina Foliada");
        configs.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 38, 100, -1));

        jLabel4.setForeground(new java.awt.Color(188, 188, 188));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Número de Copias");
        configs.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 38, 100, -1));

        background.add(configs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 970, 60));

        barraPestanias.setBackground(new java.awt.Color(51, 51, 51));
        barraPestanias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        folio1Tab.setBackground(new java.awt.Color(62, 65, 67));
        folio1Tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Folio1TabMouseClicked();
            }
        });
        folio1Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setForeground(new java.awt.Color(188, 188, 188));
        jLabel18.setText("Folio 1");
        folio1Tab.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, -1, -1));

        barraPestanias.add(folio1Tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        background.add(barraPestanias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 30));

        workspace.setBackground(new java.awt.Color(53, 56, 58));
        workspace.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mesaTrabajo0.setBackground(new java.awt.Color(60, 63, 66));
        mesaTrabajo0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cX.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cX.setText("1");
        mesaTrabajo0.add(cX, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 75, 110, 25));

        cY.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cY.setText("1");
        mesaTrabajo0.add(cY, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 75, 110, 25));

        sliderX.setBackground(new java.awt.Color(60, 63, 66));
        mesaTrabajo0.add(sliderX, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 130, 25));

        sliderY.setBackground(new java.awt.Color(60, 63, 66));
        sliderY.setOrientation(javax.swing.JSlider.VERTICAL);
        mesaTrabajo0.add(sliderY, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 25, 130));

        workspace.add(mesaTrabajo0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 500));

        background.add(workspace, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 510, 500));

        newFolio.setBackground(new java.awt.Color(70, 73, 75));
        newFolio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newFolio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newFolioMouseClicked();
            }
        });
        newFolio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Arial", Font.PLAIN, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(188, 188, 188));
        jLabel17.setText("+");
        newFolio.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, -2, -1, -1));

        background.add(newFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 30, 30));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 970, 590));

        barraInformativa.setBackground(new java.awt.Color(200, 200, 210));
        barraInformativa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonCerrar.setBackground(new java.awt.Color(255, 0, 0));
        botonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCerrarMouseClicked();
            }
        });

        javax.swing.GroupLayout botonCerrarLayout = new javax.swing.GroupLayout(botonCerrar);
        botonCerrar.setLayout(botonCerrarLayout);
        botonCerrarLayout.setHorizontalGroup(
                botonCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 19, Short.MAX_VALUE)
        );
        botonCerrarLayout.setVerticalGroup(
                botonCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 19, Short.MAX_VALUE)
        );

        barraInformativa.add(botonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(948, 3, 19, 19));

        nombreArchivoTextbox.setBackground(new java.awt.Color(200, 200, 210));
        nombreArchivoTextbox.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        nombreArchivoTextbox.setForeground(new java.awt.Color(51, 51, 51));
        nombreArchivoTextbox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreArchivoTextbox.setText("nombre Archivo");
        nombreArchivoTextbox.setBorder(null);
        barraInformativa.add(nombreArchivoTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 0, 410, 25));

        selectFileButton.setBackground(new java.awt.Color(60, 62, 65));
        selectFileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectFileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectFileButtonMouseClicked();
            }
        });
        selectFileButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(188, 188, 188));
        jLabel1.setText("Cargar PDF");
        selectFileButton.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 5, -1, -1));

        barraInformativa.add(selectFileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 25));

        getContentPane().add(barraInformativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 969, 25));

        pack();
    }// </editor-fold>                        


    private void botonCerrarMouseClicked() {//GEN-FIRST:event_botonCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_botonCerrarMouseClicked

    private void newFolioMouseClicked() {//GEN-FIRST:event_newFolioMouseClicked

        newTab.nuevoFolio();
        this.numeroFolios++;
    }//GEN-LAST:event_newFolioMouseClicked

    private void Folio1TabMouseClicked() {//GEN-FIRST:event_Folio1TabMouseClicked
        newTab.agregarMesaTrabajo(NewTab.getMesaTrabajo(0));
    }//GEN-LAST:event_Folio1TabMouseClicked

    private void onOffButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (onOffButton.isSelected()) {
            Settings.setSecuenciaConsecutiva(false); // Falso = Repetido
            onOffButton.setText("Repetido");
        } else {
            Settings.setSecuenciaConsecutiva(true);  // Verdadero = Consecutivo
            onOffButton.setText("Consecutivo");
        }
    }//GEN-LAST:event_onOffButtonActionPerformed

    private void selectFileButtonMouseClicked() {//GEN-FIRST:event_selectFileButtonMouseClicked
        cargarPdf();
    }//GEN-LAST:event_selectFileButtonMouseClicked

    private void jPanel7MouseClicked() {
        mostrarMensajeFlotante("Archivo en Proceso...git --version");
        String nombreArchivo = nombreArchivoTextbox.getText();
        int folioInicial = Integer.parseInt(folioInicialField.getText());
        int folioFinal = Integer.parseInt(folioFinalField.getText());
        float fontSize = Float.parseFloat(Objects.requireNonNull(fontSizeBox.getSelectedItem()).toString());

        // CAMBIO 1: Obtener el color real desde Settings (alimentado por el panel)
        Color color = com.lumtec.foliadorpdf.creacion.Settings.getColor();

        settings = new Settings(nombreArchivo,
                folioInicial,
                folioFinal,
                fontSize,
                numeroFolios,
                color);

        settings.setCoordenadas();

        while (true) {
            if (Settings.getUbicacionPdfOriginal() != null) {
                CrearPdf crearPdf = new CrearPdf(settings);
                crearPdf.crearPdf();

                // CAMBIO 2: Disparar la notificación visual


                break;
            } else {
                cargarPdf();
            }
        }
    }

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (jToggleButton1.isSelected()) {
            Settings.setDuplicarPDF(false);
            jToggleButton1.setText("Original");
        } else {
            Settings.setDuplicarPDF(true);
            jToggleButton1.setText("1er Pagina");
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    public static void main(String[] args) {

        // --- SOLUCIÓN PARA ACELERAR EL JFILECHOOSER ---
        javax.swing.UIManager.put("FileChooser.useShellFolder", Boolean.FALSE);

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Foliador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Foliador().setVisible(true));
    }


    public static javax.swing.JPanel barraPestanias;
    public static javax.swing.JTextField folioFinalField;
    public static javax.swing.JTextField folioInicialField;
    public static javax.swing.JTextField numeroCopias;
    public static javax.swing.JComboBox<String> fontSizeBox;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton onOffButton;
    public static javax.swing.JPanel mesaTrabajo0;
    private javax.swing.JTextField nombreArchivoTextbox;
    private JLabel jLabel4;

    public static javax.swing.JPanel workspace;
    // End of variables declaration                   

    private void cargarPdf() {

        //Ruta de la ubicación del PDF
        Settings.setUbicacionPdfOriginal();

        //Colocar el nombre del PDF en el cuadro de texto
        nombreArchivoTextbox.setText(Settings.getNombreArchivo());

    }

    private void guardarPlantilla() {
        java.awt.FileDialog fd = new java.awt.FileDialog(this, "Guardar Plantilla de Coordenadas", java.awt.FileDialog.SAVE);
        fd.setFile("*.json");
        fd.setVisible(true);

        String directorio = fd.getDirectory();
        String archivo = fd.getFile();

        if (directorio != null && archivo != null) {
            String path = new java.io.File(directorio, archivo).getAbsolutePath();
            if (!path.toLowerCase().endsWith(".json")) {
                path += ".json";
            }

            java.util.List<com.lumtec.foliadorpdf.modelo.Coordenadas> lista = new java.util.ArrayList<>();
            for (int i = 0; i < numeroFolios; i++) {
                javax.swing.JPanel mesa = com.lumtec.foliadorpdf.modelo.NewTab.getMesaTrabajo(i);
                if (mesa != null) {
                    javax.swing.JTextField cX = (javax.swing.JTextField) mesa.getComponent(0);
                    javax.swing.JTextField cY = (javax.swing.JTextField) mesa.getComponent(1);
                    float x = Float.parseFloat(cX.getText());
                    float y = Float.parseFloat(cY.getText());
                    lista.add(new com.lumtec.foliadorpdf.modelo.Coordenadas(x, y));
                }
            }

            com.lumtec.foliadorpdf.utils.CoordenadasExporter.exportarCoordenadas(lista, path);
            mostrarMensajeFlotante("Coordenadas Guardadas"); // Usando un mensaje limpio
        }
    }

    private void cargarPlantilla() {
        java.awt.FileDialog fd = new java.awt.FileDialog(this, "Cargar Plantilla de Coordenadas", java.awt.FileDialog.LOAD);
        fd.setFile("*.json");
        fd.setVisible(true);

        String directorio = fd.getDirectory();
        String archivo = fd.getFile();

        if (directorio != null && archivo != null) {
            String path = new java.io.File(directorio, archivo).getAbsolutePath();
            java.util.List<com.lumtec.foliadorpdf.modelo.Coordenadas> listaCargada =
                    com.lumtec.foliadorpdf.utils.CoordenadasImporter.importarCoordenadas(path);

            if (listaCargada != null && !listaCargada.isEmpty()) {
                barraPestanias.removeAll();
                workspace.removeAll();
                com.lumtec.foliadorpdf.modelo.NewTab.resetTabs();
                this.numeroFolios = 0;

                for (int i = 0; i < listaCargada.size(); i++) {
                    newTab.nuevoFolio();
                    this.numeroFolios++;

                    javax.swing.JPanel mesa = com.lumtec.foliadorpdf.modelo.NewTab.getMesaTrabajo(i);
                    javax.swing.JTextField cX = (javax.swing.JTextField) mesa.getComponent(0);
                    javax.swing.JTextField cY = (javax.swing.JTextField) mesa.getComponent(1);

                    com.lumtec.foliadorpdf.modelo.Coordenadas coord = listaCargada.get(i);

                    cX.setText(coord.getX() % 1 == 0 ? String.valueOf((int)coord.getX()) : String.valueOf(coord.getX()));
                    cY.setText(coord.getY() % 1 == 0 ? String.valueOf((int)coord.getY()) : String.valueOf(coord.getY()));
                }

                newTab.agregarMesaTrabajo(com.lumtec.foliadorpdf.modelo.NewTab.getMesaTrabajo(0));
                barraPestanias.revalidate();
                barraPestanias.repaint();

                mostrarMensajeFlotante("Coordenadas Cargadas");
            }
        }
    }

    //http://googleusercontent.com/immersive_entry_chip/0

    // Método para el Menú Desplegable de Colores
    private void mostrarSelectorDeColor(javax.swing.JPanel panelColor) {
        javax.swing.JPopupMenu popup = new javax.swing.JPopupMenu();

        // Colores rápidos y limpios
        java.awt.Color[] colores = {
                java.awt.Color.RED, java.awt.Color.BLACK, java.awt.Color.BLUE,
                new java.awt.Color(0, 153, 0), java.awt.Color.DARK_GRAY
        };
        String[] nombres = {"Rojo", "Negro", "Azul", "Verde", "Gris"};

        for (int i = 0; i < colores.length; i++) {
            final java.awt.Color c = colores[i];
            javax.swing.JMenuItem item = new javax.swing.JMenuItem(nombres[i]);
            item.setBackground(c);
            item.setForeground(java.awt.Color.WHITE); // Texto en blanco para contraste
            item.addActionListener(e -> {
                panelColor.setBackground(c);
                com.lumtec.foliadorpdf.creacion.Settings.setColor(c);
            });
            popup.add(item);
        }

        // Opción para abrir la paleta completa si se requiere algo muy específico
        popup.addSeparator();
        javax.swing.JMenuItem customItem = new javax.swing.JMenuItem("Personalizado...");
        customItem.addActionListener(e -> {
            java.awt.Color elegido = javax.swing.JColorChooser.showDialog(this, "Selecciona un Color para el Folio", panelColor.getBackground());
            if (elegido != null) {
                panelColor.setBackground(elegido);
                com.lumtec.foliadorpdf.creacion.Settings.setColor(elegido);
            }
        });
        popup.add(customItem);

        // Desplegar justo debajo del cuadrito de color
        popup.show(panelColor, 0, panelColor.getHeight());
    }

    // Método para la Notificación Flotante (Toast)
    private void mostrarMensajeFlotante(String mensaje) {
        // JWindow es ideal porque no tiene bordes de ventana nativos
        javax.swing.JWindow toast = new javax.swing.JWindow(this);
        toast.setBackground(new java.awt.Color(0, 0, 0, 0)); // Fondo transparente

        javax.swing.JPanel panel = new javax.swing.JPanel();
        panel.setBackground(new java.awt.Color(50, 50, 50, 240)); // Gris oscuro moderno y translúcido
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));

        javax.swing.JLabel label = new javax.swing.JLabel(mensaje);
        label.setForeground(java.awt.Color.WHITE);
        label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 14));
        label.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 25, 12, 25)); // Padding

        panel.add(label);
        toast.add(panel);
        toast.pack();

        // Centrar respecto a la ventana principal, y bajarlo un poco
        toast.setLocationRelativeTo(this);
        java.awt.Point loc = toast.getLocation();
        toast.setLocation(loc.x, loc.y + 120);

        toast.setVisible(true);

        // Temporizador para autodestruir el mensaje después de 2 segundos (2000 ms)
        new javax.swing.Timer(2000, e -> toast.dispose()).start();
    }

}