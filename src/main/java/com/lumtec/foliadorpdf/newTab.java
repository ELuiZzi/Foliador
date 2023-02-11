package com.lumtec.foliadorpdf;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class newTab {

    private static int nTab = 2;
    private static int xTab = 90;
    private static int xButton = 180;

    private JPanel background = new JPanel();
    private JPanel bar = new JPanel();
    private JPanel button = new JPanel();
    private JPanel[] folios = new JPanel[32];
    private JPanel[] tabs = new JPanel[32];

    private JLabel titleTab;

    private JPanel tab;
    private JPanel worktable;

    public newTab(JPanel work, JPanel bar, JPanel button) {
        this.background = work;
        this.bar = bar;
        this.button = button;
        folios[0] = work;
    }

    public void addPanel() {
        this.background.removeAll();

        newTab();

        newWindow();

        //Configs del button
        this.button.setLocation(xButton, 0);

        xTab = xTab + 90;
        xButton = xButton + 90;

        ++nTab;

        //En caso de que se agreguen más de 9 tabs...
        if (nTab == 9) {

        }

        //Revalidar y repintar
        this.background.revalidate();
        this.bar.revalidate();
        this.background.repaint();
        this.bar.repaint();
    }

    //Nuevo tab
    private void newTab() {
        tab = new JPanel();

        titleTab = new JLabel("Folio " + nTab);

        //Configs del tab
        tab.setName(Integer.toString(nTab - 1));
        tab.setVisible(true);
        tab.setLayout(new AbsoluteLayout());
        tab.add(titleTab, new AbsoluteConstraints(10, 7));
        addCloseButton(tab, tabs[nTab - 2]);
        System.out.println(nTab - 2);
        tab.setCursor(new Cursor(Cursor.HAND_CURSOR));
        tab.addMouseListener(new MouseAdapter() {
            @Override
            //Mostrar en Interfaz la ventana
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getComponent().getName());
                background.removeAll();
                background.add(folios[Integer.parseInt(e.getComponent().getName())], new AbsoluteConstraints(0, 0, 570, 500));
                background.revalidate();
                background.repaint();
            }

        });

        //Guardar el Tab en un arreglo
        tabs[nTab - 1] = tab;

        //Agregar el tab a la interfaz
        this.bar.add(tab, new AbsoluteConstraints(xTab, 0, 90, 30));
    }

    //Nueva Ventana
    private void newWindow() {
        worktable = new JPanel();

        //Configs del table
        worktable.setVisible(true);
        worktable.setLayout(new AbsoluteLayout());
        JTextField x = new JTextField("X" + nTab);
        JTextField y = new JTextField("Y" + nTab);
        JSlider xS = new JSlider();
        xS.setOrientation(JSlider.HORIZONTAL);
        JSlider yS = new JSlider();
        yS.setOrientation(JSlider.VERTICAL);
        worktable.add(x, new AbsoluteConstraints(75, 75, 110, 25));
        worktable.add(y, new AbsoluteConstraints(300, 75, 110, 25));
        worktable.add(xS, new AbsoluteConstraints(60, 110, 130, 25));
        worktable.add(yS, new AbsoluteConstraints(410, 20, 25, 130));

        folios[nTab - 1] = worktable;

        this.background.add(worktable, new AbsoluteConstraints(0, 0, 570, 500));
    }

    private void addCloseButton(JPanel tab1, JPanel tab2) {
        tab1.add(closeButton(), new AbsoluteConstraints(70, 8, 15, 15));
        /*
        Se crea el try, para la primera vez que no existe un tab, no nos de error de null.
         */
        try {
            tab2.remove(1); //Lista que inicia en el -1 (-1,0,1), el botón es el tercer elemento
        } catch (NullPointerException ex) {
            System.out.println("Error");
        }

    }

    //Botón Cerrar
    private JPanel closeButton() {
        JPanel closeButton = new JPanel();
        closeButton.setName("button");
        closeButton.setBackground(new Color(255, 51, 60));
        closeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                bar.size();
                bar.remove(nTab-2);
                --nTab;
                bar.revalidate();
                bar.repaint();
            }
        });

        return closeButton;

    }
}
