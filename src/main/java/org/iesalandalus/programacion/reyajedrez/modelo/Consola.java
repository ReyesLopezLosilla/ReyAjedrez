package org.iesalandalus.programacion.reyajedrez.modelo;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
    private Consola(){}
    public static void mostrarMenu(){
        System.out.println("1. Crear rey por defecto");
        System.out.println("2. Crear rey eligiendo el color");
        System.out.println("3. Mover");
        System.out.println("4. Salir");
    }
    public static int elegirOpcionMenu(){
        int opcionElegida;
        System.out.println("Por favor, introduzca un número entre 1 y 4 en función de la opción deseada");
        opcionElegida = Entrada.entero();
        while (opcionElegida <1 || opcionElegida >4){
            System.out.println("Por favor, introduzca un número de opción válido");
            opcionElegida = Entrada.entero();
        }
        return opcionElegida;
    }
    public static int elegirOpcion(){
        int opcionColor;
        System.out.println("Elija un color indicando el número correspondiente. 1-Blanco o 2-Negro");
        opcionColor = Entrada.entero();
        while (opcionColor >2 || opcionColor <1){
            System.out.println("Por favor, introduce un número de opción válida");
            opcionColor = Entrada.entero();
        }
        return opcionColor;
    }



}

