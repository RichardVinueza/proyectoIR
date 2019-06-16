package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.articulosV;
import vista.comprasV;
import vista.PrincipalV;

/**
 *
 * @author Ivet
 */
public class Controlador {
    
    public static PrincipalV objv;
    public static Modelo objm;
    

    public Controlador(PrincipalV vistaGeneral, Modelo modelo){ 
        objv = vistaGeneral;
        objm = modelo;
        objv.jButtonCompras.addActionListener(new clickCompras());
        
    }

    private static class clickCompras implements ActionListener {

        public clickCompras() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            objv.inicializarMenu2();
            PrincipalV.vistaMenu2.setVisible(true);
            objv.setVisible(false);
        }
    }




}
