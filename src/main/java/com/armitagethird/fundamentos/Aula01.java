package com.armitagethird.fundamentos;

public class Aula01 {
    public static void main(String[] args) {
        int idadeDoPet = 5;
        double pesoEmKg = 10.0;
        boolean vacinado = true;
        System.out.println("vacinado: " + vacinado);
        System.out.println("Idade do Pet: " + idadeDoPet);
        System.out.println("Peso em KG: " + pesoEmKg);


        Integer a = 100;
        Integer b = 100;
        Integer x = 200;
        Integer y = 200;

        System.out.println( a == b);
        System.out.println(x == y);
        System.out.println(x.equals(y));
// a == b dá true pq a jvm tem de -128 a 127 no cache dela e 200 não está entre eles, portanto, o
// compilador nao associa e compara os valores, ele busca e nao acha. Para economizar memoria.

        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println( s1 == s2);
        System.out.println( s1 == s3);
        System.out.println( s1.equals(s3));
// s1 == s2 dá true pq apontam para o mesmo hello, já s1 == s3 dá false pq s3 é um novo hello que foi criado, diferente do s1 e s2

        int[] numeros = {10, 20, 30};
        String[] nomes = new String[3];
        nomes[0] = "Rex";

        System.out.println(numeros.length);
        System.out.println(nomes.length);

        int[] copia = numeros;
        copia[0] = 99;
        System.out.println(numeros[0]);
// copia aponta pro MESMO array que numeros, por isso mudar copia[0] também muda numeros[0];

        var totalDePets = 3;
        var nomeDoTutor = "Carlos";

        System.out.println(totalDePets);
        System.out.println(nomeDoTutor);



    }

}
