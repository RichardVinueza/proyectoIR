/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercio;

import controlador.Controlador;
import modelo.Modelo;
import vista.PrincipalV;


/**
 *
 * @author Ivet
 */
public class Comercio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PrincipalV vistaGeneral = new PrincipalV();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(vistaGeneral,modelo);
        vistaGeneral.setVisible(true);
        
        
        
      
        // TODO code application logic here
    }
    
}
