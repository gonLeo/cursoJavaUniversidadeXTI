package br.com.xti.poo;

public class GalinhaTets {
    public static void main(String[] args) {
        Galinha g1 = new Galinha();
        Galinha g2 = new Galinha();

        g1.botar().botar().botar();
        g2.botar().botar();

        System.out.println("\n Galinha 1 \n" + g1.ovos + " ovos" + "\n\nGalinha 2 \n" + g2.ovos + " ovos");
        System.out.println("\nTOTAIS DE OVOS DA GRANJA: " + Galinha.ovosDaGranja + "\n");
        System.out.println("\nMÉDIA DE OVOS BOTADOS: " + Galinha.mediaDeOvos(2) + "\n");
    }
}
