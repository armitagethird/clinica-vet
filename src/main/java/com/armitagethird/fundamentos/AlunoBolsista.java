package com.armitagethird.fundamentos;

public class AlunoBolsista extends Aluno {

    private String prefixo;

    public AlunoBolsista(String nome, String prefixo) {
        super(nome);
        this.prefixo = prefixo;
    }

    @Override
    public void setNome(String nome) {
        super.setNome(prefixo.toUpperCase() + " " + nome);
    }
}

