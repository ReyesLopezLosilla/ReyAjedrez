package org.iesalandalus.programacion.reyajedrez.modelo;

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
            throw new IllegalArgumentException("La fila no puede ser menor que uno o mayor que ocho.");
        }
        else {
            this.fila = fila;
        }
    }

    public void setColumna(char columna) throws IllegalArgumentException {
        if (columna <'a' || columna > 'h'){
            throw new IllegalArgumentException("La columna no puede ser diferente de a-h");
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
        this.setFila(posicion.getFila());
        this.setColumna(posicion.getColumna());
    }

}
