package br.com.xti.erros;

import java.util.Scanner;

public class Assertion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe um número de 0 a 10");
        int numero = s.nextInt();

        // Verificação em etapa de desenvolvimento - vem desligadas por padrão
        assert (numero >= 0 && numero <= 10) : " Numero inválido " + numero;
        System.out.println("Você entrou " + numero);
        s.close();
    }
}
