package br.com.xti.erros;

public class SenhaTest {
    static void autenticar(String senha) throws SenhaInvalidaExceptio {
        if ("123".equals(senha)) {
            System.out.println("Autenticado");
        } else {
            throw new SenhaInvalidaExceptio("Senha Incorreta");
        }
    }

    public static void main(String[] args) {
        try {
            autenticar("123");
        } catch (SenhaInvalidaExceptio e) {
            System.out.println(e.getMessage());
        }
    }
}
