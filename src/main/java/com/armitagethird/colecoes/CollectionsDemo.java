package com.armitagethird.colecoes;

import com.armitagethird.fundamentos.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;
public class CollectionsDemo {

    public static void main(String[] args) {
        List<Produto> estoque = new ArrayList<>();

        estoque.add(new Produto("Ração Premium 10kg", 189.90, "alimentacao"));
        estoque.add(new Produto("Sachê de patê", 4.50, "alimentacao"));
        estoque.add(new Produto("Vermífugo", 32.00, "medicamento"));
        estoque.add(new Produto("Antipulgas", 78.40, "medicamento"));
        estoque.add(new Produto("Coleira refletiva", 24.90, "acessorio"));
        estoque.add(new Produto("Comedouro inox", 39.90, "acessorio"));

        System.out.println("sachê vs ração: " + estoque.get(1).compareTo(estoque.get(0)));

        System.out.println("Total de produtos: " + estoque.size());

        for (Produto p : estoque) {
            System.out.println(p);
        }

        System.out.println("Primeiro: " + estoque.get(0).getNome());
        System.out.println("Contem coleira? " + estoque.contains(
                new Produto("Coleira refletiva", 24.90, "acessorio")));

        System.out.println("--- removendo acessorios ---");
        Iterator<Produto> it = estoque.iterator();
        while (it.hasNext()) {
            Produto p = it.next();
            if (p.getCategoria().equals("acessorio")) {
                it.remove();
            }
        }
        System.out.println("Sobraram: " + estoque.size());
        for (Produto p : estoque) {
            System.out.println(p);
        }
        System.out.println("--- SET ---");
        Set<Produto> catalogo = new HashSet<>();
        catalogo.add(new Produto("Vermifugo", 32.00, "medicamento"));
        catalogo.add(new Produto("Vermifugo", 32.00, "medicamento"));
        catalogo.add(new Produto("Antipulgas", 78.40, "medicamento"));
        System.out.println("Tamanho do catalogo: " + catalogo.size());


        System.out.println("--- MAP ---");
        Map<String, Integer> porCategoria = new HashMap<>();
        for (Produto p : estoque) {
            porCategoria.put(
                    p.getCategoria(),
                    porCategoria.getOrDefault(p.getCategoria(), 0) + 1);
        }
        System.out.println(porCategoria);

        System.out.println("--- AGRUPADO ---");
        Map<String, List<Produto>> agrupado = new HashMap<>();
        for (Produto p : estoque) {
            agrupado.computeIfAbsent(p.getCategoria(), k -> new ArrayList<>()).add(p);
        }
        for (Map.Entry<String, List<Produto>> entrada : agrupado.entrySet()) {
            System.out.println(entrada.getKey() + " tem " + entrada.getValue().size());
        }

        System.out.println("--- POR NOME ---");
        estoque.sort(Comparator.comparing(Produto::getNome));
        for (Produto p : estoque) {
            System.out.println(p.getNome() + " - " + p.getPreco());
        }

        System.out.println("--- MAIS CARO PRIMEIRO ---");
        estoque.sort(Comparator.comparingDouble(Produto::getPreco).reversed());
        for (Produto p : estoque) {
            System.out.println(p.getNome() + " - " + p.getPreco());
        }

        System.out.println("--- CATEGORIA, DEPOIS PRECO ---");
        estoque.sort(Comparator.comparing(Produto::getCategoria)
                .thenComparing(Produto::getPreco));
        for (Produto p : estoque) {
            System.out.println(p.getCategoria() + " | " + p.getNome() + " - " + p.getPreco());
        }


        System.out.println("--- ORDENADO POR PREÇO ---");
        Collections.sort(estoque);
        for (Produto p : estoque){
            System.out.println(p.getNome() + " - " + p.getPreco());
        }
    }
}