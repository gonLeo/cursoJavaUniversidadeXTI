package br.com.xti.java;

public class StringOperacoes {
    public static void main(String[] args) {
        // Literais String
        String s1 = "Write Once";
        // Concatenação de string
        String s2 = s1 + "Run Anywere";
        // Com o método construtor
        String s3 = new String("Java Virtual Machine");

        // Array de caracteres
        char[] array = { 'j', 'a', 'v', 'a' };
        String s4 = new String(array);

        // OPERAÇÕES
        int tamanho = s1.length();
        char letra = s1.charAt(0);
        String texto = s1.toString();

        // LOCALIZAÇÃO

        int posicao = s3.indexOf("Virtual"); // Recupera a posição da string na primeira ocorrência
        int ultima = s3.lastIndexOf('a'); // Recupera a posição da string na ultima ocorrência
        boolean vazia = s3.isEmpty();

        // COMPARAÇÃO
        String xti = "XTI";
        boolean igual = xti.equals("xti"); // O operador '==' compara referência e o método equals compara valores
        boolean igualCaseIgnore = xti.equalsIgnoreCase("xti"); // Para ignorar maíuscula de minuscula

        boolean x = xti.startsWith("X"); // Verifica se a string inicia com um determinado valor
        boolean xEnds = xti.endsWith("I"); // Verifica se a string termina com um determinado valor

        int c = "amor".compareTo("bola");// Verifica se uma string é alfabeticamente maior que a outra -
                                         // Caso o retorno seja:
                                         // c == 0 -> Strings iguais
                                         // c < 0 -> String é menor (vem antes) da string em comparação
                                         // c > 0 -> String é maior (vem depois) da string em comparação

        String so = "Olhe, olhe!";
        boolean o = so.regionMatches(true, 6, "Olhe", 0, 4); // Verifica se uma string está dentro de outra string

        // EXTRAÇÃO

        String l = "O Brasil é lindo";
        String sl = l.substring(11); // Com início e fim. l.substring(2,8);

        // MODIFICAÇÕES DE STRING
        sl = l.concat("Que maravilha"); // equivalente a sl += l + "Que maravilha"
        sl = l.replace('s', 'z'); // Substitui uma string por outra
        sl = l.replaceFirst(" ", "X"); // Substitui uma string por outra apenas na primeira ocorrência

    }
}
