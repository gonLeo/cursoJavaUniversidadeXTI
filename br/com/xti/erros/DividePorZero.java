package br.com.xti.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean continuar = true;
        do {
            try {
                System.out.print("Números: ");
                int a = s.nextInt();
                System.out.print("Divisor: ");
                int b = s.nextInt();
    
                System.out.println(a/b);
                continuar = false;
                s.close();
            } catch (InputMismatchException e1) {
                System.err.println("Valor de entrada inválido");
                s.nextLine();                
            }catch (ArithmeticException e2) {
                System.err.println("Não é possível dividir por zero");
                s.nextLine();                
            }            
        } while (continuar);               
      
    }
}
