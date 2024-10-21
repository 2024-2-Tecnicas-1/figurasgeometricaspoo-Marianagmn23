package com.mycompany.figurasgeometricas;

public class FiguraGeometrica {
//Atributos
private String color;
private String nombre;

/**
 * Constructor Complejidad temporal: O(1) Tiempo constante.
 */
public FiguraGeometrica(String color, String nombre) {
    this.color = color;
    this.nombre = nombre;
}

/**
 * Métodos getter y setter Complejidad temporal: O(1) Tiempo constante.
 */
public String getNombre() {
    return nombre;
}

public void setNombre() {
    this.nombre = nombre;
} //revisar sets

public String getColor() {
    return nombre;
}

public void setColor() {
    this.color = color;
}

/**
 * Métodos para obtener el área y perímetro Complejidad temporal: O(1)
 * Tiempo constante.
 */
public double obtenerArea() {
    return 0.0;
}

public double obtenerPerimetro() {
    return 0.0;
}
}

