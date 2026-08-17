package com.armitagethird.arquivos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDeArquivo {

    /**
     * Le um arquivo de texto e imprime cada linha cno console
     * @param caminho caminho do arquivo, relativo à raiz do projeto
     * @throws IOException se o arquivo nao existir ou nao puder ser lido
     */
    public static void imprimirAgenda(String caminho) throws IOException {
        try (BufferedReader leito = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = leito.readLine()) != null) {
                System.out.println(linha);
            }
        }
    }
}
