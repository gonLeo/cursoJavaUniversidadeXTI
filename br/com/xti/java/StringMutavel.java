package br.com.xti.java;

public class StringMutavel {
    public static void main(String[] args) {

        // Ideal para ambiente multiprocessado para métodos sincronizados
        StringBuffer s0 = new StringBuffer();

        StringBuilder s1 = new StringBuilder("Java");

        s1.toString();
        s1.length();
        s1.capacity();
        System.out.println(s1.length());
        System.out.println(s1.capacity());// Informa a capacidade de armazenamento dos objetos - A capacidade aumenta
                                          // conforme a necessidade

        s1.append("trabalhando "); // Utilizado para concatenar sem gerar um novo objeto
        char[] c = { 'c', 'o', 'm' };
        s1.append(c).append(" textos ");
        System.out.println(s1);

        String url = new StringBuilder("www.xti.com.br").delete(0, 4).toString(); // remove o texto
        System.out.println(url);

    }
}
