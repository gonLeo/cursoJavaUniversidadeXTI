package br.com.xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.xti.poo.Conta;

public class Arquivo3 {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(new Conta("Carmen Steffans", 1200.50));
        contas.add(new Conta("Adonis Creed", 3500.75));
        contas.add(new Conta("Keanu Reeves", 7500.50));
        contas.add(new Conta("Michael Jackson", 10000.50));
        salvaContas(contas);

        exibeContas(contas);
        // if (contas.get(0).saca(1000)) {
        // String res = contas.get(0).transfere(1000, contas.get(1));
        // System.out.println(res.toString());
        // } else {
        // System.out.println("Erro na transferencia");
        // }
    }

    public static void salvaContas(ArrayList<Conta> conta) {
        Path path = Paths.get("C:/Users/06010736145/Documents/curso java/files/contas.txt");
        Charset utf8 = StandardCharsets.UTF_8;

        try (BufferedWriter w = Files.newBufferedWriter(path, utf8)) {
            for (int i = 0; i < conta.size(); i++) {
                w.write(conta.get(i).showDetails() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void exibeContas(ArrayList<Conta> conta) {
        Path path = Paths.get("C:/Users/06010736145/Documents/curso java/files/contas.txt");
        Charset utf8 = StandardCharsets.UTF_8;
        try (BufferedReader reader = Files.newBufferedReader(path, utf8)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
