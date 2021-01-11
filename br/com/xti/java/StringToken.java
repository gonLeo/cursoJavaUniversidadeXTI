package br.com.xti.java;

public class StringToken {
    public static void main(String[] args) {
        String s = "HTML; CSS; Javascript; Jquery; Java";
        String[] tokens = s.split(";");
        System.out.println(tokens.length + "Tokens");
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
