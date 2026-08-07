package com.armitagethird.formas;

public class Retangulo extends FormaGeometrica {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        super("Retangulo");
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double area(){
        return altura * largura;
    }




}
