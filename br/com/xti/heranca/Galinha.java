package br.com.xti.heranca;

//Interface permite relacionementos de típos díspares
public class Galinha extends Animal implements AreaCalculavel{
    public Galinha() {
        // Faz referencia a superclasse (Para diferenciar os atributos da classe pai e
        // filho)
        super(2, "Milho");
    }

    // Sobreescria do método da classe animal
    public void fazerBarulho() {
        System.out.println("Có Có");
    }

    public double calcularArea() {
        return 0;
    }
}
