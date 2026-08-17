package com.armitagethird.genericos;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {

    private final List<T> itens = new ArrayList<>();

    public void empilhar(T item) {
        itens.add(item);
    }

    public T desempilhar(){
        return itens.remove(itens.size() - 1);
    }

    public boolean estaVazia(){
        return itens.isEmpty();
    }
}
