package com.armitagethird.formas;

public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        super("Circulo");
        this.raio = raio;
    }

    @Override
    public double area(){
        return Math.PI * raio * raio;
    }




}
