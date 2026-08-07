package com.armitagethird.app;
import com.armitagethird.banco.ContaBancaria;


public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;
    private static final double TAXA_SAQUE = 2.0;
    public ContaPoupanca(String titular, double saldo, double taxa){
        super(titular, saldo);
        this.taxaRendimento = taxa;
    }
    public void render(){
        double juros = getSaldo() * taxaRendimento;
        depositar(juros);
    }
    public void experimentoVisibilidade(){
        System.out.println(numeroConta);

    }

    @Override
    public void sacar(double valor){
        System.out.println(" [poupanca] cobrando taxa de " + TAXA_SAQUE);
        super.sacar(valor + TAXA_SAQUE);
    }



}
