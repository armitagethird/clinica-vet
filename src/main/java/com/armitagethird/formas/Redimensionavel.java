package com.armitagethird.formas;

public interface Redimensionavel{

    void redimensionar(double fator);

    default void resetar(){
        System.out.println("Voltando ao original.");


    }

}
