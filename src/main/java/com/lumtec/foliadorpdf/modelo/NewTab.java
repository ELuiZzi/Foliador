package com.lumtec.foliadorpdf.modelo;

import com.lumtec.foliadorpdf.interfaz.Foliador;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class NewTab {

    private static int nTab = 1;

    private static int xTab = 90;
    private static int xButton = 180;

    private static JPanel[] mesasTrabajo = new JPanel[NewTabUtil.maxTabs];
    private static JPanel[] tabs = new JPanel[NewTabUtil.maxTabs];

    private JPanel background = new JPanel();
    private JPanel bar = new JPanel();
    private JPanel button = new JPanel();

    private JLabel titleTab;

    //Los paneles que editaremos son siempre los mismos, es por eso que los iniciamos, y no los heredamos con argumentos.
    //El primero es el Panel del contenido, y el seguno es la barra de Pestañas.
    private JPanel barraPestañas = Foliador.barraPestañas;
    private JPanel worktable = Foliador.workspace;

    public NewTab() {
        //Si el indice está vacio, asignar el Panel por primera vez.
        if(mesasTrabajo[0] == null){
            mesasTrabajo[0] = Foliador.mesaTrabajo0;
        }
        
    }

    public void nuevoFolio() {
        //Se pueden crear 9 folios maximos
        if (nTab < NewTabUtil.maxTabs) {
            this.crearPestaña();
            this.crearMesaTrabajo();
            nTab++;
        }

    }

     /*
    Crear el panel Pestaña, con sus elementos y configurarciones
    */
    private void crearPestaña() {

        JPanel pestaña = new JPanel();

        //El titulo de la pestaña es el numero de pestañas más 1, porque el Folio 1, ya está en default
        JLabel titulo = new JLabel("Folio " + (nTab + 1));
        titulo.setForeground(NewTabUtil.BACKGROUND_LABEL);

        //Nombre de pestaña , para identificar el numero de folio
        pestaña.setName(Integer.toString(nTab));
        pestaña.setLayout(new AbsoluteLayout());
        pestaña.setBackground(NewTabUtil.BACKGROUND_TAB);
        pestaña.add(titulo, new AbsoluteConstraints(7, 7));
        pestaña.setVisible(true);

        /*ActionListener para el JPanel 'pestaña', que funge como botón
        Que solo funciona al dar click dentro del panel, no influye en el comportamiento inicial
        */
        pestaña.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Convertir el nombre a int, que es index dentro del arreglo de mesas de trabajo.
                int index = Integer.parseInt(pestaña.getName());
                
                agregarMesaTrabajo(getMesaTrabajo(index));
            }

        });

        agregarPestaña(pestaña);

    }

    
    /*
    Crear el panel Mesa de Trabajo, con sus elementos y configurarciones
    */
    private void crearMesaTrabajo() {

        int ejeYField = 75;
        int widthField = 110;
        int heigthField = 25;

        JPanel mesaTrabajo = new JPanel();

        //Componentes
        JTextField cX, cY;
        JSlider sliderX, sliderY;

        cX = new JTextField("X" + (nTab + 1));
        cY = new JTextField("Y" + (nTab + 1));

        sliderX = new JSlider();
        sliderY = new JSlider();

        sliderX.setOrientation(JSlider.HORIZONTAL);
        sliderY.setOrientation(JSlider.VERTICAL);
        sliderX.setBackground(NewTabUtil.BACKGROUND_MESA_TRABAJO);
        sliderY.setBackground(NewTabUtil.BACKGROUND_MESA_TRABAJO);

        mesaTrabajo.setLayout(new AbsoluteLayout());
        mesaTrabajo.setBackground(NewTabUtil.BACKGROUND_MESA_TRABAJO);
        mesaTrabajo.add(cX, new AbsoluteConstraints(70, ejeYField, widthField, heigthField));
        mesaTrabajo.add(cY, new AbsoluteConstraints(300, ejeYField, widthField, heigthField));
        mesaTrabajo.add(sliderX, new AbsoluteConstraints(60, 110, 130, 25));
        mesaTrabajo.add(sliderY, new AbsoluteConstraints(410, 20, 25, 130));

        asignarMessaTrabajo(mesaTrabajo);

        agregarMesaTrabajo(mesaTrabajo);

    }

    
     /*
    Agregar a la barra de Pestañas, un panel
    */
    private void agregarPestaña(JPanel pestaña) {
        int ubicacionX = nTab * 90;
        barraPestañas.add(pestaña, new AbsoluteConstraints(ubicacionX, 0, 90, 30));
        barraPestañas.revalidate();
        barraPestañas.repaint();
    }

     /*
    Agregar a Background, un panel
    */
    public void agregarMesaTrabajo(JPanel mesaTrabajo) {
        worktable.removeAll();

        worktable.add(mesaTrabajo, new AbsoluteConstraints(0, 0, 510, 500));
        worktable.revalidate();
        worktable.repaint();
    }

    private void asignarMessaTrabajo(JPanel panel) {
        NewTab.mesasTrabajo[nTab] = panel;
    }

    public static JPanel getMesaTrabajo(int index) {
        return NewTab.mesasTrabajo[index];
    }

}
