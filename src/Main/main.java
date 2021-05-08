
package Main;

import Controlador.controlador;
import Modelo.modelo;
import Vista.Vista;
import Vista.Vista2;
import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        Vista vista=new Vista();
        modelo Modelo=new modelo();
        controlador control=new controlador(Modelo, vista);
        control.ver();
    }
    
}
