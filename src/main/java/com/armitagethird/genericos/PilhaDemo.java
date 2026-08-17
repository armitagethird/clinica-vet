package com.armitagethird.genericos;
import java.util.List;
import com.armitagethird.arquivos.LeitorDeArquivo;
import java.io.IOException;

public class PilhaDemo {

    public static void main(String[] args){

        Pilha<Integer> pilha = new Pilha<>();

        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);

        System.out.println("Desempilhou: " + pilha.desempilhar());
        System.out.println("Desempilhou: " + pilha.desempilhar());
        System.out.println("Vazia? " + pilha.estaVazia());
        System.out.println("Desempilhou: " + pilha.desempilhar());
        System.out.println("Vazia? " + pilha.estaVazia());


        Pilha<Integer> a = new Pilha<>();
        Pilha<String> b = new Pilha<>();
        System.out.println("Mesma classe? " + (a.getClass() == (b.getClass())));
        //pilha.empilhar("vinte");

        List<String> nomes = List.of("Kerly", "Ana", "Zilda", "Bruno");
        List<Integer> valores = List.of(180, 90, 250, 120);

        System.out.println("Maior nome: " + Comparacoes.maiorDaLista(nomes));
        System.out.println("Maior valor: " + Comparacoes.maiorDaLista(valores));


        try{
            List<String> vazia = List.of();
            System.out.println("Maior de vazia: " + Comparacoes.maiorDaLista(vazia));
        } catch (ListaVaziaException e){
            System.out.println("Tratado: " + e.getMessage());
        }
        System.out.println("O programa continua vivo");

        System.out.println(testeFinally());

        System.out.println("--- AGENDA DE HOJE ---");
        try{
            LeitorDeArquivo.imprimirAgenda("consultas.txt");

        } catch (IOException e){
            System.out.println("Fala ao ler a agenda: " + e.getMessage());
        }


    }

    static String testeFinally() {
        try {
            return "valor do try";
        } finally {
            System.out.println(">>> finally rodou");
        }
    }
}
