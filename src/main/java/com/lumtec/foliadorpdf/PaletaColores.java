package com.lumtec.foliadorpdf;

import Interfaz.Foliador;
import java.awt.Color;

public class PaletaColores extends javax.swing.JPanel {

    public PaletaColores() {
        initComponents();
    }

    Color blanco = new Color(255, 255, 255);
    Color azul = new Color(0, 51, 255);
    Color morado = new Color(153, 153, 255);
    Color rosa = new Color(255, 51, 255);
    Color rojo = new Color(255, 0, 0);
    Color amarillo = new Color(255, 255, 51);
    Color verde = new Color(51, 255, 0);
    Color aqua = new Color(0, 255, 204);
    Color pantano = new Color(0, 153, 153);
    Color gris = new Color(210, 210, 210);
    Color negro = new Color(0, 0, 0);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Blanco3 = new javax.swing.JPanel();
        Blanco8 = new javax.swing.JPanel();
        Blanco10 = new javax.swing.JPanel();
        blancoBt = new javax.swing.JPanel();
        negroBt = new javax.swing.JPanel();
        grisBt = new javax.swing.JPanel();
        azulBt = new javax.swing.JPanel();
        rosaBt = new javax.swing.JPanel();
        rojoBt = new javax.swing.JPanel();
        amarilloBt = new javax.swing.JPanel();
        verdeBt = new javax.swing.JPanel();

        Blanco3.setBackground(new java.awt.Color(25, 229, 255));
        Blanco3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Blanco3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout Blanco3Layout = new javax.swing.GroupLayout(Blanco3);
        Blanco3.setLayout(Blanco3Layout);
        Blanco3Layout.setHorizontalGroup(
            Blanco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        Blanco3Layout.setVerticalGroup(
            Blanco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        Blanco8.setBackground(new java.awt.Color(255, 255, 51));
        Blanco8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Blanco8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout Blanco8Layout = new javax.swing.GroupLayout(Blanco8);
        Blanco8.setLayout(Blanco8Layout);
        Blanco8Layout.setHorizontalGroup(
            Blanco8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        Blanco8Layout.setVerticalGroup(
            Blanco8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        Blanco10.setBackground(new java.awt.Color(51, 255, 0));
        Blanco10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Blanco10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout Blanco10Layout = new javax.swing.GroupLayout(Blanco10);
        Blanco10.setLayout(Blanco10Layout);
        Blanco10Layout.setHorizontalGroup(
            Blanco10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        Blanco10Layout.setVerticalGroup(
            Blanco10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(130, 130, 130));
        setMinimumSize(new java.awt.Dimension(131, 74));
        setPreferredSize(new java.awt.Dimension(131, 74));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        blancoBt.setBackground(new java.awt.Color(255, 255, 255));
        blancoBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        blancoBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blancoBtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout blancoBtLayout = new javax.swing.GroupLayout(blancoBt);
        blancoBt.setLayout(blancoBtLayout);
        blancoBtLayout.setHorizontalGroup(
            blancoBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        blancoBtLayout.setVerticalGroup(
            blancoBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(blancoBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

        negroBt.setBackground(new java.awt.Color(0, 0, 0));
        negroBt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        negroBt.setForeground(new java.awt.Color(204, 204, 204));
        negroBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        negroBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                negroBtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout negroBtLayout = new javax.swing.GroupLayout(negroBt);
        negroBt.setLayout(negroBtLayout);
        negroBtLayout.setHorizontalGroup(
            negroBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        negroBtLayout.setVerticalGroup(
            negroBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        add(negroBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 20, 20));

        grisBt.setBackground(new java.awt.Color(210, 210, 210));
        grisBt.setForeground(new java.awt.Color(204, 204, 204));
        grisBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grisBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grisBtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout grisBtLayout = new javax.swing.GroupLayout(grisBt);
        grisBt.setLayout(grisBtLayout);
        grisBtLayout.setHorizontalGroup(
            grisBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        grisBtLayout.setVerticalGroup(
            grisBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(grisBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 20, 20));

        azulBt.setBackground(new java.awt.Color(0, 51, 255));
        azulBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        azulBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                azulBtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout azulBtLayout = new javax.swing.GroupLayout(azulBt);
        azulBt.setLayout(azulBtLayout);
        azulBtLayout.setHorizontalGroup(
            azulBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        azulBtLayout.setVerticalGroup(
            azulBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(azulBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 20, 20));

        rosaBt.setBackground(new java.awt.Color(255, 51, 255));
        rosaBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rosaBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rosaBtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rosaBtLayout = new javax.swing.GroupLayout(rosaBt);
        rosaBt.setLayout(rosaBtLayout);
        rosaBtLayout.setHorizontalGroup(
            rosaBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        rosaBtLayout.setVerticalGroup(
            rosaBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(rosaBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 20, 20));

        rojoBt.setBackground(new java.awt.Color(255, 0, 0));
        rojoBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rojoBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rojoBtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rojoBtLayout = new javax.swing.GroupLayout(rojoBt);
        rojoBt.setLayout(rojoBtLayout);
        rojoBtLayout.setHorizontalGroup(
            rojoBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        rojoBtLayout.setVerticalGroup(
            rojoBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(rojoBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 20, 20));

        amarilloBt.setBackground(new java.awt.Color(255, 255, 51));
        amarilloBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        amarilloBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                amarilloBtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout amarilloBtLayout = new javax.swing.GroupLayout(amarilloBt);
        amarilloBt.setLayout(amarilloBtLayout);
        amarilloBtLayout.setHorizontalGroup(
            amarilloBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        amarilloBtLayout.setVerticalGroup(
            amarilloBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(amarilloBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 20, 20));

        verdeBt.setBackground(new java.awt.Color(51, 255, 0));
        verdeBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verdeBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verdeBtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout verdeBtLayout = new javax.swing.GroupLayout(verdeBt);
        verdeBt.setLayout(verdeBtLayout);
        verdeBtLayout.setHorizontalGroup(
            verdeBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        verdeBtLayout.setVerticalGroup(
            verdeBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(verdeBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 20, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void rojoBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rojoBtMouseClicked
        asignarColor(rojo);
    }//GEN-LAST:event_rojoBtMouseClicked

    private void negroBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_negroBtMouseClicked
        asignarColor(negro);
    }//GEN-LAST:event_negroBtMouseClicked

    private void grisBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grisBtMouseClicked
        asignarColor(gris);
    }//GEN-LAST:event_grisBtMouseClicked

    private void azulBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_azulBtMouseClicked
        asignarColor(azul);
    }//GEN-LAST:event_azulBtMouseClicked

    private void rosaBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rosaBtMouseClicked
        asignarColor(rosa);
    }//GEN-LAST:event_rosaBtMouseClicked

    private void amarilloBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amarilloBtMouseClicked
        asignarColor(amarillo);
    }//GEN-LAST:event_amarilloBtMouseClicked

    private void verdeBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verdeBtMouseClicked
        asignarColor(verde);
    }//GEN-LAST:event_verdeBtMouseClicked

    private void blancoBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blancoBtMouseClicked
        asignarColor(blanco);
    }//GEN-LAST:event_blancoBtMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Blanco10;
    private javax.swing.JPanel Blanco3;
    private javax.swing.JPanel Blanco8;
    private javax.swing.JPanel amarilloBt;
    private javax.swing.JPanel azulBt;
    private javax.swing.JPanel blancoBt;
    private javax.swing.JPanel grisBt;
    private javax.swing.JPanel negroBt;
    private javax.swing.JPanel rojoBt;
    private javax.swing.JPanel rosaBt;
    private javax.swing.JPanel verdeBt;
    // End of variables declaration//GEN-END:variables

    private void asignarColor(Color cl) {
        //Ocultar la ventana
        this.setVisible(false);
    }

}
