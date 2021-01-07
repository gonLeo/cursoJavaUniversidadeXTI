package br.com.xti.heranca;

public class AnimalTest {

    public static void barulho(Animal animal) {
        animal.fazerBarulho();
    }

    public static void main(String[] args) {
        Cachorro bob = new Cachorro();
        Galinha carijo = new Galinha();
        // Animal generico = new Animal(0, null);

        // generico.fazerBarulho();
        carijo.fazerBarulho();
        bob.fazerBarulho();

        barulho(bob);
        barulho(carijo);

    }

}
