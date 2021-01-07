package br.com.xti.poo;

public class Carro {
    String modelo;
    int velocidadeMaxima;
    double segundosZeroACem;
    Motor motor;

    // Contrutor padrão
    public Carro() {

    }

    // Contrutor com parâmetros
    public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem) {
        // Reaproveita o outro contructor, não utilizando apenas o segundo parâmetro
        this(modelo, velocidadeMaxima, segundosZeroACem, null);
    }

    public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem, Motor motor) {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.segundosZeroACem = segundosZeroACem;
        this.motor = motor;
    }
}
