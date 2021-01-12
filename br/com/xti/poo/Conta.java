package br.com.xti.poo;

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
		System.out.println(cliente + " seu saldo � R$" + saldo);
	}

	public boolean saca(double valor) {

		if (valor >= saldo) {
			saldo = saldo + valor;
			return true;
		} else {
			return false;
		}

	}

	public String deposita(double valor) {
		saldo = saldo + valor;
		return "Saque realizado com sucesso";
	}

	public void recebe(double valor, Conta conta) {
		conta.deposita(valor);
	}
}
