package com.armitagethird.fundamentos;

public class Aula02 {
    public static void main(String[] args) {
        int nota = 85;
        System.out.println("Você tirou = " + obterConceito(nota) + "!");

        int[] notas = {100, 89, 90, 70, 59};

        for (int i = 0; i < notas.length; i++){
            System.out.println(notas[i] + "->" + obterConceito(notas[i]));
        }
        for (int n : notas){
            System.out.println(n + "->" + obterConceito(n));
        }
        System.out.println("Média de valores soltos: " + media(10, 20, 30));
        System.out.println("Média do array notas:    " + media(notas));
        System.out.println("Média de nada:           " + media());
    }

    private static String obterConceito(int nota) {
        int bucket = nota / 10;
        return switch (bucket) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };
    }
    private static double media (int... notas){
        if (notas.length == 0) {
            return 0;
        }
        int soma = 0;
        for (int n : notas){
            soma += n;
        }
        return (double) soma/ notas.length;
    }

}
