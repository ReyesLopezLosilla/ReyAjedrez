package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reyajedrez.modelo.Rey;

import javax.naming.OperationNotSupportedException;

public class MainApp {
    private Rey rey;
    public void ejecutarOpcion (int opcion){
        switch(opcion){
            case 1:
                crearReyDefecto();
                break;
            case 2:
                crearReyColor(Consola.elegirOpcion());
                break;
            case 3:
                mover();
                break;
            case 4:
                Consola.despedirse();
                break;
        }


    }
    public void crearReyDefecto(){
        rey = new Rey();
    }
    public void crearReyColor(int color){
        rey = new Rey();
        if (color == 1){
            rey = new Rey (Color.BLANCO);
        }else {
            rey = new Rey (Color.NEGRO);
        }
    }

    public void mover(){
        Consola.mostrarMenuDirecciones();
        try {
            switch (Consola.elegirDireccion()) {
                case 1:
                    rey.mover(Direccion.NORTE);
                    break;
                case 2:
                    rey.mover(Direccion.NORESTE);
                    break;
                case 3:
                    rey.mover(Direccion.ESTE);
                    break;
                case 4:
                    rey.mover(Direccion.SURESTE);
                    break;
                case 5:
                    rey.mover(Direccion.SUR);
                    break;
                case 6:
                    rey.mover(Direccion.SUROESTE);
                    break;
                case 7:
                    rey.mover(Direccion.OESTE);
                    break;
                case 8:
                    rey.mover(Direccion.NOROESTE);
                    break;
                case 9:
                    rey.mover(Direccion.ENROQUE_CORTO);
                    break;
                case 10:
                    rey.mover(Direccion.ENROQUE_LARGO);
                    break;
            }
        }catch(OperationNotSupportedException e){
            System.out.println(e.getMessage());
        }
    }
    public void mostrarRey (){
        if (rey == null){
            System.out.println("El rey no está creado");
        }else {
            System.out.println(rey);
        }
    }


    public static void main(String[] args) {
        boolean continuar;
        continuar = true;
        do {
            Consola.mostrarMenu();
            Consola.elegirOpcionMenu();


        } while (continuar ==true);


    }

}
