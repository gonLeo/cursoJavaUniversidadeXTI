package br.com.xti.java;

import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Arquivo {
    public static void main(String[] args) throws IOException {
        // Java 7
        Path path = Paths.get("C:/Users/06010736145/Documents/curso java/files/texto.txt");
        System.out.println(path.toAbsolutePath());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.getFileName());

        // CRIAÇÃO DE DIRETÓRIOS
        Files.createDirectories(path.getParent());

        // ESCREVER E LER ARQUIVOS
        byte[] bytes = "Meu texto".getBytes();
        Files.write(path, bytes);// Cria. limpa e escreve o texto dentro do arquivo

        byte[] retorno = Files.readAllBytes(path);
        System.out.println(new String(retorno));
    }
}
