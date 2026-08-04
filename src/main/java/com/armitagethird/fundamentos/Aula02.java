package com.armitagethird.fundamentos;

public class Aula02 {
    private static int alunosProcessados = 0;
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

        Aluno a = new Aluno("Romero");

        renomear(a);
        System.out.println("Depois de renomear: " + a.getNome());

        trocar(a);
        System.out.println("Depois de trocar: " + a.getNome());

        Aluno b = new Aluno("Ana");
        Aluno c = new Aluno("Lucas");

        processar(a);
        processar(b);
        processar(c);
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
    private static void renomear(Aluno aluno){
        aluno.setNome("MUDADO");
    }
    private static void trocar(Aluno aluno){
        aluno = new Aluno("OUTRO");
    }
    private static void processar(Aluno aluno) {
        int contadorLocal = 0;
        contadorLocal++;
        alunosProcessados++;
        System.out.println(aluno.getNome() + " | local: " + contadorLocal + " | static: " + alunosProcessados);
    }

}
