package com.armitagethird.fundamentos;

import java.util.Objects;

public class Produto implements Comparable<Produto> {

    private String nome;
    private double preco;
    private String categoria;

    public Produto(String nome, double preco, String categoria){
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(preco, produto.preco) == 0 && Objects.equals(nome, produto.nome) && Objects.equals(categoria, produto.categoria);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco, categoria);
    }
    @Override
    public int compareTo(Produto outro){
        return Double.compare(this.preco, outro.preco);
    }

    public void aplicarDesconto(double percentual) {
        this.preco = this.preco - (this.preco * percentual / 100);
    }
}
