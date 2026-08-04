package com.armitagethird.banco;              // PACOTE = a pasta com/armitagethird/banco

public class ContaBancaria {                  // CLASSE = a planta. Aqui tudo é DEFINIDO, nada executa.

    // CAMPOS = o estado do objeto. Uma cópia POR OBJETO. Terminam em ";" e não têm parênteses.
    private String titular;                   // private         = só esta classe enxerga
    private double saldo;                     // private
    protected String numeroConta;             // protected       = esta classe + o pacote inteiro + subclasses
    String codigoInterno;                     // SEM modificador = package-private (só o pacote). NÃO é public!

    // CONSTRUTOR = nome igual ao da classe e SEM tipo de retorno. Quem chama é o "new".
    // titular e saldo aqui são PARÂMETROS: temporários, deixam de existir no "}" do construtor.
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;               // this.campo = parâmetro -> guarda no objeto (sem o "this." não faria nada)
        this.saldo = saldo;
        this.numeroConta = "CC-" + titular.toUpperCase();   // campo DERIVADO: a classe calcula, não recebe
        this.codigoInterno = "INT-" + titular.length();     // campo DERIVADO
    }

    // 2º CONSTRUTOR: mesmo nome, lista de parâmetros diferente (sobrecarga).
    public ContaBancaria(String titular){
        this(titular, 0.0);                   // this(...) = delega pro outro construtor. Obrigatoriamente a 1ª linha.
    }

    // MÉTODO = tem TIPO DE RETORNO antes do nome e termina em "{". Este RESPONDE: devolve e não muda nada.
    public String getTitular(){
        return titular;                       // dispensa o "this.": não existe parâmetro com esse nome aqui
    }
    public double getSaldo(){
        return saldo;
    }

    // MÉTODO que AGE: void = não devolve nada, muda o estado do objeto.
    // Não existe setTitular nem setSaldo DE PROPÓSITO: o saldo só muda por regra de negócio.
    public void depositar(double valor){
        if (valor <= 0){                      // guarda: pergunta sobre o VALOR que chegou
            throw new IllegalArgumentException("Valor do depósito deve ser positivo. Recebido: " + valor);
        }
        this.saldo += valor;
    }
    public void sacar(double valor){
        if (valor <= 0){                      // pergunta sobre o VALOR  -> IllegalArgumentException
            throw new IllegalArgumentException("Valor do saque deve ser positivo. Recebido: " + valor);
        }
        if (valor > saldo){                   // pergunta sobre o OBJETO -> IllegalStateException
            throw new IllegalStateException("Saldo insuficiente. Saldo: " + saldo + ", saque pedido:" + valor);
        }
        this.saldo -= valor;                  // se algum throw acima disparar, esta linha NÃO roda
    }
}
