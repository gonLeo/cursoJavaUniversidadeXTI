package br.com.xti.java;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;

//Para arquivos grandes
public class Arquivo2 {
    public static void main(String[] args) {
        Path path = Paths.get("C:/Users/06010736145/Documents/curso java/files/texto.txt");
        Charset utf8 = StandardCharsets.UTF_8;
        // Com este método a escrita fica aberta, ideal para manipulação de arquivos
        // grandes

        // ESCRITA DE ARQUIVOS
        // Objetos que implementam a interface closable são automaticamente fechados
        // quando estão no bloco try
        try (BufferedWriter w = Files.newBufferedWriter(path, utf8)) {
            w.write("Texto\n");
            w.write("Texto\n");
            w.write("Texto\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // LEITURA DE ARQUIVOS
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
