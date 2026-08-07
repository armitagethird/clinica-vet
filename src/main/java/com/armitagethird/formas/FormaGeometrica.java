package com.armitagethird.formas;

public abstract class FormaGeometrica {

    private String nome;

    public FormaGeometrica(String nome){
        this.nome = nome;
    }
    public abstract double area();

    public String resumo(){
        return nome + " tem área " + area();

    }




}
