package org.iesalandalus.programacion.reyajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Rey {
    private Color color;
    private Posicion posicion;
    private int totalMovimientos;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) throws IllegalArgumentException {
        this.posicion = posicion;
    }

    public int getTotalMovimientos() {
        return totalMovimientos;
    }

    public void setTotalMovimientos(int totalMovimientos) {
        this.totalMovimientos = totalMovimientos;
    }
    public Rey (){
        this.color = Color.BLANCO;
        this.posicion = new Posicion(1, 'e');
    }
    public Rey(Color color){
        this();
        if (color != Color.BLANCO){
            this.color = Color.NEGRO;
            this.posicion = new Posicion (8, 'e');
        }

    }
    public void mover (Direccion direccion)throws NullPointerException, OperationNotSupportedException{
        if (direccion == null){
            throw new NullPointerException("Esa posición es nula.");
        }
        else {
            try {
                switch (direccion) {
                    case NORTE:
                        this.posicion = new Posicion(posicion.getFila() + 1, posicion.getColumna());
                        break;
                    case NORESTE:
                        this.posicion = new Posicion(posicion.getFila() + 1, (char) (posicion.getColumna() + 1));
                        break;
                    case ESTE:
                        this.posicion = new Posicion(posicion.getFila(), (char) (posicion.getColumna() + 1));
                        break;
                    case SURESTE:
                        this.posicion = new Posicion(posicion.getFila() - 1, (char) (posicion.getColumna() + 1));
                        break;
                    case SUR:
                        this.posicion = new Posicion(posicion.getFila() - 1, posicion.getColumna());
                        break;
                    case SUROESTE:
                        this.posicion = new Posicion(posicion.getFila() - 1, (char) (posicion.getColumna() - 1));
                        break;
                    case OESTE:
                        this.posicion = new Posicion(posicion.getFila(), (char) (posicion.getColumna() - 1));
                        break;
                    case NOROESTE:
                        this.posicion = new Posicion(posicion.getFila() + 1, (char) (posicion.getColumna() - 1));
                        break;
                    case ENROQUE_CORTO:
                        this.posicion = new Posicion(posicion.getFila(), (char) (posicion.getColumna() + 2));
                        break;
                    case ENROQUE_LARGO:
                        this.posicion = new Posicion(posicion.getFila(), (char) (posicion.getColumna() - 2));
                        break;
                }
            }catch(IllegalArgumentException e){
                throw new OperationNotSupportedException("Movimiento no válido.");
                }

           }
        }

    @Override
    public String toString() {
        return "Rey{" +
                "color=" + color +
                ", posicion=" + posicion +
                '}';
    }
}



