package com.mycompany.figurasgeometricas;

class Circulo extends FiguraGeometrica {

    //Atributos
        private double radio;
    
        /**
         * Constructor Complejidad temporal: O(1) Tiempo constante.
         */
        public Circulo(String color, String nombre, double radio) {
            super(color, nombre);
            this.radio = radio;
        }
    
        /**
         * Método para calcular el área del círculo Complejidad temporal: O(1)
         * Tiempo constante.
         */
        @Override
        public double obtenerArea() {
            return Math.PI * Math.pow(radio, 2);
        }
    
        /**
         * Método para calcular el perímetro del círculo Complejidad temporal: O(1)
         * Tiempo constante.
         */
        @Override
        public double obtenerPerimetro() {
            return 2 * Math.PI * radio;
        }
    
    }