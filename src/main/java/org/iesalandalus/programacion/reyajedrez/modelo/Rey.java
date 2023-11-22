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
            throw new NullPointerException("ERROR: La dirección no puede ser nula.");
        }
        else {
            try {
                switch (direccion) {
                    case NORTE:
                        this.posicion = new Posicion(posicion.getFila() + 1, posicion.getColumna());
                        totalMovimientos++;
                        break;
                    case NORESTE:
                        this.posicion = new Posicion(posicion.getFila() + 1, (char) (posicion.getColumna() + 1));
                        totalMovimientos++;
                        break;
                    case ESTE:
                        this.posicion = new Posicion(posicion.getFila(), (char) (posicion.getColumna() + 1));
                        totalMovimientos++;
                        break;
                    case SURESTE:
                        this.posicion = new Posicion(posicion.getFila() - 1, (char) (posicion.getColumna() + 1));
                        totalMovimientos++;
                        break;
                    case SUR:
                        this.posicion = new Posicion(posicion.getFila() - 1, posicion.getColumna());
                        totalMovimientos++;
                        break;
                    case SUROESTE:
                        this.posicion = new Posicion(posicion.getFila() - 1, (char) (posicion.getColumna() - 1));
                        totalMovimientos++;
                        break;
                    case OESTE:
                        this.posicion = new Posicion(posicion.getFila(), (char) (posicion.getColumna() - 1));
                        totalMovimientos++;
                        break;
                    case NOROESTE:
                        this.posicion = new Posicion(posicion.getFila() + 1, (char) (posicion.getColumna() - 1));
                        totalMovimientos++;
                        break;
                    case ENROQUE_CORTO:
                        if (totalMovimientos == 0){
                            this.posicion = new Posicion(posicion.getFila(), (char) (posicion.getColumna() + 2));
                            totalMovimientos++;
                        }else {
                            System.out.println("El rey se ha movido");
                        }

                        break;
                    case ENROQUE_LARGO:
                        if (totalMovimientos==0){
                            this.posicion = new Posicion(posicion.getFila(), (char) (posicion.getColumna() - 2));
                            totalMovimientos++;
                        }else {
                            System.out.println("El rey se ha movido");
                        }
                        break;
                }
            }catch(IllegalArgumentException e){
                throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
                }

           }
        }

    @Override
    public String toString() {
        return "color="+color +", posicion=("+posicion+")";
    }
}



