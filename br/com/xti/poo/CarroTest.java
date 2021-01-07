package br.com.xti.poo;

public class CarroTest {
    public static void main(String[] args) {

        // Definindo motor sem constructor (Relacionamento tem um)
        Motor v12 = new Motor();
        v12.tipo = "V12";
        v12.potencia = 660;

        // Definindo motor sem constructor (Relacionamento tem um)
        Motor v8 = new Motor("V8", 1018);

        // Definindo carro sem o constructor
        Carro ferrari = new Carro();
        ferrari.modelo = "Ferrari Enzo";
        ferrari.velocidadeMaxima = 349;
        ferrari.segundosZeroACem = 3.2;
        ferrari.motor = v12;

        // Definindo carro com o constuctor
        Carro k = new Carro("Koenigsegg CCXR", 430, 3.1);
        k.motor = v8;

        Carro bugatti = new Carro("Bugatti", 550, 2.5, new Motor("w16", 1200));

        System.out.println("Table car");

        System.out.println("\nFERRARI\n");
        System.out.println("Modelo: " + ferrari.modelo + "\nSegundos Zero a 100: " + ferrari.segundosZeroACem
                + "\nVelocidade máxima: " + ferrari.velocidadeMaxima + "\nTipo motor : " + ferrari.motor.tipo
                + "\nPotência motor: " + ferrari.motor.potencia);

        System.out.println("\nKOENIGSEGG CCXR\n");
        System.out.println("Modelo: " + k.modelo + "\nSegundos Zero a 100: " + k.segundosZeroACem
                + "\nVelocidade máxima: " + k.velocidadeMaxima + "\nTipo motor : " + k.motor.tipo + "\nPotência motor: "
                + k.motor.potencia);

        System.out.println("\nBUGATTI\n");
        System.out.println("Modelo: " + bugatti.modelo + "\nSegundos Zero a 100: " + bugatti.segundosZeroACem
                + "\nVelocidade máxima: " + bugatti.velocidadeMaxima + "\nTipo motor : " + bugatti.motor.tipo
                + "\nPotência motor: " + bugatti.motor.potencia);

    }
}
