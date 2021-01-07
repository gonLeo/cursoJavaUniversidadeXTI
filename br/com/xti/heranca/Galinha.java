package br.com.xti.heranca;

public class Galinha extends Animal {
    public Galinha() {
        // Faz referencia a superclasse (Para diferenciar os atributos da classe pai e
        // filho)
        super(2, "Milho");
    }

    // Sobreescria do método da classe animal
    public void fazerBarulho() {
        System.out.println("Có Có");
    }
}
