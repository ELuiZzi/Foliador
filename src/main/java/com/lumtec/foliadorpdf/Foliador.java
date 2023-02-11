package com.lumtec.foliadorpdf;

import java.awt.Color;
import javax.swing.JSpinner;

public class Foliador extends javax.swing.JFrame {

    Color activ = new Color(230, 230, 230);
    Color desa = new Color(255, 255, 255);
    newTab tab;

    //Creación de objetos
    Settings set = new Settings();
    Coordinates coor = new Coordinates();
    PDFCreacion Pdf;

    public Foliador() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Foliador");

        iniciarContadores();
        PanelConfiguracion.requestFocus();
        this.tab = new newTab(workspace, panelVetanas, newFolio);
    }

    static boolean f1 = false, f2 = false, f3 = false, f4 = false;

    private static String ruta;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox4 = new javax.swing.JCheckBox();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        TipoFoliado = new javax.swing.ButtonGroup();
        Folio4Panel = new javax.swing.JPanel();
        TituloFolio4 = new javax.swing.JLabel();
        Separador4 = new javax.swing.JSeparator();
        Y4 = new javax.swing.JTextField();
        X4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        PanelUbicacion = new javax.swing.JPanel();
        Folio2Panel = new javax.swing.JPanel();
        TituloFolio2 = new javax.swing.JLabel();
        Separador2 = new javax.swing.JSeparator();
        X2 = new javax.swing.JTextField();
        Y2 = new javax.swing.JTextField();
        Folio3Panel = new javax.swing.JPanel();
        TituloFolio3 = new javax.swing.JLabel();
        Separador3 = new javax.swing.JSeparator();
        Y3 = new javax.swing.JTextField();
        X3 = new javax.swing.JTextField();
        Folio1Panel = new javax.swing.JPanel();
        TituloFolio1 = new javax.swing.JLabel();
        X1 = new javax.swing.JTextField();
        Y1 = new javax.swing.JTextField();
        Separador1 = new javax.swing.JSeparator();
        Background = new javax.swing.JPanel();
        PanelConfiguracion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombreArchivoField = new javax.swing.JTextField();
        SeparadorFuente = new javax.swing.JSeparator();
        InicioSpinner = new javax.swing.JSpinner();
        FinalSpinner = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fontSizeField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        FoliosXHojaField = new javax.swing.JTextField();
        ConsecutivoButton = new javax.swing.JRadioButton();
        RepetidoButton = new javax.swing.JRadioButton();
        AbrirCheck = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        RutalLabel = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        configs = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        fontSize = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        panelVetanas = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        workspace = new javax.swing.JPanel();
        folio1 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jSlider1 = new javax.swing.JSlider();
        jSlider2 = new javax.swing.JSlider();
        newFolio = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("Folio #1");

        jTextField8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("jTextField1");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("X:");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Y:");

        jTextField9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("jTextField3");

        Folio4Panel.setBackground(new java.awt.Color(255, 255, 255));
        Folio4Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Folio4PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Folio4PanelMouseExited(evt);
            }
        });
        Folio4Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloFolio4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TituloFolio4.setText("Folio #4");
        Folio4Panel.add(TituloFolio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Separador4.setForeground(new java.awt.Color(0, 0, 0));
        Separador4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Folio4Panel.add(Separador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 10, 230));

        Y4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Y4.setForeground(new java.awt.Color(153, 153, 153));
        Y4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Y4.setText("Y");
        Y4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Y4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Y4FocusLost(evt);
            }
        });
        Y4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Y4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y4MousePressed(evt);
            }
        });
        Folio4Panel.add(Y4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 90, 30));

        X4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        X4.setForeground(new java.awt.Color(153, 153, 153));
        X4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        X4.setText("X");
        X4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                X4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                X4FocusLost(evt);
            }
        });
        X4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                X4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                X4MousePressed(evt);
            }
        });
        Folio4Panel.add(X4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, 30));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Versión: 1.3");
        Folio4Panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 230, 90, -1));

        PanelUbicacion.setBackground(new java.awt.Color(255, 255, 255));
        PanelUbicacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Folio2Panel.setBackground(new java.awt.Color(255, 255, 255));
        Folio2Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Folio2PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Folio2PanelMouseExited(evt);
            }
        });
        Folio2Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloFolio2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TituloFolio2.setText("Folio #2");
        Folio2Panel.add(TituloFolio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Separador2.setForeground(new java.awt.Color(0, 0, 0));
        Folio2Panel.add(Separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 249, 280, 30));

        X2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        X2.setForeground(new java.awt.Color(153, 153, 153));
        X2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        X2.setText("X");
        X2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                X2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                X2FocusLost(evt);
            }
        });
        X2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                X2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                X2MousePressed(evt);
            }
        });
        Folio2Panel.add(X2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, 30));

        Y2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Y2.setForeground(new java.awt.Color(153, 153, 153));
        Y2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Y2.setText("Y");
        Y2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Y2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Y2FocusLost(evt);
            }
        });
        Y2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Y2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y2MousePressed(evt);
            }
        });
        Folio2Panel.add(Y2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 90, 30));

        PanelUbicacion.add(Folio2Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 300, 250));

        Folio3Panel.setBackground(new java.awt.Color(255, 255, 255));
        Folio3Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Folio3PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Folio3PanelMouseExited(evt);
            }
        });
        Folio3Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloFolio3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TituloFolio3.setText("Folio #3");
        Folio3Panel.add(TituloFolio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Separador3.setForeground(new java.awt.Color(0, 0, 0));
        Folio3Panel.add(Separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 280, 10));

        Y3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Y3.setForeground(new java.awt.Color(153, 153, 153));
        Y3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Y3.setText("Y");
        Y3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Y3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Y3FocusLost(evt);
            }
        });
        Y3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Y3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y3MousePressed(evt);
            }
        });
        Folio3Panel.add(Y3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 90, 30));

        X3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        X3.setForeground(new java.awt.Color(153, 153, 153));
        X3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        X3.setText("X");
        X3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                X3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                X3FocusLost(evt);
            }
        });
        X3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                X3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                X3MousePressed(evt);
            }
        });
        Folio3Panel.add(X3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, 30));

        PanelUbicacion.add(Folio3Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 300, 250));

        Folio1Panel.setBackground(new java.awt.Color(255, 255, 255));
        Folio1Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Folio1PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Folio1PanelMouseExited(evt);
            }
        });
        Folio1Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloFolio1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TituloFolio1.setText("Folio #1");
        Folio1Panel.add(TituloFolio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        X1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        X1.setForeground(new java.awt.Color(153, 153, 153));
        X1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        X1.setText("X");
        X1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                X1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                X1FocusLost(evt);
            }
        });
        X1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                X1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                X1MousePressed(evt);
            }
        });
        Folio1Panel.add(X1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 90, 30));

        Y1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Y1.setForeground(new java.awt.Color(153, 153, 153));
        Y1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Y1.setText("Y");
        Y1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Y1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Y1FocusLost(evt);
            }
        });
        Y1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Y1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y1MousePressed(evt);
            }
        });
        Folio1Panel.add(Y1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 90, 30));

        Separador1.setForeground(new java.awt.Color(0, 0, 0));
        Separador1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Folio1Panel.add(Separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 10, 10, 230));

        PanelUbicacion.add(Folio1Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 250));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelConfiguracion.setBackground(new java.awt.Color(102, 102, 102));
        PanelConfiguracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");
        PanelConfiguracion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, -1));

        nombreArchivoField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nombreArchivoField.setForeground(new java.awt.Color(153, 153, 153));
        nombreArchivoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreArchivoField.setText("Nombre del Archivo");
        nombreArchivoField.setAlignmentX(1.0F);
        nombreArchivoField.setAlignmentY(2.0F);
        nombreArchivoField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nombreArchivoField.setMargin(new java.awt.Insets(5, 5, 2, 5));
        nombreArchivoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreArchivoFieldFocusLost(evt);
            }
        });
        nombreArchivoField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreArchivoFieldMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreArchivoFieldMousePressed(evt);
            }
        });
        PanelConfiguracion.add(nombreArchivoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 200, 20));

        SeparadorFuente.setForeground(new java.awt.Color(255, 255, 255));
        PanelConfiguracion.add(SeparadorFuente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 220, 10));

        InicioSpinner.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        InicioSpinner.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        InicioSpinner.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                InicioSpinnerMouseWheelMoved(evt);
            }
        });
        PanelConfiguracion.add(InicioSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 190, 60, 25));

        FinalSpinner.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        FinalSpinner.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        FinalSpinner.setMinimumSize(new java.awt.Dimension(26, 19));
        FinalSpinner.setPreferredSize(new java.awt.Dimension(26, 19));
        FinalSpinner.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                FinalSpinnerMouseWheelMoved(evt);
            }
        });
        PanelConfiguracion.add(FinalSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 190, 60, 25));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inicio");
        PanelConfiguracion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 50, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Final");
        PanelConfiguracion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 50, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        PanelConfiguracion.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fuente");
        PanelConfiguracion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        PanelConfiguracion.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 220, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Foliación");
        PanelConfiguracion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tamaño:");
        PanelConfiguracion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 20));

        fontSizeField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        fontSizeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fontSizeField.setText("12");
        fontSizeField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        fontSizeField.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                fontSizeFieldMouseWheelMoved(evt);
            }
        });
        PanelConfiguracion.add(fontSizeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 60, 20));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Folios x Hoja:");
        PanelConfiguracion.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        FoliosXHojaField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        FoliosXHojaField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FoliosXHojaField.setText("1");
        FoliosXHojaField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        FoliosXHojaField.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                FoliosXHojaFieldMouseWheelMoved(evt);
            }
        });
        FoliosXHojaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FoliosXHojaFieldKeyPressed(evt);
            }
        });
        PanelConfiguracion.add(FoliosXHojaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 120, 20));

        ConsecutivoButton.setBackground(new java.awt.Color(102, 102, 102));
        TipoFoliado.add(ConsecutivoButton);
        ConsecutivoButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ConsecutivoButton.setForeground(new java.awt.Color(255, 255, 255));
        ConsecutivoButton.setSelected(true);
        ConsecutivoButton.setText(" Consecutivo");
        ConsecutivoButton.setBorder(null);
        ConsecutivoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ConsecutivoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConsecutivoButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConsecutivoButtonMouseExited(evt);
            }
        });
        PanelConfiguracion.add(ConsecutivoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, 20));

        RepetidoButton.setBackground(new java.awt.Color(102, 102, 102));
        TipoFoliado.add(RepetidoButton);
        RepetidoButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        RepetidoButton.setForeground(new java.awt.Color(255, 255, 255));
        RepetidoButton.setText("   Repetido");
        RepetidoButton.setBorder(null);
        RepetidoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RepetidoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RepetidoButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RepetidoButtonMouseExited(evt);
            }
        });
        PanelConfiguracion.add(RepetidoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 90, 20));

        AbrirCheck.setBackground(new java.awt.Color(102, 102, 102));
        AbrirCheck.setForeground(new java.awt.Color(255, 255, 255));
        AbrirCheck.setSelected(true);
        AbrirCheck.setText("Abrir al Crear");
        AbrirCheck.setAlignmentY(0.0F);
        AbrirCheck.setBorder(null);
        AbrirCheck.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AbrirCheck.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        PanelConfiguracion.add(AbrirCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 455, 100, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        PanelConfiguracion.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Color:");
        PanelConfiguracion.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 40, 20));

        jPanel2.setBackground(new java.awt.Color(130, 130, 130));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Crear");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 8, -1, -1));

        PanelConfiguracion.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 455, 100, 30));

        Background.add(PanelConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 240, 500));

        jPanel3.setBackground(new java.awt.Color(50, 50, 50));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RutalLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RutalLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(RutalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 520, 30));

        Background.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 30));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(51, 51, 51));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 310, 410));

        background.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 460, 500));

        configs.setBackground(new java.awt.Color(78, 78, 78));
        configs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Crear");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 8, -1, -1));

        configs.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 15, 90, 30));

        jTextField1.setBackground(new java.awt.Color(73, 75, 78));
        jTextField1.setForeground(new java.awt.Color(188, 188, 188));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("1");
        configs.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 7, 65, 25));

        jTextField2.setBackground(new java.awt.Color(73, 75, 78));
        jTextField2.setForeground(new java.awt.Color(188, 188, 188));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("500");
        configs.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 7, 65, 25));

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

        fontSize.setEditable(true);
        fontSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11" }));
        fontSize.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 0, 1, 1));
        fontSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontSizeActionPerformed(evt);
            }
        });
        configs.add(fontSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 50, -1));

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

        background.add(configs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 970, 60));

        panelVetanas.setBackground(new java.awt.Color(51, 51, 51));
        panelVetanas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(62, 65, 67));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setForeground(new java.awt.Color(188, 188, 188));
        jLabel18.setText("Folio 1");
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, -1, -1));

        panelVetanas.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        background.add(panelVetanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 30));

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        background.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(945, 5, 20, 20));

        workspace.setBackground(new java.awt.Color(53, 56, 58));
        workspace.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        folio1.setBackground(new java.awt.Color(60, 63, 66));
        folio1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField3.setText("X1");
        folio1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 75, 110, 25));

        jTextField4.setText("Y2");
        folio1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 75, 90, 25));

        jSlider1.setBackground(new java.awt.Color(60, 63, 66));
        folio1.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 130, 25));

        jSlider2.setBackground(new java.awt.Color(60, 63, 66));
        jSlider2.setOrientation(javax.swing.JSlider.VERTICAL);
        folio1.add(jSlider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 25, 130));

        workspace.add(folio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 500));

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

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreArchivoFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreArchivoFieldMouseClicked

    }//GEN-LAST:event_nombreArchivoFieldMouseClicked

    private void RepetidoButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RepetidoButtonMouseEntered
        RepetidoButton.setBackground(new Color(120, 120, 120));
    }//GEN-LAST:event_RepetidoButtonMouseEntered

    private void RepetidoButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RepetidoButtonMouseExited
        RepetidoButton.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_RepetidoButtonMouseExited

    private void ConsecutivoButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsecutivoButtonMouseEntered
        ConsecutivoButton.setBackground(new Color(120, 120, 120));
    }//GEN-LAST:event_ConsecutivoButtonMouseEntered

    private int valorFolio() {
        return Integer.parseInt(FoliosXHojaField.getText());
    }


    private void ConsecutivoButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsecutivoButtonMouseExited
        ConsecutivoButton.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_ConsecutivoButtonMouseExited

    private void FoliosXHojaFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FoliosXHojaFieldKeyPressed

        if (evt.getKeyCode() == evt.VK_UP && valorFolio() < 4) {
            int folio = valorFolio() + 1;
            FoliosXHojaField.setText(Integer.toString(folio));
        } else if (evt.getKeyCode() == evt.VK_DOWN && valorFolio() > 1) {
            int folio = valorFolio() - 1;
            FoliosXHojaField.setText(Integer.toString(folio));
        }
    }//GEN-LAST:event_FoliosXHojaFieldKeyPressed

    private void Folio2PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Folio2PanelMouseEntered
        Folio2Panel.setBackground(activ);
    }//GEN-LAST:event_Folio2PanelMouseEntered

    private void Folio2PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Folio2PanelMouseExited
        Folio2Panel.setBackground(desa);
    }//GEN-LAST:event_Folio2PanelMouseExited

    private void Folio1PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Folio1PanelMouseEntered
        Folio1Panel.setBackground(activ);
    }//GEN-LAST:event_Folio1PanelMouseEntered

    private void Folio3PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Folio3PanelMouseEntered
        Folio3Panel.setBackground(activ);
    }//GEN-LAST:event_Folio3PanelMouseEntered

    private void Folio4PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Folio4PanelMouseEntered
        Folio4Panel.setBackground(activ);
    }//GEN-LAST:event_Folio4PanelMouseEntered

    private void Folio1PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Folio1PanelMouseExited
        Folio1Panel.setBackground(desa);
    }//GEN-LAST:event_Folio1PanelMouseExited

    private void Folio3PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Folio3PanelMouseExited
        Folio3Panel.setBackground(desa);
    }//GEN-LAST:event_Folio3PanelMouseExited

    private void Folio4PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Folio4PanelMouseExited
        Folio4Panel.setBackground(desa);
    }//GEN-LAST:event_Folio4PanelMouseExited

    private void X1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X1MouseClicked

    }//GEN-LAST:event_X1MouseClicked

    private void Y1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y1MouseClicked

    }//GEN-LAST:event_Y1MouseClicked

    private void X2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X2MouseClicked

    }//GEN-LAST:event_X2MouseClicked

    private void Y2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y2MouseClicked

    }//GEN-LAST:event_Y2MouseClicked

    private void Y3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y3MouseClicked

    }//GEN-LAST:event_Y3MouseClicked

    private void Y4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y4MouseClicked

    }//GEN-LAST:event_Y4MouseClicked

    private void X3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X3MouseClicked

    }//GEN-LAST:event_X3MouseClicked

    private void X4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X4MouseClicked

    }//GEN-LAST:event_X4MouseClicked

    private void X1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_X1FocusLost
        if (X1.getText().equals("")) {
            X1.setText("X");
            X1.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_X1FocusLost

    private void Y1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Y1FocusLost
        if (Y1.getText().equals("")) {
            Y1.setText("Y");
            Y1.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_Y1FocusLost

    private void nombreArchivoFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreArchivoFieldFocusLost
        if (nombreArchivoField.getText().equals("")) {
            nombreArchivoField.setText("Nombre del Archivo");
            nombreArchivoField.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_nombreArchivoFieldFocusLost

    private void X2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_X2FocusLost
        if (X2.getText().equals("")) {
            X2.setText("X");
            X2.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_X2FocusLost

    private void X3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_X3FocusLost
        if (X3.getText().equals("")) {
            X3.setText("X");
            X3.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_X3FocusLost

    private void X4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_X4FocusLost
        if (X4.getText().equals("")) {
            X4.setText("X");
            X4.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_X4FocusLost

    private void Y2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Y2FocusLost
        if (Y2.getText().equals("")) {
            Y2.setText("Y");
            Y2.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_Y2FocusLost

    private void Y3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Y3FocusLost
        if (Y3.getText().equals("")) {
            Y3.setText("Y");
            Y3.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_Y3FocusLost

    private void Y4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Y4FocusLost
        if (Y4.getText().equals("")) {
            Y4.setText("Y");
            Y4.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_Y4FocusLost

    private void nombreArchivoFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreArchivoFieldMousePressed
        if (nombreArchivoField.getText().equals("Nombre del Archivo")) {
            nombreArchivoField.setText("");
            nombreArchivoField.setForeground(Color.BLACK);
            nombreArchivoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        }
    }//GEN-LAST:event_nombreArchivoFieldMousePressed

    private void X1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X1MousePressed

    }//GEN-LAST:event_X1MousePressed

    private void Y1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y1MousePressed

    }//GEN-LAST:event_Y1MousePressed

    private void X2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X2MousePressed

    }//GEN-LAST:event_X2MousePressed

    private void Y2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y2MousePressed

    }//GEN-LAST:event_Y2MousePressed

    private void X3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X3MousePressed

    }//GEN-LAST:event_X3MousePressed

    private void Y3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y3MousePressed

    }//GEN-LAST:event_Y3MousePressed

    private void X4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X4MousePressed

    }//GEN-LAST:event_X4MousePressed

    private void Y4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y4MousePressed

    }//GEN-LAST:event_Y4MousePressed

    private void FoliosXHojaFieldMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_FoliosXHojaFieldMouseWheelMoved
        int l = Integer.parseInt(FoliosXHojaField.getText());

        if (evt.getWheelRotation() == -1 && l < 4) {
            l++;
        } else if (evt.getWheelRotation() == 1 && l > 1) {
            l--;
        }
        FoliosXHojaField.setText(Integer.toString(l));
    }//GEN-LAST:event_FoliosXHojaFieldMouseWheelMoved

    private void fontSizeFieldMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_fontSizeFieldMouseWheelMoved
        int FSA = Integer.parseInt(fontSizeField.getText());
        if (evt.getWheelRotation() == -1) {
            FSA++;
        } else if (evt.getWheelRotation() == +1 && FSA > 1) {
            FSA--;
        }

        fontSizeField.setText(Integer.toString(FSA));
    }//GEN-LAST:event_fontSizeFieldMouseWheelMoved

    private void X1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_X1FocusGained
        if (X1.getText().equals("X")) {
            X1.setText("");
            X1.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_X1FocusGained

    private void Y1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Y1FocusGained
        if (Y1.getText().equals("Y")) {
            Y1.setText("");
            Y1.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_Y1FocusGained

    private void X2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_X2FocusGained
        if (X2.getText().equals("X")) {
            X2.setText("");
            X2.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_X2FocusGained

    private void Y2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Y2FocusGained
        if (Y2.getText().equals("Y")) {
            Y2.setText("");
            Y2.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_Y2FocusGained

    private void X3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_X3FocusGained
        if (X3.getText().equals("X")) {
            X3.setText("");
            X3.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_X3FocusGained

    private void Y3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Y3FocusGained
        if (Y3.getText().equals("Y")) {
            Y3.setText("");
            Y3.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_Y3FocusGained

    private void X4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_X4FocusGained
        if (X4.getText().equals("X")) {
            X4.setText("");
            X4.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_X4FocusGained

    private void Y4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Y4FocusGained
        if (Y4.getText().equals("Y")) {
            Y4.setText("");
            Y4.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_Y4FocusGained
    static int abrir = 1;
    PaletaColores paleta = new PaletaColores();
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        paleta.setVisible(true);
        if (abrir == 1) {
            PanelConfiguracion.add(paleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 391, 131, 74));
            PanelConfiguracion.revalidate();
            PanelConfiguracion.repaint();
            abrir--;
        } else if (abrir == 0) {

            PanelConfiguracion.remove(paleta);
            PanelConfiguracion.revalidate();
            PanelConfiguracion.repaint();
            abrir++;
        }


    }//GEN-LAST:event_jPanel1MousePressed

    private void InicioSpinnerMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_InicioSpinnerMouseWheelMoved
        if (evt.getWheelRotation() < 0) {
            increaseValue(InicioSpinner);
        } else if (evt.getWheelRotation() > 0) {
            decreasesValue(InicioSpinner);
        }
    }//GEN-LAST:event_InicioSpinnerMouseWheelMoved

    private void FinalSpinnerMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_FinalSpinnerMouseWheelMoved
        if (evt.getWheelRotation() < 0) {
            increaseValue(FinalSpinner);
        } else if (evt.getWheelRotation() > 0) {
            decreasesValue(FinalSpinner);
        }
    }//GEN-LAST:event_FinalSpinnerMouseWheelMoved

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        //Asignar los ajustes

        //Asignar las coordenadas
        setCoordinates();

        //Crear el PDF
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void fontSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fontSizeActionPerformed

    private void newFolioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newFolioMouseClicked
        tab.addPanel();
    }//GEN-LAST:event_newFolioMouseClicked

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

    private void iniciarContadores() {
        InicioSpinner.setValue(1);
        FinalSpinner.setValue(500);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AbrirCheck;
    private javax.swing.JPanel Background;
    private javax.swing.JRadioButton ConsecutivoButton;
    private javax.swing.JSpinner FinalSpinner;
    private javax.swing.JPanel Folio1Panel;
    private javax.swing.JPanel Folio2Panel;
    private javax.swing.JPanel Folio3Panel;
    private javax.swing.JPanel Folio4Panel;
    private javax.swing.JTextField FoliosXHojaField;
    private javax.swing.JSpinner InicioSpinner;
    private javax.swing.JPanel PanelConfiguracion;
    private javax.swing.JPanel PanelUbicacion;
    private javax.swing.JRadioButton RepetidoButton;
    private javax.swing.JLabel RutalLabel;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JSeparator Separador3;
    private javax.swing.JSeparator Separador4;
    private javax.swing.JSeparator SeparadorFuente;
    private javax.swing.ButtonGroup TipoFoliado;
    private javax.swing.JLabel TituloFolio1;
    private javax.swing.JLabel TituloFolio2;
    private javax.swing.JLabel TituloFolio3;
    private javax.swing.JLabel TituloFolio4;
    private javax.swing.JTextField X1;
    private javax.swing.JTextField X2;
    private javax.swing.JTextField X3;
    private javax.swing.JTextField X4;
    private javax.swing.JTextField Y1;
    private javax.swing.JTextField Y2;
    private javax.swing.JTextField Y3;
    private javax.swing.JTextField Y4;
    private javax.swing.JPanel background;
    private javax.swing.JPanel configs;
    private javax.swing.JPanel folio1;
    private javax.swing.JComboBox<String> fontSize;
    private javax.swing.JTextField fontSizeField;
    private javax.swing.JCheckBox jCheckBox4;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel newFolio;
    private javax.swing.JTextField nombreArchivoField;
    private javax.swing.JPanel panelVetanas;
    private javax.swing.JPanel workspace;
    // End of variables declaration//GEN-END:variables

    //Aumenta en uno el valor actual de una caja Spinner
    private void increaseValue(JSpinner spin) {
        int value = (int) spin.getValue();
        ++value;
        spin.setValue(value);
    }

    //Disminuye en uno el valor actual de una caja Spinner
    private void decreasesValue(JSpinner spin) {
        int value = (int) spin.getValue();
        --value;
        spin.setValue(value);
    }

    //Asigna las coordenadas a a clase Coordinates, tomando el contenido de las cajas de texto
    private void setCoordinates() {

        //El número de folios se obtiene restando el numero final menos el inicial;
        int nFolios = Integer.parseInt(FoliosXHojaField.getText());

        if (nFolios > 0) {
            coor.setX1(Float.parseFloat(X1.getText()));
            coor.setY1(Float.parseFloat(Y1.getText()));
        }

        if (nFolios > 1) {
            coor.setX2(Float.parseFloat(X2.getText()));
            coor.setY2(Float.parseFloat(Y2.getText()));
        }

        if (nFolios > 2) {
            coor.setX3(Float.parseFloat(X3.getText()));
            coor.setY3(Float.parseFloat(Y3.getText()));
        }

        if (nFolios > 4) {
            coor.setX4(Float.parseFloat(X4.getText()));
            coor.setY4(Float.parseFloat(Y4.getText()));
        }

    }
}
