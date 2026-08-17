package com.armitagethird.genericos;
import java.util.List;
public class Comparacoes {

    public static <T extends Comparable<T>> T maiorDaLista(List<T> lista){
        if (lista.isEmpty()){
            throw new ListaVaziaException("maior elemento");
        }
        T maior = lista.get(0);
        for (T item : lista){
            if (item.compareTo(maior) > 0){
                maior = item;
            }
        }
        return maior;
    }

}
