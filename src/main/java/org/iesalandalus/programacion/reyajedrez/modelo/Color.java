package org.iesalandalus.programacion.reyajedrez.modelo;

public enum Color {
    BLANCO ("Blanco"), NEGRO ("Negro");
    private String cadenaAMostrar;

    public Color (String cadenaAMostrar) {
        this.cadenaAMostrar = cadenaAMostrar;
    }

    @Override
    public String toString() {
        return "Color{" +
                "cadenaAMostrar='" + cadenaAMostrar + '\'' +
                '}';
    }
}
