/**
 * 
 */
package model;

import javax.swing.JOptionPane;

/**
 * @author Lucas Batista 31 de mar. de 2024
 */
public class ContaBancaria {
	private String cliente;
	private int numConta;
	private float saldo = 0;

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void sacar(float saque) {
		if (saque > getSaldo()) {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente para o saque!");
		} else {
			setSaldo(getSaldo() - saque);
			JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
		}
	}

	public void depositar(float deposito) {
		setSaldo(getSaldo() + deposito);
		JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
	}

	@Override
	public String toString() {
		return "ContaBancaria{" + "cliente='" + cliente + '\'' + ", num_conta=" + numConta + ", saldo=" + saldo + '}';
	}
}
