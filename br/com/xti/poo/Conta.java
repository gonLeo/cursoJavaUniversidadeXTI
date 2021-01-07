package br.com.xti.poo;

public class Conta {
	String cliente;
	double saldo;
	
	void exibeSaldo() {
		System.out.println(cliente + " seu saldo é R$" + saldo);
	}
	
	void saca(double valor) {
		saldo = saldo - valor;
	}
}
