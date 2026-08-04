package com.armitagethird.banco;

public class Auditoria {
    public static void inspecionar(ContaBancaria conta){
        System.out.println(conta.numeroConta);
        System.out.println(conta.codigoInterno);
        //System.out.println(conta.titular);
    }
}
