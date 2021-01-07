package br.com.xti.logica;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        System.out.println("Qual seu nome?");
        Scanner s = new Scanner(System.in);
        String nome = s.nextLine();
        System.out.println("Bem vindo " + nome);
        s.close();
    }
}
