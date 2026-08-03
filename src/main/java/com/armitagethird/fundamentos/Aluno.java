package com.armitagethird.fundamentos;

public class Aluno {
    private String nome;

    public Aluno(String nome){
        setNome(nome);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        if (nome == null || nome.isBlank()){
    throw new IllegalArgumentException("Nome não pode ser vazio ou nulo");
        }
        this.nome = nome;
    }
}