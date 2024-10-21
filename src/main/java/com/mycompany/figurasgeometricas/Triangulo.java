package com.mycompany.figurasgeometricas;

class Triangulo extends FiguraGeometrica {
    //atributos
    
        private int base;
        private int altura;
    
        /**
         * Constructor Complejidad temporal: O(1) Tiempo constante.
         */
        public Triangulo(String color, String nombre, int base, int altura) {
            super(color, nombre);
            this.base = base;
            this.altura = altura;
        }
    
        /**
         * Método para calcular el área del triángulo Complejidad temporal: O(1)
         * Tiempo constante.
         */
        @Override
        public double obtenerArea() {
            return (base * altura) / 2;
        }
    
        /**
         * Método para calcular el perímetro del triángulo equilátero Complejidad
         * temporal: O(1) Tiempo constante.
         */
        @Override
        public double obtenerPerimetro() {
            return 3 * base;
        }
    
    }
