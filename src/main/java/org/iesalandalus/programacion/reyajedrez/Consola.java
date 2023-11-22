package org.iesalandalus.programacion.reyajedrez;

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
    public static void mostrarMenuDirecciones(){
        System.out.println("1.Norte");
        System.out.println("2.Noreste");
        System.out.println("3.Este");
        System.out.println("4.Sureste");
        System.out.println("5.Sur");
        System.out.println("6.Suroeste");
        System.out.println("7.Oeste");
        System.out.println("8.Noroeste");
        System.out.println("9. Enroque corto");
        System.out.println("10. Enroque largo");
    }
    public static int elegirDireccion(){
        int direccionElegida;
        System.out.println("Por favor elija un número entre el 1 y el 10 en función de la dirección elegida");
        direccionElegida =Entrada.entero();
        while (direccionElegida<1 || direccionElegida > 10){
            System.out.println("Por favor, indique una opción válida");
            direccionElegida = Entrada.entero();
        }
        return direccionElegida;
    }
    public static void despedirse(){
        System.out.println("¡Nos vemos!");
    }



}

