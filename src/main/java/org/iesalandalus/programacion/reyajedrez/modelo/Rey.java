package org.iesalandalus.programacion.reyajedrez.modelo;

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
    public Rey(Color color, Posicion posicion){
        this();
        if (color != Color.BLANCO){
            this.color = Color.NEGRO;
            this.posicion = new Posicion (8, 'e');
        }

    }


}
