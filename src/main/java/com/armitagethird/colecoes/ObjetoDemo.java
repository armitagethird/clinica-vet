package com.armitagethird.colecoes;

import com.armitagethird.fundamentos.Produto;

public class ObjetoDemo {

    public static void main(String[] args) {

        // 1) UM MOLDE, DOIS OBJETOS
        Produto cafe = new Produto("Café", 25.90, "Bebidas");
        Produto arroz = new Produto("Arroz", 22.00, "Alimentos");
        System.out.println("1) Dois objetos, cada um com seus proprios campos:");
        System.out.println("   " + cafe);
        System.out.println("   " + arroz);

        // 2) MEXER EM UM NAO MEXE NO OUTRO
        cafe.aplicarDesconto(50);
        System.out.println();
        System.out.println("2) Desconto de 50% SO no cafe:");
        System.out.println("   " + cafe);
        System.out.println("   " + arroz);

        // 3) A VARIAVEL NAO E O OBJETO
        Produto apelido = cafe;
        apelido.aplicarDesconto(50);
        System.out.println();
        System.out.println("3) Desconto aplicado via 'apelido' — olha o 'cafe':");
        System.out.println("   cafe    = " + cafe);
        System.out.println("   apelido = " + apelido);
        System.out.println("   cafe == apelido ? " + (cafe == apelido));

        // 4) MESMO CONTEUDO NAO E MESMO OBJETO
        Produto gemeo1 = new Produto("Feijao", 9.80, "Alimentos");
        Produto gemeo2 = new Produto("Feijao", 9.80, "Alimentos");
        System.out.println();
        System.out.println("4) Dois objetos com conteudo identico:");
        System.out.println("   gemeo1 == gemeo2      ? " + (gemeo1 == gemeo2));
        System.out.println("   gemeo1.equals(gemeo2) ? " + gemeo1.equals(gemeo2));

        // 5) QUANTOS OBJETOS EXISTEM DE VERDADE?
        System.out.println();
        System.out.println("5) Identidade de cada um (numero unico por objeto):");
        System.out.println("   cafe    -> " + System.identityHashCode(cafe));
        System.out.println("   apelido -> " + System.identityHashCode(apelido));
        System.out.println("   arroz   -> " + System.identityHashCode(arroz));
        System.out.println("   gemeo1  -> " + System.identityHashCode(gemeo1));
        System.out.println("   gemeo2  -> " + System.identityHashCode(gemeo2));
    }
}