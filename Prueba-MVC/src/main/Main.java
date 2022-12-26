

package main;

import Controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class Main {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador control = new Controlador(modelo,vista);
        
        control.iniciar();
        vista.setVisible(true);        
    }
}
