package com.lumtec.foliadorpdf.interfaz;

import com.lumtec.foliadorpdf.modelo.Coordenadas;
import com.lumtec.foliadorpdf.creacion.CrearPdf;
import com.lumtec.foliadorpdf.modelo.NewTab;
import com.lumtec.foliadorpdf.creacion.Settings;

import java.awt.Color;

public class Foliador extends javax.swing.JFrame {

    //Numero de folios se puede entender como el número de pestañas abiertas. Por default, solo hay 1
    int numeroFolios = 1;
    Color activ = new Color(230, 230, 230);
    Color desa = new Color(255, 255, 255);
    NewTab newTab;
    Settings settings;
    CrearPdf crearPDF;


    public Foliador() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Foliador");

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        vistaPreviaPanel = new javax.swing.JPanel();
        vistaPrevia = new javax.swing.JPanel();
        configs = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        folioInicialField = new javax.swing.JTextField();
        folioFinalField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        fontSizeBox = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        onOffButton = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        barraPestañas = new javax.swing.JPanel();
        Folio1Tab = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        workspace = new javax.swing.JPanel();
        mesaTrabajo0 = new javax.swing.JPanel();
        cX = new javax.swing.JTextField();
        cY = new javax.swing.JTextField();
        sliderX = new javax.swing.JSlider();
        sliderY = new javax.swing.JSlider();
        newFolio = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        barraInformativa = new javax.swing.JPanel();
        botonCerrar = new javax.swing.JPanel();
        nombreArchivoTextbox = new javax.swing.JTextField();
        selectFileButton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

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
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Crear");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 8, -1, -1));

        configs.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 15, 90, 30));

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
        fontSizeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11" }));
        fontSizeBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 0, 1, 1));
        configs.add(fontSizeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 50, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

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

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator4.setForeground(new java.awt.Color(190, 190, 190));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        configs.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 7, 10, 46));

        onOffButton.setText("Consecutivo");
        onOffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onOffButtonActionPerformed(evt);
            }
        });
        configs.add(onOffButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 100, -1));

        jLabel2.setForeground(new java.awt.Color(188, 188, 188));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Orden de Folios");
        configs.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 38, 100, -1));

        jToggleButton1.setText("1er Pagina");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        configs.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 100, -1));

        jLabel3.setForeground(new java.awt.Color(188, 188, 188));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pagina Foliada");
        configs.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 38, 100, -1));

        background.add(configs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 970, 60));

        barraPestañas.setBackground(new java.awt.Color(51, 51, 51));
        barraPestañas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Folio1Tab.setBackground(new java.awt.Color(62, 65, 67));
        Folio1Tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Folio1TabMouseClicked(evt);
            }
        });
        Folio1Tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setForeground(new java.awt.Color(188, 188, 188));
        jLabel18.setText("Folio 1");
        Folio1Tab.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, -1, -1));

        barraPestañas.add(Folio1Tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        background.add(barraPestañas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 30));

        workspace.setBackground(new java.awt.Color(53, 56, 58));
        workspace.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mesaTrabajo0.setBackground(new java.awt.Color(60, 63, 66));
        mesaTrabajo0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cX.setText("X1");
        mesaTrabajo0.add(cX, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 75, 110, 25));

        cY.setText("Y1");
        mesaTrabajo0.add(cY, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 75, 110, 25));

        sliderX.setBackground(new java.awt.Color(60, 63, 66));
        mesaTrabajo0.add(sliderX, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 130, 25));

        sliderY.setBackground(new java.awt.Color(60, 63, 66));
        sliderY.setOrientation(javax.swing.JSlider.VERTICAL);
        mesaTrabajo0.add(sliderY, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 25, 130));

        workspace.add(mesaTrabajo0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 500));

        background.add(workspace, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 510, 500));

        newFolio.setBackground(new java.awt.Color(70, 73, 75));
        newFolio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        newFolio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newFolioMouseClicked(evt);
            }
        });
        newFolio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(188, 188, 188));
        jLabel17.setText("+");
        newFolio.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, -2, -1, -1));

        background.add(newFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 30, 30));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 970, 590));

        barraInformativa.setBackground(new java.awt.Color(200, 200, 210));
        barraInformativa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonCerrar.setBackground(new java.awt.Color(255, 0, 0));
        botonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCerrarMouseClicked(evt);
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
        nombreArchivoTextbox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreArchivoTextbox.setForeground(new java.awt.Color(51, 51, 51));
        nombreArchivoTextbox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreArchivoTextbox.setText("nombre Archivo");
        nombreArchivoTextbox.setBorder(null);
        barraInformativa.add(nombreArchivoTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 0, 410, 25));

        selectFileButton.setBackground(new java.awt.Color(60, 62, 65));
        selectFileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectFileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectFileButtonMouseClicked(evt);
            }
        });
        selectFileButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(188, 188, 188));
        jLabel1.setText("Cargar PDF");
        selectFileButton.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 5, -1, -1));

        barraInformativa.add(selectFileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 25));

        getContentPane().add(barraInformativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 969, 25));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void botonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_botonCerrarMouseClicked

    private void newFolioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newFolioMouseClicked
        newTab = new NewTab();
        newTab.nuevoFolio();
        this.numeroFolios++;
    }//GEN-LAST:event_newFolioMouseClicked

    private void Folio1TabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Folio1TabMouseClicked
        newTab.agregarMesaTrabajo(NewTab.getMesaTrabajo(0));
    }//GEN-LAST:event_Folio1TabMouseClicked

    private void onOffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onOffButtonActionPerformed
        if (onOffButton.isSelected()) {
            Settings.setSecuenciaConsecutiva(false);
            onOffButton.setText("Repetido");
        } else {
            Settings.setSecuenciaConsecutiva(true);
            onOffButton.setText("Consecutivo");
        }
    }//GEN-LAST:event_onOffButtonActionPerformed

    private void selectFileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectFileButtonMouseClicked
        cargarPdf();
    }//GEN-LAST:event_selectFileButtonMouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        //Asiganr Settings
        String nombreArchivo = nombreArchivoTextbox.getText();
        int folioInicial = Integer.parseInt(folioInicialField.getText());
        int folioFinal = Integer.parseInt(folioFinalField.getText());
        float fontSize = Float.parseFloat(fontSizeBox.getSelectedItem().toString());

        settings = new Settings(nombreArchivo, folioInicial, folioFinal, fontSize, numeroFolios);

        //Asigar Coordenadas
        settings.setCoordenadas();

        while (true) {
            //Verificar que se ha seleccionado algún PDF
            if (Settings.getUbicacionPdfOriginal() != null) {
                //Crear PDF
                CrearPdf crearPdf = new CrearPdf(settings);
                break;
            } else {
                cargarPdf();
            }
        }


    }//GEN-LAST:event_jPanel7MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (jToggleButton1.isSelected()) {
            Settings.setDuplicarPDF(false);
            jToggleButton1.setText("Original");
        } else {
            Settings.setDuplicarPDF(true);
            jToggleButton1.setText("1er Pagina");
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Foliador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Foliador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Foliador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Foliador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Foliador().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Folio1Tab;
    private javax.swing.JPanel background;
    private javax.swing.JPanel barraInformativa;
    public static javax.swing.JPanel barraPestañas;
    private javax.swing.JPanel botonCerrar;
    private javax.swing.JTextField cX;
    private javax.swing.JTextField cY;
    private javax.swing.JPanel configs;
    public static javax.swing.JTextField folioFinalField;
    public static javax.swing.JTextField folioInicialField;
    public static javax.swing.JComboBox<String> fontSizeBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JToggleButton jToggleButton1;
    public static javax.swing.JPanel mesaTrabajo0;
    private javax.swing.JPanel newFolio;
    private javax.swing.JTextField nombreArchivoTextbox;
    private javax.swing.JToggleButton onOffButton;
    private javax.swing.JPanel selectFileButton;
    private javax.swing.JSlider sliderX;
    private javax.swing.JSlider sliderY;
    private javax.swing.JPanel vistaPrevia;
    private javax.swing.JPanel vistaPreviaPanel;
    public static javax.swing.JPanel workspace;
    // End of variables declaration//GEN-END:variables

    //Debe de recibir un arreglo del tipo JPanel, que contenga cada mesa de trabajo, que a su vez, contienen las coordenas de cada folio


    private void cargarPdf() {

        //Ruta de la ubicación del PDF
        Settings.setUbicacionPdfOriginal();

        //Coloacr el nombre del PDF en el cuadro de texto
        nombreArchivoTextbox.setText(Settings.getNombreArchivo());

    }

}
