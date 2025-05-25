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

    private static final JPanel[] mesasTrabajo = new JPanel[NewTabUtil.maxTabs];

    //Los paneles que editaremos son siempre los mismos, es por eso que los iniciamos, y no los heredamos con argumentos.
    //El primero es el Panel del contenido, y el segundo es la barra de Pestañas.
    private final JPanel barraPestanias = Foliador.barraPestanias;
    private final JPanel worktable = Foliador.workspace;

    public NewTab() {
        //Si el índice está vació, asignar el Panel por primera vez.
        if(mesasTrabajo[0] == null){
            mesasTrabajo[0] = Foliador.mesaTrabajo0;
        }

        
    }

    public void nuevoFolio() {
        //Se pueden crear 9 folios máximo
        if (nTab < NewTabUtil.maxTabs) {
            this.crearPestania();
            this.crearMesaTrabajo();
            nTab++;
        }

    }

     /*
    Crear el panel Pestaña, con sus elementos y configuraciones
    */
    private void crearPestania() {

        JPanel pestania = new JPanel();

        //El título de la pestania es el número de pestañas más 1, porque el Folio 1, ya está en default
        JLabel titulo = new JLabel("Folio " + (nTab + 1));
        titulo.setForeground(NewTabUtil.BACKGROUND_LABEL);

        //Nombre de pestania, para identificar el número de folio
        pestania.setName(Integer.toString(nTab));
        pestania.setLayout(new AbsoluteLayout());
        pestania.setBackground(NewTabUtil.BACKGROUND_TAB);
        pestania.add(titulo, new AbsoluteConstraints(7, 7));
        pestania.setVisible(true);

        /*ActionListener para el JPanel 'pestania', que funge como botón
        Que solo funciona al dar clic dentro del panel, no influye en el comportamiento inicial
        */
        pestania.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Convertir el nombre a int, que es index dentro del arreglo de mesas de trabajo.
                int index = Integer.parseInt(pestania.getName());
                
                agregarMesaTrabajo(getMesaTrabajo(index));
            }

        });

        agregarPestania(pestania);

    }

    
    /*
    Crear el panel Mesa de Trabajo, con sus elementos y configuraciones
    */
    private void crearMesaTrabajo() {

        int ejeYField = 75;
        int widthField = 110;
        int heigthField = 25;

        JPanel mesaTrabajo = new JPanel();

        //Componentes
        JSlider sliderX, sliderY;
        JTextField cX, cY;


        cX = new JTextField(String.valueOf(nTab + 1));
        cY = new JTextField(String.valueOf(nTab + 1));

        cX.setHorizontalAlignment(JTextField.CENTER);
        cY.setHorizontalAlignment(JTextField.CENTER);


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

        asignarMesaTrabajo(mesaTrabajo);

        agregarMesaTrabajo(mesaTrabajo);

    }

    
     /*
    Agregar a la barra de Pestañas, un panel
    */
    private void agregarPestania(JPanel pestania) {
        int ubicacionX = nTab * 90;
        barraPestanias.add(pestania, new AbsoluteConstraints(ubicacionX, 0, 90, 30));
        barraPestanias.revalidate();
        barraPestanias.repaint();
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

    private void asignarMesaTrabajo(JPanel panel) {
        NewTab.mesasTrabajo[nTab] = panel;
    }

    public static JPanel getMesaTrabajo(int index) {
        return NewTab.mesasTrabajo[index];
    }

}
