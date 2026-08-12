package com.armitagethird.fundamentos;

public class Aluno {
    private String nome;

    public Aluno(String nome){
        this.nome = validar(nome);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = validar(nome);
    }
    private static String validar(String nome){
        if (nome == null || nome.isBlank()){
    throw new IllegalArgumentException("Nome não pode ser vazio ou nulo");
        }
        return nome;
    }
}