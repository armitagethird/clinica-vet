package com.armitagethird.app;                  // PACOTE app — DIFERENTE do pacote da ContaBancaria
import com.armitagethird.banco.ContaBancaria;   // IMPORT = apelido, não cópia. Só é preciso por serem pacotes diferentes.

public class Main {                             // CLASSE
    public static void main(String[] args){     // MÉTODO — o ÚNICO definido neste arquivo (termina em "{")
                                                // Daqui pra baixo é tudo CHAMADA (termina em ";")

        // ContaBancaria = TIPO | conta = REFERÊNCIA | new = fabrica o OBJETO | "Ana", 500.0 = ARGUMENTOS
        ContaBancaria conta = new ContaBancaria("Ana", 500.0);
        System.out.println("Titular: " + conta.getTitular());       // CHAMADA de método: tem parênteses
        System.out.println("Saldo Inicial " + conta.getSaldo());

        conta.depositar(100.0);                 // a REFERÊNCIA antes do ponto define quem é o "this" lá dentro
        System.out.println("Depois de depositar 100: " + conta.getSaldo());

        conta.sacar(30.0);
        System.out.println("Depois de sacar 30: " + conta.getSaldo());

        // 2º OBJETO, pelo construtor de 1 parâmetro. O 0.0 vem da delegação this(titular, 0.0).
        ContaBancaria contaDoBeto = new ContaBancaria("Beto");
        System.out.println("Saldo do Beto: " + contaDoBeto.getSaldo());

        ContaPoupanca poupanca = new ContaPoupanca("Carla", 1000.0, 0.05);
        System.out.println("Poupança da Carla: " + poupanca.getSaldo());
        poupanca.render();
        System.out.println("Depois de render 5%: " + poupanca.getSaldo());
        poupanca.experimentoVisibilidade();

        System.out.println("--- agora vai quebrar de proposito ---");
        conta.sacar(9999.0);                    // lança IllegalStateException e MATA o método aqui
        System.out.println("Esta linha nunca vai ser impressa.");
    }
}
