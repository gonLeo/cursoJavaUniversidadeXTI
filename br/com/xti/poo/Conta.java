package br.com.xti.poo;

public class Conta {
	String cliente;
	double saldo;
	
	void exibeSaldo() {
		System.out.println(cliente + " seu saldo � R$" + saldo);
	}
	
	void saca(double valor) {
		saldo = saldo - valor;
	}
}
