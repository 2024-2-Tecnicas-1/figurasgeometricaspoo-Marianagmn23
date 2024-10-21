package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
             /**
     * Consola 
     * Complejidad temporal: O(1) Tiempo constante.
     */
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la figura");
        String nombreFigura = scan.nextLine();

        System.out.println("Ingrese el color de la figura");
        String colorFigura = scan.nextLine();

        System.out.println("Ingrese el tipo de figura(1: Círculo, 2: Rectángulo, 3: Triángulo)");
        int tipoFigura = scan.nextInt();

        FiguraGeometrica figura = null;
             /**
     * Switch y objetos 
     * Complejidad temporal: O(1) Tiempo constante.
     */
        switch (tipoFigura) {
            case '1':
                System.out.println("Ingrese el radio del circulo");
                double radio = scan.nextDouble();
                figura = new Circulo(colorFigura, nombreFigura, radio);
                break;
            case '2':
                System.out.println("Ingrese el valor del lado 1 del rectangulo");
                int lado1 = scan.nextInt();
                System.out.println("Ingrese el valor del lado 2 del rectángulo");
                int lado2 = scan.nextInt();
                figura = new Rectangulo(colorFigura, nombreFigura, lado1, lado2);
                break;
            case '3':
                System.out.println("Ingrese el valor de la base del triángulo");
                int base = scan.nextInt();
                System.out.println("Ingrese el valor de la altura del triángulo");
                int altura = scan.nextInt();
                figura = new Triangulo(colorFigura, nombreFigura, base, altura);
                break;
            default:
                System.out.println("Tipo de figura no válida");
                break;
        }
             /**
     * Resultados de área y perímetro.
     * Complejidad temporal: O(1) Tiempo constante.
     */
        if (figura != null) {
            System.out.println("El área de la figura es: " + figura.obtenerArea());
            System.out.println("El perímetro de la figura es: " + figura.obtenerPerimetro());
        }
    }
}

