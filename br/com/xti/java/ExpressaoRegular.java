package br.com.xti.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        // QUANTIFICADORES
        // X{n} X, exatamente n vezes
        // X{n,} X, pelo menos n vezes
        // X{n, m} X, pelo menos n vezes mas não mais do que m vezes
        // X? X, 0 ou 1 vez
        // X* X, 0 ou + 1 vezes
        // X+ X, 1 ou + 1 vezes

        // METACARACTERES DE FRONTEIRA
        // ^ inicia
        // $ finaliza
        // | ou

        // AGRUPADORES
        // [...] Agrupamento
        // [a-z] Alcance
        // [a-e][i-u] União
        // [a-z&&[aeiou]] Interseção
        // [^abc] Exceção
        // [a-z&&[^m-p]] Subtração
        // \x Fuga literal

        b = "@".matches(".");
        b = "2".matches("\\d");

        String doce = "qual o DOCE mais doCe que o doce de batata Doce?";
        Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        // SUBSTITUIÇÕES
        String r = doce.replaceAll("(?i)doce", "docinho");
        System.out.println(r);

    }
}
