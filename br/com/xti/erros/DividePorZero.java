package br.com.xti.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

    public static void dividir(Scanner s) throws InputMismatchException, ArithmeticException {
        System.out.print("Números: ");
        int a = s.nextInt();
        System.out.print("Divisor: ");
        int b = s.nextInt();

        System.out.println(a / b);
        s.close();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean continuar = true;
        do {
            try {
                dividir(s);
                continuar = false;
                // Multi catch
            } catch (InputMismatchException | ArithmeticException e1) {
                System.err.println("Valor inválido");
                e1.printStackTrace(); // Imprime a pilha de erro encontrada na exceção
                s.nextLine();
            }
        } while (continuar);

    }
}
