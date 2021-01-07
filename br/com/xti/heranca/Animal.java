package br.com.xti.heranca;

public class Animal {

    protected int serial; // protected exibe apenas para as subclasses
    double peso;
    String comida;

    public Animal(double peso, String comida) {
        this.peso = peso;
        this.comida = comida;
    }

    void dormir() {
        System.out.println("Dormiu");
    }

    void fazerBarulho() {
        System.out.println("Fazer barulho");
    }
}
