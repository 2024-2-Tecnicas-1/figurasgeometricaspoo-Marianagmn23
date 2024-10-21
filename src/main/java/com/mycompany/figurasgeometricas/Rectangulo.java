package com.mycompany.figurasgeometricas;

class Rectangulo extends FiguraGeometrica {

    //Atributos
        private int lado1;
        private int lado2;
    
        /**
         * Constructor Complejidad temporal: O(1) Tiempo constante.
         */
        public Rectangulo(String color, String nombre, int lado1, int lado2) {
            super(color, nombre);
            this.lado1 = lado1;
            this.lado2 = lado2;
        }
    
        /**
         * Método para calcular el área del rectángulo Complejidad temporal: O(1)
         * Tiempo constante.
         */
        @Override
        public double obtenerArea() {
            return lado1 * lado2;
    
        }
    
        /**
         * Método para calcular el perímetro del rectángulo Complejidad temporal:
         * O(1) Tiempo constante.
         */
        @Override
        public double obtenerPerimetro() {
            return 2 * (lado1 + lado2);
    
        }
    
    }