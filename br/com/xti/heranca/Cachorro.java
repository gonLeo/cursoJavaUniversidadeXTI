package br.com.xti.heranca;

//Herdando atributos e métodos (usar regra do "É UM")
public class Cachorro extends Animal {
    public Cachorro() {
        // Faz referencia a superclasse (Para diferenciar os atributos da classe pai e
        // filho)
        super(30, "Carne");
    }

    // Sobreescria do método da classe animal
    void fazerBarulho() {
        System.out.println("Au au");
    }
}
