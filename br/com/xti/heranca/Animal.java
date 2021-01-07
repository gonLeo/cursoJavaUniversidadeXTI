package br.com.xti.heranca;

// (Torna a classe não instanciável) e todos os métodos abstratos devem ser implementados por subclasses não abstratas (concretas)
public abstract class Animal {

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

    //Mtodo abstrato que não está implementado, e será implementado apenas nas subclasses (Torna a classe não instanciável)
    abstract void fazerBarulho();
}

//Modificador final em métodos impedem que eles sejam sobreescritos e em classes que elas sejam extendidas