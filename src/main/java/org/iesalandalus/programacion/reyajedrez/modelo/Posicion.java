package org.iesalandalus.programacion.reyajedrez.modelo;

import java.util.Objects;

public class Posicion {
    private int fila;
    private char columna;


    public int getFila() {
        return fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setFila(int fila) throws IllegalArgumentException {
        if (fila <1 || fila >8) {
            throw new IllegalArgumentException("ERROR: Fila no válida.");
        }
        else {
            this.fila = fila;
        }
    }

    public void setColumna(char columna) throws IllegalArgumentException {
        if (columna <'a' || columna > 'h'){
            throw new IllegalArgumentException("ERROR: Columna no válida.");
        }
        else {
            this.columna = columna;
        }
    }

    public Posicion (int fila, char columna){
        setFila(fila);
        setColumna(columna);
    }
    public Posicion (Posicion posicion){
        if (posicion==null){
            System.out.println("ERROR: No es posible copiar una posición nula.");
        }else {
            this.setFila(posicion.getFila());
            this.setColumna(posicion.getColumna());}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posicion posicion = (Posicion) o;
        return fila == posicion.fila && columna == posicion.columna;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fila, columna);
    }

    @Override
    public String toString() {
        return "fila=" + fila + ", columna=" + columna;
    }
}
