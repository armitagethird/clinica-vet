package com.armitagethird.formas;

public class Circulo extends FormaGeometrica implements Redimensionavel {
    private double raio;

    public Circulo(double raio) {
        super("Circulo");
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }

    @Override
    public void redimensionar(double fator) {
        this.raio = raio * fator;

    }


}


