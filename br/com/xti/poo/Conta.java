package br.com.xti.poo;

import java.time.LocalDate;

public class Conta {

	private String cliente;
	private double saldo;

	public Conta() {

	}

	public Conta(String cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public String showDetails() {
		String s = new String();
		s = " Cliente: " + this.cliente + "\n Saldo: R$ " + this.saldo;
		return s;
	}

	public void exibeSaldo() {
		System.out.println("\nCliente: " + cliente + "\nSaldo Disponível: R$" + saldo);
	}

	public boolean saca(double valor) {

		if (valor <= saldo) {
			saldo = saldo - valor;
			return true;
		}
		return false;

	}

	public String deposita(double valor) {
		saldo = saldo + valor;
		return "Depósito realizado com sucesso";
	}

	public String transfere(double valor, Conta contaDestino) {
		contaDestino.deposita(valor);
		String res = "-----------------------------------------------"
				+ "\nCOMPROVANTE DE TRANSFERÊNCIA ENTRE CONTAS\n\n" + "CONTA DE ORIGEM: " + this.cliente
				+ "\nSALDO APÓS TRANSFERÊNCIA R$ " + this.saldo + "\n-----------------------------------------------"
				+ "\n\nCONTA DESTINO: " + contaDestino.cliente + "\nSALDO APOS TRANSFERENCIA R$ " + contaDestino.saldo
				+ "\n\nREALIZADA EM: " + java.time.LocalDate.now()
				+ "\n-----------------------------------------------";
		return res;
	}
}
