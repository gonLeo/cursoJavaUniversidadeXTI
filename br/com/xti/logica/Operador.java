package br.com.xti.logica;

import java.util.Random;

import java.util.Scanner;

public class Operador {
    public static void main(String[] args) {
        System.out.println("Qual seu palpite ?");
        Scanner s = new Scanner(System.in);

        int palpite = new Integer(s.nextLine());
        int dado = new Random().nextInt(6) + 1;

        System.out.println(palpite == dado ? "Você acertou" : "Você errou");
        s.close();

    }
}