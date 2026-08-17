package com.armitagethird.genericos;

public class ListaVaziaException extends  RuntimeException{

    public ListaVaziaException(String operacao){
        super("Nao existe " + operacao + " em uma lista vazia");
    }
}
