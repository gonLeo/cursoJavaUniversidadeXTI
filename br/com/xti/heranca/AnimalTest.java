package br.com.xti.heranca;

public class AnimalTest {

    public static void main(String[] args) {
        Cachorro bob = new Cachorro();
        bob.dormir();

        Galinha carijo = new Galinha();
        carijo.dormir();

        System.out.println(bob instanceof Cachorro);
        System.out.println(bob instanceof Animal);
    }

}
