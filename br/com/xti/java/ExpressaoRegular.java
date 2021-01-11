package br.com.xti.java;

public class ExpressaoRegular {
    public static void main(String[] args) {

        boolean b = "Java".matches("(?im)java");
        System.out.println(b);

        // MODIFICADORES
        // (?i) - Ignora maiúscula e minúscula
        // (?x) - Comentários
        // (?m) - Multilinhas
        // (?s) - Dottal

        // METACARACTERES
        // . qualquer caracter
        // \d dígitos [0-9]
        // \D não é dígito [^0-9]
        // \s espacos [\t\n\x0B\f\r]
        // \S não é espaço [^\s]
        // \w letra [a-zA-Z_0-9]
        // \W não é letra

        b = "@".matches(".");
        b = "2".matches("\\d");
        System.out.println(b);
    }
}
