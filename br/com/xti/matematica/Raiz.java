package br.com.xti.matematica;

import java.util.Scanner;

public class Raiz {

    public static void main(String[] args) {
        System.out.println("Qual o número que deseja obter a raiz?");
        Scanner s = new Scanner(System.in);
        Integer x = s.nextInt();

        if (x < 1) {
            System.out.println("A raiz é igual a " + x);
            s.close();
            return;
        }
        int cont = 0;
        int impar = 1;
        System.out.println("Raiz pelo math " + Math.sqrt(x));

        for (int i = 0; i < x; i++) {
            // System.out.println(i);
            // if (i == 1) {
            // impar = 1;
            // } else {
            // impar += 2;
            // }
            // System.out.println(x + " - " + impar + " = " + (x - impar));
            x = x - impar;
            impar += 2;
            cont += 1;

        }
        System.out.println("A raiz é igual a " + cont);

        s.close();
    }
}
