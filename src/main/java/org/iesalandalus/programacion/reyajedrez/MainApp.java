package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Rey;

public class MainApp {
    private Rey rey;
    public void ejecutarOpcion (int opcion){
        switch(opcion){
            case 1:
                rey = new Rey();
                break;
            case 2:
                Consola.elegirOpcion();
                break;
            case 3:
                Consola.mostrarMenuDirecciones();
                Consola.elegirDireccion();
                rey.mover();
                break;
            case 4:
                Consola.despedirse();
                break;
        }


    }
    public void crearReyDefecto(){
        rey = new Rey();
    }

    public static void main(String[] args) {


    }

}
